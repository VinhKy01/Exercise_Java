
package BTC3_BT3_B;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawOval extends JPanel{
    @Override
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       int x = 0, y = 0;
       int x2 = 230, y2 = 0;
       int update1 = 20, update2 = 20;
        for (int i = 0; i < 10; i++) {
            g.setColor(new Color(RandInt(0, 255),RandInt(0, 255),RandInt(0, 255)));
            g.fillOval(x + update1, y + update1, 40, 40);
            update1+= 20;
            
            g.setColor(new Color(RandInt(0, 255),RandInt(0, 255),RandInt(0, 255)));
            g.fillOval(x2 - update1, y2 + update2, 40, 40);
            update2+= 20;    
        }
    }
    int RandInt(int min, int max)
        {
            Random r = new Random();
            return r.nextInt(max-min)+min;
        }
}
