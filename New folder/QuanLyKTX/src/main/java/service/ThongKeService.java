/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.ThongKeDao;
import java.util.List;
import model.ThongKePhong_317;
import model.Thongke_NS_317;

/**
 *
 * @author Admin
 */
public class ThongKeService implements ThongKeService_317{
    
    private ThongKeDao thongKeDao = null;

    public ThongKeService() {
        this.thongKeDao = new ThongKeDao();
    }

    @Override
    public List<Thongke_NS_317> getListBySinhVien() {
        return thongKeDao.getListBySinhVien();
    }

    @Override
    public List<ThongKePhong_317> getListBySinhVienP() {
        return thongKeDao.getListBySinhVienP();
    }
     
}
