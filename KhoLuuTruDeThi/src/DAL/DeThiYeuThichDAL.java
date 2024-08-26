
package DAL;
import Entities.DeThiYeuThich;
import Tools.DatabaseToList;
import Tools.WriteDataToDatabase;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DeThiYeuThichDAL {
    public static ArrayList<DeThiYeuThich> showAll() throws ClassNotFoundException{
        try{
            ArrayList<DeThiYeuThich> a = DatabaseToList.Doc_DeThiYeuThich_Tu_CSDL();
            
            return a;
        }
        catch(SQLException e){
            return null;
        }
    }
    
    public static ArrayList<DeThiYeuThich> show(String maTaiKhoan) throws SQLException, ClassNotFoundException{
        try{
            ArrayList<DeThiYeuThich> a = DatabaseToList.Doc_DeThiYeuThich_Tu_CSDL(), b = new ArrayList<DeThiYeuThich>();
            for(DeThiYeuThich i:a){
                if(i.getMaTaiKhoan().equals(maTaiKhoan))
                    b.add(i);
            }
            return b;
        }
        catch(SQLException e){
            return null;
        }
    }
    
    public static int showSoLuong(String maTaiKhoan) throws SQLException, ClassNotFoundException{
        try{
            int t=0;
            ArrayList<DeThiYeuThich> a = DatabaseToList.Doc_DeThiYeuThich_Tu_CSDL(), b = new ArrayList<DeThiYeuThich>();
            for(DeThiYeuThich i:a){
                if(i.getMaTaiKhoan().equals(maTaiKhoan))
                    t+=i.getSoLuong();
            }
            return t;
        }
        catch(SQLException e){
            return 0;
        }
    }
    
    
    
    public static boolean insert(ArrayList<DeThiYeuThich> list, DeThiYeuThich a) throws IOException, SQLException, ClassNotFoundException{
        if(a.getMaTaiKhoan().equals("")){
            JOptionPane.showMessageDialog(null,"Vui lòng đăng nhập để thực hiện");
            return false;
        }
        list.add(a);
        WriteDataToDatabase.ghi_SachTrongGioHang_Vao_CSDL(a);
        return true;
    }
    
    
    
    public static boolean delete(ArrayList<DeThiYeuThich> list, DeThiYeuThich a) throws IOException, SQLException, ClassNotFoundException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaTaiKhoan().equals(list.get(i).getMaTaiKhoan()) && 
                    a.getSachDaChon().getMaSach().equals(list.get(i).getSachDaChon().getMaSach())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            WriteDataToDatabase.xoa_SachTrongGioHang_Vao_CSDL(a.getSachDaChon().getMaSach(),a.getMaTaiKhoan());
            return true;
        }
        else
        return false;
    }
}
