/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Que1_and_Que2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author ANKIT
 */
public class upd {
    // JDBC URL, username, and password
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/DEPARTMENT";
    static final String USERNAME = "root";
    static final String PASSWORD = "1234";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
 try {
            // Establishing connection to the database
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            
            // Creating statement
            statement = connection.createStatement();
            
            // SQL query to select manager details from the Sales department
            String sqlQuery = "SELECT * FROM Managers WHERE DEPARTMENT = 'sales'";
            
            // Executing the query
            resultSet = statement.executeQuery(sqlQuery);
            
            // Displaying the manager details
             while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("dept");
                System.out.println("Manager ID: " + id + ", Name: " + name + ", Department: " + department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Closing resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}