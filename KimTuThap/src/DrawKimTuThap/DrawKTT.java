
package DrawKimTuThap;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawKTT extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int SoTang = 5;
        int x = 50, y = 200;
        int count = 0;
        
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                //Nếu i == 1 thì in ra chân tháp vì phải tăng x và giữ nguyên
                        g.setColor(new Color(RandInt(0, 255)));
                        g.fillRect(x, y, 40, 20);
                        x += 40;
                }
                count++;
                x = 20*count+50;
                y = y - 20;
            }
        }
    int RandInt(int min, int max)
        {
            Random r = new Random();
            return r.nextInt(max-min)+min;
        }
}
