/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Community;
import model.DataService;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author madhav
 */
public class CommunityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityJPanel
     */
    
    DataService community;
    
    public CommunityJPanel(DataService community) {
        initComponents();
        this.community = community;
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

        lbltitle = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        lblCID = new javax.swing.JLabel();
        txtCID = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCommunity = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtCityId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 204, 255));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitle.setText("Community Details");

        lblCommunity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCommunity.setText("Community Name");

        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });

        lblCID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCID.setText("Community ID");

        txtCID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIDActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCity.setText("City ID");

        btnSave.setBackground(new java.awt.Color(204, 204, 204));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Community Name", "Community ID", "City ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCommunity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCommunityMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCommunity);

        btnView.setBackground(new java.awt.Color(204, 204, 204));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnView)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCID)
                            .addComponent(txtCommunity)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate))
                            .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(343, 343, 343)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lbltitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnView});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSave, btnUpdate});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCID, lblCity, lblCommunity});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addGap(77, 77, 77))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCID, lblCity, lblCommunity});

    }// </editor-fold>//GEN-END:initComponents

    public boolean isEmpty(String c){
        return c != null && c.length() ==0;
        }
    
    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed

    private void txtCIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCIDActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        
        String Communityname = txtCommunity.getText();
        String CommunityId = txtCID.getText();
        String CityId = txtCityId.getText();
        
        Community vs = community.addCdata();
        
        vs.setCommunityName(Communityname);
        vs.setCommunityID(CommunityId);
        vs.setCityID(CityId);
        
        
        //
        
        if(txtCommunity.getText().length()<=0 || txtCID.getText().length()<=0){
            
            JOptionPane.showMessageDialog(this,"Please enter all Fields");
            return;
        }
        
        JOptionPane.showMessageDialog(this,"New Community Details Added.");
        
        txtCommunity.setText("");
        txtCID.setText("");
        txtCityId.setText("");
        
        //for (int selectedRowIndex = tblCommunity.getRowCount() -1; selectedRowIndex>=0; selectedRowIndex--){
        //    community.removeRow(selectedRowIndex);
        //}
        // code needed list(city)
        
        populateTable();
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblCommunity.getSelectedRow();
        
        if(selectedRowIndex<0){
            
            JOptionPane.showMessageDialog(this, "Please select a row to View");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCommunity.getModel();
        Community selectedCdata = (Community) model.getValueAt(selectedRowIndex, 0);
        
        txtCommunity.setText(selectedCdata.getCommunityName());
        txtCID.setText(selectedCdata.getCommunityID());
        txtCityId.setText(selectedCdata.getCityID());
        
        
        // code needed list(city)
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCommunity.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select row to delete");
            return;
        }
        else{
            
            JOptionPane.showMessageDialog(this, "Community data deleted");
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCommunity.getModel();
        Community selectedCdata = (Community) model.getValueAt(selectedRowIndex, 0);
        
//     (selectedCdata);
        this.community.deleteCdata(selectedCdata);
        txtCommunity.setText("");
        txtCID.setText("");
        txtCityId.setText("");
        
        populateTable();
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblCommunity.getModel();
        
        int selectedRowIndex = tblCommunity.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select row to update");
            return;
        }
        
        if(tblCommunity.getSelectedRowCount() == 1){
            
            if(isEmpty(txtCommunity.getText()) || isEmpty(txtCID.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter all fields to update");
            return;
        }
            
            String comm = txtCommunity.getText();
            String commID = txtCID.getText();
            String cityID = txtCityId.getText();
            
        
        Community vs = community.getCommunity().get(selectedRowIndex);
        
        vs.setCommunityName(comm);
        vs.setCommunityID(commID);
        vs.setCityID(cityID);
        
        
        }
        
        JOptionPane.showMessageDialog(this, "Community Data Updated");
        
        txtCommunity.setText("");
        txtCID.setText("");
        txtCityId.setText("");
        
        populateTable();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblCommunityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCommunityMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblCommunity.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select Community to Update");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCommunity.getModel();
        
        Community selectedCommunity = (Community) model.getValueAt(selectedRowIndex,0);
        
        txtCommunity.setText(String.valueOf(selectedCommunity.getCommunityName()));
        txtCID.setText(selectedCommunity.getCommunityID());
        txtCityId.setText(selectedCommunity.getCityID());
        
    }//GEN-LAST:event_tblCommunityMouseClicked

    private void cbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBoxActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_cbBoxActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCID;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblCommunity;
    private javax.swing.JTextField txtCID;
    private javax.swing.JTextField txtCityId;
    private javax.swing.JTextField txtCommunity;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblCommunity.getModel();
        model.setRowCount(0);
        
        for(Community vs : community.getCommunity()){
            
            Object[] row = new Object[3];
            
            row[0] = vs;
            row[1] = vs.getCommunityID();
            row[2]= vs.getCityID();
            
            
            // code needed list(city)
            
            model.addRow(row);
        }
    }
        
    
}
