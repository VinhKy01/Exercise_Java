package test;
import javax.swing.JFrame;
public class testSleep {
    public static void main(String[] args) {
        //khoi tao
        JFrame frame = new JFrame();
        //dieu chinh giao dien lon nho
        frame.setSize(500,500);
        //dat giao dien ra giua man hinh
        frame.setLocationRelativeTo(null);
        //exit program khi tat giao dien
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //them panel vao
        myJPanel panel = new myJPanel();
        frame.add(panel);
        
        //hien thi 
        frame.setVisible(true);
    }    
}
