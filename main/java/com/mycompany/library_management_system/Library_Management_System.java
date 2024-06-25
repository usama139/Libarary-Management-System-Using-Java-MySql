/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USAMA
 */
public class Library_Management_System {

    public static void main(String[] args) {
       Connection conn = null;
       
       try{
           
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","usama");
           if(conn!=null)
           {
               System.out.println("connectd to database successfully");
           }
                   
       }catch(Exception e)
       {
                          System.out.println("not connectd to database");

       }
    }
}
