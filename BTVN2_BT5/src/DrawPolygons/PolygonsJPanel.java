
package DrawPolygons;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class PolygonsJPanel extends JPanel{
    
    public void paint(Graphics g){
        
        int[] x = {40, 80, 100, 60, 40, 30};//Vị trí toạ độ x của tường đỉnh
        int[] y = {100, 100, 120, 160, 160, 120};//Vị trí toạ độ y của từng đỉnh
        //Tạo đối tượng polygons 2 toạ độ với 6 đỉnh
        Polygon plg1 = new Polygon(x, y, 6);
        g.drawPolygon(plg1);
        
        int[] a = {300, 400, 300, 120, 80, 120};//Vị trí toạ độ a của tường đỉnh
        int[] b = {20, 20, 225, 160, 180, 120};//Vị trí toạ độ b của tường đỉnh
        g.drawPolygon(a, b, 6);
        
        int[] c = {120, 160, 300, 180, 120, 90};//Vị trí toạ độ c của tường đỉnh
        int[] d = {300, 300, 360, 420, 400, 360};//Vị trí toạ độ d của tường đỉnh
        g.fillPolygon(c, d, 6);
        
        
        int[] e = {250, 270, 290, 280, 270, 250};//Vị trí toạ độ e của tường đỉnh
        int[] f = {250, 270, 290, 310, 290, 280};//Vị trí toạ độ f của tường đỉnh
        g.fillPolygon(e, f, 6);
        
    }
}
