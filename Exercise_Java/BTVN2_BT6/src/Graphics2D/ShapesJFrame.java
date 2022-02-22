
package Graphics2D;

import javax.swing.JFrame;

public class ShapesJFrame extends JFrame{
    
    //Tạo đối tượng có tên shapesJpanel
    ShapesJPanel shapesJpanel;
    
    public ShapesJFrame(){
        //Tạo đối tượng mới
        shapesJpanel = new ShapesJPanel();
        //Đưa JPanel của ShapesJPanel vào JFrame của ShapesJFrame
        add(shapesJpanel);
    
    }
    
    public static void main(String[] args) {
        //Tạo đối tượng JFrame mới ten color của lớp ShapesJFrame
        ShapesJFrame jframe = new ShapesJFrame();
        //Điều chỉnh kích thước 
        jframe.setSize(500, 500);
        //Đưa program về vị trí trung tâm
        jframe.setLocationRelativeTo(null);
        //Tắt chương trình khi đóng program
        jframe.setDefaultCloseOperation(ShapesJFrame.EXIT_ON_CLOSE);
        //Định dạng/Display Program
        jframe.setVisible(true);
    }
    
}
