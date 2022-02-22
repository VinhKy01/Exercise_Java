
package BTC3_BT3_A;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawCar extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);   
        //Màu thùng xe
        g.setColor(Color.GREEN);
        g.fillRect (0, 0, 600, 400);
        //Màu cua so xe
        g.setColor(Color.CYAN);
        g.fillRect (400, 50, 200, 115);
        //--------------------------------------
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 350, 600, 50);
        //--------------------------------------
        g.setColor(Color.BLACK);
        g.fillOval(80, 290, 100, 100);
        g.fillOval(380, 290, 100, 100);
        //--------------------------------------
        g.setColor(Color.WHITE);
        g.fillOval(100, 310, 60, 60);
        g.fillOval(400, 310, 60, 60);
        
    }

}
