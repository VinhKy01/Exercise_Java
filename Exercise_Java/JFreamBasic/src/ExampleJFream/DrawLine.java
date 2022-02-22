
package ExampleJFream;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLine extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
 
        super.paintComponent(g);
        g.drawLine(30, 30, 30, 200);
        g.drawLine(30, 30, 200, 30);
        g.drawLine(200, 30, 200, 200);
        g.drawLine(30, 200, 200, 200);
        g.drawLine(30, 30, 200, 200);
        g.drawLine(200, 30, 30, 200); 
    }

}
