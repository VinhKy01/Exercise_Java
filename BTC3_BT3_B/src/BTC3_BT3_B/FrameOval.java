
package BTC3_BT3_B;

import javax.swing.JFrame;

public class FrameOval {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame oval = new JFrame("Draw Oval");
        //Khoi tao Frame
        oval.setSize(400, 400);
        //dieu chinh kich thuoc 
        oval.setLocationRelativeTo(null);
        //dua frame vao trung tam man hinh
        oval.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        //close chuong trinh khi dong program
        DrawOval drawoval = new DrawOval();
        //goi doi tuong 
        oval.add(drawoval);
        // Display the frame
        oval.setVisible(true);
    }  
}
