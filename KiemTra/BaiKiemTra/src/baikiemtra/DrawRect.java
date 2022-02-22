/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baikiemtra;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Random;

/**
 *
 * @author Windows 10 Pro
 */
public class DrawRect implements Runnable{
    Graphics g;

    public DrawRect(Graphics g) {
        this.g = g;
    }
    
    @Override
    public void run() {
        
        while(true)
        {
            //setcolor
            g.setColor(new Color(randInt(0, 255), randInt(0, 255), randInt(0, 255)));
            g.drawRect(randInt(280,560), randInt(0,300), randInt(10,50), randInt(10, 50));
            g.setColor(Color.BLACK);
            g.drawRect(285, 0, 285, 330);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }
     public int randInt(int min, int max) {
        Random rand=new Random();      
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
