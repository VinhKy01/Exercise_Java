
package BTC3_BT4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


public class BallMove extends JPanel implements Runnable{
    
    //Khởi tạo vị trí ban đầu cho quả bóng
    int x = 20;
    int y = 200;
    
    Thread thread;
    
    public BallMove(){
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void paint(Graphics g){
        //Tạo 1 Panel nền màu trắng size(500,500) ghì đè lên Panel quả bóng 
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 800, 500);
        try {
            thread.sleep(10);
            repaint();
        } catch (InterruptedException ex) {
            Logger.getLogger(BallMove.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Tạo 1 Panel chứa quả bóng với vị trí ban đầu cố định (0,200)
        g.setColor(new Color(RandInt(0, 255),RandInt(0, 255),RandInt(0, 255),RandInt(0, 255)));
        //Hàm Math lấy giá trị tuyệt đối x và y
        g.fillOval(Math.abs(x), Math.abs(y), 50, 50);
        
    }
    @Override
    //Hàm run giúp in đè Panel quả bóng với Panel nền màu trắng
    public void run() {
        while(true){
//            x = RandInt(0, 480);
//            y = RandInt(0, 480);
//            //Nếu quả bóng có toạ độ x tăng lên bằng quy định thì gán x bằng trừ chính nó 
            if (x==740 || x==0) {
                x=-x;
            }
//            //Nếu quả bóng có toạ độ y tăng lên bằng quy định thì gán x bằng trừ chính nó 
            if (y==420 || y==0) {
                y=-y;
            }
//            //X sẽ lấy giá trị âm ở trên và +1 và quay lài hàm paint lấy giá trị tuyệt đối về lại số dương
            x++;
//            //X sẽ lấy giá trị âm ở trên và +1 và quay lài hàm paint lấy giá trị tuyệt đối về lại số dương
            y++;
            try {
                //Tăng thời gian chờ lên 5 mili giây
                thread.sleep(5);
                repaint();
            } catch (InterruptedException ex) {
            }
        }
    }
    int RandInt(int min, int max)
        {
            Random r = new Random();
            return r.nextInt(max-min)+min;
        }
}
