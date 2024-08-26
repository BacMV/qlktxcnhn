/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Date;
import connect.KetNoiSQL;
import controller.KiemTraEmail_324;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien_tatCaThongTin_140;
import model.SinhVien_trangChu_324;
import model.ThongTinPhong_140;

public class SinhVienTheoPhong_Dao_324 {
    SinhVien_tatCaThongTin_140 sv = new SinhVien_tatCaThongTin_140();
    
    //Lay thong tin cua phong theo ma Phong nhap vao
    public ThongTinPhong_140 getRoomByMaPhong(String maPhong) throws ClassNotFoundException, SQLException{
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from Phong where maPhong = ?";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,maPhong);
                ResultSet rs = preparedStatement.executeQuery();
                while(rs.next()){
                    ThongTinPhong_140 sv  = new ThongTinPhong_140();
                    sv.setTenPhong(rs.getString("tenPhong"));
                    sv.setMaPhong(rs.getString("maPhong"));
                    sv.setLoaiPhong(rs.getString("loaiPhong"));
                    sv.setSoSVHienTai(String.valueOf(CountStudent(maPhong)));
                    sv.setSoSVToiDa(rs.getString("soNguoiToiDa"));
                    sv.setTinhTrangPhong(demchoTrong(maPhong));
                    return sv;
                 }
            }
            catch(SQLException e){
                e.printStackTrace();    
            }
        return null;
    }
    
    //Lay ra danh sach sinh vien theo ma phong duoc nhap vao
    public List<SinhVien_tatCaThongTin_140> getAllStudenByRoom(String maPhong) throws ClassNotFoundException, SQLException{
        List<SinhVien_tatCaThongTin_140> sv = new ArrayList<>();
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where maPhong = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maPhong);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                SinhVien_tatCaThongTin_140 svs = new SinhVien_tatCaThongTin_140();
                svs.setMaSv_140(rs.getString("maSV"));
                svs.setTen_140(rs.getString("HoTen"));
                svs.setCMND_140(rs.getString("CMND"));
                svs.setNgaysinh_140(rs.getDate("ngaySinh"));
                svs.setGioitinh_140(kiemTraGioiTinh(rs.getString("gioiTinh")));
                svs.setSDT_140(rs.getString("SDT"));
                svs.setQuequan_140(rs.getString("queQuan"));
                sv.add(svs);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return sv;
    }
    
    //Dem so luong sinh vien trong phong
    public int CountStudent(String maPhong) throws ClassNotFoundException, SQLException{
        Connection connection = KetNoiSQL.getConnection();
        int a = 0;
        String sql = "select * from SinhVien where maPhong = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maPhong);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                a = a+1;
            }
            }catch(Exception ex){
            ex.printStackTrace();
        }
        return a;
    }
    
    //Dem so luong sinh vien trong phong
    public SinhVien_tatCaThongTin_140 CountTotal(String maPhong) throws ClassNotFoundException, SQLException{
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select soNguoiToiDa from Phong where maPhong = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maPhong);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                SinhVien_tatCaThongTin_140 sv = new SinhVien_tatCaThongTin_140();
                sv.setSoSinhVienToiDa_140(rs.getString("soNguoiToiDa"));
                return sv;
            }
            }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public String demchoTrong(String maPhong) throws NumberFormatException, ClassNotFoundException, SQLException{
        int a = Integer.parseInt(CountTotal(maPhong).getSoSinhVienToiDa_140()) - CountStudent(maPhong);
        if(a<=0)
            return "Hết Chỗ";
        else
            return "Còn Chỗ";
    }
    
    public String kiemTraGioiTinh(String gioiTinh){
        if(gioiTinh.equals("1"))
            return "Nam";
        else
            return "Nữ";
    }

}
