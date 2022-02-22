package BT5_C3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawDoThi extends JPanel{
  
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int x, y;


        //ve 2 cai truc toa do
        g.drawLine(400, 0, 400, 600);
        g.drawLine(0, 300, 800, 300);
        int count = 0;
        
        //danh dau cac so (quy doi 100 don vi = 1 don vi)
        for (int i = 400; i < 800; i+=100) {
            if(count%2==0){
                g.drawString(Integer.toString(count), i, 295);
                g.drawString(Integer.toString(-count), 800-i, 295);
            }
            else{
                g.drawString(Integer.toString(count), i, 315);
                g.drawString(Integer.toString(-count), 800-i, 315); 
            }
            count++;
        }
        count = 1;
        for (int i = 400; i < 600; i+=100) {
            if(count%2==0){
                g.drawString(Integer.toString(-count), 385, i);
                g.drawString(Integer.toString(count), 385, 600-i);
            }
            else{
                g.drawString(Integer.toString(-count), 410, i);
                g.drawString(Integer.toString(count), 410, 600-i); 
            }
            count++;
        }
        
        /* Ý TƯỞNG: Quy đổi đồ thị từ hệ tọa độ Oxy sang hệ tọa độ mới tương ứng
        b1: Xác định 3 điểm mà đồ thị y = 3x2+6x+1 đi qua: A(0;1) b(-2;1) C(-2;1)
        b2: Trong hệ tọa độ mới (O'xy), vẽ đường thẳng x = 400 và y = 300 (tọa độ của trục Õ và Oy trong Panel)
        b3: gọi giao điểm kia là M, ta có hệ tọa độ mới tạm gọi là Mxy, chiếu các điểm A,B,C lên Mxy tương ứng (A', B', C')
        b4: Xác định tọa độ của A', B', C' và tìm ra đồ thị mới y = ax2 + bx + c
        b5: Vẽ đồ thị mới trong Panel  
        
        t quy đổi phương trình 3x2 + 6x = 1 thành phương trình y = (-3/100)x2 + 18x - 2200
        còn quy đỏi tjees nào thi... đoán xem =))
        */
         
        for (x = 0; x < 800; x+=1) {
            y = -3*x*x/100 + 18*x -2200;
            g.drawLine(x, y, x, y);            
            g.drawLine(x, y, x+1, (int) (-3*(x+1)*(x+1)/100 + 18*(x+1) -2200));           
        }       
    }
    int randInt(int min, int max){
        Random r = new Random();
        return r.nextInt(max - min)+min;
    }
}
