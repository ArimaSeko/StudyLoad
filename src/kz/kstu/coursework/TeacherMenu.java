/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kz.kstu.coursework;

import java.awt.Font;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;
/**
 *
 * @author j3t1x
 */
public class TeacherMenu extends javax.swing.JFrame {
JTextField[] textFields =null;
JTable table = new JTable();
 JScrollPane scrollPane = null;
 Connection connection = null;   
 int columns = 1; 
 Person person;
/**
     * Creates new form TeacherMenu
     * @param login
     * @param password
     * @param person
     * @param UserLogin
     */
    public TeacherMenu(String login, String password,Person person,String UserLogin) {
        setTitle("Head of department menu");
        connection = SqlConnection.Connect(login, password);
        setLocation(400,100);
        initComponents();
        this.person = person;
        person.addAction(CurrentDateTime.getTime()+"  LogIn "+UserLogin);   
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
        ShowDataButton = new javax.swing.JButton();
        ViewsCB = new javax.swing.JComboBox<>();
        TablesCB = new javax.swing.JComboBox<>();
        ErLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ShowDataButton.setText("Show data");
        ShowDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataButtonActionPerformed(evt);
            }
        });

        ViewsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Views", "Teacher loads", "Teacher disciplines", "Teachers list" }));
        ViewsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewsCBActionPerformed(evt);
            }
        });

        TablesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tables", "Load", "TypesOfTeachingLoad", "Disciplines" }));
        TablesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablesCBActionPerformed(evt);
            }
        });

        ErLabel.setForeground(new java.awt.Color(255, 51, 0));
        ErLabel.setText("                         ");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablesCB, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(454, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ErLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(ShowDataButton)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TablesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowDataButton)
                    .addComponent(ErLabel))
                .addContainerGap())
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

    private void ShowDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataButtonActionPerformed
       if(TablesCB.getSelectedItem().equals("Tables")!=true
                &&ViewsCB.getSelectedItem().equals("Views")){
        String tableName = "select * from "+TablesCB.getSelectedItem().toString();
        table.setBounds(30,70,550,300);
            try {table.setModel(SqlConnection.buildTableModel(tableName,connection));
            } catch (SQLException ex) {
            Logger.getLogger(HODMenu.class.getName()).log(Level.SEVERE, null, ex);}
        if(scrollPane==null){
        sp(table);
        }}
        
        if(ViewsCB.getSelectedItem().equals("Views")!=true&&
                TablesCB.getSelectedItem().equals("Tables")){
        String query = "select * from ["+ViewsCB.getSelectedIndex()+"Report]";
        table.setBounds(30,70,550,300);
            try {table.setModel(SqlConnection.buildTableModel(query,connection));
            } catch (SQLException ex) {
            Logger.getLogger(HODMenu.class.getName()).log(Level.SEVERE, null, ex);}
            if(textFields!=null){tfdel();}
        if(scrollPane==null){
        sp(table);
        }}
    }//GEN-LAST:event_ShowDataButtonActionPerformed

    private void TablesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablesCBActionPerformed
        if(TablesCB.getSelectedItem().equals("Tables")!=true)ViewsCB.setSelectedIndex(0);
        TableSetter();
    }//GEN-LAST:event_TablesCBActionPerformed

    private void ViewsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewsCBActionPerformed
        if(ViewsCB.getSelectedItem().equals("Views")!=true)TablesCB.setSelectedIndex(0);
    }//GEN-LAST:event_ViewsCBActionPerformed

    
    public static void initialize() {
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
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    public void sp(JTable table){
scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30,70,550,300);
        panel1.add(scrollPane);}


public void tfdel(){
for (int i = 0; i < textFields.length; i++) {
    if(textFields[i]!=null){
                textFields[i].hide();
        panel1.remove(textFields[i]);
        textFields[i]=null;
        }}
}

@Override
public void dispose() {
    person.logWrite();
    super.dispose();
}
public void TableSetter(){
int xx=0;
String tableName=null;
        if(TablesCB.getSelectedItem().equals("Tables")!=true
                &&ViewsCB.getSelectedItem().equals("Views")){
         tableName = "select * from "+TablesCB.getSelectedItem().toString();
        table.setBounds(30,70,550,300);
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
        textFields[k].setBounds(20+xx,400,90,30);
        xx=xx+120;}
        }
        if(textFields ==null){
            columns = table.getColumnCount();
        textFields = new JTextField[columns];
        for(int k = 0; k<columns; k++){
        textFields[k]= new JTextField();
        panel1.add(textFields[k]);
        textFields[k].setBounds(20+xx,400,90,30);
        xx=xx+120;
        ErLabel.setText("");
        }}}
        table.setFont(new Font("Tahoma",Font.PLAIN,13));
        person.addAction(tableName);
}
public void ViewSetter(){
    String query=null;
 if(ViewsCB.getSelectedItem().equals("Views")!=true&&TablesCB.getSelectedItem().equals("Tables")){
        query = "select * from ["+ViewsCB.getSelectedIndex()+"Report]";
        table.setBounds(30,70,550,300);
            try {table.setModel(SqlConnection.buildTableModel(query,connection));
            } catch (SQLException ex) {
            Logger.getLogger(HODMenu.class.getName()).log(Level.SEVERE, null, ex);}
            if(textFields!=null){tfdel();}
        if(scrollPane==null){
        sp(table);
        }
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErLabel;
    private javax.swing.JButton ShowDataButton;
    private javax.swing.JComboBox<String> TablesCB;
    private javax.swing.JComboBox<String> ViewsCB;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
