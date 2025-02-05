/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.DataService;
import model.HospitalAdmin;

/**
 *
 * @author madhav
 */
public class CreateHospAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHospAdminJPanel
     */
    DataService HAdmin;
    public CreateHospAdminJPanel(DataService HAdmin) {
        initComponents();
        this.HAdmin=HAdmin;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHospAdminId = new javax.swing.JTextField();
        txtHospAdminName = new javax.swing.JTextField();
        txtHospAdminUsername = new javax.swing.JTextField();
        btnSaveHA = new javax.swing.JButton();
        lbCreateHospAdmin = new javax.swing.JLabel();
        lbHospAdminID = new javax.swing.JLabel();
        lbHospAdminName = new javax.swing.JLabel();
        lbHospAdminUsername = new javax.swing.JLabel();
        lbHospAdminPass = new javax.swing.JLabel();
        txtHospAdminPassword = new javax.swing.JTextField();

        txtHospAdminId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospAdminIdActionPerformed(evt);
            }
        });

        btnSaveHA.setText("Save Hospital Admin");
        btnSaveHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHAActionPerformed(evt);
            }
        });

        lbCreateHospAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCreateHospAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCreateHospAdmin.setText("Create Hospital Admin Profile");

        lbHospAdminID.setText("Hospital Admin ID :");

        lbHospAdminName.setText("Admin Name :");

        lbHospAdminUsername.setText("Admin Username :");

        lbHospAdminPass.setText("Admin Password :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbCreateHospAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbHospAdminUsername)
                            .addComponent(lbHospAdminName)
                            .addComponent(lbHospAdminID)
                            .addComponent(lbHospAdminPass))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHospAdminId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHospAdminName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHospAdminUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtHospAdminPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSaveHA)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCreateHospAdmin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospAdminID)
                    .addComponent(txtHospAdminId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospAdminName)
                    .addComponent(txtHospAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHospAdminUsername)
                    .addComponent(txtHospAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospAdminPass))
                .addGap(35, 35, 35)
                .addComponent(btnSaveHA)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospAdminIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospAdminIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospAdminIdActionPerformed
public boolean isEmpty(String c){
        return c != null && c.length() ==0;
        }
public boolean isStrongPassword(String s) {  
    return s != null && s.matches("^(?=.[a-z])(?=.[A-Z])(?=.\\d)(?=.[@$!%?&])[A-Za-z\\d@$!%?&]{8,}$");  
    }
    private void btnSaveHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHAActionPerformed
        // TODO add your handling code here:
        if(isEmpty(txtHospAdminId.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter admin ID");
            return;
        }
        String hAdminId = txtHospAdminId.getText();
        if(isEmpty(txtHospAdminName.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter admin name");
            return;
        }
        String hAdminName = txtHospAdminName.getText();
        
        String hAdminUsername = txtHospAdminUsername.getText();
        if(isEmpty(txtHospAdminUsername.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter admin Username");
            return;
        }
        /* if(!isStrongPassword(txtHospAdminPassword.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter a Strong Password");
            return;
        }*/
        String hAdminPassword = txtHospAdminPassword.getText();
       

        HospitalAdmin ha = HAdmin.addNewHospAdmin();
        ha.sethAdminId(hAdminId);
        ha.sethAdminName(hAdminName);
        ha.sethAdminUserName(hAdminUsername);
        ha.sethAdminPassword(hAdminPassword);

        JOptionPane.showMessageDialog(this,"New Hospital Added to List");
        
        txtHospAdminId.setText("");
        txtHospAdminName.setText("");
        txtHospAdminUsername.setText("");
        txtHospAdminPassword.setText("");
        
    }//GEN-LAST:event_btnSaveHAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveHA;
    private javax.swing.JLabel lbCreateHospAdmin;
    private javax.swing.JLabel lbHospAdminID;
    private javax.swing.JLabel lbHospAdminName;
    private javax.swing.JLabel lbHospAdminPass;
    private javax.swing.JLabel lbHospAdminUsername;
    private javax.swing.JTextField txtHospAdminId;
    private javax.swing.JTextField txtHospAdminName;
    private javax.swing.JTextField txtHospAdminPassword;
    private javax.swing.JTextField txtHospAdminUsername;
    // End of variables declaration//GEN-END:variables
}
