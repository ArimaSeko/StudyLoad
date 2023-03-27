package kz.kstu.coursework;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class DatabaseTable extends JFrame {
    private JTable table;
    private JButton insert;
    private JButton update;
    private JButton delete;
    private JTextField ft;
    public DatabaseTable(String tableName) {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database Table");
        ft = new JTextField();
        table = new JTable();
        insert = new JButton("Insert");
        update = new JButton("Upadte");
        delete = new JButton("Delete");
        ft.setBounds(500,450,200,25);
        insert.setBounds(500,500,200,50);
        update.setBounds(300,500,200,50);
        delete.setBounds(100,500,200,50);
        add(ft);
        add(update);
        add(delete);
        add(insert);
        JScrollPane scrollPane = new JScrollPane(table);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        setSize(800, 600);
         
        // Получение данных из базы данных
        try (Connection connection = DriverManager.getConnection("jdbc:sqlserver://MATEBOOK:1433;databaseName=StudyLoad;encrypt=true;trustServerCertificate=true;", "sa", "310857")) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM "+tableName);

            // Создание таблицы на основе данных из базы данных
            table.setModel(buildTableModel(resultSet));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public DatabaseTable() {}
    // Метод для создания таблицы на основе данных из ResultSet
    private static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
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

    public static void initialization(String tableName) {
        SwingUtilities.invokeLater(() -> {
            DatabaseTable app = new DatabaseTable(tableName);
            app.setVisible(true);
        });
    }

   
}