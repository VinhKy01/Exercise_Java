
package BTC3_BT5;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawDoThi extends JPanel{
    int dai = 800, cao = 600;
    int x1 = -500;
    int y1 = dai/2 - (3*x1*x1 - 6*x1 + 1);
    int x2, y2;
    int rong = 5;
    public void paintComponent(Graphics g){
    
        super.paintComponent(g);
        for (x2 = -499; x2 < 500; x2++){
            y2 = dai/2 - (3*x2*x2 - 6*x2 + 1);
            g.drawLine(rong * x1 + dai/2, y1,rong * x2 + dai/2, y2);
            x1 = x2;
            y1 = y2;
        }
        Drawtoado(g);
    }
    void Drawtoado(Graphics g){
        //truc toa do
        //tung do y
        g.drawLine(dai/2, 0, dai/2, cao);
        //hoanh do x
        g.drawLine(0, cao/2, dai, cao/2);
    }
}
