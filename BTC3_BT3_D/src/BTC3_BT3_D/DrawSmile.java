
package BTC3_BT3_D;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawSmile extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //Hinh Vuong
        g.setColor(Color.YELLOW);
        g.fillRect(50, 50, 400, 300);
        
        //Mat Cuoi
        g.setColor(Color.CYAN);
        g.fillOval(150, 100, 200, 200);
        
        
        //Mat va Mui
        g.setColor(Color.BLACK);
        g.fillOval(200, 150, 30, 30);
        g.fillOval(275, 150, 30, 30);
        g.fillOval(200+75/2, 200, 30, 30);
        
        
        g.setColor(Color.BLACK);
        g.fillOval(200, 240, 100, 20);
        g.setColor(Color.CYAN);
        g.fillRect(200, 232, 100, 20);
    }
    int RandInt(int min, int max)
        {
            Random r = new Random();
            return r.nextInt(max-min)+min;
        }
}
