
package service;

import connect.KetNoiSQL;
import dao.SinhVienDao;
import dao.StudentDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.SinhVien_tatCaThongTin_140;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentService {
    private StudentDao studentDao;
    private SinhVienDao svDao;
    public List<SinhVien_tatCaThongTin_140> getAlLStudents2;
   
    public StudentService(){
        studentDao = new StudentDao();
        svDao = new SinhVienDao();
    }
    public List<SinhVien_tatCaThongTin_140> getAllStudents(){
        return studentDao.getAlLStudents();
    }

    public List<SinhVien_tatCaThongTin_140> thongTinSinhVien(String maPhong){
        return studentDao.getAllStudenByRoom(maPhong);
    }
    
    public void ThemSinhVIen(SinhVien_tatCaThongTin_140 sv) throws SQLException {
        svDao.themSinhVien(sv);
    }
    public SinhVien_tatCaThongTin_140 getTangByMaPhong (String maPhong){
        return studentDao.getTangByMaPhong(maPhong);
    }      
    public SinhVien_tatCaThongTin_140 getStudentByMaSv_320 (String MaSV){
        return studentDao.getStudentByMaSv_320(MaSV);
    }      
    
    public void CapNhatThongTin(SinhVien_tatCaThongTin_140 sv){
        svDao.CapNhatThongTin(sv);
    }
}