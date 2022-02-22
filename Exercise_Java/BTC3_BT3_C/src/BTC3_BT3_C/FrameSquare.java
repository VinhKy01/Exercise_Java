
package BTC3_BT3_C;

import javax.swing.JFrame;

public class FrameSquare {
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame square = new JFrame("Draw Square");
        //Khoi tao Frame
        square.setSize(600, 430);
        //dieu chinh kich thuoc 
        square.setLocationRelativeTo(null);
        //dua frame vao trung tam man hinh
        square.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        //close chuong trinh khi dong program
        DrawSquare drawsquare = new DrawSquare();
        //goi doi tuong 
        square.add(drawsquare);
        // Display the frame
        square.setVisible(true);
    }
    
}
