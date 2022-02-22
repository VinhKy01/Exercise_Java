package testpanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestPanel extends javax.swing.JFrame{

    JFrame f = new JFrame("Test Panel");
    Graphics g;
    JPanel p = new JPanel();
    Thread animetionThread;
    int x = 0, y = 0;
    
    //ptkt
    public TestPanel(){
        creatPanel();
        g = p.getGraphics();
        p.paintComponents(g);  
        
    } 
    
    //tao khung panel
    void creatPanel() {       
        f.setSize(600, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setBackground(Color.white);       
        f.add(p);
        f.setVisible(true);
    }

    //ham viet animation
    void startMove(){
        animetionThread = new Thread(new Runnable() {
            @Override
            public void run() {  
                g.setColor(new Color(randInt(0, 255),randInt(0, 255),randInt(0, 255) ));
                while((0<=Math.abs(x) && Math.abs(x)<=550) && (0<=Math.abs(y) && Math.abs(y)<=550)){                    
                    g.fillOval(Math.abs(x++), Math.abs(y++), 50, 50);
                    
                    //gioi han khung chay cho hinh tron
                    if(x==535 || x==0){
                        x=-x;
                        g.setColor(new Color(randInt(0, 255),randInt(0, 255),randInt(0, 255) ));
                    }
                    if(y==310 || y==0){
                        y=-y;
                        g.setColor(new Color(randInt(0, 255),randInt(0, 255),randInt(0, 255) ));
                    }
                    
                    //delay
                    try{
                        Thread.sleep(1);
                        p.repaint();
                        Thread.sleep(10);
                    }catch(InterruptedException e){
                        System.err.println("" + e.getMessage());
                    }                   
                }
            }           
        }); 
        animetionThread.start();
    }
    
    //--------------main---------------------
    public static void main(String[] args) {
        TestPanel t = new TestPanel();
        t.startMove();
    } 
    
    //random
    int randInt(int min, int max){
        Random r = new Random();
        return r.nextInt(max - min)+min;
    }
}
