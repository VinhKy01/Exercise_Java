/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2_BTC7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author infov
 */
public class Bai2_BTC7 {

    /**
     * @param args the command line arguments
     */
    
    public static int RandInt(int min, int max)
        {
            Random r = new Random();
            return r.nextInt(max-min)+min;
        }
    
    public static Boolean KTSoNT(int r)
    {
        int count = 0;
        for (int i = 2; i < r; i++) {
            if (r % i == 0)
                count++; 
        }
        if (count == 2)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here           
        
        int r;
        
        BufferedWriter bw, bw1;
        try {    
            bw = new BufferedWriter(new FileWriter("even.dat"));  
            bw1 = new BufferedWriter(new FileWriter("odd.dat"));
            //thiet ke vong lap, phat sinh r
            for (int i = 0; i < 100; i++) {
                r = RandInt(0, 100);
                if(r % 2 == 0)
                    bw.write(r+" ");
                else
                    bw1.write(r+" ");
            }
            System.out.println("Ghi tap tin sonn.dat thanh cong");
            bw.close();
            bw1.close();
        } catch (IOException ex) { 
        }
    }    
}
