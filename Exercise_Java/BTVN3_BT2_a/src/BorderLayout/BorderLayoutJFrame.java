
package BorderLayout;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutJFrame extends JFrame{

    public void createGUI(){
        JFrame jf = new JFrame("BoderLayout");
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout(1, 1));
        jp.add(new JButton("North"), BorderLayout.NORTH);
        jp.add(new JButton("South"), BorderLayout.SOUTH);
        jp.add(new JButton("East"), BorderLayout.EAST);
        jp.add(new JButton("West"), BorderLayout.WEST);
        jp.add(new JButton("Center"), BorderLayout.CENTER);
        
        jf.add(jp);
        jf.pack();
        jf.setSize(500, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(BorderLayoutJFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        BorderLayoutJFrame jframe = new BorderLayoutJFrame();
        jframe.createGUI();
    } 
}
