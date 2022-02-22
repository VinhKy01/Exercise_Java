
package BTC3_BT3_E;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JPanel;

public class DrawKimTuThap extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int soTang = 10;
        int soVien = soTang;
        int x = 200, y = 20;
        int count = 0;
        for (int i = 0; i < soTang; i++) {
            for (int j = 0; j < soVien; j++) {
               g.setColor(Color.WHITE);
               g.setColor(new Color(RandInt(0, 255), RandInt(0, 255), RandInt(0, 255)));
               g.fillRect(x, y, 40, 20);
               x -= 20;
               y += 20;

            }
            count++;
            soVien--;
            x = count * 20 + 200;
            y = count * 20 + 20;
        }
    }
    int RandInt(int min, int max)
        {
            Random r = new Random();
            return r.nextInt(max-min)+min;
        }
}
