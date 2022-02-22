
package GridLayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame{
    
    
    public MyGridLayout(){
        JFrame jf = new JFrame("GridLayout");
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(5, 5));
        p.add(new JLabel("      User name:"));
        p.add(new JTextField());
        
        p.setLayout(new GridLayout(5, 5));
        p.add(new JLabel("      Password:"));
        p.add(new JTextField());
        
        p.setLayout(new GridLayout(5, 5));
        p.add(new JLabel("      Confrim Password:"));
        p.add(new JTextField());
        p.add(new JButton("Login"));
        p.add(new JButton("Register"));

        jf.add(p);
        jf.setSize(600,400);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(MyGridLayout.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
    public static void main(String[] args) {
        MyGridLayout jframe = new MyGridLayout();
    }
    
}
