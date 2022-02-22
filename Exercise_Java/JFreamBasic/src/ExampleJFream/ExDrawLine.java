
package ExampleJFream;
import javax.swing.JFrame;
public class ExDrawLine {
     public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("JFrame");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawLine drawLine=new DrawLine();
        frame.add(drawLine);
        
        // Display the frame
        frame.setVisible(true);
    }    

}
