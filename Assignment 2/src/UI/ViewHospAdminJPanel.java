/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DataService;
import model.HospitalAdmin;

/**
 *
 * @author madhav
 */
public class ViewHospAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHospAdminJPanel
     */
    DataService HAdmin;
    public ViewHospAdminJPanel(DataService HAdmin) {
        initComponents();
        this.HAdmin = HAdmin;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHospAdminName = new javax.swing.JTextField();
        txtAdminUsername = new javax.swing.JTextField();
        lbHospAdminID = new javax.swing.JLabel();
        lbViewHospitalAdmin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospAdmin = new javax.swing.JTable();
        btnViewHospAdmin = new javax.swing.JButton();
        btnDeleteHospAdmin = new javax.swing.JButton();
        lbHospAdminName = new javax.swing.JLabel();
        lbAdminUsername = new javax.swing.JLabel();
        txtHospAdminId = new javax.swing.JTextField();
        lbAdminPassword = new javax.swing.JLabel();
        txtAdminPassword = new javax.swing.JTextField();

        lbHospAdminID.setText("Hospital Admin ID :");

        lbViewHospitalAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbViewHospitalAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbViewHospitalAdmin.setText("View Hospital Admin Details");

        tblHospAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "HA ID", "HA Name", "HA Username", "HA Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospAdmin);

        btnViewHospAdmin.setText("View");
        btnViewHospAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospAdminActionPerformed(evt);
            }
        });

        btnDeleteHospAdmin.setText("Delete");
        btnDeleteHospAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHospAdminActionPerformed(evt);
            }
        });

        lbHospAdminName.setText("Hospital Admin Name :");

        lbAdminUsername.setText("Hospital Admin Username :");

        txtHospAdminId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospAdminIdActionPerformed(evt);
            }
        });

        lbAdminPassword.setText("Hospital Admin Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbViewHospitalAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(btnViewHospAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteHospAdmin))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbHospAdminID)
                                    .addComponent(lbHospAdminName)
                                    .addComponent(lbAdminUsername)
                                    .addComponent(lbAdminPassword))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtHospAdminId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHospAdminName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAdminUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdminPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbViewHospitalAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewHospAdmin)
                    .addComponent(btnDeleteHospAdmin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHospAdminID)
                    .addComponent(txtHospAdminId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHospAdminName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAdminUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAdminPassword)
                    .addComponent(txtAdminPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewHospAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospAdminActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospAdmin.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }
        DefaultTableModel model= (DefaultTableModel) tblHospAdmin.getModel();
        HospitalAdmin selectedHospitalAdmin = (HospitalAdmin) model.getValueAt(selectedRowIndex, 0);
        txtHospAdminId.setText(String.valueOf(selectedHospitalAdmin.gethAdminId()));
        txtHospAdminName.setText(selectedHospitalAdmin.gethAdminName());
        txtAdminUsername.setText(selectedHospitalAdmin.gethAdminUserName());
        txtAdminPassword.setText(selectedHospitalAdmin.gethAdminPassword());
    }//GEN-LAST:event_btnViewHospAdminActionPerformed

    private void btnDeleteHospAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHospAdminActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospAdmin.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }
        DefaultTableModel model= (DefaultTableModel) tblHospAdmin.getModel();
        HospitalAdmin selectedHospitalAdmin = (HospitalAdmin) model.getValueAt(selectedRowIndex, 0);
      
        HAdmin.deleteHospAdmin(selectedHospitalAdmin);
        JOptionPane.showMessageDialog(this, "Hospital record has been deleted");
        populateTable();
    }//GEN-LAST:event_btnDeleteHospAdminActionPerformed

    private void txtHospAdminIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospAdminIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospAdminIdActionPerformed
private void populateTable() {
        DefaultTableModel model= (DefaultTableModel) tblHospAdmin.getModel();
        model.setRowCount(0);
        
        for(HospitalAdmin ha : HAdmin.getHospAdmin()){
            Object[] row = new Object[4];
            row[0] = ha;
            row[1] = ha.gethAdminName();
            row[2] = ha.gethAdminUserName();
            row[3] = ha.gethAdminPassword();
            model.addRow(row);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteHospAdmin;
    private javax.swing.JButton btnViewHospAdmin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAdminPassword;
    private javax.swing.JLabel lbAdminUsername;
    private javax.swing.JLabel lbHospAdminID;
    private javax.swing.JLabel lbHospAdminName;
    private javax.swing.JLabel lbViewHospitalAdmin;
    private javax.swing.JTable tblHospAdmin;
    private javax.swing.JTextField txtAdminPassword;
    private javax.swing.JTextField txtAdminUsername;
    private javax.swing.JTextField txtHospAdminId;
    private javax.swing.JTextField txtHospAdminName;
    // End of variables declaration//GEN-END:variables
}
