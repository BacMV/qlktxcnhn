
package service;

import dao.StudentDao;
import dao.TaiKhoan_Dao_324;
import model.TaiKhoanDangNhap_324;
import model.TaoTaiKhoan_324;


public class TaiKhoanService_324 {
    
    TaiKhoan_Dao_324 taiKhoandao;
    public TaiKhoanService_324(){
        taiKhoandao = new TaiKhoan_Dao_324();
    }
    public TaiKhoanDangNhap_324 CheckAccount_324(String username, String password){
        return taiKhoandao.CheckAccount_324(username, password);
    }
     public TaiKhoanDangNhap_324 getTaiKhoanByUser(String user) {
         return taiKhoandao.getTaiKhoanByUser(user);
     }
    
      public void updateTaiKhoan(TaiKhoanDangNhap_324 taiKhoanDangNhap_324) {
          taiKhoandao.updateTaiKhoan(taiKhoanDangNhap_324);
      }
      
      public void TaoTaiKhoan(TaoTaiKhoan_324 taiKhoanDangNhap_324) {
          taiKhoandao.taoTaiKhoan(taiKhoanDangNhap_324);
      }
}
