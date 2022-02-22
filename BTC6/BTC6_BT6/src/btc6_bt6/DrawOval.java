/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package btc6_bt6;
//import bai5_c6.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
*
* @author Sinhvien
*/
public class DrawOval implements Runnable {
    Graphics g;
    int mx,my;
    public void setXMouse(int mx) {
    this.mx = mx;
    }
    public void setYMouse(int my) {
    this.my = my;
    }
    public DrawOval(Graphics g) {
    this.g = g;
    }
    public void setGraphics(Graphics g) {
    this.g = g;
    }
    @Override
    public void run() {
        Color c=new Color(randInt(0,255),randInt(0,255),randInt(0,255));
        int x,y,dx,dy;
        x=randInt(30, 470);
        y=randInt(30, 370);
        while(true)
        {
        g.setColor(c);
        g.fillOval(x,y,60,60);
        try {
            Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(DrawOval.class.getName()).log(Level.SEVERE, null, ex);
            }
            g.setColor(Color.white);
            g.fillOval(x,y,60,60);
            dx=mx-x;
            dy=my-y;
            dx=Math.abs(dx/50)>2?dx/50:(dx>0?1:(dx<0?-1:0));
            dy=Math.abs(dy/50)>2?dy/50:(dy>0?1:(dy<0?-1:0));
            x=x+dx;
            y=y+dy;
        }
    }
    public int randInt(int min, int max) {
        Random rand=new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
