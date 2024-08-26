/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.KetNoiSQL;
import controller.KiemTraEmail_324;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.TaiKhoanDangNhap_324;
import model.TaoTaiKhoan_324;

/**
 *
 * @author ACER
 */
public class TaiKhoan_Dao_324 {
   public TaiKhoanDangNhap_324 CheckAccount_324(String username, String password) throws ClassNotFoundException, SQLException{
       Connection connect = KetNoiSQL.getConnection();
       String sql = "select * from Taikhoan where userName = ? and Pass = ?";
       try{
           PreparedStatement pr = connect.prepareStatement(sql);
           pr.setString(1,username);
           pr.setString(2,password);
           ResultSet rs = pr.executeQuery();
           while(rs.next()){
               TaiKhoanDangNhap_324 tk = new TaiKhoanDangNhap_324();
               tk.setUsername(rs.getString("userName"));
               tk.setPassword(rs.getString("Pass"));
               return tk;
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
       return null;
   }
   
   
   public TaiKhoanDangNhap_324 getTaiKhoanByUser(String user) throws ClassNotFoundException, SQLException {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from Taikhoan where userName = ?";

        try {
            PreparedStatement stm;
            stm = conn.prepareStatement(sql);
            stm.setString(1,user);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                TaiKhoanDangNhap_324 taiKhoanDangNhap_324 = new TaiKhoanDangNhap_324();
                taiKhoanDangNhap_324.setUsername(rs.getString("UserName"));
                taiKhoanDangNhap_324.setPassword(rs.getString("Pass"));
                taiKhoanDangNhap_324.setHoTen(rs.getString("hoVaTen"));
                taiKhoanDangNhap_324.setEmail(rs.getString("email"));
                taiKhoanDangNhap_324.setSdt(rs.getString("SDT"));            
                return taiKhoanDangNhap_324;
            }

        } catch (Exception  e) {
            e.printStackTrace();
        }
        return null;
    }
   
   
   public void updateTaiKhoan(TaiKhoanDangNhap_324 taiKhoanDangNhap_324) throws ClassNotFoundException, SQLException {
        Connection connection = KetNoiSQL.getConnection();
        String sql = "Update Taikhoan set userName = ? , Pass = ? , hoVaTen = ? , email=? , SDT = ?  where userName = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, taiKhoanDangNhap_324.getUsername());
            preparedStatement.setString(2, taiKhoanDangNhap_324.getPassword());
            preparedStatement.setString(3, taiKhoanDangNhap_324.getHoTen());
            preparedStatement.setString(4, taiKhoanDangNhap_324.getEmail() );
            preparedStatement.setString(5, taiKhoanDangNhap_324.getSdt());
            preparedStatement.setString(6, taiKhoanDangNhap_324.getUsername() );
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public void taoTaiKhoan(TaoTaiKhoan_324 tk) throws ClassNotFoundException, SQLException{
        Connection connection = KetNoiSQL.getConnection();
        String sql = "INSERT Taikhoan (userName, Pass, hoVaTen, SDT, email) VALUES (?,?,?,?,?)";   
        try {
            PreparedStatement pr = connection.prepareStatement(sql);
                pr.setString(1,tk.getTenTaiKhoan());
                pr.setString(2,tk.getMatKhau());
                pr.setString(3,tk.getHoTen());
                pr.setString(4,tk.getSoDt());
                pr.setString(5,tk.getEmail());
                int rs = pr.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
