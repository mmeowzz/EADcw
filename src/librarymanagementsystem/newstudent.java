package librarymanagementsystem;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Chanulya Fernando
 */
public class newstudent extends javax.swing.JFrame {

    /**
     * Creates new form newstudent
     */
    public newstudent() {
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

        lblid = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblcourse = new javax.swing.JLabel();
        lblbranch = new javax.swing.JLabel();
        lblcontact = new javax.swing.JLabel();
        lbltopic = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        cmbcourse = new javax.swing.JComboBox<>();
        cmbbranch = new javax.swing.JComboBox<>();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        lblbg1 = new javax.swing.JLabel();
        lblbg2 = new javax.swing.JLabel();
        lblbg3 = new javax.swing.JLabel();
        lblbg4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(370, 170));
        setName("frmnewstudent"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblid.setForeground(new java.awt.Color(0, 102, 153));
        lblid.setText("Student ID");
        getContentPane().add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 80, -1));

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(0, 102, 153));
        lblname.setText("Name");
        getContentPane().add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        lblcourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcourse.setForeground(new java.awt.Color(0, 102, 153));
        lblcourse.setText("Course Name");
        getContentPane().add(lblcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 98, -1));

        lblbranch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbranch.setForeground(new java.awt.Color(0, 102, 153));
        lblbranch.setText("Branch Name");
        getContentPane().add(lblbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 103, -1));

        lblcontact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcontact.setForeground(new java.awt.Color(0, 102, 153));
        lblcontact.setText("Contact Number");
        getContentPane().add(lblcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 120, -1));

        lbltopic.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbltopic.setForeground(new java.awt.Color(0, 102, 153));
        lbltopic.setText("Add New Student");
        getContentPane().add(lbltopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 33, -1, -1));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 193, -1));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 193, -1));
        getContentPane().add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 193, -1));

        cmbcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "DSE", "HNDSE", "BSE", "CCS", "DCSD", "HNDIS", "BIS", "CNE", "DNE", "HNDNE", "BNE", " ", " " }));
        getContentPane().add(cmbcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 193, -1));

        cmbbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CO", "MT", "PE", "GA", "KD", "KU" }));
        getContentPane().add(cmbbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 193, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(0, 102, 153));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 95, 34));

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(0, 102, 153));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 95, 34));

        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(0, 102, 153));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 95, 34));

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(0, 102, 153));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 95, 34));

        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(0, 102, 153));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 95, 34));

        lblbg1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chanulya Fernando\\Desktop\\SE\\EAD1\\CW Practice\\Images\\bg color.jpg")); // NOI18N
        getContentPane().add(lblbg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 370, 230));

        lblbg2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chanulya Fernando\\Desktop\\SE\\EAD1\\CW Practice\\Images\\bg color.jpg")); // NOI18N
        getContentPane().add(lblbg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 330, 220));

        lblbg3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chanulya Fernando\\Desktop\\SE\\EAD1\\CW Practice\\Images\\bg color.jpg")); // NOI18N
        getContentPane().add(lblbg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 230));

        lblbg4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chanulya Fernando\\Desktop\\SE\\EAD1\\CW Practice\\Images\\bg color.jpg")); // NOI18N
        getContentPane().add(lblbg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 330, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String stid = txtid.getText();
        String stname = txtname.getText();
        String stcontact = txtcontact.getText();
        String stcourse = (String)cmbcourse.getSelectedItem();
        String stbranch = (String)cmbbranch.getSelectedItem();
            
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Class not found!");
                setVisible(false);
                new newstudent().setVisible(true);
            }
            // TODO add your handling code here:
            String url = "jdbc:mysql://localhost:3306/librarymanagement";
            String user = "root";
            String pswd = "";
            
            Connection con = DriverManager.getConnection(url, user, pswd); 
            
            Statement stmt = con.createStatement();
            
            stmt.execute("INSERT INTO student VALUES('"+stid+"','"+stname+"','"+stcontact+"','"+stcourse+"','"+stbranch+"')");
            JOptionPane.showMessageDialog(null,"Successfully created!");
            setVisible(false);
            new newstudent().setVisible(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Student ID already exists!");
            setVisible(false);
            new newstudent().setVisible(true);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String stid = txtid.getText();
        String stname = txtname.getText();
        String stcontact = txtcontact.getText();
        String stcourse = (String)cmbcourse.getSelectedItem();
        String stbranch = (String)cmbbranch.getSelectedItem();
        
        try {
            String url = "jdbc:mysql://localhost:3306/librarymanagement";
            String user = "root";
            String pswd = "";
            Connection con = DriverManager.getConnection(url, user, pswd);
            
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE student SET stname = '"+stname+"',stcontact = '"+stcontact+"',stcourse = '"+stcourse+"',stbranch = '"+stbranch+"' WHERE stid = '"+stid+"'");
            JOptionPane.showMessageDialog(null,"Student Updated Successfully!");
            setVisible(false);
            new newstudent().setVisible(true);  
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ ex.getMessage());
            setVisible(false);
            new newstudent().setVisible(true);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        String stid = txtid.getText();
        
        try {
            String url = "jdbc:mysql://localhost:3306/librarymanagement";
            String user = "root";
            String pswd = "";
            Connection con = DriverManager.getConnection(url, user, pswd);
            
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM student WHERE stid = '"+stid+"'");
            JOptionPane.showMessageDialog(null,"Student Deleted Successfully!");
            setVisible(false);
            new newstudent().setVisible(true);  
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ ex.getMessage());
            setVisible(false);
            new newstudent().setVisible(true);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String stid = txtid.getText();
        
        try {
            String url = "jdbc:mysql://localhost:3306/librarymanagement";
            String user = "root";
            String pswd = "";
            Connection con = DriverManager.getConnection(url, user, pswd);
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student WHERE stid = '"+stid+"'");
            
            if(rs.next())
            {
                txtname.setText(rs.getString(2));
                txtcontact.setText(rs.getString(3));
                cmbcourse.setSelectedItem(rs.getString(4));
                cmbbranch.setSelectedItem(rs.getString(5));
                //txtid.setEditable(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"This student does not exist in the system!");
                setVisible(false);
                new newstudent().setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ ex.getMessage());
            setVisible(false);
            new newstudent().setVisible(true);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbbranch;
    private javax.swing.JComboBox<String> cmbcourse;
    private javax.swing.JLabel lblbg1;
    private javax.swing.JLabel lblbg2;
    private javax.swing.JLabel lblbg3;
    private javax.swing.JLabel lblbg4;
    private javax.swing.JLabel lblbranch;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblcourse;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbltopic;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
