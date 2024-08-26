/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entities.*;
import GUI.DES;
import Database.*;

import java.util.ArrayList;
import java.sql.*;

public class DatabaseToList {
	
    public static ArrayList<TacGia> Doc_TacGia_Tu_CSDL() throws SQLException, ClassNotFoundException {
        ArrayList<TacGia> tacGiaList = new ArrayList<>();
        
        try{
            Connection connection = DatabaseManager.getConnection();
            String query ="select * from tacgia";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                TacGia tacGia = new TacGia();
                tacGia.setMaTG(resultSet.getString("MaTG"));
                tacGia.setTenTG(resultSet.getNString("TenTG"));
                tacGiaList.add(tacGia);
            }
            return tacGiaList;
        }catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<TacGia>();
        } 
    }

  
    public static ArrayList<DeThiYeuThich> Doc_DeThiYeuThich_Tu_CSDL() throws SQLException, ClassNotFoundException{
        ArrayList<DeThiYeuThich> sachTrongGioHangList  = new ArrayList<>();
        
        try{
            Connection connection = DatabaseManager.getConnection();
            String query = "select * from dethiyeuthich inner join dethi on dethiyeuthich.MaDT = dethi.MaDT";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                DeThiYeuThich sachDaChon = new DeThiYeuThich();
                sachDaChon.setMaTaiKhoan(resultSet.getString("MaTaiKhoan"));
                DeThi s = new DeThi();
                s.setMaSach(resultSet.getString("MaDT"));
                s.setTenSach(resultSet.getString("TenDT"));
                s.setNamXuatBan(resultSet.getInt("NamXuatBan"));
                s.setSoTrang(resultSet.getInt("SoTrang"));                       
                s.setMaNXB(resultSet.getString("MaNXB"));
                s.setDonGia((float)resultSet.getLong("SoCauHoi"));
                s.setSoLuongCon(resultSet.getInt("SoLuongCon"));
                s.setMaTG(resultSet.getNString("MaTG"));
                    
                sachDaChon.setSachDaChon(s);
                sachDaChon.setSoLuong(resultSet.getInt("SoLuong"));
                    
                sachTrongGioHangList.add(sachDaChon);
            }
            return sachTrongGioHangList;
        }catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<DeThiYeuThich>();
        }        
    }
    
    public static ArrayList<NhaXuatBan> Doc_NhaXuatBan_Tu_CSDL() throws SQLException, ClassNotFoundException{
        ArrayList<NhaXuatBan> nhaXuatBanList = new ArrayList<>();
        try{
            Connection connection = DatabaseManager.getConnection();
            String query = "select * from nhaxuatban";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                NhaXuatBan nhaXuatBan = new NhaXuatBan();
                nhaXuatBan.setMaNXB(resultSet.getString("MaNXB"));
                nhaXuatBan.setTenNXB(resultSet.getString("TenNXB"));
                nhaXuatBan.setDiaChi(resultSet.getString("DiaChi"));
                nhaXuatBan.setSDT(resultSet.getString("SDT"));
                nhaXuatBanList.add(nhaXuatBan);
            }
            return nhaXuatBanList;
        }
        catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<NhaXuatBan>();
        }
    }
    
    public static ArrayList<DeThi> Doc_Sach_Tu_CSDL() throws SQLException, ClassNotFoundException{
        ArrayList<DeThi> sachList = new ArrayList<>();
        try{
            Connection connection = DatabaseManager.getConnection();
            String query = "select * from dethi";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                DeThi sach = new DeThi();
                sach.setMaSach(resultSet.getString("MaDT"));
                sach.setTenSach(resultSet.getNString("TenDT"));
                sach.setNamXuatBan(resultSet.getInt("NamXuatBan"));
                sach.setSoTrang(resultSet.getInt("SoTrang"));
                sach.setMaNXB(resultSet.getString("MaNXB"));
                sach.setDonGia((float)resultSet.getLong("SoCauHoi"));
                sach.setSoLuongCon(resultSet.getInt("SoLuongCon"));
                sach.setMaTG(resultSet.getString("MaTG"));
                sachList.add(sach);
            }
            return sachList;
        }
        catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<DeThi>();
        }
    }
    
    public static ArrayList<TaiKhoan> Doc_TaiKhoan_Tu_CSDL() throws SQLException, ClassNotFoundException{
        ArrayList<TaiKhoan> taiKhoanList = new ArrayList<>();
     //  DES baomat=new DES();
     
        try{
            Connection connection = DatabaseManager.getConnection();
            String query = "select * from taikhoan";
           Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
          // PreparedStatement preparedStatement = connection.prepareStatement(query);
            //ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                TaiKhoan taiKhoan = new TaiKhoan();
               taiKhoan.setMaTaiKhoan(resultSet.getNString("MaTaiKhoan"));
               taiKhoan.setMatKhau(resultSet.getNString("MatKhau"));
           
               taiKhoan.setVaiTro(resultSet.getNString("VaiTro"));
               taiKhoanList.add(taiKhoan);
             
               
            }
            return taiKhoanList;
            
        }
        catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<TaiKhoan>();
        }
    }
}


   
	

