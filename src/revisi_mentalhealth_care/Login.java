/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisi_mentalhealth_care;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;



/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {
    
    public static String username;

    /**
     * Creates new form koneksi
     */
    public Login() {
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

        BackgroundLogin1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        BackgroundLogin2 = new javax.swing.JPanel();
        nama = new javax.swing.JTextField();
        ButtonLogin = new javax.swing.JButton();
        LabelLogin = new javax.swing.JLabel();
        ButtonRegister = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundLogin1.setBackground(new java.awt.Color(77, 150, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo innepeace1.png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLogin1Layout = new javax.swing.GroupLayout(BackgroundLogin1);
        BackgroundLogin1.setLayout(BackgroundLogin1Layout);
        BackgroundLogin1Layout.setHorizontalGroup(
            BackgroundLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLogin1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(logo)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        BackgroundLogin1Layout.setVerticalGroup(
            BackgroundLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLogin1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(logo)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        getContentPane().add(BackgroundLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 490));

        BackgroundLogin2.setBackground(new java.awt.Color(255, 255, 255));

        nama.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        nama.setText("Username");
        nama.setBorder(null);
        nama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                namaMouseClicked(evt);
            }
        });
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        ButtonLogin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        ButtonLogin.setForeground(new java.awt.Color(77, 150, 255));
        ButtonLogin.setText("Login");
        ButtonLogin.setBorder(null);
        ButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonLoginMouseExited(evt);
            }
        });
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        LabelLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        LabelLogin.setText("Login");

        ButtonRegister.setBackground(new java.awt.Color(255, 255, 255));
        ButtonRegister.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        ButtonRegister.setForeground(new java.awt.Color(77, 150, 255));
        ButtonRegister.setText("Register");
        ButtonRegister.setBorder(null);
        ButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonRegisterMouseExited(evt);
            }
        });
        ButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegisterActionPerformed(evt);
            }
        });

        password.setText("password");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLogin2Layout = new javax.swing.GroupLayout(BackgroundLogin2);
        BackgroundLogin2.setLayout(BackgroundLogin2Layout);
        BackgroundLogin2Layout.setHorizontalGroup(
            BackgroundLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLogin2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(ButtonRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLogin2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(BackgroundLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLogin2Layout.createSequentialGroup()
                        .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLogin2Layout.createSequentialGroup()
                        .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLogin2Layout.createSequentialGroup()
                        .addGroup(BackgroundLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))))
        );
        BackgroundLogin2Layout.setVerticalGroup(
            BackgroundLogin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLogin2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(LabelLogin)
                .addGap(73, 73, 73)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(BackgroundLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 0, -1, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here: C
    }//GEN-LAST:event_namaActionPerformed

    private void ButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegisterActionPerformed
        new Register().show();
        this.dispose();
    }//GEN-LAST:event_ButtonRegisterActionPerformed

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        try{
            String sql = "select*from login where username=? and password=?";
            java.sql.Connection conn = (java.sql.Connection)koneksi_database.koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nama.getText());
            pst.setString(2, password.getText());
            java.sql.ResultSet rs = pst.executeQuery();
            if(rs.next()){
                if(nama.getText().equals("konsul") && password.getText().equals("konsul")){
                    new Menuconsultant().show();
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Login Berhasil");
                    username = nama.getText();
                    new TampilanUser().show();
                    this.dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Username Atau Password Salah");
                nama.setText("");
                password.setText("");
                nama.requestFocus();
            }
            conn.close();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void ButtonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLoginMouseEntered
        ButtonLogin.setForeground(Color.WHITE);
        ButtonLogin.setBackground(new Color(77,150,255));
    }//GEN-LAST:event_ButtonLoginMouseEntered

    private void ButtonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLoginMouseExited
        ButtonLogin.setForeground(new Color(77,150,255));
        ButtonLogin.setBackground(Color.WHITE);
    }//GEN-LAST:event_ButtonLoginMouseExited

    private void ButtonRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRegisterMouseEntered
        ButtonRegister.setForeground(Color.WHITE);
        ButtonRegister.setBackground(Color.RED);
    }//GEN-LAST:event_ButtonRegisterMouseEntered

    private void ButtonRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRegisterMouseExited
        ButtonRegister.setForeground(new Color(77,150,255));
        ButtonRegister.setBackground(Color.WHITE);
    }//GEN-LAST:event_ButtonRegisterMouseExited

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

    private void namaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namaMouseClicked
        nama.setText("");
    }//GEN-LAST:event_namaMouseClicked

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
    }//GEN-LAST:event_logoMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundLogin1;
    private javax.swing.JPanel BackgroundLogin2;
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JButton ButtonRegister;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nama;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
