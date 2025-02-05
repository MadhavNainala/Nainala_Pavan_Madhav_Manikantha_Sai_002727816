/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.DataService;

/**
 *
 * @author madhav
 */
public class FunctionalitySAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FunctionalitySAdminJPanel
     */
    DataService d;
    public FunctionalitySAdminJPanel(DataService d) {
        initComponents();
        this.d =d;
        
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
        splitFP = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnPatientMg = new javax.swing.JButton();
        btnSysAMg = new javax.swing.JButton();
        btnDocMg = new javax.swing.JButton();
        btnHospAMg = new javax.swing.JButton();
        btnCommAMg = new javax.swing.JButton();
        btnHospMg = new javax.swing.JButton();
        btnCommMg = new javax.swing.JButton();
        btnEncMg = new javax.swing.JButton();
        btnVitMg = new javax.swing.JButton();
        workAreaFP = new javax.swing.JPanel();

        btnPatientMg.setText("Manage Patient Details");
        btnPatientMg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientMgActionPerformed(evt);
            }
        });

        btnSysAMg.setText("Manage System Admin Details");
        btnSysAMg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSysAMgActionPerformed(evt);
            }
        });

        btnDocMg.setText("Manage Doctor Details");
        btnDocMg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocMgActionPerformed(evt);
            }
        });

        btnHospAMg.setText("Manage Hospital Admin Details");
        btnHospAMg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospAMgActionPerformed(evt);
            }
        });

        btnCommAMg.setText("Manage Community Admin Details");
        btnCommAMg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommAMgActionPerformed(evt);
            }
        });

        btnHospMg.setText("Manage Hospital Details");
        btnHospMg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospMgActionPerformed(evt);
            }
        });

        btnCommMg.setText("Manage Community Details");
        btnCommMg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommMgActionPerformed(evt);
            }
        });

        btnEncMg.setText("Manage Encounter Details");
        btnEncMg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncMgActionPerformed(evt);
            }
        });

        btnVitMg.setText("Manage Vital Signs Details");
        btnVitMg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitMgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDocMg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHospMg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCommAMg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCommMg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEncMg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVitMg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHospAMg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnPatientMg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSysAMg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSysAMg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPatientMg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDocMg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHospAMg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCommAMg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHospMg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCommMg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEncMg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVitMg)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        splitFP.setLeftComponent(controlPanel);

        javax.swing.GroupLayout workAreaFPLayout = new javax.swing.GroupLayout(workAreaFP);
        workAreaFP.setLayout(workAreaFPLayout);
        workAreaFPLayout.setHorizontalGroup(
            workAreaFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );
        workAreaFPLayout.setVerticalGroup(
            workAreaFPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        splitFP.setRightComponent(workAreaFP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitFP)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitFP)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientMgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientMgActionPerformed
        // TODO add your handling code here:
        FunctionPatientJPanel panel = new FunctionPatientJPanel(this.d);
        this.splitFP.setRightComponent(panel);
    }//GEN-LAST:event_btnPatientMgActionPerformed

    private void btnSysAMgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSysAMgActionPerformed
        // TODO add your handling code here:
        MainSysAdminJPanel panel = new MainSysAdminJPanel(d);
        this.splitFP.setRightComponent(panel);
    }//GEN-LAST:event_btnSysAMgActionPerformed

    private void btnDocMgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocMgActionPerformed
        // TODO add your handling code here:
        FunctionDoctorJPanel panel = new FunctionDoctorJPanel(this.d);
        this.splitFP.setRightComponent(panel);
    }//GEN-LAST:event_btnDocMgActionPerformed

    private void btnHospAMgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospAMgActionPerformed
        // TODO add your handling code here:
        MainHospAdminJPanel panel = new MainHospAdminJPanel(this.d);
        this.splitFP.setRightComponent(panel);
    }//GEN-LAST:event_btnHospAMgActionPerformed

    private void btnCommAMgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommAMgActionPerformed
        // TODO add your handling code here:
        CommunityAdminJpanel panel = new CommunityAdminJpanel(this.d);
        this.splitFP.setRightComponent(panel);
    }//GEN-LAST:event_btnCommAMgActionPerformed

    private void btnHospMgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospMgActionPerformed
        // TODO add your handling code here:
        MainHospJPanel panel = new MainHospJPanel(this.d);
        this.splitFP.setRightComponent(panel);
    }//GEN-LAST:event_btnHospMgActionPerformed

    private void btnCommMgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommMgActionPerformed
        // TODO add your handling code here:
        FunctionCommunityAdmin panel = new FunctionCommunityAdmin(this.d);
        this.splitFP.setRightComponent(panel);
    }//GEN-LAST:event_btnCommMgActionPerformed

    private void btnEncMgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncMgActionPerformed
        // TODO add your handling code here:
        CreateEncounterJPanel panel = new CreateEncounterJPanel(this.d);
        this.splitFP.setRightComponent(panel);
    }//GEN-LAST:event_btnEncMgActionPerformed

    private void btnVitMgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitMgActionPerformed
        // TODO add your handling code here:
        VitalsJpanel panel = new VitalsJpanel(this.d);
        this.splitFP.setRightComponent(panel);
    }//GEN-LAST:event_btnVitMgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommAMg;
    private javax.swing.JButton btnCommMg;
    private javax.swing.JButton btnDocMg;
    private javax.swing.JButton btnEncMg;
    private javax.swing.JButton btnHospAMg;
    private javax.swing.JButton btnHospMg;
    private javax.swing.JButton btnPatientMg;
    private javax.swing.JButton btnSysAMg;
    private javax.swing.JButton btnVitMg;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane splitFP;
    private javax.swing.JPanel workAreaFP;
    // End of variables declaration//GEN-END:variables
}
