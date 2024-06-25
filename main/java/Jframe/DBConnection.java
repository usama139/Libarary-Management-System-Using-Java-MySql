/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jframe;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USAMA
 */
class DBConnection {
    static Connection conn = null;
    
    public static Connection getConnection(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","usama");
    
    }catch(Exception e ){
    e.printStackTrace();
    }
    return conn;
    }
}
