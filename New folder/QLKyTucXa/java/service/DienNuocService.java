/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.DienNuocDao;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import model.DienNuoc_317;

/**
 *
 * @author Admin
 */
public class DienNuocService {
    private DienNuocDao dienNuocDao;

    public DienNuocService() {
        dienNuocDao = new DienNuocDao();
    }
    
    public List<DienNuoc_317> getAllDienNuoc() throws ClassNotFoundException, SQLException{
        return dienNuocDao.getTatCaThongTinDienNuoc();
    }  
    
    public void addDienNuoc(DienNuoc_317 dienNuoc_317) throws ClassNotFoundException, SQLException{
        dienNuocDao.addDienNuoc(dienNuoc_317);
    }
    public void deleteDienNuoc(String maphong , Date Thang) throws ClassNotFoundException, SQLException{
        dienNuocDao.deleteDienNuoc(maphong,Thang);
    }
    
   public void updateDienNuoc(DienNuoc_317 dienNuoc_317) throws ClassNotFoundException, SQLException{
        dienNuocDao.updateDienNuoc(dienNuoc_317);
    }
   
   public DienNuoc_317 getDoUongByMP_T(String maphong , Date Thang) throws ClassNotFoundException, SQLException{
        return dienNuocDao.getDienNuocByMP_T(maphong, Thang);
    }
}
