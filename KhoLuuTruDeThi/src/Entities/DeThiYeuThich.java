
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.DatabaseToList;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeThiYeuThich implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String MaTaiKhoan;
    private DeThi SachDaChon;
    private int SoLuong;
    public DeThiYeuThich() {
       MaTaiKhoan ="";
        SachDaChon = new DeThi();
        SoLuong = 0;
    }

    public DeThiYeuThich(String MaTaiKhoan, DeThi SachDaChon, int SoLuong) {
        this.MaTaiKhoan = MaTaiKhoan;
        this.SachDaChon = SachDaChon;
        this.SoLuong = SoLuong;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public DeThi getSachDaChon() {
        return SachDaChon;
    }

    public void setSachDaChon(DeThi SachDaChon) {
        this.SachDaChon = SachDaChon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

  

    
    
    @Override
	public String toString() {
		return "DeThiYeuThich [MaTaiKhoan=" + MaTaiKhoan + ", SachDaChon=" + SachDaChon + ", SoLuong=" + SoLuong + "]";
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
        @SuppressWarnings("unused")
		ArrayList<DeThiYeuThich> a = DatabaseToList.Doc_DeThiYeuThich_Tu_CSDL();
    }
}
