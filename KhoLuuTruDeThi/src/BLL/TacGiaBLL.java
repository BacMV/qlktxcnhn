
package BLL;

import DAL.TacGiaDAL;
import Entities.TacGia;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TacGiaBLL {
    public static TableModel show() throws SQLException, ClassNotFoundException{
        
        ArrayList<TacGia> list= TacGiaDAL.show();
        String[] columnNames = {"Mã tác giả","Tên tác giả"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(TacGia c : list){
            data[row][0] = c.getMaTG();
            data[row][1] = c.getTenTG();
            
            row++;
        }
        
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            private static final long serialVersionUID = 1L;

			@Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 1:return String.class;
                    default:return String.class;
                }
            };
            
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            };
        };
        
       return table;
        
    }
    
    public static Object[] showControlWithCombobox(String cbbValue) throws SQLException, ClassNotFoundException{
        ArrayList<TacGia> list = TacGiaDAL.show();
        Object[] obj = new Object[4];
        for(TacGia k :list){
            if(cbbValue.equals(k.getMaTG())){
                  obj[0]  = k.getMaTG();
                  obj[1]  = k.getTenTG();
            }
        }
        return obj;
    }
    
    public static ComboBoxModel<?> cbb_show() throws SQLException, ClassNotFoundException{
        
        StringBuilder items = new StringBuilder();
        
        try {
			for(int i = 0;i<TacGiaDAL.show().size();i++){
			    items.append(TacGiaDAL.show().get(i).getMaTG());
			    items.append("#");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return new DefaultComboBoxModel<Object>(items.toString().split("#"));
    }
}
