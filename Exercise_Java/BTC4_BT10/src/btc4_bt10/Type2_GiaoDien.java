/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btc4_bt10;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author infov
 */
public class Type2_GiaoDien extends javax.swing.JFrame {

    /**
     * Creates new form List
     */
    public Type2_GiaoDien() {
        initComponents();
        AddInList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddAll = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnremoveAll = new javax.swing.JButton();
        ds1 = new javax.swing.JScrollPane();
        lstLeft = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstRight = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddAll.setText("Add all ->");
        btnAddAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAllActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setText("Add ->");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemove.setText("<- Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnremoveAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnremoveAll.setText("<- Remove all");
        btnremoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveAllActionPerformed(evt);
            }
        });

        ds1.setViewportView(lstLeft);

        jScrollPane2.setViewportView(lstRight);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ds1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnremoveAll, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddAll, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnremoveAll, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ds1)
                    .addComponent(jScrollPane2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultListModel itemList1 = new DefaultListModel();
    void AddInList()
    {
        for (int i = 0; i < 10; i++) {
            itemList1.addElement("Item: "+(i+1));
        }
        lstLeft.setModel(itemList1);
    }
    DefaultListModel itemList2 = new DefaultListModel();
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        if (lstLeft.getSelectedIndex() != -1) {
            itemList2.addElement(lstLeft.getSelectedValue());
            itemList1.removeElement(lstLeft.getSelectedValue());
            lstRight.setModel(itemList2);
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "B???n ph???i ch???n 1 ?????i t?????ng Item");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAllActionPerformed
        
        if (lstLeft.getSelectedIndex() != -1)
        {
            for(Object item:lstLeft.getSelectedValues())
            {
                itemList2.addElement(item);
                itemList1.removeElement(item);
            }
            lstRight.setModel(itemList2);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "B???n ph???i ch???n 1 ?????i t?????ng Item");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddAllActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        if (lstRight.getSelectedIndex() != -1) {
            itemList1.addElement(lstRight.getSelectedValue());
            itemList2.removeElement(lstRight.getSelectedValue());
            lstLeft.setModel(itemList1);
        }else
        {
            JOptionPane.showMessageDialog(rootPane, "B???n ph???i ch???n 1 ?????i t?????ng Item");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnremoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveAllActionPerformed

        if (lstRight.getSelectedIndex() != -1)
        {
            for(Object item:lstRight.getSelectedValues())
            {
                itemList1.addElement(item);
                itemList2.removeElement(item);
            }
            lstLeft.setModel(itemList1);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "B???n ph???i ch???n 1 ?????i t?????ng Item");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnremoveAllActionPerformed

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
            java.util.logging.Logger.getLogger(Type2_GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Type2_GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Type2_GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Type2_GiaoDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Type2_GiaoDien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddAll;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnremoveAll;
    private javax.swing.JScrollPane ds1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstLeft;
    private javax.swing.JList<String> lstRight;
    // End of variables declaration//GEN-END:variables
}
