/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidumouselistener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author MyPC
 */
public class Mypanel extends JPanel implements MouseListener{
        @Override
        protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.
        grphcs.drawImage(img, 0, 0, this);
        }
        BufferedImage img;
        int x1=-1,y1=-1,x2=-1,y2=-1;
        Graphics g;
        public Mypanel()
        {
        img=new BufferedImage( 600, 400,BufferedImage.TYPE_INT_RGB);
        img.createGraphics();
        g=img.getGraphics();
        g.clearRect(0, 0, 600, 400);
        }
        @Override
        public void mouseClicked(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //JOptionPane.showMessageDialog(this, me.getX()+","+me.getY());
        }

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        @Override
        public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        if(me.getButton() == me.BUTTON1)
//        {
//        JOptionPane.showMessageDialog(this, "Bạn đã nhấn chuột trái");
//        }
//        else if(me.getButton() == me.BUTTON3)
//        {
//        JOptionPane.showMessageDialog(this, "Bạn đã nhấn chuột phải");
//        }
        }
        @Override
    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(x1==-1&&y1==-1){
            x1=me.getX();
            y1=me.getY();
        }
        else{
            x2=me.getX();
            y2=me.getY();
            g.setColor(Color.yellow);
            g.drawLine(x1, y1, x2, y2);
            this.repaint();
            this.invalidate();
            x1=y1=x2=y2=-1;
        }
    }
    @Override
    public void mouseEntered(MouseEvent me) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void mouseExited(MouseEvent me) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
