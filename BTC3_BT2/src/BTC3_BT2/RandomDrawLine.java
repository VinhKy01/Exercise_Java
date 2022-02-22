
package BTC3_BT2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class RandomDrawLine extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
 
        super.paintComponent(g);
        
        for (int i = 0; i < 100; i++) {
            g.setColor(new Color(RandInt(0, 255),RandInt(0, 255),RandInt(0, 255)));
            g.drawLine(RandInt(0, 800), RandInt(0, 800),RandInt(0, 800),RandInt(0, 800));
        }
    }
    int RandInt(int min, int max)
        {
            Random r = new Random();
            return r.nextInt(max-min)+min;
        }
}
