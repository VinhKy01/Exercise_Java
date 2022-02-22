package BT5_C3;

import javax.swing.JFrame;

public class MainDoThi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //khoi tao
        JFrame frame = new JFrame();
        //dieu chinh giao dien lon nho
        frame.setSize(800,600);
        //dat giao dien ra giua man hinh
        frame.setLocationRelativeTo(null);
        //exit program khi tat giao dien
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //them panel vao
        DrawDoThi panel = new DrawDoThi();
        frame.add(panel);
        
        //hien thi 
        frame.setVisible(true);
    }
    
}
