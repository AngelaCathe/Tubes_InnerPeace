/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package revisi_mentalhealth_care;

import java.awt.Color;
/**
 *
 * @author Aspire 5
 */
public class MenuKonsultan extends javax.swing.JFrame {

    /**
     * Creates new form MenuUser
     */
    public MenuKonsultan() {
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

        ButtonLogOut = new javax.swing.JButton();
        LogoInnerPeace = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ButtonRekamMedis = new javax.swing.JButton();
        ButtonAppointment = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabelGreetingUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InnerPeace");
        setName("MenuUser"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(709, 483));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonLogOut.setBackground(java.awt.Color.pink);
        ButtonLogOut.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        ButtonLogOut.setForeground(new java.awt.Color(0, 102, 153));
        ButtonLogOut.setText("Log Out");
        ButtonLogOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonLogOut.setBorderPainted(false);
        ButtonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonLogOutMouseExited(evt);
            }
        });
        ButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 150, 40));

        LogoInnerPeace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo innepeace1.png"))); // NOI18N
        getContentPane().add(LogoInnerPeace, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 260, 440));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(150, 204, 255));

        ButtonRekamMedis.setBackground(java.awt.Color.pink);
        ButtonRekamMedis.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonRekamMedis.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRekamMedis.setText("Consultee Records");
        ButtonRekamMedis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonRekamMedis.setBorderPainted(false);
        ButtonRekamMedis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonRekamMedis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonRekamMedisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonRekamMedisMouseExited(evt);
            }
        });
        ButtonRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRekamMedisActionPerformed(evt);
            }
        });

        ButtonAppointment.setBackground(java.awt.Color.pink);
        ButtonAppointment.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ButtonAppointment.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAppointment.setText("Appointment");
        ButtonAppointment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAppointment.setBorderPainted(false);
        ButtonAppointment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonAppointmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonAppointmentMouseExited(evt);
            }
        });
        ButtonAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonRekamMedis, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(ButtonAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ButtonAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(ButtonRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 710, 360));

        jPanel1.setBackground(new java.awt.Color(77, 150, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelGreetingUser.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        LabelGreetingUser.setForeground(new java.awt.Color(255, 255, 255));
        LabelGreetingUser.setText("InnerPeace");
        jPanel1.add(LabelGreetingUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRekamMedisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonRekamMedisActionPerformed

    private void ButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLogOutActionPerformed

    private void ButtonAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAppointmentActionPerformed

    private void ButtonRekamMedisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRekamMedisMouseEntered
        ButtonRekamMedis.setBackground(Color.lightGray);
    }//GEN-LAST:event_ButtonRekamMedisMouseEntered

    private void ButtonRekamMedisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRekamMedisMouseExited
        ButtonRekamMedis.setBackground(Color.pink);
    }//GEN-LAST:event_ButtonRekamMedisMouseExited

    private void ButtonAppointmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAppointmentMouseEntered
        ButtonAppointment.setBackground(Color.lightGray);
    }//GEN-LAST:event_ButtonAppointmentMouseEntered

    private void ButtonAppointmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAppointmentMouseExited
        ButtonAppointment.setBackground(Color.pink);
    }//GEN-LAST:event_ButtonAppointmentMouseExited

    private void ButtonLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseEntered
        ButtonLogOut.setBackground(Color.lightGray);
    }//GEN-LAST:event_ButtonLogOutMouseEntered

    private void ButtonLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseExited
        ButtonLogOut.setBackground(Color.pink);
    }//GEN-LAST:event_ButtonLogOutMouseExited

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
            java.util.logging.Logger.getLogger(MenuKonsultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuKonsultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuKonsultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuKonsultan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuKonsultan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAppointment;
    private javax.swing.JButton ButtonLogOut;
    private javax.swing.JButton ButtonRekamMedis;
    private javax.swing.JLabel LabelGreetingUser;
    private javax.swing.JLabel LogoInnerPeace;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
    
}
