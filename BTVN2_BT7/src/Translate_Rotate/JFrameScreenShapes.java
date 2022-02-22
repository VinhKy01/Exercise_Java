
package Translate_Rotate;

import javax.swing.JFrame;

public class JFrameScreenShapes extends JFrame{
    //Tạo đối tượng paintJPanel của lớp Paint_JPanel
    Paint_JPanel paintJPanel;
    
    public JFrameScreenShapes(){
        //Tạo đối tượng mới
        paintJPanel = new Paint_JPanel();
        //Đưa JPanel vao JFrame
        add(paintJPanel);
    }
    
    public static void main(String[] args) {  
        //Tạo đối tượng JFrame mới ten color của lớp LineRectOvalJFrame
        JFrameScreenShapes jframe = new JFrameScreenShapes();
        //Điều chỉnh kích thước
        jframe.setSize(500, 500);
        //Đưa program về vị trí trung tâm
        jframe.setLocationRelativeTo(null);
        //Tắt chương trình khi đóng program
        jframe.setDefaultCloseOperation(JFrameScreenShapes.EXIT_ON_CLOSE);
        //Định dạng/Display Program
        jframe.setVisible(true);
        
    }
    
}
