
package view;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.net.URI;
import controller.Controller_DieuKhien_trangChu_324;
import controller.Phong_Controller_324;
import controller.QuanLyThongKeContrller;
import dao.DienNuocDao;
import dao.SinhVienDao;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import model.DienNuoc_317;
import model.TaiKhoanDangNhap_324;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import service.*;

public class TrangChu extends javax.swing.JFrame {
    List<JPanel> listPanel_317 = new ArrayList<>();
    List<JPanel> listPanelCon = new ArrayList<>();
    List<JLabel> listLabel_317 = new ArrayList<>();
    DienNuocService dienNuocService = new DienNuocService();
    TaiKhoanService_324 taiKhoanService_324 = new TaiKhoanService_324();
    Phong_Controller_324 phong324 = new Phong_Controller_324();
    Controller_DieuKhien_trangChu_324 ctr ;
    
    String[] title = {"Ma phong","Ma sinh vien" , "Ten" , "CMND", "Gioi tinh", "Que Quan"}; 
    String[] title_317 = {"Mã Phòng","Ngày Thanh Toán","CScudien","CSmoidien","CScunuoc","CSmoinuoc","Tiền Điện","Tiền Nước" ,"Tổng Tiền"};
    
    DefaultTableModel defaultTableModel = new DefaultTableModel(title,0){
        public boolean isCellEditable(int row, int column){
             return false;
            }
        };
    
        DefaultTableModel defaultTableModel1 = new DefaultTableModel(title_317,0){
        public boolean isCellEditable(int row, int column){
             return false;
            }
        };
                
    public TrangChu() throws ClassNotFoundException, SQLException {
        initComponents();
        Add_listPanel();
        Add_listLabel();
        Add_listPanelCon();
        Choose_Panel(0);
        Choose_Lable(0);
        jpn_QLSinhVien_324.setVisible(false);
        setLocationRelativeTo(null);
        jpn_quanLyTiemKiem.setVisible(false);
        ctr = new Controller_DieuKhien_trangChu_324();
        ctr.SetTable(tbSV,defaultTableModel);
        ctr.SetTable_317(tbDN, defaultTableModel1);
        phong324.hienThiSoSinhVien(soChoTrongA1_JLable_324,soChoTrongA2_JLable_324,soChoTrongA3_JLable_324,soChoTrongA4_JLable_324,soChoTrongB1_JLable_324,soChoTrongB2_JLable_324,soChoTrongB3_JLable_324,soChoTrongB4_JLable_324,soChoTrongC1_JLable_324,soChoTrongC2_JLable_324,soChoTrongC3_JLable_324,soChoTrongC4_JLable_324);
        phong324.soSinhVienToiDa(tongChoA1, tongChoA2, tongChoA3, tongChoA4, tongChoB1, tongChoB2, tongChoB3, tongChoB4, tongChoC1, tongChoC2, tongChoC3, tongChoC4);
         
    }

    public void Add_listPanel(){
        listPanel_317.add(jpn_TrangChu_317);
        listPanel_317.add(jpn_CaiDat_317);
        listPanel_317.add(jpn_DangXuat_317);
    }
    
    public void Add_listLabel(){
        listLabel_317.add(jlb_TrangChu_317);
        listLabel_317.add(jlb_phong_317);
        listLabel_317.add(jlb_ThongKe_317);
    }
    public void Add_listPanelCon(){
        listPanelCon.add(QuanLyTrangChu);
        listPanelCon.add(jpn_QLSinhVien_324);
        listPanelCon.add(jpn_DangKyKTX_324);
        listPanelCon.add(jpn_QLPhongKTX_324);
        listPanelCon.add(jpn_QLThongKe_324);
        listPanelCon.add(jpn_QLDienNuoc_324);
        listPanelCon.add(jpn_QLNhanXe_324);              
    }
    
