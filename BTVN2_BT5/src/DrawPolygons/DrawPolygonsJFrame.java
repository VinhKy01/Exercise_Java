
package DrawPolygons;

import javax.swing.JFrame;

public class DrawPolygonsJFrame extends JFrame{
    
    //Tạo 1 đối tượng có tên polygonsJPanel của PolygonsJPanel
    PolygonsJPanel polygonsJPanel;
    
    public DrawPolygonsJFrame(){
        //Tạo đối tượng mới của PolygonsJPanel
        polygonsJPanel = new PolygonsJPanel();
        //Đưa JPanel vào JFrame
        add(polygonsJPanel);
    }
    
    public static void main(String[] args) {
        //Tạo 1 đối tượng Jframe mới có tên là jframe
        DrawPolygonsJFrame jframe = new DrawPolygonsJFrame();
        //Điều chỉnh kích thước của JFrame
        jframe.setSize(500, 500);
        //Điều chỉnh JFrame về vị trí trung tâm màn hình
        jframe.setLocationRelativeTo(null);
        //Đóng chương trình khi tắt program
        jframe.setDefaultCloseOperation(DrawPolygonsJFrame.EXIT_ON_CLOSE);
        //Định dạng JFrame
        jframe.setVisible(true);
        
    }
    
}
