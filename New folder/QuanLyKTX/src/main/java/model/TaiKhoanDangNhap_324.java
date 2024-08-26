
package model;

public class TaiKhoanDangNhap_324 {
    private String username;
    private String password;
    private String hoTen;
    private String email;
    private String Sdt;
    

    public TaiKhoanDangNhap_324() {
    }

    public TaiKhoanDangNhap_324(String username, String password, String hoTen, String email, String Sdt) {
        this.username = username;
        this.password = password;
        this.hoTen = hoTen;
        this.email = email;
        this.Sdt = Sdt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

   


    @Override
    public String toString() {
        return "TaiKhoanDangNhap_324{" + "username=" + username + ", password=" + password + '}';
    }
    
    
}
