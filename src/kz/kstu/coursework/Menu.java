/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kz.kstu.coursework;

import java.awt.Font;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author j3t1x
 */
public class Menu extends javax.swing.JFrame {
 JTable table = new JTable();
 JScrollPane scrollPane = null;
 Connection connection = null;   
 int columns = 1;
 JTextField[] textFields =null;
 JButton [] iudButtons = null;
  /**
     * Creates new form Menu
     * @param login
     * @param password
     */
    public Menu(String login, String password) {
        connection = SqlConnection.Connect(login, password);
        setLocation(400,100);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        TablesCB = new javax.swing.JComboBox<>();
        ViewsCB = new javax.swing.JComboBox<>();
        QueriesCB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose the table", "Departments", "Disciplines", "Groups", "Load", "PermissibleLoadTypes", "Positions", "Standard", "Teachers", "TypesOfTeachingLoad" }));

        ViewsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Views", "Teacher loads", "Teacher disciplines", "Teachers list" }));

        QueriesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Queries", "TOTL list", "Sum hours depatment", "Discipline list in spring", "Teachers hours for loads" }));

        jButton1.setText("Show data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        InsertButton.setText("Insert");

        jButton2.setText("Update");

        jButton3.setText("Delete");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TablesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsertButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(90, 90, 90)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(ViewsCB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(QueriesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 265, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TablesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QueriesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(InsertButton)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int xx=0;
        if(TablesCB.getSelectedItem().equals("Choose the table")){}
        else {
        String tableName = "select * from "+TablesCB.getSelectedItem().toString();
        ResultSet rs = SqlConnection.RS(tableName, connection);
        table.setBounds(30,70,550,300);
        table.setFont(new Font("Monserat",Font.PLAIN,13));
            try {table.setModel(SqlConnection.buildTableModel(rs));
            } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);}
        if(scrollPane!=null){}else{
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30,70,550,300);
        panel1.add(scrollPane);
        }
        if(textFields!=null){
        for (int i = 0; i < textFields.length; i++) {
        textFields[i].hide();
        panel1.remove(textFields[i]);
        textFields[i]=null;
        }
        columns = table.getColumnCount();
        textFields = new JTextField[columns];
        for(int k = 0; k<columns; k++){
        textFields[k]= new JTextField();
        panel1.add(textFields[k]);
        textFields[k].setBounds(20+xx,400,90,25);
        xx=xx+120;}
        panel1.validate();
        }
        if(textFields ==null){
            columns = table.getColumnCount();
        textFields = new JTextField[columns];
        for(int k = 0; k<columns; k++){
        textFields[k]= new JTextField();
        panel1.add(textFields[k]);
        textFields[k].setBounds(20+xx,400,90,25);
        xx=xx+120;}}
        
        }
        
        if(ViewsCB.getSelectedItem().equals("Views")){
        }else{
        String query = "select * from ["+ViewsCB.getSelectedIndex()+"Report]";
        ResultSet rs = SqlConnection.RS(query, connection);
        table.setBounds(30,70,550,300);
            try {table.setModel(SqlConnection.buildTableModel(rs));
            } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);}
            if(textFields!=null){for (int i = 0; i < textFields.length; i++) {
                textFields[i].hide();
        panel1.remove(textFields[i]);
        textFields[i]=null;
        }}
        if(scrollPane!=null){}else{
        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30,70,550,300);
        panel1.add(scrollPane);}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

     
    public void initialize(String login, String password) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Menu(login, password).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertButton;
    private javax.swing.JComboBox<String> QueriesCB;
    private javax.swing.JComboBox<String> TablesCB;
    private javax.swing.JComboBox<String> ViewsCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
