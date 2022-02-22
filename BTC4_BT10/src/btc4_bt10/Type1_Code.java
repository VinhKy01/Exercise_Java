package btc4_bt10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Type1_Code extends JFrame implements ActionListener {
    JList lstLeft,lstRight;
    JButton addToRight,addAllToRight,addToleft,addAllToLeft;
    DefaultListModel ds1 = new DefaultListModel();
    DefaultListModel ds2 = new DefaultListModel();
    @SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    if(arg0.getSource()==addToRight)
    {
        if (lstLeft.getSelectedIndex() != -1)
        {
            ds2.addElement(lstLeft.getSelectedValue());
            ds1.removeElement(lstLeft.getSelectedValue());
        }
    }
    if(arg0.getSource()==addAllToRight)
    {
        if (lstLeft.getSelectedIndex() != -1)
        {
            for(Object item:lstLeft.getSelectedValues())
            { // data += vegetable + " ";
                ds2.addElement(item);
                ds1.removeElement(item);
            }
        }
    }
    if(arg0.getSource()==addToleft)
    {
        if (lstRight.getSelectedIndex() != -1)
        {
            ds1.addElement(lstRight.getSelectedValue());
            ds2.removeElement(lstRight.getSelectedValue());
        }
    }
    if(arg0.getSource()==addAllToLeft)
    {
        if (lstRight.getSelectedIndex() != -1)
        {
            for(Object item:lstRight.getSelectedValues())
            { // data += vegetable + " ";
                ds1.addElement(item);
                ds2.removeElement(item);
            }
        }
    }
    this.revalidate();
    this.repaint();
    this.pack();
    }
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    new Type1_Code().createGUI();
    }
    public void createGUI()
    {
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        GridBagConstraints c=new GridBagConstraints();
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=0;
        c.ipadx=100;
        c.ipady=0;
        c.gridheight=4;
        for(int i=1;i<=20;i++)
        ds1.addElement("Dòng " +i);
        lstLeft=new JList(ds1);
        lstLeft.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        lstLeft.setVisibleRowCount(15);
        JScrollPane listLeftScrollPane = new JScrollPane(lstLeft);
        this.add(listLeftScrollPane,c);
        c.gridx=2;
        c.gridy=0;
        //c.ipadx=0;
        //for(int i=1;i<=20;i++)
        //ds2.addElement("D ̣ng " +i);
        lstRight=new JList(ds2);
        lstRight.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        lstRight.setSelectedIndex(0);
        lstRight.setVisibleRowCount(15);
        JScrollPane listRightScrollPane = new JScrollPane(lstRight);
        this.add(listRightScrollPane,c);
        c.gridx=1;
        c.gridy=0;
        c.gridheight=1;
        c.ipadx=0;
        c.ipady=0;
        c.insets=new Insets(50, 0, 0, 0);
        this.add(addToRight=new JButton("Add -->"),c);
        c.gridx=1;
        c.gridy=1;
        this.add(addAllToRight=new JButton("Add All-->"),c);
        c.gridx=1;
        c.gridy=2;
        this.add(addToleft=new JButton("Remove <--"),c);
        c.gridx=1;
        c.gridy=3;
        this.add(addAllToLeft=new JButton("Remove All <--"),c);
        addToRight.addActionListener(this);
        addAllToRight.addActionListener(this);
        addToleft.addActionListener(this);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    } 
}
