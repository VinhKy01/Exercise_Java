
package BTC3_BT2;

import javax.swing.JFrame;

public class FrameLine {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame veduongthang = new JFrame("100 duong thang");
        //Khoi tao Frame
        veduongthang.setSize(800, 600);
        //dieu chinh kich thuoc 
        veduongthang.setLocationRelativeTo(null);
        //dua frame vao trung tam man hinh
        veduongthang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        //close chuong trinh khi dong program
        RandomDrawLine drawLine = new RandomDrawLine();
        //goi doi tuong 
        veduongthang.add(drawLine);
        // Display the frame
        veduongthang.setVisible(true);
    }
}