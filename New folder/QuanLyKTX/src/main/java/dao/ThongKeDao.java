/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connect.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien_tatCaThongTin_140;
import model.ThongKePhong_317;
import model.Thongke_NS_317;

/**
 *
 * @author Admin
 */
public class ThongKeDao implements ThongKeDao_317 {
    @Override
    public List<Thongke_NS_317> getListBySinhVien() {
         Connection cons = null;
		try {
			cons = KetNoiSQL.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String sql = "select  YEAR(ngaySinh) as Năm_Sinh , COUNT(*) as SinhVienSinhNam from SinhVien group by YEAR(ngaySinh);";
        List<Thongke_NS_317> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Thongke_NS_317 thongke_NS_317 = new Thongke_NS_317();
                thongke_NS_317.setNamSinh(rs.getString("Năm_Sinh"));
                thongke_NS_317.setSoLuongSV(rs.getInt("SinhVienSinhNam"));
                list.add(thongke_NS_317);
            }
            ps.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ThongKePhong_317> getListBySinhVienP() {
         Connection cons = null;
		try {
			cons = KetNoiSQL.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String sql = "select tenPhong , count(maSV) as soLuong from SinhVien join Phong on SinhVien.maPhong =  Phong.maPhong group by tenPhong;";
        List<ThongKePhong_317> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKePhong_317 thongke_P_317 = new ThongKePhong_317();
                thongke_P_317.setTenPhong(rs.getString("tenPhong"));
                thongke_P_317.setSoLuong(rs.getInt("SoLuong"));
                list.add(thongke_P_317);
            }
            ps.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
