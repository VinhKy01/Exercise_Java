/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baikiemtra;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10 Pro
 */
public class Main_Form extends javax.swing.JFrame {

    /**
     * Creates new form Main_Form
     */
    DrawRect rect;
    DrawOval oval;
    Thread threadLine, threadOval;
    boolean kiemTraStartRect = true;
    boolean kiemTraStartOval = true;
    int countRect = 1;
    int countOval = 1;
    public Main_Form() {
        initComponents();
        rect=new DrawRect(Panel.getGraphics());
        threadLine=new Thread(rect);
        
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
        btnStartSquare = new javax.swing.JButton();
        btnSuspendSquare = new javax.swing.JButton();
        btnResumeSquare = new javax.swing.JButton();
        btnStopSquare = new javax.swing.JButton();
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

        btnStartSquare.setText("StartSquare");
        btnStartSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartSquareActionPerformed(evt);
            }
        });

        btnSuspendSquare.setText("SuspendSquare");
        btnSuspendSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuspendSquareActionPerformed(evt);
            }
        });

        btnResumeSquare.setText("ResumeSquare");
        btnResumeSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumeSquareActionPerformed(evt);
            }
        });

        btnStopSquare.setText("StopSquare");
        btnStopSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopSquareActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnStartSquare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSuspendSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResumeSquare)
                        .addGap(18, 18, 18)
                        .addComponent(btnStopSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnStartOval, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSuspendOval, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnresumeOval, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStopOval, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStartSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuspendSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResumeSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStopSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnStartOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartOvalActionPerformed

        if (kiemTraStartOval == true) {
            threadOval.start();
            kiemTraStartOval = false;
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Chương trình đang chạy");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartOvalActionPerformed

    private void btnSuspendOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspendOvalActionPerformed

        if (countOval % 2 != 0) {
            threadOval.suspend();
            countOval++;
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Chương trình đang Suspend");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuspendOvalActionPerformed

    private void btnresumeOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresumeOvalActionPerformed

        if (countOval % 2 == 0) {
            threadOval.resume();
            countOval++;
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Chương trình đang Resume");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnresumeOvalActionPerformed

    private void btnStopOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopOvalActionPerformed

        threadOval.stop();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStopOvalActionPerformed

    private void btnStartSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartSquareActionPerformed

        if (kiemTraStartRect == true) {
            threadLine.start();
            kiemTraStartRect = false;
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Chương trình đang chạy");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartSquareActionPerformed

    private void btnSuspendSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuspendSquareActionPerformed

        if (countRect % 2 != 0) {
            threadLine.suspend();
            countRect++;
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Chương trình đang Suspend");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuspendSquareActionPerformed

    private void btnResumeSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumeSquareActionPerformed

        if (countRect % 2 == 0) {
            threadLine.resume();
            countRect++;
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Chương trình đang Resume");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResumeSquareActionPerformed

    private void btnStopSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopSquareActionPerformed

        threadLine.stop();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStopSquareActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnResumeSquare;
    private javax.swing.JButton btnStartOval;
    private javax.swing.JButton btnStartSquare;
    private javax.swing.JButton btnStopOval;
    private javax.swing.JButton btnStopSquare;
    private javax.swing.JButton btnSuspendOval;
    private javax.swing.JButton btnSuspendSquare;
    private javax.swing.JButton btnresumeOval;
    // End of variables declaration//GEN-END:variables
}
