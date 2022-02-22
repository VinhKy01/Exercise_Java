
package LineRectOval;

import javax.swing.JFrame;

public class LineRectOvalJFrame extends JFrame{
    
    //Tạo 1 đối tượng có tên lineRectovalJPanel của class LineRectOvalJFrame
    LineRectOvalJPanel lineRectovalJPanel;
    
    public LineRectOvalJFrame(){
        //Tạo đối tượng mới
        lineRectovalJPanel = new LineRectOvalJPanel();
        //Đưa JPanel vao JFrame
        add(lineRectovalJPanel);
        
    }
    
    public static void main(String[] args) {
        //Tạo đối tượng JFrame mới ten color của lớp LineRectOvalJFrame
        LineRectOvalJFrame linerectoval = new LineRectOvalJFrame();
        //Điều chỉnh kích thước
        linerectoval.setSize(500, 500);
        //Đưa program về vị trí trung tâm
        linerectoval.setLocationRelativeTo(null);
        //Tắt chương trình khi đóng program
        linerectoval.setDefaultCloseOperation(LineRectOvalJFrame.EXIT_ON_CLOSE);
        //Định dạng/Display Program
        linerectoval.setVisible(true);
    }
    
}
