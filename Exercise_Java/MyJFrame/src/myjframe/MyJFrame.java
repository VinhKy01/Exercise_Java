
package myjframe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyJFrame extends JFrame{
    
    JButton jbutton;
    JTextField username;
    JPasswordField password;

    private String users = "admin";
    public void createGUI(){
        
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(0, 2));
        jp.add(new JLabel("User name "));
        jp.add(username = new JTextField(15));
        jp.add(new JLabel("Password "));
        jp.add(password = new JPasswordField(15));
        jbutton = new JButton("Submit");
        
        jbutton.addActionListener(new ActionListener(){
            private Object users;
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = username.getText();
                String pass = password.getText();
                for (int i = 0; i < users.length; i++) {
                    if (pass.compareTo(users[i][0])==0 && name.compareTo(users[i][0])==0) {
                        JOptionPane.showMessageDialog(null, "Log in Succeeded");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Log in Failed");
            }
        });
        
        add(jbutton, BorderLayout.SOUTH);
        add(jp, BorderLayout.CENTER);
        setSize(500, 500);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(MyJFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyJFrame jf = new MyJFrame();
        jf.createGUI();
    }
    
}
