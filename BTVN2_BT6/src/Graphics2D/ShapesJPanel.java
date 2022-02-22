
package Graphics2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class ShapesJPanel extends JPanel{
    
    public void paint(Graphics g){
        //Tạo đối tượng g2d của Graphics2D
        Graphics2D g2d = (Graphics2D) g;
        
        //Theo thứ tự vị trí màu xanh và màu vàng của hình tròn
        g2d.setPaint(new GradientPaint(5, 40, Color.BLUE, 40, 120, Color.YELLOW, true));
        //Định dạng 1 hình tròn 2D
        g2d.fill(new Ellipse2D.Double(15, 30, 85, 120));//Theo thứ tự toạ độ x, toạ độ y, chiều dài và chiều cao
        
        //Điều chỉnh màu
        g2d.setPaint(Color.RED);
        //Tạo một viền có dộ dày 15
        g2d.setStroke(new BasicStroke(15));
        //Vẽ 1 hình vương rổng
        g2d.draw(new Rectangle2D.Double(180, 40, 65, 100));//Theo thứ tự toạ độ x, toạ độ y, chiều dài và chiều cao
        
        BufferedImage buffImage = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        Graphics2D gg = buffImage.createGraphics();
        gg.setColor(Color.YELLOW);
        gg.fillRect(1, 1, 10, 10);//Theo thứ tự toạ độ x, toạ độ y, chiều dài và chiều cao
        gg.setColor(Color.BLACK);
        gg.fillRect(1, 1, 6, 6);//Theo thứ tự toạ độ x, toạ độ y, chiều dài và chiều cao
        gg.setColor(Color.BLUE);
        gg.fillRect(1, 1, 3, 3);//Theo thứ tự toạ độ x, toạ độ y, chiều dài và chiều cao
        gg.setColor(Color.red);
        gg.fillRect(4, 4, 3, 3);//Theo thứ tự toạ độ x, toạ độ y, chiều dài và chiều cao
        
        g2d.setPaint(new TexturePaint(buffImage, new Rectangle(10, 10)));
        g2d.fill(new RoundRectangle2D.Double(300, 100, 80, 100, 60, 60));
        
        //Điều chỉnh màu
        g2d.setPaint(Color.WHITE);
        //Tạo một viền có dộ dày 15
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(new Arc2D.Double(20, 250, 80, 100, 180, 270, Arc2D.PIE));//Theo thứ tự toạ độ x, toạ độ y, độ dài, độ cao, độ xoay của hình tròn, độ đầy đủ của hình tròn)
        
        //Điều chỉnh màu
        g2d.setPaint(Color.GREEN);
        g2d.draw(new Line2D.Double(150, 250, 250, 400));//Theo thứ tự toạ độ x, toạ độ y, chiều dài và chiều cao
        
        float[] dashes = {15};
        g2d.setPaint(Color.YELLOW);
        g2d.setStroke(new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, dashes, 0));
        g2d.draw(new Line2D.Double(250, 250, 150, 400));//Theo thứ tự toạ độ x, toạ độ y, chiều dài và chiều cao
        
        
    }
}
