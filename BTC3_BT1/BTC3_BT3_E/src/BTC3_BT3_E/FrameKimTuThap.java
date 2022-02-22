
package BTC3_BT3_E;

import javax.swing.JFrame;

public class FrameKimTuThap {

    public static void main(String[] args) {
        
        // TODO code application logic here
        JFrame kimtuthap = new JFrame("Kim Tu Thap");
        //Khoi tao Frame
        kimtuthap.setSize(500, 400);
        //dieu chinh kich thuoc 
        kimtuthap.setLocationRelativeTo(null);
        //dua frame vao trung tam man hinh
        kimtuthap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        //close chuong trinh khi dong program
        DrawKimTuThap ktt = new DrawKimTuThap();
        //goi doi tuong 
        kimtuthap.add(ktt);
        // Display the frame
        kimtuthap.setVisible(true);
    }
    
}
