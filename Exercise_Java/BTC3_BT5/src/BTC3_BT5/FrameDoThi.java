
package BTC3_BT5;

import javax.swing.JFrame;

public class FrameDoThi {

    public static void main(String[] args) {
        //Khoi tao Frame
        JFrame jframe = new JFrame("Do Thi");
        //dieu chinh kich thuoc 
        jframe.setSize(800, 600);
        //dua frame vao trung tam man hinh
        jframe.setLocationRelativeTo(null);
        //close chuong trinh khi dong program
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //goi doi tuong class DrawDoThi
        DrawDoThi draw = new DrawDoThi();
        //add jpanel vao frame
        jframe.add(draw);
        //dinh dang frame
        jframe.setVisible(true);
    }
    
}
