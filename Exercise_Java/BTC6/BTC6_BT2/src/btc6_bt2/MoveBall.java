
package btc6_bt2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MoveBall implements Runnable{
  
    Graphics g;
    int speed;
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    public MoveBall(Graphics g, int speed) {
        this.g = g;
        this.speed = speed;
    }

    @Override
    public void run() {
        int x = RandInt(0, 570);
        int y = RandInt(0, 300);
        int dx,dy;
        int d=30;
        dx= RandInt(1, 2) * (RandInt(0, 1)==0 ? 1:-1);
        dy= RandInt(1, 2) * (RandInt(0, 1)==0 ? 1:-1);
        Color color= new Color(RandInt(0,255),RandInt(0,255),RandInt(0,255));
        
        while(true)
        {
            g.setColor(color);
            g.fillOval(x, y, d, d);
            
            try {
                Thread.sleep(speed);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoveBall.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            g.setColor(Color.white);
            g.fillOval(x , y, d, d);
            
            //kiem tra chạm canh hay chua?
            if(x<=0 || x+d>=600){
                dx=-dx;
            }
                
            if(y<=0 || y+d>=330){
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
