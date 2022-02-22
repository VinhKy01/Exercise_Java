package BTC3_BT3_D;

import javax.swing.JFrame;

public class FrameSmile {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame smile = new JFrame("Draw Smile");
        //Khoi tao Frame
        smile.setSize(500, 400);
        //dieu chinh kich thuoc 
        smile.setLocationRelativeTo(null);
        //dua frame vao trung tam man hinh
        smile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        //close chuong trinh khi dong program
        DrawSmile drawssmile = new DrawSmile();
        //goi doi tuong 
        smile.add(drawssmile);
        // Display the frame
        smile.setVisible(true);
    }

}
