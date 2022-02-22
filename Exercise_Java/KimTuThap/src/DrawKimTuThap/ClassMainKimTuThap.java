package DrawKimTuThap;

import javax.swing.JFrame;

public class ClassMainKimTuThap {

    public static void main(String[] args) {

        JFrame KimTuThap = new JFrame("Kim Tu Thap");
        KimTuThap.setSize(500, 500);
        KimTuThap.setLocationRelativeTo(null);
        KimTuThap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawKTT ktt = new DrawKTT();
        KimTuThap.add(ktt);
        KimTuThap.setVisible(true);

    }

}
