/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Function.TaiKhoan;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import javax.swing.border.Border;

/**
 *
 * @author infov
 */
public class fDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form fDangNhap
     */
    public fDangNhap() {
        initComponents();

        this.setLocationRelativeTo(null);

        //Đường viền panelMain
        Border panBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        panelMain.setBorder(panBorder);

        //Hiện mật khẩu
        txtPassWord.setEchoChar((char) 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelLitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassWord = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        chkGhiNho = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        panelThongBao = new javax.swing.JPanel();
        lblAnThongBao = new javax.swing.JLabel();
        lblThongBao = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelMain.setBackground(new java.awt.Color(6, 214, 160));

        panelLitle.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(255, 196, 61));
        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(27, 154, 170));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ĐĂNG NHẬP");
        lblTitle.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/user.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/lock.png"))); // NOI18N

        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtUser.setText("Username");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });

        txtPassWord.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtPassWord.setText("Password");
        txtPassWord.setBorder(null);
        txtPassWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassWordMouseClicked(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(27, 154, 170));
        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDangNhap.setText("ĐĂNG NHẬP");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        chkGhiNho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGhiNhoActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/eye.png"))); // NOI18N

        panelThongBao.setBackground(new java.awt.Color(255, 0, 0));
        panelThongBao.setPreferredSize(new java.awt.Dimension(36, 55));

        lblAnThongBao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Ten.png"))); // NOI18N
        lblAnThongBao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAnThongBaoMouseClicked(evt);
            }
        });

        lblThongBao.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblThongBao.setForeground(new java.awt.Color(204, 255, 255));
        lblThongBao.setText("Sai tài khoản hoặc mật khẩu");

        javax.swing.GroupLayout panelThongBaoLayout = new javax.swing.GroupLayout(panelThongBao);
        panelThongBao.setLayout(panelThongBaoLayout);
        panelThongBaoLayout.setHorizontalGroup(
            panelThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongBaoLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongBaoLayout.createSequentialGroup()
                        .addComponent(lblAnThongBao)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThongBaoLayout.createSequentialGroup()
                        .addComponent(lblThongBao)
                        .addGap(22, 22, 22))))
        );
        panelThongBaoLayout.setVerticalGroup(
            panelThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongBaoLayout.createSequentialGroup()
                .addComponent(lblAnThongBao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblThongBao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelLitleLayout = new javax.swing.GroupLayout(panelLitle);
        panelLitle.setLayout(panelLitleLayout);
        panelLitleLayout.setHorizontalGroup(
            panelLitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLitleLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelLitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLitleLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(panelLitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLitleLayout.createSequentialGroup()
                                .addComponent(chkGhiNho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPassWord)
                            .addComponent(jSeparator2)))
                    .addComponent(panelThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addGroup(panelLitleLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(panelLitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelLitleLayout.setVerticalGroup(
            panelLitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLitleLayout.createSequentialGroup()
                .addGroup(panelLitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLitleLayout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkGhiNho)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        lblExit.setBackground(new java.awt.Color(6, 214, 160));
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Close.png"))); // NOI18N
        lblExit.setOpaque(true);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(panelLitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(lblExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ẩn thông báo panel
    Timer timerUpTimer = new Timer(30, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (panelThongBao.getHeight() != 0) {
                panelThongBao.setBounds(panelThongBao.getX(), panelThongBao.getY(), panelThongBao.getWidth(), panelThongBao.getHeight() - 5);
            } else {
                timerUpTimer.stop();
            }
        }
    });

    //Hiện thông báo panel
    Timer timerDownTimer = new Timer(30, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (panelThongBao.getHeight() != 55) {
                panelThongBao.setBounds(panelThongBao.getX(), panelThongBao.getY(), panelThongBao.getWidth(), panelThongBao.getHeight() + 5);
            } else {
                timerDownTimer.stop();
            }
        }
    });

    boolean ktra = true;

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_lblExitMouseClicked

    private void chkGhiNhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGhiNhoActionPerformed

        if (chkGhiNho.isSelected()) {
            txtPassWord.setEchoChar((char) 0);
        } else {
            txtPassWord.setEchoChar('*');
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGhiNhoActionPerformed

    private void lblAnThongBaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAnThongBaoMouseClicked

        //Ẩn thông báo
        timerUpTimer.start();
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAnThongBaoMouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed

        String username = txtUser.getText();
        String pass = txtPassWord.getText();
        
        int loaitk = TaiKhoan.Instance().dangNhap(username, pass);
        switch (loaitk) {
            case 1: {
                fMenuAdmin fAdmin = new fMenuAdmin(username);
                this.dispose();
                fAdmin.setVisible(true);
                break;
            }
            case 0: {
                fMenuNhanVien fNhanVien = new fMenuNhanVien(username);
                this.dispose();
                fNhanVien.setVisible(true);
                break;
            }
            default:
                timerDownTimer.start();

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked

        txtUser.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtPassWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassWordMouseClicked

        txtPassWord.setText("");
        txtPassWord.setEchoChar('*');
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassWordMouseClicked

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
            java.util.logging.Logger.getLogger(fDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JCheckBox chkGhiNho;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAnThongBao;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblThongBao;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelLitle;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelThongBao;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
