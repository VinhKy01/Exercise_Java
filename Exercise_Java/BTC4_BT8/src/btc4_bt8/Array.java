
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btc4_bt8;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Windows 10 Pro
 */
public class Array extends javax.swing.JFrame {

    /**
     * Creates new form Array
     */
    public Array() {
        initComponents();
        PanelArray.setLayout(new FlowLayout());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btnPhatSinh = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtSoPhanTuMang = new javax.swing.JTextField();
        PanelArray = new javax.swing.JPanel();
        btnSapXepTang = new javax.swing.JButton();
        btnTimMax = new javax.swing.JButton();
        btnTimMin = new javax.swing.JButton();
        btnTimSoChan = new javax.swing.JButton();
        btnSoNguyenTo = new javax.swing.JButton();
        btnBoiSo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ChkMax = new javax.swing.JCheckBox();
        ChkMin = new javax.swing.JCheckBox();
        ChkSoChan = new javax.swing.JCheckBox();
        ChkBoiChung = new javax.swing.JCheckBox();
        ChkSoNguyenTo = new javax.swing.JCheckBox();
        btnXoaDieuKhien = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("S??? ph???n t??? m???ng");

        btnPhatSinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPhatSinh.setText("Ph??t Sinh");
        btnPhatSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhatSinhActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setText("Tho??t");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        txtSoPhanTuMang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        PanelArray.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "M???ng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        javax.swing.GroupLayout PanelArrayLayout = new javax.swing.GroupLayout(PanelArray);
        PanelArray.setLayout(PanelArrayLayout);
        PanelArrayLayout.setHorizontalGroup(
            PanelArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelArrayLayout.setVerticalGroup(
            PanelArrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        btnSapXepTang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSapXepTang.setText("S???p T??ng");
        btnSapXepTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepTangActionPerformed(evt);
            }
        });

        btnTimMax.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTimMax.setText("T??m Max");
        btnTimMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimMaxActionPerformed(evt);
            }
        });

        btnTimMin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTimMin.setText("T??m Min");
        btnTimMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimMinActionPerformed(evt);
            }
        });

        btnTimSoChan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTimSoChan.setText("T??m S??? Ch???n");
        btnTimSoChan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSoChanActionPerformed(evt);
            }
        });

        btnSoNguyenTo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSoNguyenTo.setText("T??m s??? nguy??n t???");
        btnSoNguyenTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoNguyenToActionPerformed(evt);
            }
        });

        btnBoiSo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBoiSo.setText("T??m s??? l?? b???i c???a 3 v?? 5");
        btnBoiSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoiSoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ChkMax.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ChkMax.setText("Ph???n t??? Max");

        ChkMin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ChkMin.setText("Ph???n t??? Min");

        ChkSoChan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ChkSoChan.setText("Ph???n t??? s??? ch???n");
        ChkSoChan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkSoChanActionPerformed(evt);
            }
        });

        ChkBoiChung.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ChkBoiChung.setText("Ph???n t??? l?? b???i c???a 3 v?? 5");

        ChkSoNguyenTo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ChkSoNguyenTo.setText("S??? nguy??n t???");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChkMax)
                    .addComponent(ChkMin))
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ChkBoiChung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ChkSoChan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChkSoNguyenTo)))
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkSoChan)
                    .addComponent(ChkMax)
                    .addComponent(ChkSoNguyenTo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkMin)
                    .addComponent(ChkBoiChung))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnXoaDieuKhien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoaDieuKhien.setText("Xo?? ??i???u Khi???n");
        btnXoaDieuKhien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDieuKhienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtSoPhanTuMang, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPhatSinh)
                .addGap(18, 18, 18)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSapXepTang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimSoChan, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSoNguyenTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBoiSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PanelArray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXoaDieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnPhatSinh)
                    .addComponent(btnThoat)
                    .addComponent(txtSoPhanTuMang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PanelArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSapXepTang)
                    .addComponent(btnBoiSo)
                    .addComponent(btnTimMax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimSoChan)
                    .addComponent(btnSoNguyenTo)
                    .addComponent(btnTimMin))
                .addGap(27, 27, 27)
                .addComponent(btnXoaDieuKhien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    JTextField[] txt;
    int soluong;
    private void btnPhatSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhatSinhActionPerformed

        PanelArray.removeAll();
        soluong = Integer.parseInt(txtSoPhanTuMang.getText());
        txt = new JTextField[soluong];
        if (soluong <= 14 && soluong > 0) {
            for (int i = 0; i < soluong; i++) {
                txt[i] = new JTextField(3);
                PanelArray.add(txt[i]);
            }
            this.revalidate();
            PanelArray.repaint();
            this.pack();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "S??? l?????ng ph???i l???n h??n 0 v?? b?? h??n 14 !");
            txtSoPhanTuMang.setText("");
            txtSoPhanTuMang.requestFocus();
        }
            
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPhatSinhActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed
    
    
    private void btnSapXepTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepTangActionPerformed
        
        int n = PanelArray.getComponentCount();
        int a, b;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                a = Integer.parseInt(((JTextField)PanelArray.getComponent(i)).getText());
                b = Integer.parseInt(((JTextField)PanelArray.getComponent(j)).getText());
                if (a > b) {
                    ((JTextField)PanelArray.getComponent(i)).setText(b + "");
                    ((JTextField)PanelArray.getComponent(j)).setText(a + "");
                }
            }
        }
        
