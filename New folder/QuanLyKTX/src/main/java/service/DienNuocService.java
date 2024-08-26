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
    
    public List<DienNuoc_317> getAllDienNuoc(){
        try {
			return dienNuocDao.getTatCaThongTinDienNuoc();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }  
    
    public void addDienNuoc(DienNuoc_317 dienNuoc_317){
        try {
			dienNuocDao.addDienNuoc(dienNuoc_317);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void deleteDienNuoc(String maphong , Date Thang){
        try {
			dienNuocDao.deleteDienNuoc(maphong,Thang);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
   public void updateDienNuoc(DienNuoc_317 dienNuoc_317){
        try {
			dienNuocDao.updateDienNuoc(dienNuoc_317);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
   
   public DienNuoc_317 getDoUongByMP_T(String maphong , Date Thang){
        try {
			return dienNuocDao.getDienNuocByMP_T(maphong, Thang);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
}
