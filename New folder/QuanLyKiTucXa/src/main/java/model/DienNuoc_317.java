/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class DienNuoc_317 {
    private String maPhong;
    private Date Thang;
    private float CScudien;
    private float CSmoidien;
    private float CScunuoc;
    private float  CSmoinuoc;
    private double TienDien;
    private double TienNuoc;
    private double  TongTien;
    public DienNuoc_317() {
    }

    public DienNuoc_317(String maPhong, Date Thang, float CScudien, float CSmoidien, float CScunuoc, float CSmoinuoc, double TienDien, double TienNuoc, double TongTien) {
        this.maPhong = maPhong;
        this.Thang = Thang;
        this.CScudien = CScudien;
        this.CSmoidien = CSmoidien;
        this.CScunuoc = CScunuoc;
        this.CSmoinuoc = CSmoinuoc;
        this.TienDien = TienDien;
        this.TienNuoc = TienNuoc;
        this.TongTien = TongTien;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public Date getThang() {
        return Thang;
    }

    public void setThang(Date Thang) {
        this.Thang = Thang;
    }

    public float getCScudien() {
        return CScudien;
    }

    public void setCScudien(float CScudien) {
        this.CScudien = CScudien;
    }

    public float getCSmoidien() {
        return CSmoidien;
    }

    public void setCSmoidien(float CSmoidien) {
        this.CSmoidien = CSmoidien;
    }

    public float getCScunuoc() {
        return CScunuoc;
    }

    public void setCScunuoc(float CScunuoc) {
        this.CScunuoc = CScunuoc;
    }

    public float getCSmoinuoc() {
        return CSmoinuoc;
    }

    public void setCSmoinuoc(float CSmoinuoc) {
        this.CSmoinuoc = CSmoinuoc;
    }

    public double getTienDien() {
        return (CSmoidien-CScudien)*1600;
    }

    public void setTienDien(double TienDien) {
        this.TienDien = TienDien;
    }

    public double getTienNuoc() {
        return (CSmoinuoc-CScunuoc)*3200;
    }

    public void setTienNuoc(double TienNuoc) {
        this.TienNuoc = TienNuoc;
    }

    public double getTongTien() {
        return getTienDien()+getTienNuoc();
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

   
}
