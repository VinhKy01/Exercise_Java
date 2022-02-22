
package BTC3_BT3_F;

import javax.swing.JFrame;

public class FrameHouse extends JFrame{
    DrawHouse drawHouse;
    
    public FrameHouse(){
        drawHouse = new DrawHouse();
        add(drawHouse);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame house = new JFrame("Draw House");
        //Khoi tao Frame
        house.setSize(300, 400);
        //dieu chinh kich thuoc 
        house.setLocationRelativeTo(null);
        //dua frame vao trung tam man hinh
        house.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        //close chuong trinh khi dong program
        DrawHouse drawhouse = new DrawHouse();
        //goi doi tuong 
        house.add(drawhouse);
        // Display the frame
        house.setVisible(true);
    }
    
}
