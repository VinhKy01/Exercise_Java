/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btc4_bt9;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Windows 10 Pro
 */
public class Type1_Code extends JFrame implements ItemListener {
    
    JCheckBox chkInDam;
    JCheckBox chkInNghieng;
    JCheckBox chkgachDuoi;
    JTextField txtSample;
    Font f;
    Map<TextAttribute, Integer> fontAttributes = new HashMap<TextAttribute, Integer>();
    Boolean isBold=false,isItalic=false,isUnderline=false;
    
    public void createGUI()
    {
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        GridBagConstraints c=new GridBagConstraints();
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=0;
        c.ipadx=200;
        c.ipady=100;
        c.gridwidth=3;
        this.add(txtSample=new JTextField("Sample text"),c);
        f=txtSample.getFont();
        c.gridwidth=1;
        c.gridx=0;
        c.gridy=1;
        c.ipadx=0;
        c.ipady=0;
        this.add(chkInDam=new JCheckBox("In đậm"),c);
        chkInDam.addItemListener(this);
        c.gridx=1;
        c.gridy=1;
        this.add(chkInNghieng=new JCheckBox("In nghiêng"),c);
        chkInNghieng.addItemListener(this);
        c.gridx=2;
        c.gridy=1;
        this.add(chkgachDuoi=new JCheckBox("Gạch chân"),c);
        chkgachDuoi.addItemListener(this);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==chkInDam)
        {
        isBold=e.getStateChange()==ItemEvent.SELECTED;
        }
        else if(e.getSource()==chkInNghieng)
        {
        isItalic=e.getStateChange()==ItemEvent.SELECTED;
        }
        else if(e.getSource()==chkgachDuoi)
        {
        if(e.getStateChange()==ItemEvent.SELECTED)
        fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        else
        fontAttributes.remove(TextAttribute.UNDERLINE);
        }
        int style=(isBold?Font.BOLD:Font.PLAIN) | (isItalic?Font.ITALIC:Font.PLAIN);
        txtSample.setFont(new Font(f.getFamily(),style, f.getSize()).deriveFont(fontAttributes));
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Type1_Code().createGUI();
    }
}

