/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kz.kstu.coursework;


import java.sql.*;

/**
 *
 * @author j3t1x
 */
public class SqlConnection {
    public static Connection Connect(String login, String password){
        Connection connection = null;
    try  {
        connection = DriverManager.getConnection("jdbc:sqlserver://MATEBOOK:1433;databaseName=StudyLoad;encrypt=true;trustServerCertificate=true;", login, password);
            
   
        } catch (Exception e) {
            e.printStackTrace();
        }
    return connection;
    }
}
