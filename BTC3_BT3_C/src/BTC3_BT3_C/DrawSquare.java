
package BTC3_BT3_C;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawSquare extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(new Color(RandInt(0, 255),RandInt(0, 255),RandInt(0, 255)));
        g.fillRect(0, 0, 400, 400);
        
        //Hinh Thoi-------------------
        g.setColor(new Color(RandInt(0, 255),RandInt(0, 255),RandInt(0, 255)));
        int ax[] = {200, 400, 200, 0};//4 dinh cua toa do x
        int ay[] = {0, 200, 400, 200};//4 dinh cua toa do y
        g.fillPolygon(ax, ay, 4);
        
        //Hinh Vuong Nho
        g.setColor(new Color(RandInt(0, 255),RandInt(0, 255),RandInt(0, 255)));
        int bx[] = {300, 300, 100, 100};//4 dinh cua toa do x
        int by[] = {100, 300, 300, 100};//4 dinh cua toa do y
        g.fillPolygon(bx, by, 4);
        
        //Hinh Tron Nho
        g.setColor(new Color(RandInt(0, 255),RandInt(0, 255),RandInt(0, 255)));
        g.fillOval(100, 100, 200, 200);
    }
    int RandInt(int min, int max)
        {
            Random r = new Random();
            return r.nextInt(max-min)+min;
        }
}
