
package DrawArcs;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ArcsJPanel extends JPanel{
    
    public void paint(Graphics g){
        //Tạo viền màu đỏ
        g.setColor(Color.red);
        g.drawRect(15, 35, 100, 100);
        //Tạo viền tròn màu đen
        g.setColor(Color.BLACK);
        g.drawArc(15, 35, 100, 100, 0, 360);
        
        //Tạo viền màu đỏ
        g.setColor(Color.red);
        g.drawRect(125, 35, 100, 100);
        //Tạo viền tròn màu đen
        g.setColor(Color.BLACK);
        g.drawArc(125, 35, 100, 100, 0, 110);
        
        //Tạo viền màu đỏ
        g.setColor(Color.red);
        g.drawRect(235, 35, 100, 100);
        //Tạo viền tròn màu đen
        g.setColor(Color.BLACK);
        g.drawArc(235, 35, 100, 100, 0, -270);
        
        
        //g.fillArc(toạ độ x, toạ độ y, độ dài, độ cao, độ xoay của hình tròn, độ đầy đủ của hình tròn)
        //Hình tròn thứ nhất
        g.fillArc(15, 145, 100, 60, 0, 360);
        
        //g.fillArc(toạ độ x, toạ độ y, độ dài, độ cao, độ xoay của hình tròn, độ đầy đủ của hình tròn)
        //Hình tròn bị khuyết 270 độ
        g.fillArc(125, 145, 100, 60, 270, -90);
        
        //g.fillArc(toạ độ x, toạ độ y, độ dài, độ cao, độ xoay của hình tròn, độ đầy đủ của hình tròn)
        //Hình tròn bị khuyết 90 độ
        g.fillArc(235, 145, 100, 60, 0, -270);
    }
}
