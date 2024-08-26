
package dao;

import connect.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien_tatCaThongTin_140;
import model.SinhVien_trangChu_324;
import java.sql.Date;

public class SinhVienDao {
    
    //Ham duoc su dung de lay tat ca thong tin cua sinh vien
    public List<SinhVien_trangChu_324> getTatCaThongTinSinhVien_324() throws ClassNotFoundException, SQLException{
    List<SinhVien_trangChu_324> sinhVien = new ArrayList<SinhVien_trangChu_324>();
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                SinhVien_trangChu_324 sv  = new SinhVien_trangChu_324();
                sv.setMaPhong_324(rs.getString("maPhong"));
                sv.setMsv_324(rs.getString("maSV"));
                sv.setTen_324(rs.getString("HoTen"));
                sv.setCmnd_324(rs.getString("CMND"));
                sv.setGioTinh_324(kiemTraGioiTinh(rs.getString("gioiTinh")));
                sv.setQueQuan_324(rs.getString("queQuan"));
                sinhVien.add(sv);
             }
        }
        catch(SQLException e){
            e.printStackTrace();    
        }
        return sinhVien;
    }
    
    //Tra ve gioi tinh Nam neu bang 1 va Nu neu bang 0
    public String kiemTraGioiTinh(String gioiTinh){
        if(gioiTinh.equals("1"))
            return "Nam";
        else
            return "Nữ";
    }
    
    //Ham nay lay tat ca thong tin cua sinh vien theo " Que Quan "
    public List<SinhVien_trangChu_324> getThongTinTheoQueQuan_324() throws ClassNotFoundException, SQLException{
        List<SinhVien_trangChu_324> sinhVien = new ArrayList<SinhVien_trangChu_324>();
            Connection connection = KetNoiSQL.getConnection();
            String sql = "select DISTINCT queQuan from SinhVien";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while(rs.next()){
                       SinhVien_trangChu_324 sv  = new SinhVien_trangChu_324();
                       sv.setQueQuan_324(rs.getString("queQuan"));
                       sinhVien.add(sv);
                }
            }
            catch(SQLException e){
                e.printStackTrace();    
            }
        return sinhVien;
    }
    
    //Ham nay duoc su dung de lay ra tat ca " so CMND " cua sinh vien
    public List<SinhVien_trangChu_324> getThongTinTheoCMND_324() throws ClassNotFoundException, SQLException{
        List<SinhVien_trangChu_324> sinhVien = new ArrayList<SinhVien_trangChu_324>();
            Connection connection = KetNoiSQL.getConnection();
            String sql = "select CMND from SinhVien";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while(rs.next()){
                       SinhVien_trangChu_324 sv  = new SinhVien_trangChu_324();
                       sv.setCmnd_324(rs.getString("CMND"));
                       sinhVien.add(sv);
                 }
            }
            catch(SQLException e){
                e.printStackTrace();    
            }
        return sinhVien;
    }
    
    //Su dung chung de kiem tra thong tin tim kiem
    public SinhVien_trangChu_324 getTen(String theLoai ,String doiTuong) throws ClassNotFoundException, SQLException{
        Connection connection = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where " + theLoai + " like N'%"+doiTuong+"%'";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                   while(rs.next()){
                    SinhVien_trangChu_324 sv  = new SinhVien_trangChu_324();
                        sv.setMaPhong_324(rs.getString(theLoai));
                        return sv;
                   }
            }
            catch(SQLException e){
                e.printStackTrace();    
            }
       return null;
    }
    public void themSinhVien(SinhVien_tatCaThongTin_140 sv) throws ClassNotFoundException, SQLException{
        Connection connection = KetNoiSQL.getConnection();
        String sql = "insert into SinhVien(maSV, HoTen , CMND, gioiTinh, ngaySinh, SDT, queQuan, ngayLamHopDong, maPhong,hoTenGH, sdtGH, quanHe, Nghenghiep)"
                + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,sv.getMaSv_140());
            preparedStatement.setString(2,sv.getTen_140());
            preparedStatement.setString(3,sv.getCMND_140());
            preparedStatement.setString(4,sv.getGioitinh_140());
            preparedStatement.setDate(5,new Date(sv.getNgaysinh_140().getTime()));
            preparedStatement.setString(6,sv.getSDT_140());
            preparedStatement.setString(7,sv.getQuequan_140());
            preparedStatement.setDate(8,new Date(sv.getNgaylamhopdong_140().getTime()));
            preparedStatement.setString(9,sv.getMaPhong_140());
            preparedStatement.setString(10,sv.getHotengh_140());
            preparedStatement.setString(11,sv.getSdtgh_140());
            preparedStatement.setString(12,sv.getQuanhe_140());
            preparedStatement.setString(13,sv.getNghenghiep_140());
            
            int rs = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    //Hay nay duoc su dung de lay thong tin theo dieu kien "where"
    public List<SinhVien_trangChu_324> getThongTinTheoDieuKien_324(String loai, String ten) throws ClassNotFoundException, SQLException{   
        List<SinhVien_trangChu_324> sinhVien = new ArrayList<SinhVien_trangChu_324>();
            Connection connection = KetNoiSQL.getConnection();
            String sql = "select * from SinhVien where " +loai + " like N'%"+ten+"%'";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while(rs.next()){
                    SinhVien_trangChu_324 sv  = new SinhVien_trangChu_324();
                    sv.setMaPhong_324(rs.getString("maPhong"));
                    sv.setMsv_324(rs.getString("maSV"));
                    sv.setTen_324(rs.getString("HoTen"));
                    sv.setCmnd_324(rs.getString("CMND"));
                    sv.setGioTinh_324(kiemTraGioiTinh(rs.getString("gioiTinh")));
                    sv.setQueQuan_324(rs.getString("queQuan"));
                    sinhVien.add(sv);
                 }
               
            }
            catch(SQLException e){
                e.printStackTrace();    
            }
        return sinhVien;
}
    public void CapNhatThongTin(SinhVien_tatCaThongTin_140 sv) throws ClassNotFoundException, SQLException{
        Connection connection = KetNoiSQL.getConnection();
        String sql = "Update SinhVien set HoTen = ?, CMND = ?,"
                + " gioiTinh = ?,ngaySinh = ?, SDT = ?, queQuan = ?, ngayLamHopDong = ?,"
                + " hoTenGH = ?, sdtGH = ?, quanHe = ?, Nghenghiep = ? where maSV = ?";
                try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sv.getTen_140());
            preparedStatement.setString(2, sv.getCMND_140());
            preparedStatement.setString(3, sv.getGioitinh_140());
            preparedStatement.setDate(4, new Date(sv.getNgaysinh_140().getTime()));
            preparedStatement.setString(5, sv.getSDT_140());
            preparedStatement.setString(6, sv.getQuequan_140());
            preparedStatement.setDate(7, new Date(sv.getNgaylamhopdong_140().getTime()));
            preparedStatement.setString(8, sv.getHotengh_140());
            preparedStatement.setString(9, sv.getSdtgh_140());
            preparedStatement.setString(10, sv.getQuanhe_140());
            preparedStatement.setString(11, sv.getNghenghiep_140());
            preparedStatement.setString(12, sv.getMaSv_140());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


