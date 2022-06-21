/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisi_mentalhealth_care;

import Objects.Consultant;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Respon_Konsul extends javax.swing.JFrame {
    public void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("No");
        model.addColumn("Username");
        model.addColumn("Topic Problem");
        model.addColumn("Place");
        model.addColumn("Date");
        model.addColumn("Time");
        model.addColumn("Status");
        model.addColumn("Diagnosis");
        model.addColumn("Foot Note");
                
        try{
            int no = 1;
            String sql = "SELECT username, problem, place, date, time, status, diagnosis, note FROM janji";
            java.sql.Connection conn = (java.sql.Connection)koneksi_database.koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                model.addRow(new Object[]{no++,rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getString(8)});
                
                TabelRecord.setModel(model);
            }
        
        }catch(SQLException e){
            System.out.println("ERROR :" +e.getMessage());
        }
    }
    /**
     * Creates new form Tampilan_Konsul
     */
    public Respon_Konsul() {
        initComponents();
        tampilkan_data();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelRecord = new javax.swing.JTable();
        LabelRecords = new javax.swing.JLabel();
        PanelForm = new javax.swing.JPanel();
        Nama = new javax.swing.JLabel();
        Topic = new javax.swing.JLabel();
        Place = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Status = new javax.swing.JTextField();
        ButtonSubmitDetails = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        ButtonBack = new javax.swing.JButton();
        PanelDiagnosis = new javax.swing.JPanel();
        LabelFootNote = new javax.swing.JLabel();
        IsiFootNote = new javax.swing.JTextField();
        ButtonSubmitDiagnosis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        IsiDiagnosis = new javax.swing.JTextArea();
        jSeparator6 = new javax.swing.JSeparator();
        LabelDetails = new javax.swing.JLabel();
        LabelDiagnosis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background1.setBackground(new java.awt.Color(77, 150, 255));
        Background1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TabelRecord.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TabelRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Problem Topic", "Place", "Date", "Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelRecordMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelRecord);

        LabelRecords.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        LabelRecords.setText("Consultee Records");

        PanelForm.setBackground(new java.awt.Color(255, 255, 255));
        PanelForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Nama.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Nama.setForeground(new java.awt.Color(204, 204, 204));
        Nama.setText("Username");

        Topic.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Topic.setForeground(new java.awt.Color(204, 204, 204));
        Topic.setText("Problem Topic");

        Place.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Place.setForeground(new java.awt.Color(204, 204, 204));
        Place.setText("Place ");

        Date.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Date.setForeground(new java.awt.Color(204, 204, 204));
        Date.setText("Date");

        Time.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Time.setForeground(new java.awt.Color(204, 204, 204));
        Time.setText("Time");

        Status.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Status.setForeground(new java.awt.Color(204, 204, 204));
        Status.setText("Status");
        Status.setBorder(null);

        ButtonSubmitDetails.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        ButtonSubmitDetails.setText("Submit");
        ButtonSubmitDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubmitDetailsActionPerformed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));

        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFormLayout = new javax.swing.GroupLayout(PanelForm);
        PanelForm.setLayout(PanelFormLayout);
        PanelFormLayout.setHorizontalGroup(
            PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addGap(0, 75, Short.MAX_VALUE)
                        .addComponent(ButtonSubmitDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(ButtonBack))
                    .addComponent(Place, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelFormLayout.createSequentialGroup()
                        .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Time, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Status, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addComponent(Topic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator8))
                .addContainerGap())
        );
        PanelFormLayout.setVerticalGroup(
            PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFormLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(Topic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Place)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonSubmitDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBack))
                .addGap(21, 21, 21))
        );

        PanelDiagnosis.setBackground(new java.awt.Color(255, 255, 255));

        LabelFootNote.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        LabelFootNote.setText("Foot Note :");

        IsiFootNote.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        IsiFootNote.setText("Type your foot note here .....");

        ButtonSubmitDiagnosis.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        ButtonSubmitDiagnosis.setText("Submit");
        ButtonSubmitDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSubmitDiagnosisActionPerformed(evt);
            }
        });

        IsiDiagnosis.setColumns(20);
        IsiDiagnosis.setRows(5);
        IsiDiagnosis.setText("Type your diagnosis here ...");
        IsiDiagnosis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IsiDiagnosis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IsiDiagnosisMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(IsiDiagnosis);

        javax.swing.GroupLayout PanelDiagnosisLayout = new javax.swing.GroupLayout(PanelDiagnosis);
        PanelDiagnosis.setLayout(PanelDiagnosisLayout);
        PanelDiagnosisLayout.setHorizontalGroup(
            PanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiagnosisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFootNote)
                    .addComponent(IsiFootNote, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDiagnosisLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonSubmitDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        PanelDiagnosisLayout.setVerticalGroup(
            PanelDiagnosisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiagnosisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelFootNote)
                .addGap(2, 2, 2)
                .addComponent(IsiFootNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonSubmitDiagnosis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelDetails.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelDetails.setText("Details");

        LabelDiagnosis.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        LabelDiagnosis.setText("Diagnosis");

        javax.swing.GroupLayout Background1Layout = new javax.swing.GroupLayout(Background1);
        Background1.setLayout(Background1Layout);
        Background1Layout.setHorizontalGroup(
            Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background1Layout.createSequentialGroup()
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Background1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Background1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LabelDetails)))
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Background1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelDiagnosis)
                        .addGap(243, 243, 243))
                    .addGroup(Background1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(PanelDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(Background1Layout.createSequentialGroup()
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Background1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(LabelRecords))
                    .addGroup(Background1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Background1Layout.setVerticalGroup(
            Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelRecords)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDetails)
                    .addComponent(LabelDiagnosis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelDiagnosis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(95, 95, 95))
        );

        getContentPane().add(Background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSubmitDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubmitDetailsActionPerformed
        try{
                String sql = "insert into janji set username ='"+ Nama.getText() +"' ,problem='"+ Topic.getText() +"' ,place='"+ Place.getText() +"' ,date='"+ Date.getText() +"' ,time='"+ Time.getText() +"' ,status='"+ Status.getText()+"' On Duplicate Key Update Username = '"+ Nama.getText() +"' ,problem='"+ Topic.getText() +"' ,place='"+ Place.getText() +"' ,date='"+ Date.getText() +"' ,time='"+ Time.getText() +"' ,status='"+ Status.getText() +"'";
                java.sql.Connection conn = (java.sql.Connection)koneksi_database.koneksi.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
           
                JOptionPane.showMessageDialog(null,"Data Tersimpan");
                
                
           
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);     
        }
        tampilkan_data();
    }//GEN-LAST:event_ButtonSubmitDetailsActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        new Menuconsultant().show();
        this.dispose();
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void TabelRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelRecordMouseClicked
        Consultant consul = new Consultant();
        int baris = TabelRecord.rowAtPoint(evt.getPoint());
        
        String user = TabelRecord.getValueAt(baris, 1).toString();
        Nama.setText(user);
        Nama.setForeground(Color.black);
        
        String pb = TabelRecord.getValueAt(baris, 2).toString();
        Topic.setText(pb);
        Topic.setForeground(Color.black);
        
        String pl = TabelRecord.getValueAt(baris, 3).toString();
        Place.setText(pl);
        Place.setForeground(Color.black);
        
        String dt = TabelRecord.getValueAt(baris, 4).toString();
        Date.setText(dt);
        Date.setForeground(Color.black);
        
        String tm = TabelRecord.getValueAt(baris, 5).toString();
        Time.setText(tm);
        Time.setForeground(Color.black);
        
        String st =TabelRecord.getValueAt(baris,6).toString();
        Status.setText(st);
        Status.setForeground(Color.black);
        consul.statusAppoint = Status.getText();
        
        String dg = TabelRecord.getValueAt(baris, 7).toString();
        IsiDiagnosis.setText(dg);
        IsiDiagnosis.setForeground(Color.black);
        consul.diagnosis = IsiDiagnosis.getText();
        
        String fn = TabelRecord.getValueAt(baris, 8).toString();
        IsiFootNote.setText(fn);
        IsiFootNote.setForeground(Color.black);
        consul.footnote = IsiFootNote.getText();
    }//GEN-LAST:event_TabelRecordMouseClicked

    private void ButtonSubmitDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSubmitDiagnosisActionPerformed
        try{
                String sql = "insert into janji set username ='"+ Nama.getText() +"' ,problem='"+ Topic.getText() +"' ,place='"+ Place.getText() +"' ,date='"+ Date.getText() +"' ,time='"+ Time.getText() +"' ,status='"+ Status.getText()+"' ,diagnosis='"+ IsiDiagnosis.getText() +"' ,note='"+ IsiFootNote.getText() +"' On Duplicate Key Update Username = '"+ Nama.getText() +"' ,problem='"+ Topic.getText() +"' ,place='"+ Place.getText() +"' ,date='"+ Date.getText() +"' ,time='"+ Time.getText() +"' ,status='"+ Status.getText() +"' ,diagnosis='"+ IsiDiagnosis.getText() +"' ,note='"+ IsiFootNote.getText() +"'";
                java.sql.Connection conn = (java.sql.Connection)koneksi_database.koneksi.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
           
                JOptionPane.showMessageDialog(null,"Data Tersimpan");
                
                
           
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);     
        }
        tampilkan_data();
    }//GEN-LAST:event_ButtonSubmitDiagnosisActionPerformed

    private void IsiDiagnosisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IsiDiagnosisMouseClicked
        Topic.setText("");
    }//GEN-LAST:event_IsiDiagnosisMouseClicked

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
            java.util.logging.Logger.getLogger(Respon_Konsul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Respon_Konsul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Respon_Konsul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Respon_Konsul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Respon_Konsul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background1;
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonSubmitDetails;
    private javax.swing.JButton ButtonSubmitDiagnosis;
    private javax.swing.JLabel Date;
    private javax.swing.JTextArea IsiDiagnosis;
    private javax.swing.JTextField IsiFootNote;
    private javax.swing.JLabel LabelDetails;
    private javax.swing.JLabel LabelDiagnosis;
    private javax.swing.JLabel LabelFootNote;
    private javax.swing.JLabel LabelRecords;
    private javax.swing.JLabel Nama;
    private javax.swing.JPanel PanelDiagnosis;
    private javax.swing.JPanel PanelForm;
    private javax.swing.JLabel Place;
    private javax.swing.JTextField Status;
    private javax.swing.JTable TabelRecord;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel Topic;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
