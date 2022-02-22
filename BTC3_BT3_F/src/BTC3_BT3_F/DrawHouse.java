
package BTC3_BT3_F;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawHouse extends JPanel{
    

    public void paint(Graphics g){
        //Màu viền thân nhà
        g.setColor(Color.BLACK);
        g.drawRect(20 ,100 , 250, 250);
        //Màu thân nhà
        g.setColor(Color.WHITE);
        g.fillRect(21 ,101 , 249, 249);
        
        //Màu viền cửa sổ 1
        g.setColor(Color.BLACK);
        g.drawRect(40, 130, 60, 45);
        //Màu cửa sổ 1
        g.setColor(Color.WHITE);
        g.fillRect(40 + 1, 130 + 1, 60 - 1, 45 - 1);
        
        //Màu viền cửa sổ 2
        g.setColor(Color.BLACK);
        g.drawRect(190 ,130 , 60, 45);
        //Màu cửa sổ 2
        g.setColor(Color.WHITE);
        g.fillRect(190 + 1, 130 + 1, 60 - 1, 45 - 1);
        
        //Màu viền cửa sổ 3
        g.setColor(Color.BLACK);
        g.drawRect(40 ,230 , 60, 45);
        //Màu cửa sổ 3
        g.setColor(Color.WHITE);
        g.fillRect(190 + 1, 230 + 1, 60 - 1, 45 - 1);
        
        //Màu viền cửa sổ 4
        g.setColor(Color.BLACK);
        g.drawRect(190 ,230 , 60, 45);
        //Màu cửa sổ 4
        g.setColor(Color.WHITE);
        g.fillRect(190 + 1, 230 + 1, 60 - 1, 45 - 1);
        
        //Màu viền cửa nhà
        g.setColor(Color.BLACK);
        g.drawRect(120 ,250 , 50, 100);
        //Màu cửa nhà
        g.setColor(Color.WHITE);
        g.fillRect(120 + 1, 250 + 1, 50 - 1, 100 - 1);
        
        //Vẽ mái nhà
        int ax[] = {145, 270, 150, 20};
        int ay[] = {0, 100, 100, 100};
        g.setColor(Color.WHITE);
        g.fillPolygon(ax, ay, 4);
        
        //Màu viền mái nhà
        g.setColor(Color.BLACK);
        //Viền mái nhà
        g.drawLine(145, 0, 20, 100);
        g.drawLine(145, 0, 270, 100);
    }
}
