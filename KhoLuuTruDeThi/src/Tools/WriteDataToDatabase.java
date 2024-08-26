/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Database.*;
import Entities.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class WriteDataToDatabase {
    public static void ghi_TacGia_Vao_CSDL(TacGia tacGia) throws SQLException, ClassNotFoundException{
        String query = "insert into tacgia (MaTG,TenTG) values (?,?)";
        try{
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, tacGia.getMaTG());
            preparedStatement.setNString(2, tacGia.getTenTG());
                
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
            throw e;
        }
    }
    public static void xoa_TacGia_Vao_CSDL(String maTacGia) throws SQLException, ClassNotFoundException{
        try{
            Connection connection = DatabaseManager.getConnection();
            
            String delSachQuery = "delete from dethi where MaTG = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(delSachQuery);
            preparedStatement.setString(1, maTacGia);
            preparedStatement.executeUpdate();
            
            String delTacGiaquery = "delete from tacgia where MaTG = ?";
            preparedStatement = connection.prepareStatement(delTacGiaquery);
            preparedStatement.setString(1, maTacGia);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void capNhat_TacGia_Vao_CSDL(TacGia tacGia) throws SQLException, ClassNotFoundException{
        String query = "update tacgia set TenTG = ? where MaTG = ?";
        try{
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, tacGia.getTenTG());
            preparedStatement.setNString(2, tacGia.getMaTG());
                
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
            throw e;
        }
    }
    
    public static void ghi_Sach_Vao_CSDL(DeThi sach) throws SQLException, ClassNotFoundException {
        String query = "insert into dethi (MaDT, TenDT, NamXuatBan, SoTrang, MaNXB, SoCauHoi, SoLuongCon, MaTG) values (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, sach.getMaSach());
            preparedStatement.setNString(2, sach.getTenSach());
            preparedStatement.setInt(3, sach.getNamXuatBan());
            preparedStatement.setInt(4, sach.getSoTrang());
            preparedStatement.setString(5, sach.getMaNXB());
            preparedStatement.setFloat(6, sach.getDonGia());
            preparedStatement.setInt(7, sach.getSoLuongCon());
            preparedStatement.setString(8, sach.getMaTG());
            
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void capNhat_Sach_Vao_CSDL(DeThi sach) throws SQLException, ClassNotFoundException {
        String query = "update dethi set TenDT = ?, NamXuatBan = ?, SoTrang = ?, MaNXB = ?, SoCauHoi = ?, SoLuongCon = ?, MaTG = ? where MaDT = ?";
        try {
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setNString(1, sach.getTenSach());
            preparedStatement.setInt(2, sach.getNamXuatBan());
            preparedStatement.setInt(3, sach.getSoTrang());
            preparedStatement.setString(4, sach.getMaNXB());
            preparedStatement.setFloat(5, sach.getDonGia());
            preparedStatement.setInt(6, sach.getSoLuongCon());
            preparedStatement.setString(7, sach.getMaTG());
            preparedStatement.setString(8, sach.getMaSach());
            
            preparedStatement.executeUpdate();

            preparedStatement.close();
            System.out.println("Đã ghi sách vào CSDL thành công.");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Ném lại ngoại lệ để xử lý ở nơi gọi
        }
    }
    public static void xoa_Sach_Vao_CSDL(String maSach) throws SQLException, ClassNotFoundException{
        String query = "delete from dethi where MaDT = ?";
        try{
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setNString(1, maSach);
            
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void giam_SoLuong_Sach_trong_CSDL(int soLuong,String maSach) throws SQLException, ClassNotFoundException{
        String query ="update dethi set SoLuongCon = SoLuongCon - ? where MaDT = ?";
        try{
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, soLuong);
            preparedStatement.setString(2, maSach);
            
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void ghi_SachTrongGioHang_Vao_CSDL(DeThiYeuThich dethiyeuthich) throws SQLException, ClassNotFoundException{
        String query = "insert into dethiyeuthich (MaTaiKhoan, MaDT, SoCauHoi, SoLuong) values (?, ?, ?, ?)";
        try{
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setNString(1, dethiyeuthich.getMaTaiKhoan());
            preparedStatement.setString(2, dethiyeuthich.getSachDaChon().getMaSach());
            preparedStatement.setLong(3,(long) dethiyeuthich.getSachDaChon().getDonGia());
            preparedStatement.setInt(4, dethiyeuthich.getSoLuong());
           
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Có vẻ như bạn đã có de thi này trong giỏ , nếu muốn thay đổi số lượng hãy xóa sản phẩm và chọn lại số lượng!");
        }
    }
    public static void xoa_SachTrongGioHang_Vao_CSDL(String maSach , String maTaiKhoan) throws SQLException, ClassNotFoundException{
        String query = "delete from dethiyeuthich where MaDT = ? and MaTaiKhoan = ?";
        try{
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setNString(1, maSach);
            preparedStatement.setNString(2, maTaiKhoan);
            
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void xoaALL_SachTrongGioHang_Vao_CSDL(String maTaiKhoan) throws SQLException, ClassNotFoundException{
        String query = "delete from dethiyeuthich";
        try{
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
  
    public static void ghi_NhaXuatBan_Vao_CSDL(NhaXuatBan nhaXuatBan) throws SQLException, ClassNotFoundException{
        String query = "insert into nhaxuatban (MaNXB,TenNXB,DiaChi,SDT) values (?,?,?,?)";
        try{
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, nhaXuatBan.getMaNXB());
            preparedStatement.setNString(2, nhaXuatBan.getTenNXB());
            preparedStatement.setNString(3, nhaXuatBan.getDiaChi());
            preparedStatement.setNString(4, nhaXuatBan.getSDT());
                
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void capNhat_NhaXuatBan_Trong_CSDL(NhaXuatBan nhaXuatBan) throws SQLException, ClassNotFoundException {
        String query = "update nhaxuatban set TenNXB = ?, DiaChi = ?, SDT = ? where MaNXB = ?";
        try {
            Connection connection = DatabaseManager.getConnection();
        
            PreparedStatement preparedStatement = connection.prepareStatement(query);
        
            preparedStatement.setNString(1, nhaXuatBan.getTenNXB());
            preparedStatement.setNString(2, nhaXuatBan.getDiaChi());
            preparedStatement.setNString(3, nhaXuatBan.getSDT());
            preparedStatement.setString(4, nhaXuatBan.getMaNXB());
        
            preparedStatement.executeUpdate();
            preparedStatement.close();       
        } catch (SQLException e) {
            e.printStackTrace();
        } 
}

    public static void xoa_NhaXuatBan_Tu_CSDL(String maNXB) throws SQLException, ClassNotFoundException {
        try {
            Connection connection = DatabaseManager.getConnection();
        
        // Xóa các sách có mã nhà xuất bản tương ứng
            String delSachQuery = "DELETE FROM dethi WHERE MaNXB = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(delSachQuery);
            preparedStatement.setString(1, maNXB);
        
        
        //Xóa nhà xuất bản từ bảng nhà xuất bản
            String deleteNXBQuery = "DELETE FROM nhaxuatban WHERE MaNXB = ?";
            preparedStatement = connection.prepareStatement(deleteNXBQuery);
            preparedStatement.setString(1, maNXB);
            preparedStatement.executeUpdate();
        
        } catch (SQLException e) {
            e.printStackTrace();
        } 
}

    public static void ghi_TaiKhoan_Vao_File(TaiKhoan taiKhoan) throws SQLException, ClassNotFoundException{
    	
        String query = "insert into taikhoan (MaTaiKhoan,MatKhau,VaiTro) values (?,?,?)";
        try{
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareCall(query);
            preparedStatement.setNString(1, taiKhoan.getMaTaiKhoan());
            preparedStatement.setNString(2, taiKhoan.getMatKhau());
            preparedStatement.setNString(3, taiKhoan.getVaiTro());
                
            preparedStatement.executeUpdate();
            
            preparedStatement.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    public static void cap_Nhat_TaiKhoan(TaiKhoan taiKhoan) throws SQLException, ClassNotFoundException {
    	
        String query = "UPDATE taikhoan SET MatKhau = ? WHERE MaTaiKhoan = ?";
        try {
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareCall(query);
            preparedStatement.setNString(1, taiKhoan.getMaTaiKhoan());
            preparedStatement.setNString(3, taiKhoan.getMatKhau());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Cập nhật tài khoản thành công!");
        } catch(SQLException e) {
            e.printStackTrace();
        }
}

    public static void xoa_TaiKhoan_Tu_CSDL(String maTaiKhoan) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM taikhoan WHERE MaTaiKhoan = ?";
    
        try {
            Connection connection = DatabaseManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setNString(1, maTaiKhoan);
        
            preparedStatement.executeUpdate();
        
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
