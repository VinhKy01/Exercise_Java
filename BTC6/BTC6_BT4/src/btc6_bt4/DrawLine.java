/*
 2 * To change this license header, choose License
Headers in Project Properties.
 3 * To change this template file, choose Tools |
Templates
 4 * and open the template in the editor.
 5 */
package btc6_bt4;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
15 *
16 * @author Sinhvien
17 */
public class DrawLine implements Runnable {


Graphics g;
//x1,y1,x2,y2: tọa độ 2 đầu của đường thẳng
//dx,dy: là hướng di chuyển
//trung tam --> trái: dx<0,dy=0
//trung tam --> phai: dx>0,dy=0
int x1,y1,x2,y2,dx,dy;
//min,max: là giới hạn trái phải của hướng di chuyển
int min,max;
public DrawLine(Graphics g) {
this.g = g;
}
public DrawLine(Graphics g,int min,int max,int x1, int y1, int x2, int y2, int dx, int dy)
{
    this.g = g;
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    this.dx = dx;
    this.dy = dy;
    this.min = min;
    this.max = max;

}
public void setGraphics(Graphics g) {
this.g = g;
}
    @Override
    public void run() {

    Color c=new Color(randInt(0,255),randInt
    (0,255),randInt(0,255));
    g.setColor(c);
        while(true)
        {
            g.drawLine(x1, y1, x2, y2);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(DrawLine.class.
                getName()).log(Level.SEVERE, null, ex);
            }

            if(x1<min || x1>max)
            {
                dx=-dx;
                c=new Color(randInt(0,255),randInt
                (0,255),randInt(0,255));

                g.setColor(c);
            }

            x1+=dx;x2=x1;
            //y1+=dy;y2+=dy;
        }
    }

    public int randInt(int min, int max) {
        Random rand=new Random();
        int randomNum = rand.nextInt((max - min) +
        1) + min;
        return randomNum;
    }
}

