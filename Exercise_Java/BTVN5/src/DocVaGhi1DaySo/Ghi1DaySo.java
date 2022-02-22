/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocVaGhi1DaySo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
/**
 *
 * @author Windows 10 Pro
 */
public class Ghi1DaySo {
    public static void main(String[] args) {
        FileWriter fw = null;
        
        try {
            //Chọn file mà mình muốn ghi vào
            JFileChooser fChooser = new JFileChooser();
            File file;
            if(fChooser.showOpenDialog(fChooser)==JFileChooser.APPROVE_OPTION){
                file = fChooser.getSelectedFile();
                fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                Scanner input = new Scanner(System.in);
                System.out.print("Nhập vào số lượng: ");
                int n = input.nextInt();
                int number;
                for (int i = 0; i < n; i++) {
                    System.out.print("Nhập vào sô thứ "+(i+1)+": ");
                    number = input.nextInt();
                    bw.write(number + "  ");
                }
                bw.close();
                fw.close();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Ghi1DaySo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }
}
