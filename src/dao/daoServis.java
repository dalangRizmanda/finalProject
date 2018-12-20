/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.gui.login.loginForm;
import finalproject.connection;
import finalproject.servis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Irham Rizady
 */
public class daoServis {
    ResultSet rs;
    Statement stm;
    Connection conn;
    final String insert = "INSERT INTO users (fname, lname, username, password, email, no_hp) VALUES (?, ?, ?, ?, ? , ?);";
    final String select = "SELECT * FROM users;";
    loginForm lf = new loginForm();
    final String loginUser = "SELECT * FROM users WHERE username'"+lf.getUsernameField()+"'AND password='"+lf.getPasswordField()+";";

    public daoServis(Connection conn) {
        this.conn = conn;
    }
    public void insert(servis s){
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, s.getFname());
            statement.setString(2, s.getLname());
            statement.setString(3, s.getUsername());
            statement.setString(4, s.getPassword());
            statement.setString(5, s.getEmail());
            statement.setInt(6, s.getNo_hp());
            while (rs.next()){
                s.getId(rs.getInt(1));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void loginUser(servis s){
        try {
            String sql = "SELECT * FROM users WHERE username='"+lf.getUsernameField()+"'AND password='"+lf.getPasswordField()+"'";
            rs = stm.executeQuery(sql);
        } catch (Exception e) {
        }
    }
}