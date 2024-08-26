
package controller;

import java.sql.SQLException;

import dao.TaiKhoan_Dao_324;

public class CheckAccount_Controller_324 {
    private String userName;
    private String passWord;
    
    TaiKhoan_Dao_324 dao = new TaiKhoan_Dao_324();
    
    public CheckAccount_Controller_324() {
    }

    public CheckAccount_Controller_324(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
    
    
    public int checkoutAccountUser(String taiKhoan, String matKhau) throws ClassNotFoundException, SQLException{
        this.userName = taiKhoan;
        this.passWord = matKhau;
        if(dao.CheckAccount_324(userName, passWord)==null)
            return 0;
        else
            return 1;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
}
