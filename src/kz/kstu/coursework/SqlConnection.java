/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kz.kstu.coursework;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author j3t1x
 */
public class SqlConnection {
    public static Connection Connect(String login, String password){
        Connection connection= null;
    try  {
        connection = DriverManager.getConnection("jdbc:sqlserver://MATEBOOK:1433;"
                + "databaseName=StudyLoad;encrypt=true;trustServerCertificate=true;", login, password);
        }
         catch (Exception e) {
            e.printStackTrace();
        }
    return connection;
    }
    
    public static ResultSet RS(String query,Connection connection){
        ResultSet rs = null;
        try {    
            Statement statement = connection.createStatement();
            rs = statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(SqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();

        // Получение количества столбцов
        int columnCount = metaData.getColumnCount();

        // Создание колонок таблицы
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i - 1] = metaData.getColumnName(i);
            
        }

        // Создание данных таблицы
        Object[][] data = new Object[0][columnCount];
        while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = rs.getObject(i);
            }
            data = addRow(data, row);
        }

        // Создание и возвращение модели таблицы
        return new DefaultTableModel(data, columnNames);
    }

    // Метод для добавления строки в массив данных таблицы
    private static Object[][] addRow(Object[][] data, Object[] row) {
        Object[][] newData = new Object[data.length + 1][];
        System.arraycopy(data, 0, newData, 0, data.length);
        newData[newData.length - 1] = row;
        return newData;
    }
    
    
}
