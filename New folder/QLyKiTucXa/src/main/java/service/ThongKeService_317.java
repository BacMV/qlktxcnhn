/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.ThongKePhong_317;
import model.Thongke_NS_317;

/**
 *
 * @author Admin
 */
public interface ThongKeService_317 {
       public List<Thongke_NS_317> getListBySinhVien();
       public List<ThongKePhong_317> getListBySinhVienP();
}
