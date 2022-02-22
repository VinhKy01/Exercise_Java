
package BoxLayout;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyBoxLayout extends JFrame{

    public void createGUI(){
    
        JFrame jf = new JFrame("Box Layout");
        JPanel jp = new JPanel();
        
        
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        

        JButton button1 = new JButton("Button 1");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        jp.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        jp.add(button2);
        
        JButton button3 = new JButton("Button 3");
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);
        jp.add(button3);

        JButton button4 = new JButton("Long-Named Button 4");
        button4.setAlignmentX(Component.CENTER_ALIGNMENT);
        jp.add(button4);

        JButton button5 = new JButton("Button 5");
        button5.setAlignmentX(Component.CENTER_ALIGNMENT);
        jp.add(button5);


        jf.add(jp);
        jf.setSize(500, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(MyBoxLayout.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
    
    public void createGUI2()
        {
        JFrame jf = new JFrame("Box Layout");
        JPanel p=new JPanel();
        
        
        p.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.add(new JButton("Button 1"));
        p.add(new JButton("Button 2"));
        p.add(new JButton("Button 3"));
        p.add(new JButton("Long-Named Button 4"));
        p.add(new JButton("Button 5"));

        
        jf.add(p);
        jf.setSize(600,100);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(MyBoxLayout.EXIT_ON_CLOSE);
        jf.setVisible(true);
        }
    
    
    
    public static void main(String[] args) {
        MyBoxLayout jframe = new MyBoxLayout();
        jframe.createGUI();
        jframe.createGUI2();
    }
    
}
