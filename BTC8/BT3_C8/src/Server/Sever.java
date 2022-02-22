/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Sever {

    
    public static void main(String[] args) {
        try {
            ServerSocket s=new ServerSocket(9999);
            
            
            while(true)
            {
            Socket incoming=s.accept();           
            System.out.println("Client connected");
              
                ClientProcess p =new ClientProcess(incoming);
                Thread t =new Thread(p);
                t.start();
          }
            
            
        } catch (IOException ex) {
            
        }
    }
    
}
