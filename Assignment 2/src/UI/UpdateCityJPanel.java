/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.DataService;

/**
 *
 * @author madhav
 */
public class UpdateCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCityJPanel
     */
    
    DataService city;
    
    /**
     *
     * @param city
     */
    public UpdateCityJPanel(DataService city) {
        initComponents();
        this.city = city;
        populateTable();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.WARNING: Do NOT modify this code.
     * The content of this method is always
 regenerated by the Form Editor.
     * @param s
     */
    @SuppressWarnings("unchecked")
    
    public boolean isCity(String s) {  
    return s != null && s.matches("^[a-zA-Z][a-zA-Z\\s-]+[a-zA-Z]$");
    }
    
//    public boolean isEmpty(String c){
//        
//        return c != null && c.length() ==0;
//        
//    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblCityName = new javax.swing.JLabel();
        lblCityId = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        txtCityId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCity = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Update City");

        lblCityName.setText("City Name:");

        lblCityId.setText("City ID:");

        tblCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City Name", "City ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCity);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCityName)
                            .addComponent(lblCityId))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityName)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityId)
                    .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnUpdate)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCity.getModel();
        if(tblCity.getSelectedRowCount() == 1){
            
            String cityName = txtCityName.getText();
            if(!isCity(txtCityName.getText())) {
            
            JOptionPane.showMessageDialog(this, "Please enter a valid City name.");
            return;

        }
        if(cityName.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "City Name is empty.");
            return;

        }
            String cityId=txtCityId.getText();
            if(cityId.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "City ID is empty.");
            return;

        }
            
            int selectedRowIndex = tblCity.getSelectedRow();
        
         City ci = city.getCity().get(selectedRowIndex);
        
        ci.setCityName(cityName);
        ci.setCityId(cityId);
        
         //update message
            JOptionPane.showMessageDialog(this, "The record has been updated successfully");
            populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed
    }
    
    
    
    
    
    private void tblCityMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        int selectedRowIndex = tblCity.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a City to Update");
            return;
        }
       DefaultTableModel model= (DefaultTableModel) tblCity.getModel();
       City selectedCity = (City) model.getValueAt(selectedRowIndex, 0);
       txtCityId.setText(String.valueOf(selectedCity.getCityId()));
        txtCityName.setText(selectedCity.getCityName());
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCityId;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCity;
    private javax.swing.JTextField txtCityId;
    private javax.swing.JTextField txtCityName;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
    DefaultTableModel model = (DefaultTableModel) tblCity.getModel();
    model.setRowCount(0);
    for(City ci : city.getCity()){
        Object[] row = new Object[2];
        row[0] = ci;
        row[1] = ci.getCityId();
        
        model.addRow(row);
    }
    }
}
