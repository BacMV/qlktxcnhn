/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */

public class KetNoiSQL {
    private static final String url = "jdbc:mysql://localhost:3306/qlktx";
    private static final String user = "root";
    private static final String password = "";
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
                Class.forName("com.mysql.cj.jdbc.Driver");  

        return DriverManager.getConnection(url, user, password);    
    
    }
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        try{
            String query = "select * from taikhoan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                String id = resultSet.getNString("MaTaiKhoan");
                String name = resultSet.getNString("MatKhau");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
	public ResultSet GetResultSet(String string) {
		// TODO Auto-generated method stub
		return null;
	}
    
}

    