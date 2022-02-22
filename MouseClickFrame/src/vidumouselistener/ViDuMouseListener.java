/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidumouselistener;
import javax.swing.JFrame;
/**
 *
 * @author MyPC
 */
public class ViDuMouseListener {
 /**
 * @param args the command line arguments
 */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f=new JFrame();
        Mypanel p=new Mypanel();
        p.addMouseListener(p);
        f.add(p);
        f.setSize(600, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
