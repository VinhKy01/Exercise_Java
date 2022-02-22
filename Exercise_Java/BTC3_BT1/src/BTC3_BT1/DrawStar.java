
package BTC3_BT1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawStar extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
 
        super.paintComponent(g);
        g.setColor(new Color(RandInt(0, 255), RandInt(0, 255), RandInt(0, 255)));
        g.drawLine(64, 210, 516, 210);
        g.drawLine(286, 32, 150, 486);
        g.drawLine(286, 32, 426, 486);
        g.drawLine(64, 210, 426, 486);
        g.drawLine(150, 486, 516, 210);
    }
    int RandInt(int min, int max)
        {
            Random r = new Random();
            return r.nextInt(max-min)+min;
        }
    
}
