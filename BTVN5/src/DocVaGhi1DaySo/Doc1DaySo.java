/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocVaGhi1DaySo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Windows 10 Pro
 */
public class Doc1DaySo {
    public static void main(String[] args) {
        try {
            JFileChooser fChooser = new JFileChooser();
            File file;
            if(fChooser.showOpenDialog(fChooser)==JFileChooser.APPROVE_OPTION){
                file = fChooser.getSelectedFile();
                
                Scanner input = new Scanner(file);
                int number;
                System.out.print("Dãy số vừa đọc là: ");
                while(input.hasNextInt()){
                    number=input.nextInt();
                    System.out.print(number + "  ");
                }
                input.close();
            }   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Doc1DaySo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
