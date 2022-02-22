/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Client {
     public static void main(String[] args) {
         try {
             Socket s=new Socket("127.0.0.1", 9999);
             System.out.println("Connected");
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out=new PrintWriter(s.getOutputStream(),true);
            Scanner sc=new Scanner(System.in);
            
            while(true)
            {
            //đọc lệnh từ bàn phím
            String commmand=sc.nextLine();
       
            //gởi lệnh lên server
            out.println(commmand);
            
            //chờ và nhận kết quả từ server
            String result=in.readLine();
            
            //in kết quả
            System.out.println(result);
            if(commmand.equalsIgnoreCase("quit"))
                break;
            }
            
            System.out.println("Disconnected");
            s.close();
         } catch (IOException ex) {
            
         }
     }
}
