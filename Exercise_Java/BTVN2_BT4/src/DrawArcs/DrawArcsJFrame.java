
package DrawArcs;

import javax.swing.JFrame;

public class DrawArcsJFrame extends JFrame{
    //Tạo một đối tượng arcsJPanel
    ArcsJPanel arcsJPanel;
    
    public DrawArcsJFrame(){
        //Tạo đối tượng mới
        arcsJPanel = new ArcsJPanel();
        //Đưa JPanel của ArcsJPanel vào JFrame Draw Arcs
        add(arcsJPanel);
        
    }
    public static void main(String[] args) {
        //Tạo một đối tượng JFrame mới của JFrame DrawArrcs
        DrawArcsJFrame jframe = new DrawArcsJFrame();
        //Điều chỉnh kích thước của JFrame
        jframe.setSize(500, 500);
        //Đưa JFrame về vị trí trung tâm màn hình
        jframe.setLocationRelativeTo(null);
        //Đóng chương trình khi tắt program
        jframe.setDefaultCloseOperation(DrawArcsJFrame.EXIT_ON_CLOSE);
        //Đinh dạng/Display JFrame
        jframe.setVisible(true);
    }
    
}
