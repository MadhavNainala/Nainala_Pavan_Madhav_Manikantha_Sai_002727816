/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.DataService;
import model.Doctor;
import model.HospitalAdmin;

/**
 *
 * @author madhav
 */
public class LoginDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginDoctorJPanel
     */
    DataService HAdmin;
    Doctor p;
    public LoginDoctorJPanel(DataService HAdmin) {
        initComponents();
        this.HAdmin = HAdmin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPaneLD = new javax.swing.JSplitPane();
        controlPanelLD = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbLDUsername = new javax.swing.JLabel();
        lbLDPassword = new javax.swing.JLabel();
        txtUsrLD = new javax.swing.JTextField();
        txtPassLD = new javax.swing.JTextField();
        btnHALogin = new javax.swing.JButton();
        workAreaLD = new javax.swing.JPanel();

        jLabel1.setText("Enter Login Details ");

        lbLDUsername.setText("Username:");

        lbLDPassword.setText(" Password:");

        btnHALogin.setText("Login ");
        btnHALogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHALoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLDLayout = new javax.swing.GroupLayout(controlPanelLD);
        controlPanelLD.setLayout(controlPanelLDLayout);
        controlPanelLDLayout.setHorizontalGroup(
            controlPanelLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLDLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(controlPanelLDLayout.createSequentialGroup()
                .addGroup(controlPanelLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(controlPanelLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbLDPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsrLD)
                            .addComponent(lbLDUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassLD, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                    .addGroup(controlPanelLDLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnHALogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLDLayout.setVerticalGroup(
            controlPanelLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLDUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsrLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLDPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHALogin)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        splitPaneLD.setLeftComponent(controlPanelLD);

        javax.swing.GroupLayout workAreaLDLayout = new javax.swing.GroupLayout(workAreaLD);
        workAreaLD.setLayout(workAreaLDLayout);
        workAreaLDLayout.setHorizontalGroup(
            workAreaLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        workAreaLDLayout.setVerticalGroup(
            workAreaLDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        splitPaneLD.setRightComponent(workAreaLD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPaneLD, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneLD)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
       Doctor searchDoctor(String username,String password) {
        for(Doctor e:this.HAdmin.getDoctr()) {
            if(e.getDocUsername().matches(username) && e.getDocPass().matches(password)) {
                return e;
            }
            
        }
        return null;
    }
    private void btnHALoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHALoginActionPerformed
        // TODO add your handling code here:
        String haUsername = txtUsrLD.getText();
        String haPassword = txtPassLD.getText();
        Doctor hau = this.searchDoctor(haUsername,haPassword);
        this.p = hau;
        //HospitalAdmin hap = this.searchHospitalAdmin(haPassword);
        if(hau==null) {

            JOptionPane.showMessageDialog(this, "Hospital ID does not exist! Please give valid Hospital Id.");return;
        }else{
            FunctionDocJPanel fhaPanel = new FunctionDocJPanel(this.p, HAdmin);
                splitPaneLD.setRightComponent(fhaPanel);
             }
    }//GEN-LAST:event_btnHALoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHALogin;
    private javax.swing.JPanel controlPanelLD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbLDPassword;
    private javax.swing.JLabel lbLDUsername;
    private javax.swing.JSplitPane splitPaneLD;
    private javax.swing.JTextField txtPassLD;
    private javax.swing.JTextField txtUsrLD;
    private javax.swing.JPanel workAreaLD;
    // End of variables declaration//GEN-END:variables
}
