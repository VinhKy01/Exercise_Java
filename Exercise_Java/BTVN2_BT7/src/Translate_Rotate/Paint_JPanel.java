
package Translate_Rotate;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;

public class Paint_JPanel extends JPanel{
    
    public void paint(Graphics g){
        super.paintComponent(g);
        
        Random random = new Random();
        int[] x = {55, 67, 109, 73, 83, 55, 17, 37, 1, 43};
        int[] y = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
        
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();
        
        star.moveTo(x[0], y[0]);
        
        for (int count = 1; count < x.length; count++) {
            star.lineTo(x[count], y[count]);
        }
        star.closePath();
        g2d.translate(150, 150);
        
        for (int count = 1; count < 20; count++) {
            g2d.rotate(Math.PI/10);
            
            g2d.setColor(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
            
            g2d.fill(star);
        }
    }
    
}
