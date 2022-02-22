
package JColorChooser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ShowColor2JFrame extends JFrame{
    
    //Tạo đối tượng JButton có tên changeColorJButton
    private JButton changeColorJButton;
    //Tạo đối tượng Color có tên color và gán bằng màu xám trắng
    private Color color = Color.LIGHT_GRAY;
    //Tạo đối tượng JPanel có tên colorJPanel
    private JPanel colorJPanel;
    
    public ShowColor2JFrame(){
        
        super("Using JColorChooser");
        //Tạo JPanel mới
        colorJPanel = new JPanel();
        //Điều chỉnh màu nền
        colorJPanel.setBackground(color);
        
        //Khởi tạo 1 JButton mới
        changeColorJButton = new JButton("Change Color");
        changeColorJButton.addActionListener(
              
        
            new ActionListener()
            {
            @Override
            public void actionPerformed(ActionEvent e) {
                color = JColorChooser.showDialog(
                ShowColor2JFrame.this, "Choose a Color", color);
                
                if (color != null) {
                    //Gán màu nền lại bằng màu User lựa chọn
                    colorJPanel.setBackground(color);
                }
                else{
                    //Nếu không chọn màu thì gán màu nền lại bằng màu xám
                    color = color.LIGHT_GRAY;
                    colorJPanel.setBackground(color);
                }
                }
            }
        );
        
        //Đưa colorJPanel về trung tâm
        add(colorJPanel, BorderLayout.CENTER);
        //Đưa changeColorJButton về phía dưới
        add(changeColorJButton, BorderLayout.SOUTH);
        
        //Điều chỉnh kích cở
        setSize(400, 130);
        //Định dạng
        setVisible(true);
    
    }   
}
