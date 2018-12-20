/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.sql.*;
/**
 *
 * @author Irham Rizady
 */
public class connection {
    private static Connection conn;
    public static Connection getConn(){
        if(conn == null){
            try {
                String url = "jdbc:mysql://localhost:100/servis";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                System.out.println("Gagal Koneksi Database");
            }
        }
        return conn;
    }
}