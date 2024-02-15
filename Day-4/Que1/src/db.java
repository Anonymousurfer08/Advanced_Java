/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.sql.*;
public class db {
   static final String DB_URL = "jdbc:mysql://localhost/";
   static final String USER = "root";
   static final String PASS = "1234";

   public static void main(String[] args) {
          // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
              ){		      
             String sql = "CREATE DATABASE ARYAN";
             stmt.executeUpdate(sql);
             System.out.println("Database created successfully...");   	  
          } catch (SQLException e) {
             e.printStackTrace();
        }
    }
}