     public void Choose_Panel(int index_324){
         
        for(int i=0; i<listPanelCon.size();i++){
                if(i == index_324){
                    listPanelCon.get(i).setVisible(true);
                    
                }
                else{
                    
                    listPanelCon.get(i).setVisible(false);
//                    jpn_TrangChu_317.setVisible(false);
                    jpn_CaiDat_317.setVisible(false);
                }
        }
    }
    public void Choose_Lable(int index_317){
        for(int i=0; i<listPanel_317.size();i++){
            for(int x=0; x<listLabel_317.size();x++)
                if(i == index_317){
                    listPanel_317.get(i).setVisible(true);
                    listLabel_317.get(i).setBorder(new MatteBorder(0 , 4 , 0 , 0 , Color.red));
                    listLabel_317.get(i).setBackground(new Color(85,65,118));
                }
                else{
                    listPanel_317.get(i).setVisible(false);
                    listLabel_317.get(i).setBorder(new MatteBorder(0, 0 , 0 , 0 , Color.red));
                    listLabel_317.get(i).setBackground(new Color(64,43,100));
                }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSpinner1 = new javax.swing.JSpinner();
        jpn_Chung_317 = new javax.swing.JPanel();
        jpn_DieuKhien_317 = new javax.swing.JPanel();
        jlb_TrangChu_317 = new javax.swing.JLabel();
        jlb_phong_317 = new javax.swing.JLabel();
        jlb_ThongKe_317 = new javax.swing.JLabel();
        Name_KTX_317 = new javax.swing.JLabel();
        jSeparator1_317 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpn_ThietKe_317 = new javax.swing.JPanel();
        jpn_CaiDat_317 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        User_name_317 = new javax.swing.JTextField();
        pass_317 = new javax.swing.JTextField();
        hvt = new javax.swing.JLabel();
        ht_317 = new javax.swing.JTextField();
        a = new javax.swing.JLabel();
        sdt_317 = new javax.swing.JTextField();
        sdt = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jpn_TrangChu_317 = new javax.swing.JPanel();
        QuanLyTrangChu = new javax.swing.JPanel();
        jPanel1_QuanLySinhVien_317 = new javax.swing.JPanel();
        jLabel2_qlsv_317 = new javax.swing.JLabel();
        icon_qlsv_317 = new javax.swing.JLabel();
        jPanel2_DangKiKTX_317 = new javax.swing.JPanel();
        jLabel2_dkktx_317 = new javax.swing.JLabel();
        icon_dkktx_317 = new javax.swing.JLabel();
        jPanel3_QuanLyPhongKTX_317 = new javax.swing.JPanel();
        jLabel2_qlpktx_317 = new javax.swing.JLabel();
        jLabel4_icon_qlpktx_317 = new javax.swing.JLabel();
        jPanel4_ThongKe_317 = new javax.swing.JPanel();
        jLabel2_tk_317 = new javax.swing.JLabel();
        jLabel8_icon_tk_317 = new javax.swing.JLabel();
        jPanel5_QuanLyDienNuoc_317 = new javax.swing.JPanel();
        jLabel2_tp_317 = new javax.swing.JLabel();
        jLabel7_icon_tp_317 = new javax.swing.JLabel();
        jPanel1_QuanLyNhaXe_317 = new javax.swing.JPanel();
        jLabel1_qlnx_317 = new javax.swing.JLabel();
        jLabel6_icon_qlnx_317 = new javax.swing.JLabel();
        jpn_QLSinhVien_324 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbSV = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtf_tiemKiem = new javax.swing.JTextField();
        jbt_tiemKiem = new javax.swing.JButton();
        jpn_quanLyTiemKiem = new javax.swing.JPanel();
        panelcon = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_queQuan = new javax.swing.JList<>();
        dongCS = new javax.swing.JLabel();
        jpnCMND = new javax.swing.JPanel();
        jtf_soCMND = new javax.swing.JTextField();
        jbt_tk_SoCMND = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jpn_MSV = new javax.swing.JPanel();
        jtf_timMaSV = new javax.swing.JTextField();
        btn_tk_MaSV = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_dong_tkMSV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jpn_DangKyKTX_324 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jpn_QLPhongKTX_324 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jpn_Tang1 = new javax.swing.JPanel();
        jpn_Phong1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tongChoA1 = new javax.swing.JLabel();
        soChoTrongA1_JLable_324 = new javax.swing.JLabel();
        jpn_Phong2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        tongChoA2 = new javax.swing.JLabel();
        soChoTrongA2_JLable_324 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        tongChoA4 = new javax.swing.JLabel();
        soChoTrongA4_JLable_324 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        tongChoA3 = new javax.swing.JLabel();
        soChoTrongA3_JLable_324 = new javax.swing.JLabel();
        jpn_Tang2 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        tongChoB4 = new javax.swing.JLabel();
        soChoTrongB4_JLable_324 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        tongChoB2 = new javax.swing.JLabel();
        soChoTrongB2_JLable_324 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        tongChoB1 = new javax.swing.JLabel();
        soChoTrongB1_JLable_324 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        tongChoB3 = new javax.swing.JLabel();
        soChoTrongB3_JLable_324 = new javax.swing.JLabel();
        jpn_Tang3 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        tongChoC1 = new javax.swing.JLabel();
        soChoTrongC1_JLable_324 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        tongChoC3 = new javax.swing.JLabel();
        soChoTrongC3_JLable_324 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        tongChoC4 = new javax.swing.JLabel();
        soChoTrongC4_JLable_324 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        tongChoC2 = new javax.swing.JLabel();
        soChoTrongC2_JLable_324 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jpn_QLThongKe_324 = new javax.swing.JPanel();
        tk1_317 = new javax.swing.JPanel();
        TK_2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jpn_QLDienNuoc_324 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDN = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        mp_317 = new javax.swing.JTextField();
        csdc_317 = new javax.swing.JTextField();
        csnc_317 = new javax.swing.JTextField();
        csdm_317 = new javax.swing.JTextField();
        csnm_317 = new javax.swing.JTextField();
        ntt_317 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jpn_QLNhanXe_324 = new javax.swing.JPanel();
        jpn_DangXuat_317 = new javax.swing.JPanel();
        thanh_Xoa_phongTo_317 = new javax.swing.JPanel();
        thoat_317 = new javax.swing.JLabel();
        Phongto_ThuNho_317 = new javax.swing.JLabel();
        an_317 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpn_Chung_317.setPreferredSize(new java.awt.Dimension(1064, 555));

        jpn_DieuKhien_317.setBackground(new java.awt.Color(54, 33, 89));

        jlb_TrangChu_317.setBackground(new java.awt.Color(64, 43, 100));
        jlb_TrangChu_317.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlb_TrangChu_317.setForeground(new java.awt.Color(255, 255, 255));
        jlb_TrangChu_317.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_TrangChu_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/go_home_icon_181144.png"))); // NOI18N
        jlb_TrangChu_317.setText("        Trang Chủ");
        jlb_TrangChu_317.setOpaque(true);
        jlb_TrangChu_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_TrangChu_317MouseClicked(evt);
            }
        });

        jlb_phong_317.setBackground(new java.awt.Color(64, 43, 100));
        jlb_phong_317.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlb_phong_317.setForeground(new java.awt.Color(255, 255, 255));
        jlb_phong_317.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_phong_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/caiDat.png"))); // NOI18N
        jlb_phong_317.setText("         Cài Đặt");
        jlb_phong_317.setOpaque(true);
        jlb_phong_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_phong_317MouseClicked(evt);
            }
        });

        jlb_ThongKe_317.setBackground(new java.awt.Color(64, 43, 100));
        jlb_ThongKe_317.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlb_ThongKe_317.setForeground(new java.awt.Color(255, 255, 255));
        jlb_ThongKe_317.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_ThongKe_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/system_log_out_icon_181207.png"))); // NOI18N
        jlb_ThongKe_317.setText("       Đăng Xuất");
        jlb_ThongKe_317.setOpaque(true);
        jlb_ThongKe_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_ThongKe_317MouseClicked(evt);
            }
        });

        Name_KTX_317.setBackground(new java.awt.Color(255, 255, 255));
        Name_KTX_317.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Name_KTX_317.setForeground(new java.awt.Color(255, 255, 255));
        Name_KTX_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name_KTX_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo-truong-250.png"))); // NOI18N
        Name_KTX_317.setText("Quản Lý Ký Túc Xá");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/facebook.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/youtube.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/twitter.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jpn_DieuKhien_317Layout = new javax.swing.GroupLayout(jpn_DieuKhien_317);
        jpn_DieuKhien_317.setLayout(jpn_DieuKhien_317Layout);
        jpn_DieuKhien_317Layout.setHorizontalGroup(
            jpn_DieuKhien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_DieuKhien_317Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_DieuKhien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlb_ThongKe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_phong_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlb_TrangChu_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jpn_DieuKhien_317Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1_317)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_DieuKhien_317Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name_KTX_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpn_DieuKhien_317Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn_DieuKhien_317Layout.setVerticalGroup(
            jpn_DieuKhien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_DieuKhien_317Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name_KTX_317, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1_317, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jlb_TrangChu_317, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jlb_phong_317, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jlb_ThongKe_317, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpn_ThietKe_317.setBackground(new java.awt.Color(51, 153, 255));
        jpn_ThietKe_317.setLayout(new java.awt.CardLayout());

        jpn_CaiDat_317.setBackground(new java.awt.Color(120, 100, 200));
        jpn_CaiDat_317.setLayout(new java.awt.GridBagLayout());

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CÀI ĐẶT TÀI KHOẢN CHUNG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 434;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jpn_CaiDat_317.add(jLabel20, gridBagConstraints);

        jPanel11.setBackground(new java.awt.Color(120, 100, 200));

        User_name_317.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        pass_317.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        hvt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        hvt.setForeground(new java.awt.Color(255, 255, 255));
        hvt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hvt.setText("Họ và tên");

        ht_317.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ht_317.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ht_317ActionPerformed(evt);
            }
        });

        a.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText("Email");

        sdt_317.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        sdt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        sdt.setForeground(new java.awt.Color(255, 255, 255));
        sdt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sdt.setText("Số điện thoại");

        email.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        pass.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass.setText("Mật khẩu");

        userName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("Tên đăng nhập");

        jButton14.setBackground(new java.awt.Color(0, 51, 153));
        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Trở lại");
        jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(51, 51, 255)));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 51, 153));
        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Sửa");
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(51, 51, 255)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton15ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(User_name_317, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(pass_317, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(hvt, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(ht_317, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(sdt_317, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(User_name_317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(pass_317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hvt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(ht_317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(sdt_317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jpn_CaiDat_317.add(jPanel11, gridBagConstraints);

        jpn_ThietKe_317.add(jpn_CaiDat_317, "card5");

        jpn_TrangChu_317.setBackground(new java.awt.Color(255, 255, 255));
        jpn_TrangChu_317.setLayout(new java.awt.CardLayout());

        QuanLyTrangChu.setBackground(new java.awt.Color(120, 100, 200));

        jPanel1_QuanLySinhVien_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel1_QuanLySinhVien_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1_QuanLySinhVien_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1_QuanLySinhVien_317MouseClicked(evt);
            }
        });

        jLabel2_qlsv_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2_qlsv_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_qlsv_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_qlsv_317.setText("QUẢN LÝ SINH VIÊN");
        jLabel2_qlsv_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        icon_qlsv_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_qlsv_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/management_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1_QuanLySinhVien_317Layout = new javax.swing.GroupLayout(jPanel1_QuanLySinhVien_317);
        jPanel1_QuanLySinhVien_317.setLayout(jPanel1_QuanLySinhVien_317Layout);
        jPanel1_QuanLySinhVien_317Layout.setHorizontalGroup(
            jPanel1_QuanLySinhVien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_QuanLySinhVien_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(icon_qlsv_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel2_qlsv_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1_QuanLySinhVien_317Layout.setVerticalGroup(
            jPanel1_QuanLySinhVien_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_QuanLySinhVien_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(icon_qlsv_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel2_qlsv_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2_DangKiKTX_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel2_DangKiKTX_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2_DangKiKTX_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2_DangKiKTX_317MouseClicked(evt);
            }
        });

        jLabel2_dkktx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2_dkktx_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_dkktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_dkktx_317.setText("ĐĂNG KÍ KTX");
        jLabel2_dkktx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        icon_dkktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_dkktx_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/student_registration_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2_DangKiKTX_317Layout = new javax.swing.GroupLayout(jPanel2_DangKiKTX_317);
        jPanel2_DangKiKTX_317.setLayout(jPanel2_DangKiKTX_317Layout);
        jPanel2_DangKiKTX_317Layout.setHorizontalGroup(
            jPanel2_DangKiKTX_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_DangKiKTX_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(icon_dkktx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel2_dkktx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2_DangKiKTX_317Layout.setVerticalGroup(
            jPanel2_DangKiKTX_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_DangKiKTX_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(icon_dkktx_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel2_dkktx_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3_QuanLyPhongKTX_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel3_QuanLyPhongKTX_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3_QuanLyPhongKTX_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3_QuanLyPhongKTX_317MouseClicked(evt);
            }
        });

        jLabel2_qlpktx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2_qlpktx_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_qlpktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_qlpktx_317.setText("QUẢN LÝ PHÒNG KTX");
        jLabel2_qlpktx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4_icon_qlpktx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_icon_qlpktx_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bunk_bed_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3_QuanLyPhongKTX_317Layout = new javax.swing.GroupLayout(jPanel3_QuanLyPhongKTX_317);
        jPanel3_QuanLyPhongKTX_317.setLayout(jPanel3_QuanLyPhongKTX_317Layout);
        jPanel3_QuanLyPhongKTX_317Layout.setHorizontalGroup(
            jPanel3_QuanLyPhongKTX_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_QuanLyPhongKTX_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4_icon_qlpktx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel2_qlpktx_317, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3_QuanLyPhongKTX_317Layout.setVerticalGroup(
            jPanel3_QuanLyPhongKTX_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_QuanLyPhongKTX_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4_icon_qlpktx_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel2_qlpktx_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4_ThongKe_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel4_ThongKe_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4_ThongKe_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4_ThongKe_317MouseClicked(evt);
            }
        });

        jLabel2_tk_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2_tk_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_tk_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_tk_317.setText("THỐNG KÊ");
        jLabel2_tk_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8_icon_tk_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8_icon_tk_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/statistics_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4_ThongKe_317Layout = new javax.swing.GroupLayout(jPanel4_ThongKe_317);
        jPanel4_ThongKe_317.setLayout(jPanel4_ThongKe_317Layout);
        jPanel4_ThongKe_317Layout.setHorizontalGroup(
            jPanel4_ThongKe_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_ThongKe_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel8_icon_tk_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel2_tk_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4_ThongKe_317Layout.setVerticalGroup(
            jPanel4_ThongKe_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_ThongKe_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel8_icon_tk_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel2_tk_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5_QuanLyDienNuoc_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel5_QuanLyDienNuoc_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5_QuanLyDienNuoc_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5_QuanLyDienNuoc_317MouseClicked(evt);
            }
        });

        jLabel2_tp_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2_tp_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_tp_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_tp_317.setText("QUẢN LÝ ĐIỆN NƯỚC");
        jLabel2_tp_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7_icon_tp_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7_icon_tp_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/expensive_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5_QuanLyDienNuoc_317Layout = new javax.swing.GroupLayout(jPanel5_QuanLyDienNuoc_317);
        jPanel5_QuanLyDienNuoc_317.setLayout(jPanel5_QuanLyDienNuoc_317Layout);
        jPanel5_QuanLyDienNuoc_317Layout.setHorizontalGroup(
            jPanel5_QuanLyDienNuoc_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5_QuanLyDienNuoc_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel7_icon_tp_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel2_tp_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5_QuanLyDienNuoc_317Layout.setVerticalGroup(
            jPanel5_QuanLyDienNuoc_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5_QuanLyDienNuoc_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7_icon_tp_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel2_tp_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1_QuanLyNhaXe_317.setBackground(new java.awt.Color(121, 130, 222));
        jPanel1_QuanLyNhaXe_317.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1_QuanLyNhaXe_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1_QuanLyNhaXe_317MouseClicked(evt);
            }
        });

        jLabel1_qlnx_317.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel1_qlnx_317.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_qlnx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_qlnx_317.setText("QUẢN LÝ NHÀ XE");
        jLabel1_qlnx_317.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6_icon_qlnx_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_icon_qlnx_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/garage_64px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1_QuanLyNhaXe_317Layout = new javax.swing.GroupLayout(jPanel1_QuanLyNhaXe_317);
        jPanel1_QuanLyNhaXe_317.setLayout(jPanel1_QuanLyNhaXe_317Layout);
        jPanel1_QuanLyNhaXe_317Layout.setHorizontalGroup(
            jPanel1_QuanLyNhaXe_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_QuanLyNhaXe_317Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6_icon_qlnx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addComponent(jLabel1_qlnx_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1_QuanLyNhaXe_317Layout.setVerticalGroup(
            jPanel1_QuanLyNhaXe_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_QuanLyNhaXe_317Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6_icon_qlnx_317)
                .addGap(0, 0, 0)
                .addComponent(jLabel1_qlnx_317, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout QuanLyTrangChuLayout = new javax.swing.GroupLayout(QuanLyTrangChu);
        QuanLyTrangChu.setLayout(QuanLyTrangChuLayout);
        QuanLyTrangChuLayout.setHorizontalGroup(
            QuanLyTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLyTrangChuLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(QuanLyTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4_ThongKe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1_QuanLySinhVien_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(QuanLyTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2_DangKiKTX_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5_QuanLyDienNuoc_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(QuanLyTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1_QuanLyNhaXe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3_QuanLyPhongKTX_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        QuanLyTrangChuLayout.setVerticalGroup(
            QuanLyTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLyTrangChuLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(QuanLyTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3_QuanLyPhongKTX_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2_DangKiKTX_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1_QuanLySinhVien_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(QuanLyTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4_ThongKe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5_QuanLyDienNuoc_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1_QuanLyNhaXe_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(195, 195, 195))
        );

        jpn_TrangChu_317.add(QuanLyTrangChu, "card2");

        jpn_QLSinhVien_324.setBackground(new java.awt.Color(120, 100, 200));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbSV.setAlignmentX(1.0F);
        tbSV.setAlignmentY(1.0F);
        tbSV.setGridColor(new java.awt.Color(255, 255, 255));
        tbSV.setRowHeight(28);
        tbSV.setSelectionBackground(new java.awt.Color(255, 102, 0));
        jScrollPane4.setViewportView(tbSV);

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xem chi tiết");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(255, 255, 0), new java.awt.Color(51, 51, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton1ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUẢN LÝ THÔNG TIN CỦA TẤT CẢ CÁC SINH VIÊN TRONG KÝ TÚC XÁ");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nhập vào tên để tìm kiếm:");

        jtf_tiemKiem.setBackground(new java.awt.Color(199, 196, 196));
        jtf_tiemKiem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_tiemKiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jtf_tiemKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tiemKiemActionPerformed(evt);
            }
        });

        jbt_tiemKiem.setBackground(new java.awt.Color(0, 102, 255));
        jbt_tiemKiem.setForeground(new java.awt.Color(255, 255, 255));
        jbt_tiemKiem.setText("Tìm kiếm");
        jbt_tiemKiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(51, 51, 255)));
        jbt_tiemKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jbt_tiemKiemActionPerformed(evt);
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jpn_quanLyTiemKiem.setLayout(new java.awt.CardLayout());

        panelcon.setBackground(new java.awt.Color(255, 51, 51));

        jl_queQuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jl_queQuanMouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jScrollPane6.setViewportView(jl_queQuan);

        dongCS.setForeground(new java.awt.Color(255, 255, 255));
        dongCS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dongCS.setText("TẮT");
        dongCS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					dongCSMouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout panelconLayout = new javax.swing.GroupLayout(panelcon);
        panelcon.setLayout(panelconLayout);
        panelconLayout.setHorizontalGroup(
            panelconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dongCS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
        );
        panelconLayout.setVerticalGroup(
            panelconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dongCS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpn_quanLyTiemKiem.add(panelcon, "card3");

        jpnCMND.setBackground(new java.awt.Color(255, 153, 153));

        jtf_soCMND.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_soCMND.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtf_soCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_soCMNDActionPerformed(evt);
            }
        });

        jbt_tk_SoCMND.setBackground(new java.awt.Color(51, 102, 255));
        jbt_tk_SoCMND.setForeground(new java.awt.Color(255, 255, 255));
        jbt_tk_SoCMND.setText("Tìm kiếm");
        jbt_tk_SoCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jbt_tk_SoCMNDActionPerformed(evt);
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nhập vào số CMND:");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Đóng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton2ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jpnCMNDLayout = new javax.swing.GroupLayout(jpnCMND);
        jpnCMND.setLayout(jpnCMNDLayout);
        jpnCMNDLayout.setHorizontalGroup(
            jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCMNDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_soCMND)
                    .addGroup(jpnCMNDLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpnCMNDLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jbt_tk_SoCMND)))
                .addContainerGap())
        );
        jpnCMNDLayout.setVerticalGroup(
            jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCMNDLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_soCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpnCMNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_tk_SoCMND)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jpn_quanLyTiemKiem.add(jpnCMND, "card4");

        jtf_timMaSV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_timMaSV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtf_timMaSV.setName(""); // NOI18N
        jtf_timMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_timMaSVActionPerformed(evt);
            }
        });

        btn_tk_MaSV.setBackground(new java.awt.Color(51, 102, 255));
        btn_tk_MaSV.setForeground(new java.awt.Color(255, 255, 255));
        btn_tk_MaSV.setText("Tìm kiếm");
        btn_tk_MaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btn_tk_MaSVActionPerformed(evt);
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nhập vào mã sinh viên:");

        btn_dong_tkMSV.setBackground(new java.awt.Color(255, 0, 0));
        btn_dong_tkMSV.setForeground(new java.awt.Color(255, 255, 255));
        btn_dong_tkMSV.setText("Đóng");
        btn_dong_tkMSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btn_dong_tkMSVActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jpn_MSVLayout = new javax.swing.GroupLayout(jpn_MSV);
        jpn_MSV.setLayout(jpn_MSVLayout);
        jpn_MSVLayout.setHorizontalGroup(
            jpn_MSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_MSVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_MSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_timMaSV)
                    .addGroup(jpn_MSVLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpn_MSVLayout.createSequentialGroup()
                        .addComponent(btn_dong_tkMSV, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btn_tk_MaSV)))
                .addContainerGap())
        );
        jpn_MSVLayout.setVerticalGroup(
            jpn_MSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_MSVLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_timMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpn_MSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tk_MaSV)
                    .addComponent(btn_dong_tkMSV))
                .addContainerGap())
        );

        jpn_quanLyTiemKiem.add(jpn_MSV, "card4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        jpn_quanLyTiemKiem.add(jPanel2, "card5");

        jComboBox2.setBackground(new java.awt.Color(255, 102, 102));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quê quán", "CMND", "Mã sinh viên" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jComboBox2ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Bộ lọc:");
        jLabel3.setToolTipText("");

        jButton4.setBackground(new java.awt.Color(51, 102, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Làm mới");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 0), new java.awt.Color(51, 51, 255)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton4ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_tiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbt_tiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap(531, Short.MAX_VALUE)
                    .addComponent(jpn_quanLyTiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_tiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_tiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jpn_quanLyTiemKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jButton5.setBackground(new java.awt.Color(0, 51, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Quay lại");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(51, 51, 255)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_QLSinhVien_324Layout = new javax.swing.GroupLayout(jpn_QLSinhVien_324);
        jpn_QLSinhVien_324.setLayout(jpn_QLSinhVien_324Layout);
        jpn_QLSinhVien_324Layout.setHorizontalGroup(
            jpn_QLSinhVien_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpn_QLSinhVien_324Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_QLSinhVien_324Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jpn_QLSinhVien_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(34, 34, 34))
        );
        jpn_QLSinhVien_324Layout.setVerticalGroup(
            jpn_QLSinhVien_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_QLSinhVien_324Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpn_QLSinhVien_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpn_TrangChu_317.add(jpn_QLSinhVien_324, "card5");

        jpn_DangKyKTX_324.setBackground(new java.awt.Color(120, 100, 200));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dangKy_ktx.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 1137, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel9);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("BIỂU MẪU ĐĂNG KÝ CHO SINH VIÊN");

        jPanel10.setBackground(new java.awt.Color(120, 100, 200));

        jButton8.setBackground(new java.awt.Color(0, 51, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Quay lại");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(51, 51, 255)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 51, 153));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Xuất file ");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(51, 51, 255)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jpn_DangKyKTX_324Layout = new javax.swing.GroupLayout(jpn_DangKyKTX_324);
        jpn_DangKyKTX_324.setLayout(jpn_DangKyKTX_324Layout);
        jpn_DangKyKTX_324Layout.setHorizontalGroup(
            jpn_DangKyKTX_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_DangKyKTX_324Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_DangKyKTX_324Layout.setVerticalGroup(
            jpn_DangKyKTX_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_DangKyKTX_324Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpn_TrangChu_317.add(jpn_DangKyKTX_324, "card6");

        jpn_QLPhongKTX_324.setBackground(new java.awt.Color(120, 100, 200));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DANH SÁCH TẦNG PHÒNG");

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jpn_Tang1.setBackground(new java.awt.Color(255, 255, 255));
        jpn_Tang1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tầng 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        jpn_Phong1.setBackground(new java.awt.Color(121, 130, 222));
        jpn_Phong1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jpn_Phong1MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Phong A101");

        tongChoA1.setForeground(new java.awt.Color(255, 255, 255));
        tongChoA1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoA1.setText("Tổng số chỗ: 8");

        soChoTrongA1_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongA1_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongA1_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jpn_Phong1Layout = new javax.swing.GroupLayout(jpn_Phong1);
        jpn_Phong1.setLayout(jpn_Phong1Layout);
        jpn_Phong1Layout.setHorizontalGroup(
            jpn_Phong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(tongChoA1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongA1_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_Phong1Layout.setVerticalGroup(
            jpn_Phong1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Phong1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoA1)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongA1_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpn_Phong2.setBackground(new java.awt.Color(121, 130, 222));
        jpn_Phong2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jpn_Phong2MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Phong A102");

        tongChoA2.setForeground(new java.awt.Color(255, 255, 255));
        tongChoA2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoA2.setText("Tổng số chỗ: 8");

        soChoTrongA2_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongA2_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongA2_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jpn_Phong2Layout = new javax.swing.GroupLayout(jpn_Phong2);
        jpn_Phong2.setLayout(jpn_Phong2Layout);
        jpn_Phong2Layout.setHorizontalGroup(
            jpn_Phong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(tongChoA2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongA2_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_Phong2Layout.setVerticalGroup(
            jpn_Phong2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Phong2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoA2)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongA2_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(121, 130, 222));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jPanel18MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Phong A104");

        tongChoA4.setForeground(new java.awt.Color(255, 255, 255));
        tongChoA4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoA4.setText("Tổng số chỗ: 8");

        soChoTrongA4_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongA4_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongA4_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
            .addComponent(tongChoA4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongA4_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoA4)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongA4_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(121, 130, 222));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jPanel20MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel20MouseEntered(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Phong A103");

        tongChoA3.setForeground(new java.awt.Color(255, 255, 255));
        tongChoA3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoA3.setText("Tổng số chỗ: 8");

        soChoTrongA3_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongA3_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongA3_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(tongChoA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongA3_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoA3)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongA3_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpn_Tang1Layout = new javax.swing.GroupLayout(jpn_Tang1);
        jpn_Tang1.setLayout(jpn_Tang1Layout);
        jpn_Tang1Layout.setHorizontalGroup(
            jpn_Tang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Tang1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jpn_Phong1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jpn_Phong2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jpn_Tang1Layout.setVerticalGroup(
            jpn_Tang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_Tang1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpn_Tang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpn_Phong1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_Phong2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        jpn_Tang2.setBackground(new java.awt.Color(255, 255, 255));
        jpn_Tang2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tầng 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        jPanel27.setBackground(new java.awt.Color(121, 130, 222));
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jPanel27MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Phong B104");

        tongChoB4.setForeground(new java.awt.Color(255, 255, 255));
        tongChoB4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoB4.setText("Tổng số chỗ: 8");

        soChoTrongB4_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongB4_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongB4_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
            .addComponent(tongChoB4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongB4_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoB4)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongB4_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(121, 130, 222));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jPanel28MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Phong B102");

        tongChoB2.setForeground(new java.awt.Color(255, 255, 255));
        tongChoB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoB2.setText("Tổng số chỗ: 8");

        soChoTrongB2_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongB2_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongB2_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(tongChoB2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongB2_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoB2)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongB2_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(121, 130, 222));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jPanel29MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Phong B101");

        tongChoB1.setForeground(new java.awt.Color(255, 255, 255));
        tongChoB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoB1.setText("Tổng số chỗ: 8");

        soChoTrongB1_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongB1_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongB1_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(tongChoB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongB1_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoB1)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongB1_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(121, 130, 222));
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jPanel30MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Phong B103");

        tongChoB3.setForeground(new java.awt.Color(255, 255, 255));
        tongChoB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoB3.setText("Tổng số chỗ: 8");

        soChoTrongB3_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongB3_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongB3_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(tongChoB3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongB3_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoB3)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongB3_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpn_Tang2Layout = new javax.swing.GroupLayout(jpn_Tang2);
        jpn_Tang2.setLayout(jpn_Tang2Layout);
        jpn_Tang2Layout.setHorizontalGroup(
            jpn_Tang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Tang2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jpn_Tang2Layout.setVerticalGroup(
            jpn_Tang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_Tang2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpn_Tang2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        jpn_Tang3.setBackground(new java.awt.Color(255, 255, 255));
        jpn_Tang3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tầng 3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 51, 51))); // NOI18N

        jPanel31.setBackground(new java.awt.Color(121, 130, 222));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jPanel31MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Phong C101");

        tongChoC1.setForeground(new java.awt.Color(255, 255, 255));
        tongChoC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoC1.setText("Tổng số chỗ: 8");

        soChoTrongC1_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongC1_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongC1_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(tongChoC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongC1_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoC1)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongC1_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBackground(new java.awt.Color(121, 130, 222));
        jPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jPanel32MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Phong C103");

        tongChoC3.setForeground(new java.awt.Color(255, 255, 255));
        tongChoC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoC3.setText("Tổng số chỗ: 8");

        soChoTrongC3_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongC3_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongC3_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(tongChoC3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongC3_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoC3)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongC3_JLable_324)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(121, 130, 222));
        jPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jPanel33MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Phong C104");

        tongChoC4.setForeground(new java.awt.Color(255, 255, 255));
        tongChoC4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoC4.setText("Tổng số chỗ: 8");

        soChoTrongC4_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongC4_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongC4_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(tongChoC4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongC4_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoC4)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongC4_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(121, 130, 222));
        jPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jPanel34MouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Phong C102");

        tongChoC2.setForeground(new java.awt.Color(255, 255, 255));
        tongChoC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tongChoC2.setText("Tổng số chỗ: 8");

        soChoTrongC2_JLable_324.setForeground(new java.awt.Color(255, 255, 255));
        soChoTrongC2_JLable_324.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soChoTrongC2_JLable_324.setText("Số chỗ còn trống:");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
            .addComponent(tongChoC2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(soChoTrongC2_JLable_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tongChoC2)
                .addGap(5, 5, 5)
                .addComponent(soChoTrongC2_JLable_324)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpn_Tang3Layout = new javax.swing.GroupLayout(jpn_Tang3);
        jpn_Tang3.setLayout(jpn_Tang3Layout);
        jpn_Tang3Layout.setHorizontalGroup(
            jpn_Tang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Tang3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jpn_Tang3Layout.setVerticalGroup(
            jpn_Tang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_Tang3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpn_Tang3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpn_Tang3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_Tang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpn_Tang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpn_Tang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jpn_Tang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(jpn_Tang3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        jScrollPane1.setViewportView(jPanel6);

        jPanel12.setBackground(new java.awt.Color(120, 100, 200));

        jButton6.setBackground(new java.awt.Color(0, 51, 153));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Quay lại");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(51, 51, 255)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpn_QLPhongKTX_324Layout = new javax.swing.GroupLayout(jpn_QLPhongKTX_324);
        jpn_QLPhongKTX_324.setLayout(jpn_QLPhongKTX_324Layout);
        jpn_QLPhongKTX_324Layout.setHorizontalGroup(
            jpn_QLPhongKTX_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_QLPhongKTX_324Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_QLPhongKTX_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                    .addGroup(jpn_QLPhongKTX_324Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpn_QLPhongKTX_324Layout.setVerticalGroup(
            jpn_QLPhongKTX_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_QLPhongKTX_324Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jpn_TrangChu_317.add(jpn_QLPhongKTX_324, "card7");

        jpn_QLThongKe_324.setBackground(new java.awt.Color(255, 255, 255));
        jpn_QLThongKe_324.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jpn_QLThongKe_324AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout tk1_317Layout = new javax.swing.GroupLayout(tk1_317);
        tk1_317.setLayout(tk1_317Layout);
        tk1_317Layout.setHorizontalGroup(
            tk1_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        tk1_317Layout.setVerticalGroup(
            tk1_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TK_2Layout = new javax.swing.GroupLayout(TK_2);
        TK_2.setLayout(TK_2Layout);
        TK_2Layout.setHorizontalGroup(
            TK_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TK_2Layout.setVerticalGroup(
            TK_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        jButton7.setBackground(new java.awt.Color(0, 51, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Quay lại");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 51, 255), new java.awt.Color(51, 51, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(51, 51, 255)));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpn_QLThongKe_324Layout = new javax.swing.GroupLayout(jpn_QLThongKe_324);
        jpn_QLThongKe_324.setLayout(jpn_QLThongKe_324Layout);
        jpn_QLThongKe_324Layout.setHorizontalGroup(
            jpn_QLThongKe_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tk1_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TK_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpn_QLThongKe_324Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn_QLThongKe_324Layout.setVerticalGroup(
            jpn_QLThongKe_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_QLThongKe_324Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tk1_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(TK_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpn_TrangChu_317.add(jpn_QLThongKe_324, "card8");

        jpn_QLDienNuoc_324.setBackground(new java.awt.Color(120, 100, 200));

        tbDN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					tbDNMouseClicked(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jScrollPane3.setViewportView(tbDN);

        jPanel1.setBackground(new java.awt.Color(120, 100, 200));

        jLabel11.setText("MÃ PHÒNG");

        jLabel12.setText("NGÀY THANH TOÁN");

        jLabel13.setText("CHỈ SỐ ĐIỆN CŨ");

        jLabel14.setText("CHỈ SỐ ĐIỆN MỚI");

        jLabel15.setText("CHỈ SỐ NƯỚC CŨ");

        jLabel18.setText("CHỈ SỐ NƯỚC MỚI");

        mp_317.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mp_317ActionPerformed(evt);
            }
        });

        csdc_317.setText("0.0");

        csnc_317.setText("0.0");

        csdm_317.setText("0.0");

        csnm_317.setText("0.0");

        ntt_317.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mp_317, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(csdc_317, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(ntt_317, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(csnc_317, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(csdm_317, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(csnm_317, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mp_317, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csdm_317, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(csnc_317, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ntt_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csdc_317, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(csnm_317, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(120, 100, 200));

        jButton10.setBackground(new java.awt.Color(0, 51, 153));
        jButton10.setFont(new java.awt.Font("Candara", 3, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Trở Lại");
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 51, 153));
        jButton11.setFont(new java.awt.Font("Candara", 3, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Thêm");
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton11ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 51, 153));
        jButton12.setFont(new java.awt.Font("Candara", 3, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Sửa");
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton12ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 51, 153));
        jButton13.setFont(new java.awt.Font("Candara", 3, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Xóa");
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton13ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(113, 113, 113))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel19.setBackground(new java.awt.Color(120, 100, 200));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("QUẢN LÝ TIỀN ĐIỆN NƯỚC");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpn_QLDienNuoc_324Layout = new javax.swing.GroupLayout(jpn_QLDienNuoc_324);
        jpn_QLDienNuoc_324.setLayout(jpn_QLDienNuoc_324Layout);
        jpn_QLDienNuoc_324Layout.setHorizontalGroup(
            jpn_QLDienNuoc_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpn_QLDienNuoc_324Layout.setVerticalGroup(
            jpn_QLDienNuoc_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_QLDienNuoc_324Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpn_TrangChu_317.add(jpn_QLDienNuoc_324, "card9");

        jpn_QLNhanXe_324.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jpn_QLNhanXe_324Layout = new javax.swing.GroupLayout(jpn_QLNhanXe_324);
        jpn_QLNhanXe_324.setLayout(jpn_QLNhanXe_324Layout);
        jpn_QLNhanXe_324Layout.setHorizontalGroup(
            jpn_QLNhanXe_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        jpn_QLNhanXe_324Layout.setVerticalGroup(
            jpn_QLNhanXe_324Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jpn_TrangChu_317.add(jpn_QLNhanXe_324, "card10");

        jpn_ThietKe_317.add(jpn_TrangChu_317, "card2");

        jpn_DangXuat_317.setBackground(new java.awt.Color(120, 100, 200));

        javax.swing.GroupLayout jpn_DangXuat_317Layout = new javax.swing.GroupLayout(jpn_DangXuat_317);
        jpn_DangXuat_317.setLayout(jpn_DangXuat_317Layout);
        jpn_DangXuat_317Layout.setHorizontalGroup(
            jpn_DangXuat_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        jpn_DangXuat_317Layout.setVerticalGroup(
            jpn_DangXuat_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jpn_ThietKe_317.add(jpn_DangXuat_317, "card5");

        thanh_Xoa_phongTo_317.setBackground(new java.awt.Color(75, 30, 155));
        thanh_Xoa_phongTo_317.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                thanh_Xoa_phongTo_317MouseDragged(evt);
            }
        });
        thanh_Xoa_phongTo_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                thanh_Xoa_phongTo_317MousePressed(evt);
            }
        });

        thoat_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thoat_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shutdown_30px.png"))); // NOI18N
        thoat_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thoat_317MouseClicked(evt);
            }
        });

        Phongto_ThuNho_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Phongto_ThuNho_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/expand_30px.png"))); // NOI18N
        Phongto_ThuNho_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Phongto_ThuNho_317MouseClicked(evt);
            }
        });

        an_317.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        an_317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        an_317.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/subtract_30px.png"))); // NOI18N
        an_317.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                an_317MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout thanh_Xoa_phongTo_317Layout = new javax.swing.GroupLayout(thanh_Xoa_phongTo_317);
        thanh_Xoa_phongTo_317.setLayout(thanh_Xoa_phongTo_317Layout);
        thanh_Xoa_phongTo_317Layout.setHorizontalGroup(
            thanh_Xoa_phongTo_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thanh_Xoa_phongTo_317Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(an_317, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Phongto_ThuNho_317, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(thoat_317, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        thanh_Xoa_phongTo_317Layout.setVerticalGroup(
            thanh_Xoa_phongTo_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(thoat_317, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Phongto_ThuNho_317, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(an_317, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jpn_Chung_317Layout = new javax.swing.GroupLayout(jpn_Chung_317);
        jpn_Chung_317.setLayout(jpn_Chung_317Layout);
        jpn_Chung_317Layout.setHorizontalGroup(
            jpn_Chung_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Chung_317Layout.createSequentialGroup()
                .addComponent(jpn_DieuKhien_317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpn_Chung_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpn_ThietKe_317, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(thanh_Xoa_phongTo_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpn_Chung_317Layout.setVerticalGroup(
            jpn_Chung_317Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_Chung_317Layout.createSequentialGroup()
                .addComponent(thanh_Xoa_phongTo_317, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpn_ThietKe_317, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jpn_DieuKhien_317, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpn_Chung_317, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_Chung_317, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jlb_TrangChu_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_TrangChu_317MouseClicked
        Choose_Lable(0);
    }//GEN-LAST:event_jlb_TrangChu_317MouseClicked

    private void jlb_phong_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_phong_317MouseClicked
       Choose_Lable(1);
    }//GEN-LAST:event_jlb_phong_317MouseClicked

    private void jlb_ThongKe_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_ThongKe_317MouseClicked
        Choose_Lable(2);
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát không ?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            DangKy_DangNhap_324 dn = new DangKy_DangNhap_324();
            dn.setVisible(true);
            this.dispose();
        }
        else{
            Choose_Lable(2);
        }
    }//GEN-LAST:event_jlb_ThongKe_317MouseClicked

    private void thoat_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thoat_317MouseClicked
        System.exit(0);
    }//GEN-LAST:event_thoat_317MouseClicked
    int xx_317,xy_317;
    private void thanh_Xoa_phongTo_317MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thanh_Xoa_phongTo_317MousePressed
        xx_317 = evt.getX();
        xy_317 = evt.getY();
    }//GEN-LAST:event_thanh_Xoa_phongTo_317MousePressed

    private void thanh_Xoa_phongTo_317MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thanh_Xoa_phongTo_317MouseDragged
        int x_317 = evt.getXOnScreen();
        int y_317 = evt.getYOnScreen();
        this.setLocation(x_317-xx_317,y_317-xy_317);
    }//GEN-LAST:event_thanh_Xoa_phongTo_317MouseDragged

    private void Phongto_ThuNho_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Phongto_ThuNho_317MouseClicked
        // TODO add your handling code here:
        if(this.getExtendedState()!= TrangChu.MAXIMIZED_BOTH){
          this.setExtendedState(TrangChu.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(TrangChu.NORMAL);
        }
    }//GEN-LAST:event_Phongto_ThuNho_317MouseClicked

    private void jPanel1_QuanLySinhVien_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1_QuanLySinhVien_317MouseClicked
        Choose_Panel(1);
    }//GEN-LAST:event_jPanel1_QuanLySinhVien_317MouseClicked

    private void jPanel2_DangKiKTX_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2_DangKiKTX_317MouseClicked
        Choose_Panel(2);
    }//GEN-LAST:event_jPanel2_DangKiKTX_317MouseClicked

    private void jPanel3_QuanLyPhongKTX_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3_QuanLyPhongKTX_317MouseClicked
        Choose_Panel(3);
       
        
    }//GEN-LAST:event_jPanel3_QuanLyPhongKTX_317MouseClicked

    private void jPanel4_ThongKe_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4_ThongKe_317MouseClicked
        Choose_Panel(4);
    }//GEN-LAST:event_jPanel4_ThongKe_317MouseClicked

    private void jPanel5_QuanLyDienNuoc_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5_QuanLyDienNuoc_317MouseClicked
        Choose_Panel(5);
    }//GEN-LAST:event_jPanel5_QuanLyDienNuoc_317MouseClicked

    private void jbt_tiemKiemActionPerformed(java.awt.event.ActionEvent evt) throws HeadlessException, ClassNotFoundException, SQLException {//GEN-FIRST:event_jbt_tiemKiemActionPerformed
        String ten = jtf_tiemKiem.getText();
        String theLoai = "HoTen";
        if(ten.equals("")){
            JOptionPane.showMessageDialog(this, "Bạn phải nhập vào tên trước!");
        }
        else{   
            SinhVienDao dao = new SinhVienDao();
            if(ctr.getKiemTraTen(theLoai,ten)==1){
                defaultTableModel.setRowCount(0);
                ctr = new Controller_DieuKhien_trangChu_324();
                String timTen = "HoTen";
                ctr.tiemKiemTheoThongTin(ten, timTen, tbSV,defaultTableModel);
            }
            else{
                JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên có tên là: "+ ten , "Thông báo lỗi",JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jbt_tiemKiemActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jComboBox2ActionPerformed
        String a = jComboBox2.getSelectedItem().toString();
        jpn_quanLyTiemKiem.setVisible(true);
        ctr = new Controller_DieuKhien_trangChu_324();
        if(a.equals("Quê quán")){
            ctr.quanLy_jList_queQuan(jl_queQuan);
            panelcon.setVisible(true);
            jpnCMND.setVisible(false);
        }
        else{
            if(a.equals("CMND")){
                panelcon.setVisible(false);
                jpnCMND.setVisible(true);
            }
            else{
                if(a.equals("Mã sinh viên"))
                jpn_MSV.setVisible(true);
                panelcon.setVisible(false);
                jpnCMND.setVisible(false);
            }
            }

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jl_queQuanMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jl_queQuanMouseClicked
        String diaChi = jl_queQuan.getSelectedValue().toString();
        String timQQ = "queQuan";
        ctr = new Controller_DieuKhien_trangChu_324();
        defaultTableModel.setRowCount(0);
        ctr.tiemKiemTheoThongTin(diaChi, timQQ, tbSV, defaultTableModel);

    }//GEN-LAST:event_jl_queQuanMouseClicked

    private void dongCSMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_dongCSMouseClicked
        jpn_quanLyTiemKiem.setVisible(false);
        ctr = new Controller_DieuKhien_trangChu_324();
        ctr.SetTable(tbSV,defaultTableModel);
        
    }//GEN-LAST:event_dongCSMouseClicked

    private void jbt_tk_SoCMNDActionPerformed(java.awt.event.ActionEvent evt) throws HeadlessException, ClassNotFoundException, SQLException {//GEN-FIRST:event_jbt_tk_SoCMNDActionPerformed
        String cmnd = jtf_soCMND.getText();
        String timCMND = "CMND";
        if(ctr.getKiemTraTen(timCMND, cmnd)==1){
            defaultTableModel.setRowCount(0);
            ctr = new Controller_DieuKhien_trangChu_324();
            ctr.tiemKiemTheoThongTin(cmnd, timCMND, tbSV,defaultTableModel);
        }
        else{
            JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên có so CMND là: "+ cmnd , "Thông báo lỗi",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbt_tk_SoCMNDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tbSV.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(TrangChu.this, "Vui lòng chọn sinh viên cần xem!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }else{
            String id = String.valueOf(String.valueOf(tbSV.getValueAt(row, 1)));
            ThongTinChiTietSinhVien thongTin = new ThongTinChiTietSinhVien(id);
            thongTin.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("https://ute.udn.vn/TinTuc/2262/1/Ky-tuc-xa-Truong-Dai-hoc-Su-pham-Ky-thuat--Dai-hoc-Da-Nang-tiep-don-sinh-vien-tro-lai-hoc-tap-luu-tru.aspx"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jtf_tiemKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tiemKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tiemKiemActionPerformed

    private void jtf_soCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_soCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_soCMNDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jButton2ActionPerformed
        jpn_quanLyTiemKiem.setVisible(false);
        ctr = new Controller_DieuKhien_trangChu_324();
        ctr.SetTable(tbSV,defaultTableModel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jButton4ActionPerformed
        jtf_tiemKiem.setText("");
        ctr = new Controller_DieuKhien_trangChu_324();
        ctr.SetTable(tbSV,defaultTableModel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtf_timMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_timMaSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_timMaSVActionPerformed

    private void btn_tk_MaSVActionPerformed(java.awt.event.ActionEvent evt) throws HeadlessException, ClassNotFoundException, SQLException {//GEN-FIRST:event_btn_tk_MaSVActionPerformed
        String maSV1 = jtf_timMaSV.getText();
        String select_maSV = "maSV";
        if(ctr.getKiemTraTen(select_maSV, maSV1)==1){
            defaultTableModel.setRowCount(0);
            ctr = new Controller_DieuKhien_trangChu_324();
            ctr.tiemKiemTheoThongTin(maSV1, select_maSV, tbSV,defaultTableModel);
        }
        else{
            JOptionPane.showMessageDialog(this, "Không tìm thấy sinh viên có mã sinh viên là: "+ maSV1 , "Thông báo lỗi",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_tk_MaSVActionPerformed

    private void btn_dong_tkMSVActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_btn_dong_tkMSVActionPerformed
        jpn_quanLyTiemKiem.setVisible(false);
        ctr = new Controller_DieuKhien_trangChu_324();
        ctr.SetTable(tbSV,defaultTableModel);
    }//GEN-LAST:event_btn_dong_tkMSVActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI("https://www.youtube.com/watch?v=e5bjI7IUcKA&t=32shttps://www.youtube.com/watch?v=e5bjI7IUcKA&t=32s"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jpn_TrangChu_317.setVisible(true);
        jpn_QLSinhVien_324.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jpn_Phong1MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jpn_Phong1MouseClicked
        String maPhong = "MPA1";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jpn_Phong1MouseClicked

    private void jpn_Phong2MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jpn_Phong2MouseClicked
      String maPhong = "MPA2";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jpn_Phong2MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jPanel18MouseClicked
        String maPhong = "MPA4";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jPanel20MouseClicked
       String maPhong = "MPA3";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jPanel27MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jPanel27MouseClicked
        String maPhong = "MPB4";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jPanel27MouseClicked

    private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jPanel28MouseClicked
     String maPhong = "MPB2";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jPanel28MouseClicked

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jPanel29MouseClicked
      String maPhong = "MPB1";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jPanel29MouseClicked

    private void jPanel30MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jPanel30MouseClicked
      String maPhong = "MPB3";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jPanel30MouseClicked

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jPanel31MouseClicked
          String maPhong = "MPC1";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jPanel31MouseClicked

    private void jPanel32MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jPanel32MouseClicked
        String maPhong = "MPC3";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jPanel32MouseClicked

    private void jPanel33MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jPanel33MouseClicked
        String maPhong = "MPC4";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jPanel33MouseClicked

    private void jPanel34MouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jPanel34MouseClicked
        String maPhong = "MPC2";
        QuanLyPhong_140 qlphong = new QuanLyPhong_140(maPhong);
        qlphong.setVisible(true);
    }//GEN-LAST:event_jPanel34MouseClicked

    private void jpn_QLThongKe_324AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jpn_QLThongKe_324AncestorAdded
                   
        QuanLyThongKeContrller contrller  = new QuanLyThongKeContrller();
        contrller.setDataToChart1(tk1_317);
        contrller.setDataToChart2(TK_2);
    }//GEN-LAST:event_jpn_QLThongKe_324AncestorAdded

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jpn_TrangChu_317.setVisible(true);
        jpn_QLSinhVien_324.setVisible(false);
        jpn_DangKyKTX_324.setVisible(false);
        jpn_QLThongKe_324.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void mp_317ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mp_317ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mp_317ActionPerformed

    private void tbDNMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_tbDNMouseClicked
        int ma = tbDN.rowAtPoint(evt.getPoint());
        String Ma_DN = tbDN.getValueAt(ma , 0).toString();
        String Thang = tbDN.getValueAt(ma, 1).toString();
        DienNuocDao dienNuocDao = new DienNuocDao();
        DienNuoc_317 dienNuoc_317 = dienNuocDao.getDienNuocByMP_T(Ma_DN, java.sql.Date.valueOf(Thang));
        setModel(dienNuoc_317);
    }//GEN-LAST:event_tbDNMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jButton11ActionPerformed
      
        String map = mp_317.getText();
        float csdc = Float.parseFloat(csdc_317.getText());
        float csdm = Float.parseFloat(csdm_317.getText());
        float csnc = Float.parseFloat(csnc_317.getText());
        float csnm = Float.parseFloat(csnm_317.getText());
        StringBuilder sb = new StringBuilder();
        if (map.equals("")) {
            sb.append(" Bạn chưa nhập mã phòng \n ");
        }
        if (csdc <= 0) {
            sb.append("Bạn Chưa nhập chỉ số điện cũ\n");
        }
        if (csdm <= 0) {
            sb.append("Bạn Chưa nhập chỉ số điện mới!\n");
        }
        if (csnc <= 0) {
            sb.append("Bạn Chưa nhập chỉ số nước cũ!\n");
        }
        if (csnm <= 0) {
            sb.append("Bạn Chưa nhập chỉ số nước mới!\n");
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Vui Lòng Nhập lại", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (dienNuocService.getDoUongByMP_T(map, new java.sql.Date(ntt_317.getDate().getTime())) != null) {
            JOptionPane.showMessageDialog(TrangChu.this, "Mã Phòng và Ngày Thanh Toán Đã Tồn Tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DienNuoc_317 dienNuoc_317 = new DienNuoc_317();
        dienNuoc_317.setMaPhong(map);
        dienNuoc_317.setThang(ntt_317.getDate());
        dienNuoc_317.setCScudien(csdc);
        dienNuoc_317.setCSmoidien(csdm);
        dienNuoc_317.setCScunuoc(csnc);
        dienNuoc_317.setCSmoinuoc(csnm);
        dienNuocService.addDienNuoc(dienNuoc_317);
        JOptionPane.showMessageDialog(this, "Đăng Kí Thành Công!!!");
        defaultTableModel1.setRowCount(0);
        ctr.SetTable_317(tbDN, defaultTableModel1);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jButton12ActionPerformed
      int row = tbDN.getSelectedRow();
        if (row == -1)//nguoi dung chua chon hang naoư
        {
            JOptionPane.showMessageDialog(TrangChu.this, "Vui lòng chọn hàng thông tin cần sửa", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            DienNuoc_317 dienNuoc_317 = dienNuocService.getDoUongByMP_T(mp_317.getText(), new java.sql.Date(ntt_317.getDate().getTime()));
            dienNuoc_317.setMaPhong(mp_317.getText());
            dienNuoc_317.setThang(ntt_317.getDate());
            dienNuoc_317.setCScudien(Float.parseFloat(csdc_317.getText()));
            dienNuoc_317.setCSmoidien(Float.parseFloat(csdm_317.getText()));
            dienNuoc_317.setCScunuoc(Float.parseFloat(csnc_317.getText()));
            dienNuoc_317.setCSmoinuoc(Float.parseFloat(csnm_317.getText()));
            dienNuocService.updateDienNuoc(dienNuoc_317);
            JOptionPane.showMessageDialog(TrangChu.this, "Đã Sửa Thành Công!!!");
            defaultTableModel1.setRowCount(0);
            ctr.SetTable_317(tbDN, defaultTableModel1);
        } 
    }//GEN-LAST:event_jButton12ActionPerformed
    private void jPanel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel20MouseEntered

    private void jPanel1_QuanLyNhaXe_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1_QuanLyNhaXe_317MouseClicked
        QuanLyNhaXe_320 nhaXe = new QuanLyNhaXe_320();
        nhaXe.setVisible(true);
    }//GEN-LAST:event_jPanel1_QuanLyNhaXe_317MouseClicked

    private void ht_317ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ht_317ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ht_317ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        TaiKhoanDangNhap_324 taiKhoanDangNhap_324 = taiKhoanService_324.getTaiKhoanByUser(User_name_317.getText());
        taiKhoanDangNhap_324.setUsername(User_name_317.getText());
        taiKhoanDangNhap_324.setPassword(pass_317.getText());
        taiKhoanDangNhap_324.setHoTen(ht_317.getText());
        taiKhoanDangNhap_324.setSdt(sdt_317.getText());
        taiKhoanDangNhap_324.setEmail(email.getText());
        taiKhoanService_324.updateTaiKhoan(taiKhoanDangNhap_324);
        JOptionPane.showMessageDialog(TrangChu.this, "Đã Sửa Thành Công!!!");
        Choose_Lable(0);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Choose_Panel(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Choose_Panel(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Choose_Panel(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void an_317MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_an_317MouseClicked
        this.setExtendedState(TrangChu.ICONIFIED);
    }//GEN-LAST:event_an_317MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_jButton13ActionPerformed
         int row = tbDN.getSelectedRow();
        if (row == -1)//nguoi dung chua chon hang naoư
        {
            JOptionPane.showMessageDialog(TrangChu.this, "Vui lòng chọn hàng thông tin cần xóa trước", "Lỗi", JOptionPane.ERROR_MESSAGE);

        } else {
            int confirm = JOptionPane.showConfirmDialog(TrangChu.this, "Bạn chắc chắn muốn xóa không?");
            if (confirm == JOptionPane.YES_OPTION) {

                String Ma_DN = tbDN.getValueAt(row , 0).toString();
                String Thang = tbDN.getValueAt(row, 1).toString();
                dienNuocService.deleteDienNuoc(Ma_DN , java.sql.Date.valueOf(Thang));
                defaultTableModel1.setRowCount(0);//de xoa het du lieu hien tai
                ctr.SetTable_317(tbDN, defaultTableModel1);
                JOptionPane.showMessageDialog(this, "Xóa thành công!");

            }

        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jpn_CaiDat_317.setVisible(false);
        Choose_Lable(0);
    }//GEN-LAST:event_jButton14ActionPerformed

    public void setModel2(TaiKhoanDangNhap_324 taiKhoanDangNhap_324) {
        User_name_317.setText(taiKhoanDangNhap_324.getUsername());
        User_name_317.setEnabled(false);
        pass_317.setText(taiKhoanDangNhap_324.getPassword());
        ht_317.setText(taiKhoanDangNhap_324.getHoTen());
        sdt_317.setText(taiKhoanDangNhap_324.getSdt());
       email.setText(taiKhoanDangNhap_324.getEmail());
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new TrangChu().setVisible(true);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }
    
     public void setModel(DienNuoc_317 dienNuoc_317){
        mp_317.setText(dienNuoc_317.getMaPhong());
        ntt_317.setDate(dienNuoc_317.getThang());
        csdc_317.setText(String.valueOf(dienNuoc_317.getCScudien()));
        csdm_317.setText(String.valueOf(dienNuoc_317.getCSmoidien()));
        csnc_317.setText(String.valueOf(dienNuoc_317.getCScunuoc()));
        csnm_317.setText(String.valueOf(dienNuoc_317.getCSmoinuoc()));     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name_KTX_317;
    private javax.swing.JLabel Phongto_ThuNho_317;
    private javax.swing.JPanel QuanLyTrangChu;
    private javax.swing.JPanel TK_2;
    private javax.swing.JTextField User_name_317;
    private javax.swing.JLabel a;
    private javax.swing.JLabel an_317;
    private javax.swing.JButton btn_dong_tkMSV;
    private javax.swing.JButton btn_tk_MaSV;
    private javax.swing.JTextField csdc_317;
    private javax.swing.JTextField csdm_317;
    private javax.swing.JTextField csnc_317;
    private javax.swing.JTextField csnm_317;
    private javax.swing.JLabel dongCS;
    private javax.swing.JTextField email;
    private javax.swing.JTextField ht_317;
    private javax.swing.JLabel hvt;
    private javax.swing.JLabel icon_dkktx_317;
    private javax.swing.JLabel icon_qlsv_317;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel1_qlnx_317;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel2_dkktx_317;
    private javax.swing.JLabel jLabel2_qlpktx_317;
    private javax.swing.JLabel jLabel2_qlsv_317;
    private javax.swing.JLabel jLabel2_tk_317;
    private javax.swing.JLabel jLabel2_tp_317;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel4_icon_qlpktx_317;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel6_icon_qlnx_317;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel7_icon_tp_317;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8_icon_tk_317;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel1_QuanLyNhaXe_317;
    private javax.swing.JPanel jPanel1_QuanLySinhVien_317;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel2_DangKiKTX_317;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel3_QuanLyPhongKTX_317;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel4_ThongKe_317;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel5_QuanLyDienNuoc_317;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1_317;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton jbt_tiemKiem;
    private javax.swing.JButton jbt_tk_SoCMND;
    private javax.swing.JList<String> jl_queQuan;
    private javax.swing.JLabel jlb_ThongKe_317;
    private javax.swing.JLabel jlb_TrangChu_317;
    private javax.swing.JLabel jlb_phong_317;
    private javax.swing.JPanel jpnCMND;
    private javax.swing.JPanel jpn_CaiDat_317;
    private javax.swing.JPanel jpn_Chung_317;
    private javax.swing.JPanel jpn_DangKyKTX_324;
    private javax.swing.JPanel jpn_DangXuat_317;
    private javax.swing.JPanel jpn_DieuKhien_317;
    private javax.swing.JPanel jpn_MSV;
    private javax.swing.JPanel jpn_Phong1;
    private javax.swing.JPanel jpn_Phong2;
    private javax.swing.JPanel jpn_QLDienNuoc_324;
    private javax.swing.JPanel jpn_QLNhanXe_324;
    private javax.swing.JPanel jpn_QLPhongKTX_324;
    private javax.swing.JPanel jpn_QLSinhVien_324;
    private javax.swing.JPanel jpn_QLThongKe_324;
    private javax.swing.JPanel jpn_Tang1;
    private javax.swing.JPanel jpn_Tang2;
    private javax.swing.JPanel jpn_Tang3;
    private javax.swing.JPanel jpn_ThietKe_317;
    private javax.swing.JPanel jpn_TrangChu_317;
    private javax.swing.JPanel jpn_quanLyTiemKiem;
    private javax.swing.JTextField jtf_soCMND;
    private javax.swing.JTextField jtf_tiemKiem;
    private javax.swing.JTextField jtf_timMaSV;
    private javax.swing.JTextField mp_317;
    private com.toedter.calendar.JDateChooser ntt_317;
    private javax.swing.JPanel panelcon;
    private javax.swing.JLabel pass;
    private javax.swing.JTextField pass_317;
    private javax.swing.JLabel sdt;
    private javax.swing.JTextField sdt_317;
    private javax.swing.JLabel soChoTrongA1_JLable_324;
    private javax.swing.JLabel soChoTrongA2_JLable_324;
    private javax.swing.JLabel soChoTrongA3_JLable_324;
    private javax.swing.JLabel soChoTrongA4_JLable_324;
    private javax.swing.JLabel soChoTrongB1_JLable_324;
    private javax.swing.JLabel soChoTrongB2_JLable_324;
    private javax.swing.JLabel soChoTrongB3_JLable_324;
    private javax.swing.JLabel soChoTrongB4_JLable_324;
    private javax.swing.JLabel soChoTrongC1_JLable_324;
    private javax.swing.JLabel soChoTrongC2_JLable_324;
    private javax.swing.JLabel soChoTrongC3_JLable_324;
    private javax.swing.JLabel soChoTrongC4_JLable_324;
    private javax.swing.JTable tbDN;
    private javax.swing.JTable tbSV;
    private javax.swing.JPanel thanh_Xoa_phongTo_317;
    private javax.swing.JLabel thoat_317;
    private javax.swing.JPanel tk1_317;
    private javax.swing.JLabel tongChoA1;
    private javax.swing.JLabel tongChoA2;
    private javax.swing.JLabel tongChoA3;
    private javax.swing.JLabel tongChoA4;
    private javax.swing.JLabel tongChoB1;
    private javax.swing.JLabel tongChoB2;
    private javax.swing.JLabel tongChoB3;
    private javax.swing.JLabel tongChoB4;
    private javax.swing.JLabel tongChoC1;
    private javax.swing.JLabel tongChoC2;
    private javax.swing.JLabel tongChoC3;
    private javax.swing.JLabel tongChoC4;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
