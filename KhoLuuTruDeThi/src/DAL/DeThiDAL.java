/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.DeThi;
import Tools.DatabaseToList;
import Tools.WriteDataToDatabase;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DeThiDAL {
    public static ArrayList<DeThi> show() throws ClassNotFoundException{
        try{
            ArrayList<DeThi> a = new ArrayList<DeThi>();
            a = DatabaseToList.Doc_Sach_Tu_CSDL();
            return a;
        }
        catch(SQLException e){
            return null;
        }
    }
    
    public static DeThi GetSach(String tenSach) throws ClassNotFoundException{
        ArrayList<DeThi> a = show();
        for(DeThi item:a){
            if(item.getTenSach().equals(tenSach))
                return item;
        }
        return null;
    }
    
    public static boolean insert(ArrayList<DeThi> list, DeThi a) throws IOException, SQLException, ClassNotFoundException{
        if(a.getMaSach().equals("")){
            JOptionPane.showMessageDialog(null,"Mã đề thi không được để trống");
            return false;
        }
        for(DeThi item : list)
            if(a.getMaSach().equals(item.getMaSach())){
                JOptionPane.showMessageDialog(null,"Mã đề thi đã tồn tại");
                return false;
            }
        
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getMaSach().compareTo(list.get(i).getMaSach())>0)
                index = i+1;
        }
        list.add(index,a);
        WriteDataToDatabase.ghi_Sach_Vao_CSDL(a);
        return true;
    }
    
    public static boolean update(ArrayList<DeThi> list, DeThi a) throws IOException, SQLException, ClassNotFoundException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaSach().equals(list.get(i).getMaSach())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            WriteDataToDatabase.capNhat_Sach_Vao_CSDL(a);
            return true;
        }
        return false;
        
    }
    
    public static boolean delete(ArrayList<DeThi> list, DeThi a) throws SQLException, ClassNotFoundException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaSach().equals(list.get(i).getMaSach())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            WriteDataToDatabase.xoa_Sach_Vao_CSDL(a.getMaSach());
            return true;
        }
        else
        return false;
    }
}
