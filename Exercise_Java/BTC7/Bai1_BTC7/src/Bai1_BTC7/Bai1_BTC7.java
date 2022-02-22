/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1_BTC7;

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
public class Bai1_BTC7 {

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
        if (count == 0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here           
        int r;
        
        BufferedWriter sonn, sont;
        try {    
            sonn = new BufferedWriter(new FileWriter("sonn.dat"));  
            sont = new BufferedWriter(new FileWriter("sont.dat"));
            //thiet ke vong lap, phat sinh r
            for (int i = 0; i < 100; i++) {
                r = RandInt(0, 100);
                if(KTSoNT(r) == true)
                {
                    sont.write(r+" ");
                }
                sonn.write(r+" ");
            }
            System.out.println("Ghi tap tin sonn.dat thanh cong");
            sont.close();
            sonn.close();
        } catch (IOException ex) { 
        }
    }    
}
