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
public class DiaryUser extends javax.swing.JFrame {

    /**
     * Creates new form MenuUser
     */
    public DiaryUser() {
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

        RadioButtonDiaryPrivacy = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTulisDiary = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelDiary = new javax.swing.JTable();
        ButtonFinishDiary = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();
        LabelGreetingDiary = new javax.swing.JLabel();
        LabelGreetingDiary2 = new javax.swing.JLabel();
        jBackground = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("InnerPeace");
        setName("MenuUser"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(709, 483));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        AreaTulisDiary.setColumns(20);
        AreaTulisDiary.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        AreaTulisDiary.setRows(5);
        AreaTulisDiary.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        AreaTulisDiary.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(AreaTulisDiary);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 410, 220));

        TabelDiary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        TabelDiary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "Date", "About..."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelDiary);
        if (TabelDiary.getColumnModel().getColumnCount() > 0) {
            TabelDiary.getColumnModel().getColumn(0).setPreferredWidth(30);
            TabelDiary.getColumnModel().getColumn(0).setMaxWidth(30);
            TabelDiary.getColumnModel().getColumn(1).setPreferredWidth(60);
            TabelDiary.getColumnModel().getColumn(1).setMaxWidth(60);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 340, 90));

        ButtonFinishDiary.setBackground(java.awt.Color.pink);
        ButtonFinishDiary.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        ButtonFinishDiary.setForeground(new java.awt.Color(0, 102, 153));
        ButtonFinishDiary.setText("Done");
        ButtonFinishDiary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonFinishDiary.setBorderPainted(false);
        ButtonFinishDiary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonFinishDiary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonFinishDiaryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonFinishDiaryMouseExited(evt);
            }
        });
        ButtonFinishDiary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFinishDiaryActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonFinishDiary, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 70, -1));

        ButtonBack.setBackground(java.awt.Color.pink);
        ButtonBack.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ButtonBack.setForeground(new java.awt.Color(0, 102, 153));
        ButtonBack.setText("Back to Main Menu");
        ButtonBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonBack.setBorderPainted(false);
        ButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonBackMouseExited(evt);
            }
        });
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 160, 40));

        LabelGreetingDiary.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LabelGreetingDiary.setForeground(new java.awt.Color(0, 102, 153));
        LabelGreetingDiary.setText("My Personal Diary");
        getContentPane().add(LabelGreetingDiary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LabelGreetingDiary2.setBackground(new java.awt.Color(255, 255, 255));
        LabelGreetingDiary2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        LabelGreetingDiary2.setForeground(new java.awt.Color(255, 255, 255));
        LabelGreetingDiary2.setText("A Sanctuary, vent to your heart's content.");
        getContentPane().add(LabelGreetingDiary2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 420, 30));

        jBackground.setBackground(new java.awt.Color(77, 150, 255));

        javax.swing.GroupLayout jBackgroundLayout = new javax.swing.GroupLayout(jBackground);
        jBackground.setLayout(jBackgroundLayout);
        jBackgroundLayout.setHorizontalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jBackgroundLayout.setVerticalGroup(
            jBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void ButtonFinishDiaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFinishDiaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonFinishDiaryActionPerformed

    private void ButtonFinishDiaryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonFinishDiaryMouseEntered
        ButtonFinishDiary.setBackground(Color.lightGray);
    }//GEN-LAST:event_ButtonFinishDiaryMouseEntered

    private void ButtonFinishDiaryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonFinishDiaryMouseExited
        ButtonFinishDiary.setBackground(Color.pink);
    }//GEN-LAST:event_ButtonFinishDiaryMouseExited

    private void ButtonBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBackMouseEntered
        ButtonBack.setBackground(Color.lightGray);
    }//GEN-LAST:event_ButtonBackMouseEntered

    private void ButtonBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBackMouseExited
        ButtonBack.setBackground(Color.pink);
    }//GEN-LAST:event_ButtonBackMouseExited

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
            java.util.logging.Logger.getLogger(DiaryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiaryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiaryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiaryUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiaryUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTulisDiary;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonFinishDiary;
    private javax.swing.JLabel LabelGreetingDiary;
    private javax.swing.JLabel LabelGreetingDiary2;
    private javax.swing.ButtonGroup RadioButtonDiaryPrivacy;
    private javax.swing.JTable TabelDiary;
    private javax.swing.JPanel jBackground;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
