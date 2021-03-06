/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sales.view;

import org.sales.controller.ProductDAO;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.sales.model.Product;


/**
 *
 * @author bijay
 */
public class ViewProduct extends javax.swing.JInternalFrame {
    DefaultTableModel model;

    /**
     * Creates new form ViewProduct
     */
    public ViewProduct() {
        initComponents();
        model=new DefaultTableModel(null,new String[]{"ID","NAME","PRICE","QUANTITY","REMARKS"});
        jTable_Product.setModel(model);
    }
    public void clearFields(){
        jTextField_Id.setText("");
        jTextField_Name.setText("");
        jTextField_Price.setText("");
        jTextField_Qty.setText("");
        jTextArea_Remarks.setText("");
        
    }
    public void clearTable(){
        int count = jTable_Product.getRowCount();
        for(int i = 0; i < count; i++){
            model.removeRow(0);
        }
    }
    public void loadData(){
         //call fetchData() method of controller class
        ProductDAO pDAO=new ProductDAO();
        List<Product> productList=pDAO.fetchData();
        clearTable();
        for(Product p : productList){
            model.addRow(new Object[]{
                p.getId(), p.getName(), p.getPrice(), p.getQty(), p.getRemarks()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Product = new javax.swing.JTable();
        jButton_LoadData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_Price = new javax.swing.JTextField();
        jTextField_Qty = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Remarks = new javax.swing.JTextArea();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);

        jTable_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Product);

        jButton_LoadData.setText("Load Data");
        jButton_LoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoadDataActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("Name");

        jLabel4.setText("Price");

        jLabel5.setText("Quantity");

        jLabel6.setText("Remarks");

        jTextField_Id.setEditable(false);

        jTextArea_Remarks.setColumns(20);
        jTextArea_Remarks.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Remarks);

        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_Qty, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton_Update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Delete))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Price))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextField_Name))
                        .addGap(627, 627, 627))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton_LoadData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Update)
                            .addComponent(jButton_Delete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton_LoadData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoadDataActionPerformed
        // TODO add your handling code here:
//        call fetchData() method of controller class
//        ProductDAO pDAO=new ProductDAO();
//        List<Product> productList=pDAO.fetchData();
//        clearTable();
//        for(Product p : productList){
//            model.addRow(new Object[]{
//                p.getId(), p.getName(), p.getPrice(), p.getQty(), p.getRemarks()
//            });
//        }
        loadData();
    }//GEN-LAST:event_jButton_LoadDataActionPerformed

    private void jTable_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ProductMouseClicked
        // TODO add your handling code here:
        int row = jTable_Product.getSelectedRow();
        jTextField_Id.setText(jTable_Product.getValueAt(row, 0).toString());
        jTextField_Name.setText(jTable_Product.getValueAt(row, 1).toString());
        jTextField_Price.setText(jTable_Product.getValueAt(row, 2).toString());
        jTextField_Qty.setText(jTable_Product.getValueAt(row, 3).toString());
        jTextArea_Remarks.setText(jTable_Product.getValueAt(row, 4).toString());
        
    }//GEN-LAST:event_jTable_ProductMouseClicked

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jTextField_Id.getText());
        String name = jTextField_Name.getText();
        double price = Double.parseDouble(jTextField_Price.getText());
        int qty = Integer.parseInt(jTextField_Qty.getText());
        String remarks = jTextArea_Remarks.getText();
        
        Product ob = new Product();
        ob.setId(id);
        ob.setName(name);
        ob.setPrice(price);
        ob.setQty(qty);
        ob.setRemarks(remarks);
        
        ProductDAO pDAO = new ProductDAO();
        int count = pDAO.updateData(ob);
        if(count > 0){
            JOptionPane.showMessageDialog(null,"Record updated into database");
            clearFields();
            loadData();
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jTextField_Id.getText());
        
        Product ob = new Product();
        ob.setId(id);
        
        ProductDAO pDAO = new ProductDAO();
        int count = pDAO.deleteData(ob);
        if(count > 0){
            JOptionPane.showMessageDialog(null,"Record deleted from database");
            clearFields();
            loadData();
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_LoadData;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Product;
    private javax.swing.JTextArea jTextArea_Remarks;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Qty;
    // End of variables declaration//GEN-END:variables
}
