/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.DataService;

/**
 *
 * @author madhav
 */
public class MainHospitalMgmtSystem extends javax.swing.JFrame {

    /**
     * Creates new form MainHospitalMgmtSystem
     */
    DataService HAdmin;
    public MainHospitalMgmtSystem() {
        initComponents();
        HAdmin = new DataService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        splitPaneHM = new javax.swing.JSplitPane();
        controlPanelHM = new javax.swing.JPanel();
        Patient = new javax.swing.JButton();
        Doctor = new javax.swing.JButton();
        SystemAdmin = new javax.swing.JButton();
        HospitalAdmin = new javax.swing.JButton();
        btnCommunityAdmin = new javax.swing.JButton();
        workAreaHM = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Patient.setText("Patient");
        Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientActionPerformed(evt);
            }
        });

        Doctor.setText("Doctor");
        Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorActionPerformed(evt);
            }
        });

        SystemAdmin.setText("System Admin");
        SystemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAdminActionPerformed(evt);
            }
        });

        HospitalAdmin.setText("Hospital Admin");
        HospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalAdminActionPerformed(evt);
            }
        });

        btnCommunityAdmin.setText("Community Admin");
        btnCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelHMLayout = new javax.swing.GroupLayout(controlPanelHM);
        controlPanelHM.setLayout(controlPanelHMLayout);
        controlPanelHMLayout.setHorizontalGroup(
            controlPanelHMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelHMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelHMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HospitalAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SystemAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(controlPanelHMLayout.createSequentialGroup()
                        .addComponent(btnCommunityAdmin)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        controlPanelHMLayout.setVerticalGroup(
            controlPanelHMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelHMLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Patient)
                .addGap(18, 18, 18)
                .addComponent(Doctor)
                .addGap(18, 18, 18)
                .addComponent(SystemAdmin)
                .addGap(18, 18, 18)
                .addComponent(HospitalAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnCommunityAdmin)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        splitPaneHM.setLeftComponent(controlPanelHM);

        javax.swing.GroupLayout workAreaHMLayout = new javax.swing.GroupLayout(workAreaHM);
        workAreaHM.setLayout(workAreaHMLayout);
        workAreaHMLayout.setHorizontalGroup(
            workAreaHMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        workAreaHMLayout.setVerticalGroup(
            workAreaHMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        splitPaneHM.setRightComponent(workAreaHM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneHM)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneHM)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalAdminActionPerformed
        // TODO add your handling code here:
        LoginHospAdmin loginPanel = new LoginHospAdmin(HAdmin);
        splitPaneHM.setRightComponent(loginPanel);
    }//GEN-LAST:event_HospitalAdminActionPerformed

    private void btnCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityAdminActionPerformed
        
        
        LoginCommAdmin logincPanel = new LoginCommAdmin(HAdmin);
        splitPaneHM.setRightComponent(logincPanel);


       // TODO add your handling code here:
    }//GEN-LAST:event_btnCommunityAdminActionPerformed

    private void PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientActionPerformed
        // TODO add your handling code here:
      LoginPatientPanel loginPanel = new LoginPatientPanel(HAdmin);
        splitPaneHM.setRightComponent(loginPanel);
       
     /*  MainHospJPanel loginPanel = new MainHospJPanel(HAdmin);
       splitPaneHM.setRightComponent(loginPanel); */
    }//GEN-LAST:event_PatientActionPerformed

    private void DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorActionPerformed
        // TODO add your handling code here:
        LoginDoctorJPanel loginPanel = new LoginDoctorJPanel(HAdmin);
        splitPaneHM.setRightComponent(loginPanel);
    }//GEN-LAST:event_DoctorActionPerformed

    private void SystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAdminActionPerformed
        // TODO add your handling code here:
        FunctionalitySAdminJPanel panel = new FunctionalitySAdminJPanel(this.HAdmin);
        this.splitPaneHM.setRightComponent(panel);
    }//GEN-LAST:event_SystemAdminActionPerformed

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
            java.util.logging.Logger.getLogger(MainHospitalMgmtSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHospitalMgmtSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHospitalMgmtSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHospitalMgmtSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHospitalMgmtSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Doctor;
    private javax.swing.JButton HospitalAdmin;
    private javax.swing.JButton Patient;
    private javax.swing.JButton SystemAdmin;
    private javax.swing.JButton btnCommunityAdmin;
    private javax.swing.JPanel controlPanelHM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane splitPaneHM;
    private javax.swing.JPanel workAreaHM;
    // End of variables declaration//GEN-END:variables
}
