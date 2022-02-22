/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btc6_bt1;

/**
 *
 * @author Windows 10 Pro
 */
public class BT1_BTC6 extends javax.swing.JFrame {

    /**
     * Creates new form BT1_BTC6
     */
    DrawLine line;
    DrawOval oval;
    Thread threadLine, threadOval;
    public BT1_BTC6() {
        initComponents();
        line=new DrawLine(Panel.getGraphics());
        threadLine=new Thread(line);
        
        oval=new DrawOval(Panel.getGraphics());
        threadOval=new Thread(oval);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        btnStartLine = new javax.swing.JButton();
        btnSuspendLine = new javax.swing.JButton();
        btnResumeLine = new javax.swing.JButton();
        btnStopLine = new javax.swing.JButton();
        btnSuspendOval = new javax.swing.JButton();
        btnStopOval = new javax.swing.JButton();
        btnresumeOval = new javax.swing.JButton();
        btnStartOval = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        btnStartLine.setText("StartLine");
        btnStartLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartLineActionPerformed(evt);
            }
        });

        btnSuspendLine.setText("SuspendLine");
        btnSuspendLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuspendLineActionPerformed(evt);
            }
        });

        btnResumeLine.setText("ResumeLine");
        btnResumeLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeLineActionPerformed(evt);
            }
        });

        btnStopLine.setText("StopLine");
        btnStopLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopLineActionPerformed(evt);
            }
        });

        btnSuspendOval.setText("SuspendOval");
        btnSuspendOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuspendOvalActionPerformed(evt);
            }
        });

        btnStopOval.setText("StopOval");
        btnStopOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopOvalActionPerformed(evt);
            }
        });

        btnresumeOval.setText("ResumeOval");
        btnresumeOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresumeOvalActionPerformed(evt);
            }
        });

        btnStartOval.setText("StartOval");
        btnStartOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartOvalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStartLine, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuspendLine, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnResumeLine, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStopLine, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStartOval, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuspendOval, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnresumeOval, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStopOval, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStartLine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuspendLine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResumeLine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStopLine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStartOval, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuspendOval, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnresumeOval, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStopOval, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartLineActionPerformed

        threadLine.start();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartLineActionPerformed

    private void btnSuspendLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspendLineActionPerformed

        threadLine.suspend();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuspendLineActionPerformed

    private void btnResumeLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeLineActionPerformed

        threadLine.resume();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResumeLineActionPerformed

    private void btnStopLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopLineActionPerformed

        threadLine.stop();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStopLineActionPerformed

    private void btnStartOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartOvalActionPerformed

        threadOval.start();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartOvalActionPerformed

    private void btnSuspendOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspendOvalActionPerformed

        threadOval.suspend();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuspendOvalActionPerformed

    private void btnresumeOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresumeOvalActionPerformed

        threadOval.resume();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnresumeOvalActionPerformed

    private void btnStopOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopOvalActionPerformed

        threadOval.stop();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStopOvalActionPerformed

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
            java.util.logging.Logger.getLogger(BT1_BTC6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BT1_BTC6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BT1_BTC6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BT1_BTC6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BT1_BTC6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnResumeLine;
    private javax.swing.JButton btnStartLine;
    private javax.swing.JButton btnStartOval;
    private javax.swing.JButton btnStopLine;
    private javax.swing.JButton btnStopOval;
    private javax.swing.JButton btnSuspendLine;
    private javax.swing.JButton btnSuspendOval;
    private javax.swing.JButton btnresumeOval;
    // End of variables declaration//GEN-END:variables
}