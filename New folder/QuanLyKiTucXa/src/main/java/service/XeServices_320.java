/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.XeDao_320;

import java.sql.SQLException;
import java.util.List;
import model.Xe_320;

/**
 *
 * @author LÊ HOÀNG ANH TUẤN
 */
public class XeServices_320 {

    XeDao_320 xeDao_320 = new XeDao_320();

    public List<Xe_320> getAllMotobike() {
        return xeDao_320.getAllMotobike();
    }

    public void addMotobike(Xe_320 xe) throws ClassNotFoundException, SQLException {
        xeDao_320.addMotobike(xe);
    }

    public void deleteMotobike(String maXe) throws ClassNotFoundException {
        xeDao_320.deleteMotobike(maXe);
    }

    public Xe_320 getMotobikeById(String maXe) throws ClassNotFoundException, SQLException{
        return xeDao_320.getMotobikeById(maXe);
    }
    
    public void editMotobike(Xe_320 xe) throws ClassNotFoundException, SQLException{
        xeDao_320.editMotobike(xe);
    }
}
