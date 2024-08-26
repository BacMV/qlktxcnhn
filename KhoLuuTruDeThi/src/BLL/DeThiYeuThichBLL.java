/*
 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DeThiYeuThichDAL;
import Entities.DeThiYeuThich;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class DeThiYeuThichBLL {
    public static TableModel show(String maTaiKhoan) throws SQLException, ClassNotFoundException{
        
        ArrayList<DeThiYeuThich> list= DeThiYeuThichDAL.show(maTaiKhoan);
        Object[][] data;
        String[] columnNames = {"STT","Tên đề","Số câu hỏi","Số lượng"};
        data = new Object[(list.size()==0)?1:list.size()][columnNames.length];
        int row = 0;
        for(DeThiYeuThich c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getSachDaChon().getTenSach();
            data[row][2] = c.getSachDaChon().getDonGia();
            data[row][3] = c.getSoLuong();
          
            row++;
            
        }
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            
			private static final long serialVersionUID = 1L;

			@Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0:return int.class;
                    case 1:return String.class;
                    case 2: return float.class;
                    case 3: return int.class;
                    default: return float.class;
                }
            };
            
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        
       return table;
        
    }
}
