
package dao;

import connect.KetNoiSQL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DienNuoc_317;

public class DienNuocDao {

    public List<DienNuoc_317> getTatCaThongTinDienNuoc() throws ClassNotFoundException, SQLException {
        List<DienNuoc_317> dienNuoc = new ArrayList<DienNuoc_317>();
        Connection connection = KetNoiSQL.getConnection();
        String sql = " SELECT * FROM DienNuoc";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                DienNuoc_317 dn = new DienNuoc_317();
                dn.setMaPhong(rs.getString("maPhong"));
                dn.setThang(rs.getDate("Thang"));
                dn.setCScudien(rs.getFloat("CScudien"));
                dn.setCSmoidien(rs.getFloat("CSmoidien"));
                dn.setCScunuoc(rs.getFloat("CScunuoc"));
                dn.setCSmoinuoc(rs.getFloat("CSmoinuoc"));
                dienNuoc.add(dn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dienNuoc;
    }

    public DienNuoc_317 getDienNuocByMP_T(String maPhong, Date thang) throws ClassNotFoundException, SQLException {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from Diennuoc where maPhong = ? and thang = ?";

        try {
            PreparedStatement stm;
            stm = conn.prepareStatement(sql);
            stm.setString(1, maPhong);
            stm.setDate(2, thang);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                DienNuoc_317 dienNuoc_317 = new DienNuoc_317();
                dienNuoc_317.setMaPhong(rs.getString("MaPhong"));
                dienNuoc_317.setThang(rs.getDate("Thang"));
                dienNuoc_317.setCScudien(rs.getFloat("CScudien"));
                dienNuoc_317.setCSmoidien(rs.getFloat("CSmoidien"));
                dienNuoc_317.setCScunuoc(rs.getFloat("CScunuoc"));
                dienNuoc_317.setCSmoinuoc(rs.getFloat("CSmoinuoc"));
                return dienNuoc_317;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addDienNuoc(DienNuoc_317 dienNuoc_317) throws ClassNotFoundException, SQLException {
        Connection connection = KetNoiSQL.getConnection();
        String sql = "INSERT INTO Diennuoc( maPhong, Thang, CScudien, CSmoidien, CScunuoc, CSmoinuoc)"
                + "VALUES(?,?,?,?,?,?)";

        PreparedStatement stm;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, dienNuoc_317.getMaPhong());
            stm.setDate(2, new Date(dienNuoc_317.getThang().getTime()) );
            stm.setFloat(3, dienNuoc_317.getCScudien());
            stm.setFloat(4, dienNuoc_317.getCSmoidien());
            stm.setFloat(5, dienNuoc_317.getCScunuoc());
            stm.setFloat(6, dienNuoc_317.getCSmoinuoc());

            int rs = stm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateDienNuoc(DienNuoc_317 dienNuoc_317) throws ClassNotFoundException, SQLException {
        Connection connection = KetNoiSQL.getConnection();
        String sql = "Update Diennuoc set maPhong = ? , Thang = ? , CScudien = ? , CSmoidien =? , CScunuoc = ? , CSmoinuoc = ?  where maPhong = ? and Thang = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, dienNuoc_317.getMaPhong());
            preparedStatement.setDate(2, new Date(dienNuoc_317.getThang().getTime()));
            preparedStatement.setFloat(3, dienNuoc_317.getCScudien());
            preparedStatement.setFloat(4, dienNuoc_317.getCSmoidien());
            preparedStatement.setFloat(5, dienNuoc_317.getCScunuoc());
            preparedStatement.setFloat(6, dienNuoc_317.getCSmoinuoc());
            preparedStatement.setString(7, dienNuoc_317.getMaPhong());
            preparedStatement.setDate(8, new Date(dienNuoc_317.getThang().getTime()));
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteDienNuoc(String maphong , Date thang) throws ClassNotFoundException, SQLException {
        Connection connection = KetNoiSQL.getConnection();
        String sql = "delete from Diennuoc where maPhong = ? and Thang = ?  ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,maphong);
            preparedStatement.setDate(2,thang);
            int rs = preparedStatement.executeUpdate();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
