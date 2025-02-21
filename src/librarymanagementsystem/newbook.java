/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Chanulya Fernando
 */
public class newbook extends javax.swing.JFrame {

    /**
     * Creates new form newbook
     */
    public newbook() {
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

        lblbid = new javax.swing.JLabel();
        lblbname = new javax.swing.JLabel();
        lblbauthor = new javax.swing.JLabel();
        lblbpublisher = new javax.swing.JLabel();
        lblbpubyear = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtbname = new javax.swing.JTextField();
        txtbauthor = new javax.swing.JTextField();
        txtbpublisher = new javax.swing.JTextField();
        txtbpubyear = new javax.swing.JTextField();
        lbltopic = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        lblbg3 = new javax.swing.JLabel();
        lblbg1 = new javax.swing.JLabel();
        lblbg2 = new javax.swing.JLabel();
        lblbg4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(370, 170));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblbid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbid.setForeground(new java.awt.Color(0, 102, 153));
        lblbid.setText("Book ID");
        getContentPane().add(lblbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        lblbname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbname.setForeground(new java.awt.Color(0, 102, 153));
        lblbname.setText("Book Name");
        getContentPane().add(lblbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        lblbauthor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbauthor.setForeground(new java.awt.Color(0, 102, 153));
        lblbauthor.setText("Author");
        getContentPane().add(lblbauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        lblbpublisher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbpublisher.setForeground(new java.awt.Color(0, 102, 153));
        lblbpublisher.setText("Publisher");
        getContentPane().add(lblbpublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        lblbpubyear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblbpubyear.setForeground(new java.awt.Color(0, 102, 153));
        lblbpubyear.setText("Published Year");
        getContentPane().add(lblbpubyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 109, -1));
        getContentPane().add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 220, -1));
        getContentPane().add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 220, -1));
        getContentPane().add(txtbauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 220, -1));
        getContentPane().add(txtbpublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 220, -1));
        getContentPane().add(txtbpubyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 220, -1));

        lbltopic.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbltopic.setForeground(new java.awt.Color(0, 102, 153));
        lbltopic.setText("Add New Book");
        getContentPane().add(lbltopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 35, -1, -1));

        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(0, 102, 153));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 87, 35));

        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclose.setForeground(new java.awt.Color(0, 102, 153));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 85, 35));

        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(0, 102, 153));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 85, 35));

        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(0, 102, 153));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 85, 35));

        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(0, 102, 153));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 85, 35));

        lblbg3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chanulya Fernando\\Desktop\\SE\\EAD1\\CW Practice\\Images\\bg color.jpg")); // NOI18N
        getContentPane().add(lblbg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 360, 230));

        lblbg1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chanulya Fernando\\Desktop\\SE\\EAD1\\CW Practice\\Images\\bg color.jpg")); // NOI18N
        getContentPane().add(lblbg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 360, 230));

        lblbg2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chanulya Fernando\\Desktop\\SE\\EAD1\\CW Practice\\Images\\bg color.jpg")); // NOI18N
        getContentPane().add(lblbg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 230));

        lblbg4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Chanulya Fernando\\Desktop\\SE\\EAD1\\CW Practice\\Images\\bg color.jpg")); // NOI18N
        getContentPane().add(lblbg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 360, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String bid = txtbid.getText();
        String bname = txtbname.getText();
        String author = txtbauthor.getText();
        String publisher = txtbpublisher.getText();
        String publishedyear = txtbpubyear.getText();
        
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Class not found!");
                setVisible(false);
                new newbook().setVisible(true);
            }
            // TODO add your handling code here:
            String url = "jdbc:mysql://localhost:3306/librarymanagement";
            String user = "root";
            String pswd = "";
            
            Connection con = DriverManager.getConnection(url, user, pswd); 
            
            Statement stmt = con.createStatement();
            
            stmt.execute("INSERT INTO book VALUES('"+bid+"','"+bname+"','"+author+"','"+publisher+"','"+publishedyear+"')");
            JOptionPane.showMessageDialog(null,"Successfully created!");
            setVisible(false);
            new newbook().setVisible(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ ex.getMessage());
            setVisible(false);
            new newbook().setVisible(true);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String bid = txtbid.getText();
        
        try {
            String url = "jdbc:mysql://localhost:3306/librarymanagement";
            String user = "root";
            String pswd = "";
            Connection con = DriverManager.getConnection(url, user, pswd);
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM book WHERE bid = '"+bid+"'");
            
            if(rs.next())
            {
                txtbname.setText(rs.getString(2));
                txtbauthor.setText(rs.getString(3));
                txtbpublisher.setText(rs.getString(4));
                txtbpubyear.setText(rs.getString(5));
                //txtbid.setEditable(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"This book does not exist in the system!");
                setVisible(false);
                new newbook().setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ ex.getMessage());
            setVisible(false);
            new newbook().setVisible(true);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String bid = txtbid.getText();
        String bname = txtbname.getText();
        String author = txtbauthor.getText();
        String publisher = txtbpublisher.getText();
        String publishedyear = txtbpubyear.getText();
        
        try {
            String url = "jdbc:mysql://localhost:3306/librarymanagement";
            String user = "root";
            String pswd = "";
            Connection con = DriverManager.getConnection(url, user, pswd);
            
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE book SET bname = '"+bname+"',author = '"+author+"',publisher = '"+publisher+"',publishedyear = '"+publishedyear+"' WHERE bid = '"+bid+"'");
            JOptionPane.showMessageDialog(null,"Book Updated Successfully!");
            setVisible(false);
            new newbook().setVisible(true);  
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ ex.getMessage());
            setVisible(false);
            new newbook().setVisible(true);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        String bid = txtbid.getText();
        
        try {
            String url = "jdbc:mysql://localhost:3306/librarymanagement";
            String user = "root";
            String pswd = "";
            Connection con = DriverManager.getConnection(url, user, pswd);
            
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DELETE FROM book WHERE bid = '"+bid+"'");
            JOptionPane.showMessageDialog(null,"Book Deleted Successfully!");
            setVisible(false);
            new newbook().setVisible(true);  
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error: "+ ex.getMessage());
            setVisible(false);
            new newbook().setVisible(true);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel lblbauthor;
    private javax.swing.JLabel lblbg1;
    private javax.swing.JLabel lblbg2;
    private javax.swing.JLabel lblbg3;
    private javax.swing.JLabel lblbg4;
    private javax.swing.JLabel lblbid;
    private javax.swing.JLabel lblbname;
    private javax.swing.JLabel lblbpublisher;
    private javax.swing.JLabel lblbpubyear;
    private javax.swing.JLabel lbltopic;
    private javax.swing.JTextField txtbauthor;
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbpublisher;
    private javax.swing.JTextField txtbpubyear;
    // End of variables declaration//GEN-END:variables
}
