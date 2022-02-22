
package DridLayoutDemo;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DridLayoutDemo extends JFrame{

    
    public void createGUI(){
    
        JFrame jf = new JFrame("DridLayout");
        JPanel jp=new JPanel();
        jp.setLayout(new GridLayout(0,2));
        jp.add(new JButton("Phím 1"));
        jp.add(new JButton("Phím 2"));
        jp.add(new JButton("Phím 3"));
        jp.add(new JButton("Phím 4"));
        jp.add(new JButton("Phím 5"));
        jp.add(new JButton("Phím 6"));

        
        jf.add(jp);
        jf.setSize(500, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(DridLayoutDemo.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
    public static void main(String[] args) {
        DridLayoutDemo jframe = new DridLayoutDemo();
        jframe.createGUI();
    }
    
}
