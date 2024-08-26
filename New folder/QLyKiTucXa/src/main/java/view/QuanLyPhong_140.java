
package view;

import model.ThongTinPhong_140;
import dao.StudentDao;
import connect.KetNoiSQL;
import controller.Phong_Controller_324;
import dao.SinhVienTheoPhong_Dao_324;
import model.SinhVien_tatCaThongTin_140;
import service.StudentService;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public  class QuanLyPhong_140 extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel = new DefaultTableModel();
    ThongTinPhong_140 h40;
    StudentService service = new StudentService();
    SinhVienTheoPhong_Dao_324 svDao = new SinhVienTheoPhong_Dao_324();
    
    public QuanLyPhong_140(String maPhong) {
        service = new StudentService();
        initComponents();
        setLocationRelativeTo(null);
        h40 = svDao.getRoomByMaPhong(maPhong);
        tenPhong_hienThi_txt.setText(h40.getTenPhong());
        maPhong_ht_324.setText(h40.getMaPhong());
        loaiPhong_ht_324.setText(h40.getLoaiPhong());
        svHt_ht_324.setText(h40.getSoSVHienTai());
        svTD_ht_324.setText(h40.getSoSVToiDa());
        tinhTrang_ht_324.setText(h40.getTinhTrangPhong());
        if(tinhTrang_ht_324.getText().equals("Hết Chỗ"))
            Them_Button.setVisible(false);
        else
            Them_Button.setVisible(true);
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // khong cho phep nguoi dung Edit du lieu trong bang
            }
        };
        
        BangThongTin_Table.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Mã sinh viên");
        defaultTableModel.addColumn("Họ và tên");
        defaultTableModel.addColumn("CMND");
        defaultTableModel.addColumn("Giới Tính");
        defaultTableModel.addColumn("Ngày sinh");
        defaultTableModel.addColumn("Số điện thoại");
        defaultTableModel.addColumn("Quê Quán");
   
        setTableData2(service.thongTinSinhVien(maPhong));
       
    } 
  
    public void setTableData2(List<SinhVien_tatCaThongTin_140> students){
        for(SinhVien_tatCaThongTin_140 st: students){
            defaultTableModel.addRow(new Object[]{st.getMaSv_140(),st.getTen_140(),
                st.getCMND_140(),st.getGioitinh_140(),st.getNgaysinh_140(),st.getSDT_140(),st.getQuequan_140()});
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ThongTin_Label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SoSinhVienToiDa_Label = new javax.swing.JLabel();
        Them_Button = new javax.swing.JButton();
        Sua_Button = new javax.swing.JButton();
        Xoa_Button = new javax.swing.JButton();
        Thoat_Button = new javax.swing.JButton();
        TenPhong_Label = new javax.swing.JLabel();
        MaPhong_Label = new javax.swing.JLabel();
        LoaiPhong_Label = new javax.swing.JLabel();
        SoSinhVienHienTai_Label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BangThongTin_Table = new javax.swing.JTable();
        TinhTrangPhong_Label = new javax.swing.JLabel();
        ThongBaoTimKiem_Label = new javax.swing.JLabel();
        tenPhong_hienThi_txt = new javax.swing.JLabel();
        maPhong_ht_324 = new javax.swing.JLabel();
        loaiPhong_ht_324 = new javax.swing.JLabel();
        svHt_ht_324 = new javax.swing.JLabel();
        tinhTrang_ht_324 = new javax.swing.JLabel();
        svTD_ht_324 = new javax.swing.JLabel();

        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 4));

        ThongTin_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ThongTin_Label.setForeground(new java.awt.Color(204, 0, 0));
        ThongTin_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home1.png"))); // NOI18N
        ThongTin_Label.setText("THÔNG TIN TỪNG PHÒNG TẠI KÝ TÚC XÁ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(ThongTin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(ThongTin_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(53, 111, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết của phòng:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel1.setToolTipText("");

        SoSinhVienToiDa_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SoSinhVienToiDa_Label.setForeground(new java.awt.Color(255, 255, 255));
        SoSinhVienToiDa_Label.setText("Số Sinh Viên Tối Đa: ");

        Them_Button.setBackground(new java.awt.Color(0, 0, 0));
        Them_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Them_Button.setForeground(new java.awt.Color(255, 255, 255));
        Them_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Login-icon-16.png"))); // NOI18N
        Them_Button.setText("Thêm sinh viên");
        Them_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Them_ButtonActionPerformed(evt);
            }
        });

        Sua_Button.setBackground(new java.awt.Color(0, 0, 0));
        Sua_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Sua_Button.setForeground(new java.awt.Color(255, 255, 255));
        Sua_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-document-edit-icon-16.png"))); // NOI18N
        Sua_Button.setText("Xem chi tiết");
        Sua_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sua_ButtonActionPerformed(evt);
            }
        });

        Xoa_Button.setBackground(new java.awt.Color(0, 0, 0));
        Xoa_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Xoa_Button.setForeground(new java.awt.Color(255, 255, 255));
        Xoa_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Actions-edit-delete-icon-16.png"))); // NOI18N
        Xoa_Button.setText("Xóa");
        Xoa_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xoa_ButtonActionPerformed(evt);
            }
        });

        Thoat_Button.setBackground(new java.awt.Color(0, 0, 0));
        Thoat_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Thoat_Button.setForeground(new java.awt.Color(255, 255, 255));
        Thoat_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout-icon-16.png"))); // NOI18N
        Thoat_Button.setText("Thoát");
        Thoat_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Thoat_ButtonActionPerformed(evt);
            }
        });

        TenPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TenPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        TenPhong_Label.setText("Tên Phòng:");

        MaPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MaPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        MaPhong_Label.setText("Mã Phòng: ");

        LoaiPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoaiPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        LoaiPhong_Label.setText("Loại Phòng: ");

        SoSinhVienHienTai_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SoSinhVienHienTai_Label.setForeground(new java.awt.Color(255, 255, 255));
        SoSinhVienHienTai_Label.setText("Số Sinh Viên Hiện Tại: ");

        BangThongTin_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tên phòng", "Mã phòng ", "Loại phòng", "Số sinh viên hiện tại", "Số sinh viên tối đa", "Tình trạng phòng"
            }
        ));
        BangThongTin_Table.setName(""); // NOI18N
        BangThongTin_Table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BangThongTin_TableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(BangThongTin_Table);

        TinhTrangPhong_Label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TinhTrangPhong_Label.setForeground(new java.awt.Color(255, 255, 255));
        TinhTrangPhong_Label.setText("Tình Trạng Phòng: ");

        tenPhong_hienThi_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tenPhong_hienThi_txt.setForeground(new java.awt.Color(255, 255, 255));
        tenPhong_hienThi_txt.setText("jLabel1");

        maPhong_ht_324.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maPhong_ht_324.setForeground(new java.awt.Color(255, 255, 255));
        maPhong_ht_324.setText("jLabel1");

        loaiPhong_ht_324.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loaiPhong_ht_324.setForeground(new java.awt.Color(255, 255, 255));
        loaiPhong_ht_324.setText("jLabel2");

        svHt_ht_324.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        svHt_ht_324.setForeground(new java.awt.Color(255, 255, 255));

        tinhTrang_ht_324.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tinhTrang_ht_324.setForeground(new java.awt.Color(255, 255, 255));
        tinhTrang_ht_324.setText("jLabel4");

        svTD_ht_324.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        svTD_ht_324.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaPhong_Label)
                    .addComponent(TenPhong_Label)
                    .addComponent(LoaiPhong_Label))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tenPhong_hienThi_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maPhong_ht_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loaiPhong_ht_324, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SoSinhVienToiDa_Label)
                    .addComponent(TinhTrangPhong_Label)
                    .addComponent(SoSinhVienHienTai_Label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tinhTrang_ht_324, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svHt_ht_324, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(svTD_ht_324, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ThongBaoTimKiem_Label)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(Thoat_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(313, 313, 313))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ThongBaoTimKiem_Label)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(svHt_ht_324, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(SoSinhVienHienTai_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SoSinhVienToiDa_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(svTD_ht_324, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TinhTrangPhong_Label)
                            .addComponent(tinhTrang_ht_324, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TenPhong_Label)
                            .addComponent(tenPhong_hienThi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaPhong_Label)
                            .addComponent(maPhong_ht_324, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoaiPhong_Label)
                            .addComponent(loaiPhong_ht_324, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Xoa_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sua_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Them_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thoat_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Thoat_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Thoat_ButtonActionPerformed
    this.dispose();
    }//GEN-LAST:event_Thoat_ButtonActionPerformed
    
    private void Xoa_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xoa_ButtonActionPerformed
   
 int result = JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa không");
        if(result == 0 ){
            int position = BangThongTin_Table.getSelectedRow();
            String data = BangThongTin_Table.getModel().getValueAt(position, 0).toString();
              try{
                Connection connection = null;
				try {
					connection = KetNoiSQL.getConnection();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                String query = "DELETE FROM dbo.[SinhVien] WHERE maSV = ? ";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1,data);
                ps.executeUpdate();
                defaultTableModel.setRowCount(0);
                setTableData2(service.thongTinSinhVien(maPhong_ht_324.getText()));
                h40 = svDao.getRoomByMaPhong(maPhong_ht_324.getText());
                tinhTrang_ht_324.setText(h40.getTinhTrangPhong());
                svHt_ht_324.setText(h40.getSoSVHienTai());
                if(tinhTrang_ht_324.getText().equals("Hết Chỗ"))
                    Them_Button.setVisible(false);
                else
                    Them_Button.setVisible(true);
                JOptionPane.showMessageDialog(null,"Xóa thành công");

        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }       
        
    }//GEN-LAST:event_Xoa_ButtonActionPerformed

    private void Sua_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sua_ButtonActionPerformed
             
        int row = BangThongTin_Table.getSelectedRow();
        if (row == -1)//nguoi dung chua chon hang nao
        {
            JOptionPane.showMessageDialog(QuanLyPhong_140.this, "Vui lòng chọn hàng thông tin sinh viên cần xóa trước", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
                    String maSV = String.valueOf(BangThongTin_Table.getValueAt(row, 0));
                    ThongTinChiTietSinhVien sv = new ThongTinChiTietSinhVien(maSV);
                    sv.setVisible(true);
        }

        
    }//GEN-LAST:event_Sua_ButtonActionPerformed

    private void Them_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Them_ButtonActionPerformed
        
        ThemSinhVien_324 them = new ThemSinhVien_324(maPhong_ht_324.getText());
        them.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Them_ButtonActionPerformed
   
    private void BangThongTin_TableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BangThongTin_TableComponentShown
        // TODO add your handling code here:
     
    }//GEN-LAST:event_BangThongTin_TableComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       //   showDuLieu();
    }//GEN-LAST:event_formComponentShown

    public void resetForm(){
 
    }
        
  
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(QuanLyPhong_140.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//              
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangThongTin_Table;
    private javax.swing.JLabel LoaiPhong_Label;
    private javax.swing.JLabel MaPhong_Label;
    private javax.swing.JLabel SoSinhVienHienTai_Label;
    private javax.swing.JLabel SoSinhVienToiDa_Label;
    private javax.swing.JButton Sua_Button;
    private javax.swing.JLabel TenPhong_Label;
    private javax.swing.JButton Them_Button;
    private javax.swing.JButton Thoat_Button;
    private javax.swing.JLabel ThongBaoTimKiem_Label;
    private javax.swing.JLabel ThongTin_Label;
    private javax.swing.JLabel TinhTrangPhong_Label;
    private javax.swing.JButton Xoa_Button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loaiPhong_ht_324;
    private javax.swing.JLabel maPhong_ht_324;
    private javax.swing.JLabel svHt_ht_324;
    private javax.swing.JLabel svTD_ht_324;
    private javax.swing.JLabel tenPhong_hienThi_txt;
    private javax.swing.JLabel tinhTrang_ht_324;
    // End of variables declaration//GEN-END:variables
}
