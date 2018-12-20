/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Irham Rizady
 */
public class connection {
    public static Connection conn;
    public static Statement stm;
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/servis";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch(Exception e){
            System.err.println("Koneksi Gagal" +e.getMessage());
        }
    }
}
