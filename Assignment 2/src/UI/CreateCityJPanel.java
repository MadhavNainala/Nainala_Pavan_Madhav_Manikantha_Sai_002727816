/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.City;
import model.DataService;

/**
 *
 * @author madhav
 */
public class CreateCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCityJPanel
     */
    
    DataService ciList;
    
    public CreateCityJPanel(DataService ciList) {
        initComponents();
        this.ciList = ciList;
    }

    /**
     * This method is called from within the constructor to initialize the form.WARNING: Do NOT modify this code.
     * The content of this method is always
 regenerated by the Form Editor.
     * @param s
     */
    @SuppressWarnings("unchecked")
    
    
    public boolean isCity(String s) {  
    return s != null && s.matches("^[a -zA-Z][a-zA-Z\\s-]+[a-zA-Z]$");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblCityName = new javax.swing.JLabel();
        lblCityId = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        txtCityId = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create City");

        lblCityName.setText("City Name:");

        lblCityId.setText("City ID:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCityName)
                    .addComponent(lblCityId))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblTitle)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityName)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityId)
                    .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140)
                .addComponent(btnSave)
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String cityName = txtCityName.getText();
        if(!isCity(txtCityName.getText())) {
            
            JOptionPane.showMessageDialog(this, "Please enter a valid City name.");
            return;

        }
        if(cityName.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "City Name is empty.");
            return;

        }
        
        String cityId = txtCityId.getText();
        if(cityId.isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "City ID is empty.");
            return;

        }
        
        City ci = ciList.addNewCity();
        
        ci.setCityName(cityName);
        ci.setCityId(cityId);
        
        JOptionPane.showMessageDialog(this, "New City added");
        
        txtCityName.setText("");
        txtCityId.setText("");
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblCityId;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCityId;
    private javax.swing.JTextField txtCityName;
    // End of variables declaration//GEN-END:variables
}