//        int a, b;
//        for (int i = 0; i < soluong - 1; i++) {
//            for (int j = i + 1; j < soluong; j++) {
//                a = Integer.parseInt(txt[i].getText());
//                b = Integer.parseInt(txt[j].getText());
//                if (a > b) {
//                    txt[i].setText(b+"");
//                    txt[j].setText(a+"");
//                }
//            }
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSapXepTangActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void ChkSoChanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkSoChanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkSoChanActionPerformed

    private void btnTimMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimMaxActionPerformed
        
        int a, b, max, locationMax = 0;
        for (int i = 0; i < soluong; i++) {
            a = Integer.parseInt(txt[i].getText());
            max = Integer.parseInt(txt[locationMax].getText()); 
            if (max < a)
                locationMax = i;
        }
        for (int i = 0; i < soluong; i++) {
            txt[i].setBackground(Color.WHITE);
        }
        txt[locationMax].setBackground(Color.RED);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimMaxActionPerformed

    private void btnTimMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimMinActionPerformed
        
        int a, b, min, locationMin = 0;
        for (int i = 0; i < soluong; i++) {
            a = Integer.parseInt(txt[i].getText());
            min = Integer.parseInt(txt[locationMin].getText()); 
            if (min > a)
                locationMin = i;
        }
        for (int i = 0; i < soluong; i++) {
            txt[i].setBackground(Color.WHITE);
        }
        txt[locationMin].setBackground(Color.BLUE);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimMinActionPerformed

    private void btnTimSoChanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSoChanActionPerformed
        
        int a;
        for (int i = 0; i < soluong; i++) {
            a = Integer.parseInt(txt[i].getText());
            txt[i].setBackground(Color.WHITE);
            if (a % 2 == 0) {
                txt[i].setBackground(Color.CYAN);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimSoChanActionPerformed
    
    public int BoiCua3(int a){
        if(a % 3 == 0)
            return 1;
        else
            return -1;
    }
    
    public int BoiCua5(int a){
        if(a % 5 == 0)
            return 1;
        else
            return -1;
    }
    private void btnBoiSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoiSoActionPerformed
        
        int a;
        for (int i = 0; i < soluong; i++) {
            a = Integer.parseInt(txt[i].getText());
            txt[i].setBackground(Color.WHITE);
            if (BoiCua3(a) == 1 && BoiCua5(a) == 1) {
                txt[i].setBackground(Color.PINK);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBoiSoActionPerformed
    
    public int SoNguyenTo(int a){
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count = count + 1;
            }
        }
        if (count == 2)
            return 1;
        else
            return -1;
    }
    private void btnSoNguyenToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoNguyenToActionPerformed
        int a;
        for (int i = 0; i < soluong; i++) {
            a = Integer.parseInt(txt[i].getText());
            txt[i].setBackground(Color.WHITE);
            if (SoNguyenTo(a) == 1) {
                txt[i].setBackground(Color.GREEN);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSoNguyenToActionPerformed

    private void btnXoaDieuKhienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDieuKhienActionPerformed
        if (ChkMax.isSelected()) {
            int a, max, locationMax = 0;
            for (int i = 0; i < soluong; i++) {
                a = Integer.parseInt(((JTextField)PanelArray.getComponent(i)).getText());
                max = Integer.parseInt(txt[locationMax].getText());
                if (max < a) {
                    locationMax = i;
                }
            }
            soluong--;
            PanelArray.remove(locationMax);
            this.revalidate(); 
            PanelArray.repaint();
        }
        
        soluong = PanelArray.getComponentCount();
        
        if (ChkSoChan.isSelected()) {
            int a;
            for (int i = 0; i < soluong; i++) {
                a = Integer.parseInt(((JTextField)PanelArray.getComponent(i)).getText());
                if (a % 2 == 0) {
                    PanelArray.remove(i);
                    this.revalidate();
                    PanelArray.repaint();
                    soluong--;
                }
            }
        }
        
        soluong = PanelArray.getComponentCount();
        
        if (ChkMin.isSelected()) {
            int a, min, locationMax = 0;
            for (int i = 0; i < soluong; i++) {
                a = Integer.parseInt(((JTextField)PanelArray.getComponent(i)).getText());
                min = Integer.parseInt(txt[locationMax].getText());
                if (min > a) {
                    locationMax = i;
                }
            }
            soluong--;
            PanelArray.remove(locationMax);
            this.revalidate();
            PanelArray.repaint();
        }
        
        soluong = PanelArray.getComponentCount();
        
        if (ChkBoiChung.isSelected()) {
            int a;
            for (int i = 0; i < soluong; i++) {
                a = Integer.parseInt(((JTextField)PanelArray.getComponent(i)).getText());
                if (BoiCua3(a) == 1 && BoiCua5(a) == 1) {
                    PanelArray.remove(i);
                    this.revalidate();
                    PanelArray.repaint();
                    soluong--;
                }
            }
        }
        
        soluong = PanelArray.getComponentCount();
        
        if (ChkSoNguyenTo.isSelected()) {
            int a;
            for (int i = 0; i < soluong; i++) {
                a = Integer.parseInt(((JTextField)PanelArray.getComponent(i)).getText());
                if (SoNguyenTo(a) == 1) {
                    PanelArray.remove(i);
                    this.revalidate();
                    PanelArray.repaint();
                    soluong--;
                }
            }
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaDieuKhienActionPerformed

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
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Array.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Array().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkBoiChung;
    private javax.swing.JCheckBox ChkMax;
    private javax.swing.JCheckBox ChkMin;
    private javax.swing.JCheckBox ChkSoChan;
    private javax.swing.JCheckBox ChkSoNguyenTo;
    private javax.swing.JPanel PanelArray;
    private javax.swing.JButton btnBoiSo;
    private javax.swing.JButton btnPhatSinh;
    private javax.swing.JButton btnSapXepTang;
    private javax.swing.JButton btnSoNguyenTo;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimMax;
    private javax.swing.JButton btnTimMin;
    private javax.swing.JButton btnTimSoChan;
    private javax.swing.JButton btnXoaDieuKhien;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtSoPhanTuMang;
    // End of variables declaration//GEN-END:variables
}
