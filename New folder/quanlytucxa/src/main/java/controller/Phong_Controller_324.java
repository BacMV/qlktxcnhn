/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SinhVienTheoPhong_Dao_324;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JLabel;
import model.SinhVien_tatCaThongTin_140;


public class Phong_Controller_324 {
    
    SinhVienTheoPhong_Dao_324 svDao = new SinhVienTheoPhong_Dao_324();
    private JLabel labelA1,labelA2,labelA3,labelA4,labelB1,labelB2,labelB3,labelB4,labelC1,labelC2,labelC3,labelC4;
    String maPhongA1 = "MPA1";
    String maPhongA2 = "MPA2";
    String maPhongA3 = "MPA3";
    String maPhongA4 = "MPA4";
    String maPhongB1 = "MPB1";
    String maPhongB2 = "MPB2";
    String maPhongB3 = "MPB3";
    String maPhongB4 = "MPB4";
    String maPhongC1 = "MPC1";
    String maPhongC2 = "MPC2";
    String maPhongC3 = "MPC3";
    String maPhongC4 = "MPC4";
    
    public Phong_Controller_324() {
    }
        
    public Phong_Controller_324(JLabel labelA1, JLabel labelA2, JLabel labelA3,  JLabel labelA4, JLabel labelB1, JLabel labelB2, JLabel labelB3, JLabel labelB4, JLabel labelC1, JLabel labelC2, JLabel labelC3, JLabel labelC4) {
        this.labelA1 = labelA1;
        this.labelA2 = labelA2;
        this.labelA3 = labelA3;
        this.labelA3 = labelA3;
        this.labelA4 = labelA4;
        this.labelB1 = labelB1;
        this.labelB2 = labelB2;
        this.labelB3 = labelB3;
        this.labelB4 = labelB4;
        this.labelC1 = labelC1;
        this.labelC2 = labelC2;
        this.labelC3 = labelC3;
        this.labelC4 = labelC4;
    }

    public JLabel getLabelA1() {
        return labelA1;
    }

    public void setLabelA1(JLabel labelA1) {
        this.labelA1 = labelA1;
    }
    public JLabel getLabelA4() {
        return labelA1;
    }

    public void setLabelA4(JLabel labelA4) {
        this.labelA4 = labelA4;
    }

    public JLabel getLabelA2() {
        return labelA2;
    }

    public void setLabelA2(JLabel labelA2) {
        this.labelA2 = labelA2;
    }

    public JLabel getLabelA3() {
        return labelA3;
    }

    public void setLabelA3(JLabel labelA3) {
        this.labelA3 = labelA3;
    }

    public JLabel getLabelB1() {
        return labelB1;
    }

    public void setLabelB1(JLabel labelB1) {
        this.labelB1 = labelB1;
    }

    public JLabel getLabelB2() {
        return labelB2;
    }

    public void setLabelB2(JLabel labelB2) {
        this.labelB2 = labelB2;
    }

    public JLabel getLabelB3() {
        return labelB3;
    }

    public void setLabelB3(JLabel labelB3) {
        this.labelB3 = labelB3;
    }

    public JLabel getLabelB4() {
        return labelB4;
    }

    public void setLabelB4(JLabel labelB4) {
        this.labelB4 = labelB4;
    }

    public JLabel getLabelC1() {
        return labelC1;
    }

    public void setLabelC1(JLabel labelC1) {
        this.labelC1 = labelC1;
    }

    public JLabel getLabelC2() {
        return labelC2;
    }

    public void setLabelC2(JLabel labelC2) {
        this.labelC2 = labelC2;
    }

    public JLabel getLabelC3() {
        return labelC3;
    }

    public void setLabelC3(JLabel labelC3) {
        this.labelC3 = labelC3;
    }

    public JLabel getLabelC4() {
        return labelC4;
    }

    public void setLabelC4(JLabel labelC4) {
        this.labelC4 = labelC4;
    }
    public int setDemSoChoTrong(String maPhong) throws ClassNotFoundException, SQLException{
        return svDao.CountStudent(maPhong);
    }
    
    public SinhVien_tatCaThongTin_140 setDoSoChoToiDa(String maPhong) throws ClassNotFoundException, SQLException{
        return svDao.CountTotal(maPhong);
    }
    
    public int choTrong(String maPhong) throws NumberFormatException, ClassNotFoundException, SQLException{
        int a = Integer.parseInt(svDao.CountTotal(maPhong).getSoSinhVienToiDa_140()) - setDemSoChoTrong(maPhong);
        return a;
    }
    
    
    public void hienThiSoSinhVien(JLabel labelA1, JLabel labelA2, JLabel labelA3, JLabel labelA4 ,JLabel labelB1, JLabel labelB2, JLabel labelB3, JLabel labelB4, JLabel labelC1, JLabel labelC2, JLabel labelC3, JLabel labelC4) throws NumberFormatException, ClassNotFoundException, SQLException{
        
     
        labelA1.setText("Số chỗ còn trống: " + choTrong(maPhongA1));
        labelA2.setText("Số chỗ còn trống: " + choTrong(maPhongA2));
        labelA3.setText("Số chỗ còn trống: " + choTrong(maPhongA3));
        labelA4.setText("Số chỗ còn trống: " + choTrong(maPhongA4));
        labelB1.setText("Số chỗ còn trống: " + choTrong(maPhongB1));
        labelB2.setText("Số chỗ còn trống: " + choTrong(maPhongB2));
        labelB3.setText("Số chỗ còn trống: " + choTrong(maPhongB3));
        labelB4.setText("Số chỗ còn trống: " + choTrong(maPhongB4));
        labelC1.setText("Số chỗ còn trống: " + choTrong(maPhongC1));
        labelC2.setText("Số chỗ còn trống: " + choTrong(maPhongC2));
        labelC3.setText("Số chỗ còn trống: " + choTrong(maPhongC3));
        labelC4.setText("Số chỗ còn trống: " + choTrong(maPhongC4));
    }
    public void soSinhVienToiDa(JLabel labelA1, JLabel labelA2, JLabel labelA3, JLabel labelA4 ,JLabel labelB1, JLabel labelB2, JLabel labelB3, JLabel labelB4, JLabel labelC1, JLabel labelC2, JLabel labelC3, JLabel labelC4) throws NumberFormatException, ClassNotFoundException, SQLException{
        
        labelA1.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongA1).getSoSinhVienToiDa_140()));
        labelA2.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongA2).getSoSinhVienToiDa_140()));
        labelA3.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongA3).getSoSinhVienToiDa_140()));
        labelA4.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongA4).getSoSinhVienToiDa_140()));
        labelB1.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongB1).getSoSinhVienToiDa_140()));
        labelB2.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongB2).getSoSinhVienToiDa_140()));
        labelB3.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongB3).getSoSinhVienToiDa_140()));
        labelB4.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongB4).getSoSinhVienToiDa_140()));
        labelC1.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongC1).getSoSinhVienToiDa_140()));
        labelC2.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongC2).getSoSinhVienToiDa_140()));
        labelC3.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongC3).getSoSinhVienToiDa_140()));
        labelC4.setText("Tổng số chỗ: " + Integer.parseInt(svDao.CountTotal(maPhongC4).getSoSinhVienToiDa_140()));
    }
}
