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
public class MainHospJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainHospJPanel
     */
    DataService hosp;
    public MainHospJPanel(DataService hosp) {
        initComponents();
       this.hosp = hosp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPaneMH = new javax.swing.JSplitPane();
        controlPanelMH = new javax.swing.JPanel();
        btnViewHosp = new javax.swing.JButton();
        btnUpdateHosp = new javax.swing.JButton();
        btnCreateHosp = new javax.swing.JButton();
        workAreaMH = new javax.swing.JPanel();

        btnViewHosp.setText("View/Delete");
        btnViewHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospActionPerformed(evt);
            }
        });

        btnUpdateHosp.setText("Update");
        btnUpdateHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospActionPerformed(evt);
            }
        });

        btnCreateHosp.setText("Create");
        btnCreateHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelMHLayout = new javax.swing.GroupLayout(controlPanelMH);
        controlPanelMH.setLayout(controlPanelMHLayout);
        controlPanelMHLayout.setHorizontalGroup(
            controlPanelMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelMHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewHosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateHosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(controlPanelMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelMHLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnCreateHosp, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        controlPanelMHLayout.setVerticalGroup(
            controlPanelMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelMHLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnViewHosp)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateHosp)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(controlPanelMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(controlPanelMHLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(btnCreateHosp)
                    .addContainerGap(231, Short.MAX_VALUE)))
        );

        splitPaneMH.setLeftComponent(controlPanelMH);

        javax.swing.GroupLayout workAreaMHLayout = new javax.swing.GroupLayout(workAreaMH);
        workAreaMH.setLayout(workAreaMHLayout);
        workAreaMHLayout.setHorizontalGroup(
            workAreaMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        workAreaMHLayout.setVerticalGroup(
            workAreaMHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        splitPaneMH.setRightComponent(workAreaMH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPaneMH)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneMH)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospActionPerformed
        // TODO add your handling code here:
        CreateHospJPanel createPanel = new CreateHospJPanel(hosp);
       //CreateHospJPanel createPanel = new CreateHospJPanel();
        splitPaneMH.setRightComponent(createPanel);
        //CreatePatientJPanel createPanel = new CreatePatientJPanel(hosp);
        //splitPaneMH.setRightComponent(createPanel);
    }//GEN-LAST:event_btnCreateHospActionPerformed

    private void btnViewHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospActionPerformed
        // TODO add your handling code here:
       ViewHospJPanel viewPanel = new ViewHospJPanel(hosp);
       //CreateHospJPanel createPanel = new CreateHospJPanel();
        splitPaneMH.setRightComponent(viewPanel);
        //ViewPatientInfoJPanel createPanel = new ViewPatientInfoJPanel(hosp);
       // splitPaneMH.setRightComponent(createPanel);
    }//GEN-LAST:event_btnViewHospActionPerformed

    private void btnUpdateHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospActionPerformed
        // TODO add your handling code here:
        UpdateHospJPanel updatePanel = new UpdateHospJPanel(hosp);
       //CreateHospJPanel createPanel = new CreateHospJPanel();
        splitPaneMH.setRightComponent(updatePanel);
    }//GEN-LAST:event_btnUpdateHospActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateHosp;
    private javax.swing.JButton btnUpdateHosp;
    private javax.swing.JButton btnViewHosp;
    private javax.swing.JPanel controlPanelMH;
    private javax.swing.JSplitPane splitPaneMH;
    private javax.swing.JPanel workAreaMH;
    // End of variables declaration//GEN-END:variables
}
