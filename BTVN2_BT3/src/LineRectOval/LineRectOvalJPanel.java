
package LineRectOval;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LineRectOvalJPanel extends JPanel{

    public void paint(Graphics g){
        
        //Tạo 1 nền màu trắng có size (500,500)
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        
        //Drawline
        //Vẽ 1 đường thẳng
        g.setColor(Color.red);
        g.drawLine(30, 30, 450, 30);//Theo thứ tự toạ độ x , y, độ dài, độ rộng
        
        //Drawrect
        //Vẽ 1 viền hình vuông
        g.setColor(Color.BLUE);
        g.drawRect(40, 40, 50, 50);//Theo thứ tự toạ độ x , y, độ dài, độ rộng
        //FillRect
        //Vẽ 1 ô vuông
        g.fillRect(100, 40, 50, 50);//Theo thứ tự toạ độ x , y, độ dài, độ rộng
        
        //Draw3DRect
        g.setColor(Color.GREEN);
        //Vẽ 1 viền hình vuông 3D
        g.draw3DRect(40, 100, 50, 50, true);//Theo thứ tự toạ độ x , y, độ dài, độ rộng
        //Vẽ 1 hình vuông 3D
        g.fill3DRect(100, 100, 50, 50, false);//Theo thứ tự toạ độ x , y, độ dài, độ rộng
        
        //FillRoundRect
        g.setColor(Color.BLACK);
        //Vẽ 1 hình vuông bo cạnh 
        g.fillRoundRect(200, 40, 80, 50, 50, 50);//Theo thứ tự toạ độ x , y, độ dài, độ rộng, độ bo cạnh 1, độ bo cạnh 2
        //Vẽ 1 viền hình vuông bo cạnh 
        g.drawRoundRect(290, 40, 80, 50, 50, 50);//Theo thứ tự toạ độ x , y, độ dài, độ rộng, độ bo cạnh 1, độ bo cạnh 2
        
        //FillOval
        g.setColor(Color.PINK);
        //Vẽ 1 hình tròn
        g.fillOval(200, 100, 80, 50);//Theo thứ tự toạ độ x , y, độ dài, độ rộng
        //Vẽ 1 viền hình tròn
        g.drawOval(290, 100, 80, 50);//Theo thứ tự toạ độ x , y, độ dài, độ rộng
    }
}
