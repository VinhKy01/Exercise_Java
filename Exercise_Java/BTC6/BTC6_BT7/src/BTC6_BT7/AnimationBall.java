/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTC6_BT7;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Phuong Dong
 */
public class AnimationBall implements Runnable{
    Graphics g;
    JPanel p;
    int x, y;
    Color c;
    public AnimationBall(Graphics g, JPanel p, int x, int y, Color c){
        this.g = g;
        this.p = p;
        this.x = x;
        this.y = y;
        this.c = c;
    }
    
    public void setG(Graphics g){
        this.g = g;
    }

    @Override
    public void run() {
        
        while(0<=Math.abs(y) && Math.abs(y)<=450){    
            g.setColor(c);
            g.fillOval(x, Math.abs(y++), 50, 50);

            //gioi han khung chay cho hinh tron
            if(y==450){
                y=-y;
            }                    
            //delay
            try{
                Thread.sleep(1);
                p.repaint();
                Thread.sleep(1);
            }catch(InterruptedException e){
                System.err.println("" + e.getMessage());
            }                   
        }      
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //random
    int randInt(int min, int max){
        Random r = new Random();
        return r.nextInt(max - min)+min;
    }
}
