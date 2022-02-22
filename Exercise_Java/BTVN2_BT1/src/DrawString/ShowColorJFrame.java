
package DrawString;

import javax.swing.JFrame;

public class ShowColorJFrame extends JFrame{
    
    //Tạo đối tượng colorJPanel của lớp ColorJPanel
    ColorJPanel colorJPanel;
    
    public ShowColorJFrame(){
        //Tạo đối tượng mới colorJPanel của lớp ColorJPanel
        colorJPanel = new ColorJPanel();
        //Đứa JPanel của ColorJPanel vào JFrame ShowColorJFrame
        add(colorJPanel);
    }
    
    public static void main(String[] args) {
        //Tạo đối tượng JFrame mới ten color của lớp ShowColorJFrame
        ShowColorJFrame color = new ShowColorJFrame();
        //Điều chỉnh kích thước 
        color.setSize(500, 500);
        //Đưa program về vị trí trung tâm
        color.setLocationRelativeTo(null);
        //Tắt chương trình khi đóng program
        color.setDefaultCloseOperation(ShowColorJFrame.EXIT_ON_CLOSE);
        //Định dạng/Display Program
        color.setVisible(true);
    }
    
}
