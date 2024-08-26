/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author LÊ HOÀNG ANH TUẤN
 */
public class Xe_320 {
    private String MaXe;
    private String MSV;
    private String BienSo;
    private Date NgayGui;

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getBienSo() {
        return BienSo;
    }

    public void setBienSo(String BienSo) {
        this.BienSo = BienSo;
    }

    public Date getNgayGui() {
        return NgayGui;
    }

    public void setNgayGui(Date NgayGui) {
        this.NgayGui = NgayGui;
    }
}
