
package BTC3_BT3_A;


import javax.swing.JFrame;

public class FrameCar {

    public static void main(String[] args){
        // TODO code application logic here
        JFrame paintCar = new JFrame("Draw Car");
        //Khoi tao Frame
        paintCar.setSize(600, 430);
        //dieu chinh kich thuoc 
        paintCar.setLocationRelativeTo(null);
        //dua frame vao trung tam man hinh
        paintCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        //close chuong trinh khi dong program
        DrawCar drawLine = new DrawCar();
        //goi doi tuong 
        paintCar.add(drawLine);
        // Display the frame
        paintCar.setVisible(true);
    }
    
}
