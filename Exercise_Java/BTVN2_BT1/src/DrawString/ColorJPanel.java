
package DrawString;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel{
    
    public void paint(Graphics g){
        
        super.paint(g);
        //Điều chỉnh màu nền
        this.setBackground(Color.WHITE);
        
        //Điều chỉnh màu đỏ
        g.setColor(Color.red);
        g.fillRect(15, 25, 100, 20);//Theo thứ tự toạ độ x, toạ độ y, độ dài và độ rộng
        g.drawString("Current RGB: ", 130, 40);//Vị trí của x, vị trí của y
        
        //Điều chỉnh màu xanh lá
        g.setColor(Color.GREEN);
        g.fillRect(15, 65, 100, 20);//Theo thứ tự toạ độ x, toạ độ y, độ dài và độ rộng
        g.drawString("Current RGB: ", 130, 80);//Vị trí của x, vị trí của y
        
        //Điều chỉnh màu xanh dương
        g.setColor(Color.BLUE);
        g.fillRect(15, 105, 100, 20);//Theo thứ tự toạ độ x, toạ độ y, độ dài và độ rộng
        g.drawString("Current RGB: ", 130, 120);//Vị trí của x, vị trí của y
        
        //Điều chỉnh màu hồng
        g.setColor(Color.pink);
        g.fillRect(15, 145, 100, 20);//Theo thứ tự toạ độ x, toạ độ y, độ dài và độ rộng
        g.drawString("Current RGB: ", 130, 160);//Vị trí của x, vị trí của y
        
        
        
    }
}
