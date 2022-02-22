
package btc6_bt5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MoveBall implements Runnable{

    
    Graphics g;
    private int x, y, dx, dy;
    public MoveBall(Graphics g) {
        this.g = g;
    }
    @Override
    public void run() {
        int x = RandInt(0, 550);
        int y = RandInt(0, 300);
        int dx = 10,dy = 10;
        int d=50;
        Color color= new Color(RandInt(0,255),RandInt(0,255),RandInt(0,255));
        
        while(true)
        {
            g.setColor(color);
            g.fillOval(x, y, d, d);
            
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoveBall.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            g.setColor(Color.white);
            g.fillOval(x , y, d, d);
            
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoveBall.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //kiem tra chạm canh hay chua?
            if(x<=0 || x+d>=550){
                dx=-dx;
            }
                
            if(y<=0 || y+d>=300){
                dy=-dy;
            }

            x=x+dx;
            y=y+dy;
        }
       
    }
    
    int RandInt(int min, int max)
        {
            Random r = new Random();
            return r.nextInt(max-min)+min;
        }
}
