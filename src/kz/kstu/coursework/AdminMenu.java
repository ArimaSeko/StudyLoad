/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kz.kstu.coursework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.TableModel;
import static kz.kstu.coursework.HODMenu.containsOnlyDigits;

/**
 *
 * @author j3t1x
 */
public class AdminMenu extends javax.swing.JFrame {
JTextField[] textFields =null;
JScrollPane scrollPane = null;
JTable table = new JTable();
Connection connection=null;
int columns =1;
JTextArea jta;
Person person;
    /**
     * Creates new form AdminMenu
     * @param login
     * @param password
     * @param person
     * @param UserLogin
     */
    public AdminMenu(String login,String password,Person person,String UserLogin) {
        connection = SqlConnection.Connect(login,password);
        setLocation(500,200);
        initComponents();
        this.person = person;
        person.addAction(CurrentDateTime.getTime()+"  LogIn "+UserLogin);
         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new javax.swing.JPanel();
        UsersButton = new javax.swing.JButton();
        AuditButton = new javax.swing.JButton();
        BackUpButton = new javax.swing.JButton();
        ErLabel = new javax.swing.JLabel();
        InsertButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        FullRB = new javax.swing.JRadioButton();
        TempRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UsersButton.setText("Users");
        UsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsersButtonActionPerformed(evt);
            }
        });

        AuditButton.setText("Audit log");
        AuditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuditButtonActionPerformed(evt);
            }
        });

        BackUpButton.setText("Back up");
        BackUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackUpButtonActionPerformed(evt);
            }
        });

        ErLabel.setForeground(new java.awt.Color(204, 51, 0));
        ErLabel.setText("                     ");

        InsertButton.setText("Insert");
        InsertButton.setEnabled(false);
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.setEnabled(false);
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.setEnabled(false);
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        FullRB.setText("FullBackUp");
        FullRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullRBActionPerformed(evt);
            }
        });

        TempRB.setText("TempBackUp");
        TempRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TempRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(InsertButton)
                        .addGap(40, 40, 40)
                        .addComponent(UpdateButton)
                        .addGap(39, 39, 39)
                        .addComponent(DeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ErLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(UsersButton)
                        .addGap(52, 52, 52)
                        .addComponent(AuditButton)
                        .addGap(37, 37, 37)
                        .addComponent(BackUpButton)
                        .addGap(18, 18, 18)
                        .addComponent(FullRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TempRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(184, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsersButton)
                    .addComponent(AuditButton)
                    .addComponent(BackUpButton)
                    .addComponent(FullRB)
                    .addComponent(TempRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ErLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(InsertButton)
                        .addComponent(UpdateButton)
                        .addComponent(DeleteButton)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersButtonActionPerformed
        int xx = 0;
        String tableName = "select * from Users";
        table.setBounds(30,70,600,300);
            try {table.setModel(SqlConnection.buildTableModel(tableName,connection));
            } catch (SQLException ex) {
            Logger.getLogger(HODMenu.class.getName()).log(Level.SEVERE, null, ex);}
        if(scrollPane==null){
        sp(table);
        }
        if(textFields!=null){
        tfdel();
        columns = table.getColumnCount();
        textFields = new JTextField[columns];
        for(int k = 0; k<columns; k++){
        textFields[k]= new JTextField();
        panel1.add(textFields[k]);
        textFields[k].setBounds(20+xx,400,90,40);
        xx=xx+120;}
        }
        if(textFields ==null){
            columns = table.getColumnCount();
        textFields = new JTextField[columns];
        for(int k = 0; k<columns; k++){
        textFields[k]= new JTextField();
        panel1.add(textFields[k]);
        textFields[k].setBounds(20+xx,400,90,40);
        xx=xx+120;
        ErLabel.setText("");
        }}
        InsertButton.setEnabled(true);
        UpdateButton.setEnabled(true);
        DeleteButton.setEnabled(true);
        person.addAction(tableName);
        if(jta!=null){jta.hide();
        panel1.remove(jta);
        jta=null;
        }
    }//GEN-LAST:event_UsersButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        String values = "";
        int selectedRow = table.getSelectedRow();
       Object value1; 
       TableModel model = table.getModel();
        for(int i =0;i<table.getColumnCount();i++)
        {
            value1 = model.getValueAt(selectedRow, i);
            if(i==0){
            if(containsOnlyDigits(value1.toString())){
            values = table.getColumnName(i) +"="+ value1.toString();}
            else{values = table.getColumnName(i) +"='"+ value1.toString()+"'";}
            }else{
                if(containsOnlyDigits(value1.toString()))
                values = values+" and "+table.getColumnName(i)+"=" + value1.toString();
                else values = values+" and "+table.getColumnName(i)+"='" + value1.toString()+"'";
        }}
         String insertQuery = "";
        String itd="";
        int columnCount = table.getColumnCount();
        if(textFields !=null){
        for(int i =0;i<columnCount;i++){
            if(i==0){
                if(containsOnlyDigits(textFields[i].getText()))
                    itd = table.getColumnName(i)+"="+textFields[i].getText();
            else{itd = table.getColumnName(i)+"='"+textFields[i].getText()+"'";}}
            else
            {if(containsOnlyDigits(textFields[i].getText()))itd = itd+", "+table.getColumnName(i)+"="+textFields[i].getText();
            else itd=itd+", "+table.getColumnName(i)+"='"+textFields[i].getText()+"'";
            }
        }
        }
        try{
            insertQuery = "update Users" + " set "+itd+" where "+values;
        SqlConnection.sqlQuery(insertQuery, connection);
        }catch(Exception e){
            System.out.println("didnt work deleteButton");
        }
        ErLabel.setText(itd);
        person.addAction(insertQuery);
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void AuditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuditButtonActionPerformed
        
        logWrite();
            if(textFields!=null){tfdel();}
        InsertButton.setEnabled(false);
        UpdateButton.setEnabled(false);
        DeleteButton.setEnabled(false);
        person.addAction("LogOpened");
    }//GEN-LAST:event_AuditButtonActionPerformed

    private void BackUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackUpButtonActionPerformed
        InsertButton.setEnabled(false);
        UpdateButton.setEnabled(false);
        DeleteButton.setEnabled(false);
    }//GEN-LAST:event_BackUpButtonActionPerformed

    private void FullRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullRBActionPerformed
        TempRB.setSelected(false);
    }//GEN-LAST:event_FullRBActionPerformed

    private void TempRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempRBActionPerformed
        FullRB.setSelected(false);
    }//GEN-LAST:event_TempRBActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
 String insertQuery = "";
        String itd="";
        if(textFields !=null){
        for(int i =0;i< textFields.length;i++){
        if(containsOnlyDigits(textFields[i].getText()))
        {if(i==0){
            itd=itd+textFields[i].getText();
            }else{
            itd=itd+","+textFields[i].getText();}}
        else {if(i==0){itd=itd+"'"+textFields[i].getText()+"'";}else{itd=itd+",'"+textFields[i].getText()+"'";}}}
        }else{ErLabel.setText("Выберите таблицу!");}
        try{
            insertQuery = "insert into Users"+" values("+itd+")";
        SqlConnection.sqlQuery(insertQuery, connection);
        person.addAction(insertQuery);
        }catch(Exception e){
            System.out.println(e);
        }
        person.addAction(insertQuery);
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       String deleteQuery = "";
       String values = "";
       Object value1 = null; 
       int selectedRow = table.getSelectedRow();
       TableModel model = table.getModel();
       try{
           for(int i =0;i<table.getColumnCount();i++)
        {
            value1 = model.getValueAt(selectedRow, i);
            if(i==0){
            if(containsOnlyDigits(value1.toString())){
            values = table.getColumnName(i) +"="+ value1.toString();}
            else{values = table.getColumnName(i) +"='"+ value1.toString()+"'";}
            }else{
                if(containsOnlyDigits(value1.toString()))
                values = values+" and "+table.getColumnName(i)+"=" + value1.toString();
                else values = values+" and "+table.getColumnName(i)+"='" + value1.toString()+"'";
        }}
            deleteQuery = "delete from Users" + " where "+values;
        SqlConnection.sqlQuery(deleteQuery, connection);
           System.out.println(deleteQuery);
        }catch(Exception e){
            System.out.println("didnt work deleteButton");
        }
       person.addAction(deleteQuery);
    }//GEN-LAST:event_DeleteButtonActionPerformed

    
    public static void init() {
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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminMenu().setVisible(true);
            }
        });
    }
public void sp(JTable table){
scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30,70,600,300);
        panel1.add(scrollPane);}


public  void tfdel(){
for (int i = 0; i < textFields.length; i++) {
    if(textFields[i]!=null){
                textFields[i].hide();
        panel1.remove(textFields[i]);
        textFields[i]=null;
        }}}
@Override
public void dispose() {
    person.logWrite();
    super.dispose();
}


public void logWrite(){
    jta = new JTextArea();
    panel1.add(jta);
    jta.setBounds(30, 70, 600, 300);
    String text=" ";
    FileInputStream fos = null;
    char[] chararay=null;
    File file = new File("D:\\log.txt");
    try {
                  chararay = new char[(int)file.length()];
                fos = new FileInputStream(file);
                for(int i = 0;i<file.length();i++){
                chararay[i]=(char) fos.read();
                }
            text =String.valueOf(chararay);
            jta.setText(text);
            jta.setEnabled(false);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AuditButton;
    private javax.swing.JButton BackUpButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel ErLabel;
    private javax.swing.JRadioButton FullRB;
    private javax.swing.JButton InsertButton;
    private javax.swing.JRadioButton TempRB;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton UsersButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
