
package ExFlowLayout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ExFlowLayout extends JFrame {
        
    public void createGUI()
        {
        JFrame jf = new JFrame("Flow Layout");
        JPanel p=new JPanel();
        //Đưa các button về trung tâm màn hình
        p.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.add(new JButton("Phím 1"));
        p.add(new JButton("Phím 2"));
        p.add(new JButton("Phím 3"));
        p.add(new JButton("Phím 4"));
        p.add(new JButton("Phím 5"));

        jf.add(p);
        jf.setSize(550,100);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        }
        
    public static void main(String[] args) {
            ExFlowLayout frame = new ExFlowLayout();
            frame.createGUI();
        }
}
