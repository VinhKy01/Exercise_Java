package BTC3_BT4;

import javax.swing.JFrame;

public class FrameBall extends javax.swing.JFrame {

    public static void main(String[] args) {
        //Khoi tao Frame
        // TODO code application logic here
        JFrame ball = new JFrame("Ball Move");
        //Khoi tao Frame
        ball.setSize(800, 500);
        //dieu chinh kich thuoc 
        ball.setLocationRelativeTo(null);
        //dua frame vao trung tam man hinh
        ball.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        //close chuong trinh khi dong program
        BallMove ktt = new BallMove();
        //goi doi tuong 
        ball.add(ktt);
        // Display the frame
        ball.setVisible(true);

    }
}
