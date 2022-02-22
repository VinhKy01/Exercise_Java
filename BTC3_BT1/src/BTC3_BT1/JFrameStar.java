
package BTC3_BT1;

import javax.swing.JFrame;
public class JFrameStar {
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ngoisao = new JFrame("Ngoi Sao 5 Canh");
        //Khoi tao Frame
        ngoisao.setSize(600, 600);
        //dieu chinh kich thuoc 
        ngoisao.setLocationRelativeTo(null);
        //dua frame vao trung tam man hinh
        ngoisao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        //close chuong trinh khi dong program
        DrawStar star = new DrawStar();
        //goi doi tuong 
        ngoisao.add(star);
        // Display the frame
        ngoisao.setVisible(true);
    }
    
}
