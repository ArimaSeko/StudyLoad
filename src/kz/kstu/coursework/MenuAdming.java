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
import javax.swing.table.TableModel;

/**
 *
 * @author j3t1x
 */
public class MenuAdming extends javax.swing.JFrame {
 JTable table = new JTable();
 JScrollPane scrollPane = null;
 Connection connection = null;   
 int columns = 1;
 JTextField[] textFields =null;
 JButton [] iudButtons = null;
 JTextField exectf=null;
 JLabel parlab = null; 
 /**
     * Creates new form Menu
     * @param login
     * @param password
     */
    public MenuAdming(String login, String password) {
        setTitle("Head of department menu");
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
        ShowDataButton = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ErLabel = new javax.swing.JLabel();
        ProcCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose the table", "Departments", "Disciplines", "Groups", "Load", "PermissibleLoadTypes", "Positions", "Standard", "Teachers", "TypesOfTeachingLoad" }));
        TablesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TablesCBActionPerformed(evt);
            }
        });

        ViewsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Views", "Teacher loads", "Teacher disciplines", "Teachers list" }));

        ShowDataButton.setText("Show data");
        ShowDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataButtonActionPerformed(evt);
            }
        });

        InsertButton.setText("Insert");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ErLabel.setForeground(new java.awt.Color(255, 0, 51));
        ErLabel.setText("        ");

        ProcCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procedures", "GroupsMoreTwenty", "SumStudentsDepartment", "TeachersHalfBet" }));
        ProcCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcCBActionPerformed(evt);
            }
        });

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
                    .addComponent(UpdateButton)
                    .addComponent(ViewsCB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(DeleteButton)
                        .addGap(42, 42, 42)
                        .addComponent(ErLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(ShowDataButton)
                        .addContainerGap())
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ProcCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TablesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProcCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowDataButton)
                    .addComponent(InsertButton)
                    .addComponent(UpdateButton)
                    .addComponent(DeleteButton)
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
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataButtonActionPerformed
        int xx=0;
        if(TablesCB.getSelectedItem().equals("Choose the table")!=true
                &&ViewsCB.getSelectedItem().equals("Views")&&ProcCB.getSelectedItem().equals("Procedures")){
        String tableName = "select * from "+TablesCB.getSelectedItem().toString();
        table.setBounds(30,70,550,300);
        table.setFont(new Font("Monserat",Font.PLAIN,13));
            try {table.setModel(SqlConnection.buildTableModel(tableName,connection));
            } catch (SQLException ex) {
            Logger.getLogger(MenuAdming.class.getName()).log(Level.SEVERE, null, ex);}
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
        xx=xx+120;
        ErLabel.setText("");
        }}}else {ErLabel.setText("Choose only one table!");
        }
        
        if(ViewsCB.getSelectedItem().equals("Views")!=true&&TablesCB.getSelectedItem().equals("Choose the table")&&
                ProcCB.getSelectedItem().equals("Procedures")){
        String query = "select * from ["+ViewsCB.getSelectedIndex()+"Report]";
        table.setBounds(30,70,550,300);
            try {table.setModel(SqlConnection.buildTableModel(query,connection));
            } catch (SQLException ex) {
            Logger.getLogger(MenuAdming.class.getName()).log(Level.SEVERE, null, ex);}
            if(textFields!=null){tfdel();}
        if(scrollPane==null){
        sp(table);
        }
        }
        if(ProcCB.getSelectedItem().equals("Procedures")!=true&&ViewsCB.getSelectedItem().equals("Views")&&
                TablesCB.getSelectedItem().equals("Choose the table"))
        {
            try {
                String gettext = " ";
                if(exectf!=null)gettext=exectf.getText();
                String query="use StudyLoad exec "+ProcCB.getSelectedItem().toString()+" "+gettext;
                System.out.println(query);
                table.setBounds(30,70,550,300);
                table.setModel(SqlConnection.buildTableModel(query, connection));
                if(textFields!=null)
        tfdel();
                if(scrollPane==null){
        sp(table);
        }
            } catch (SQLException ex) {
                Logger.getLogger(MenuAdming.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_ShowDataButtonActionPerformed

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
            insertQuery = "insert into "+TablesCB.getSelectedItem().toString()+" values("+itd+")";
        SqlConnection.sqlQuery(insertQuery, connection);
        }catch(Exception e){
            System.out.println("инсерт в говне");
        }
        ErLabel.setText(itd);
        System.out.println(insertQuery);
        
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        String values = "";
        int selectedRow = table.getSelectedRow();
       Object value1 = null; 
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
            insertQuery = "update " + TablesCB.getSelectedItem().toString()+" set "+itd+" where "+values;
        SqlConnection.sqlQuery(insertQuery, connection);
        }catch(Exception e){
            System.out.println("didnt work deleteButton");
        }
        ErLabel.setText(itd);
        System.out.println(insertQuery);
    }//GEN-LAST:event_UpdateButtonActionPerformed

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
            deleteQuery = "delete from " + TablesCB.getSelectedItem().toString()+" where "+values;
        SqlConnection.sqlQuery(deleteQuery, connection);
           System.out.println(deleteQuery);
        }catch(Exception e){
            System.out.println("didnt work deleteButton");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ProcCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcCBActionPerformed
        if(exectf==null&&ProcCB.getSelectedItem().equals("Procedures")!=true&&
                ProcCB.getSelectedItem().equals("TeachersHalfBet")!=true){
          
        exectf = new JTextField();
        parlab = new JLabel();
        
        parlab.setText("Введите параметр!");
        panel1.add(exectf);
        panel1.add(parlab);
        exectf.setBounds(490, 20, 90, 25);
        parlab.setBounds(490, 5, 110, 13);}
           if(ProcCB.getSelectedItem().equals("Procedures")||ProcCB.getSelectedItem().equals("TeachersHalfBet")){
               if(exectf!=null){
           exectf.hide();
            parlab.hide();
            panel1.remove(parlab);
            panel1.remove(exectf);
            exectf=null;
            parlab=null;
               }
        }
        
    }//GEN-LAST:event_ProcCBActionPerformed

    private void TablesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TablesCBActionPerformed
        if(TablesCB.getSelectedItem().toString().equals("Tables")!=true){
        ViewsCB.setSelectedItem(ViewsCB.getItemAt(0));
        ProcCB.setSelectedItem(ProcCB.getItemAt(0));
        }
    }//GEN-LAST:event_TablesCBActionPerformed

     
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
            java.util.logging.Logger.getLogger(MenuAdming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Menu(login, password).setVisible(true);
            }
        });
    }
    public static boolean containsOnlyDigits(String str) {
    for (int i = 0; i < str.length(); i++) {
        if (!Character.isDigit(str.charAt(i))) {
            return false;
        }
    }
    return true;
}
public void sp(JTable table){
scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30,70,550,300);
        panel1.add(scrollPane);}


public void tfdel(){
for (int i = 0; i < textFields.length; i++) {
                textFields[i].hide();
        panel1.remove(textFields[i]);
        textFields[i]=null;
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel ErLabel;
    private javax.swing.JButton InsertButton;
    private javax.swing.JComboBox<String> ProcCB;
    private javax.swing.JButton ShowDataButton;
    private javax.swing.JComboBox<String> TablesCB;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JComboBox<String> ViewsCB;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
