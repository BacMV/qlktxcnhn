
package controller;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class ThietLap_controller_324 {
    private JTextField maSV, hoTen, cmnd, soDT, queQuan, tenNGH, soDTGH, quanHe, ngheNghiep ;
    private JRadioButton buttonNam, buttonNu;
    private JDateChooser ngaySinh, ngayHD;
    public JRadioButton getButtonNam() {
        return buttonNam;
    }

    public void setButtonNam(JRadioButton buttonNam) {
        this.buttonNam = buttonNam;
    }

    public JRadioButton getButtonNu() {
        return buttonNu;
    }

    public void setButtonNu(JRadioButton buttonNu) {
        this.buttonNu = buttonNu;
    }
    public ThietLap_controller_324() {
    }

    public ThietLap_controller_324(JTextField maSV, JTextField hoTen, JTextField cmnd, JTextField soDT, JTextField queQuan, JTextField tenNGH, JTextField soDTGH, JTextField quanHe, JTextField ngheNghiep, JRadioButton buttonNam, JRadioButton buttonNu, JDateChooser ngaySinh, JDateChooser ngayHD) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.cmnd = cmnd;
        this.soDT = soDT;
        this.queQuan = queQuan;
        this.tenNGH = tenNGH;
        this.soDTGH = soDTGH;
        this.quanHe = quanHe;
        this.ngheNghiep = ngheNghiep;
        this.buttonNam = buttonNam;
        this.buttonNu = buttonNu;
        this.ngaySinh = ngaySinh;
        this.ngayHD = ngayHD;
    }

    public JDateChooser getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(JDateChooser ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public JDateChooser getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(JDateChooser ngayHD) {
        this.ngayHD = ngayHD;
    }

    
    public void LamMoi(JTextField maSV, JTextField hoTen, JTextField cmnd, JTextField soDT, JTextField queQuan, JTextField tenNGH, JTextField soDTGH, JTextField quanHe, JTextField ngheNghiep, JRadioButton buttonNam, JRadioButton buttonNu, JDateChooser ngaySinh,JDateChooser ngayHD){
        maSV.setText("");
        hoTen.setText("");
        cmnd.setText("");
        soDT.setText("");
        queQuan.setText("");
        tenNGH.setText("");
        soDTGH.setText("");
        quanHe.setText("");
        ngheNghiep.setText("");
        buttonNam.setSelected(true);
        buttonNu.setSelected(false);
//        ngaySinh.setDateFormatString("");
//        ngayHD.setDateFormatString("");
    }
    
    public void capNhat(JTextField maSV, JTextField hoTen, JTextField cmnd, JTextField soDT, JTextField queQuan, JTextField tenNGH, JTextField soDTGH, JTextField quanHe, JTextField ngheNghiep){
        maSV.setEditable(true);
        hoTen.setEditable(true);
        cmnd.setEditable(true);
        soDT.setEditable(true);
        queQuan.setEditable(true);
        tenNGH.setEditable(true);
        soDTGH.setEditable(true);
        quanHe.setEditable(true);
        ngheNghiep.setEditable(true);
    }
    
    public void dongCapNhat(JTextField maSV, JTextField hoTen, JTextField cmnd, JTextField soDT, JTextField queQuan, JTextField tenNGH, JTextField soDTGH, JTextField quanHe, JTextField ngheNghiep){
        maSV.setEditable(false);
        hoTen.setEditable(false);
        cmnd.setEditable(false);
        soDT.setEditable(false);
        queQuan.setEditable(false);
        tenNGH.setEditable(false);
        soDTGH.setEditable(false);
        quanHe.setEditable(false);
        ngheNghiep.setEditable(false);
    }
    
    public JTextField getMaSV() {
        return maSV;
    }

    public void setMaSV(JTextField maSV) {
        this.maSV = maSV;
    }

    public JTextField getHoTen() {
        return hoTen;
    }

    public void setHoTen(JTextField hoTen) {
        this.hoTen = hoTen;
    }

    public JTextField getCmnd() {
        return cmnd;
    }

    public void setCmnd(JTextField cmnd) {
        this.cmnd = cmnd;
    }

    public JTextField getSoDT() {
        return soDT;
    }

    public void setSoDT(JTextField soDT) {
        this.soDT = soDT;
    }

    public JTextField getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(JTextField queQuan) {
        this.queQuan = queQuan;
    }

    public JTextField getTenNGH() {
        return tenNGH;
    }

    public void setTenNGH(JTextField tenNGH) {
        this.tenNGH = tenNGH;
    }

    public JTextField getSoDTGH() {
        return soDTGH;
    }

    public void setSoDTGH(JTextField soDTGH) {
        this.soDTGH = soDTGH;
    }

    public JTextField getQuanHe() {
        return quanHe;
    }

    public void setQuanHe(JTextField quanHe) {
        this.quanHe = quanHe;
    }

    public JTextField getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(JTextField ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
    

}
