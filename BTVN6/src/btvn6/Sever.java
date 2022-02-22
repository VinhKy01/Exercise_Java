/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.PrintWriter;

/**
 *
 * @author Windows 10 Pro
 */
public class Sever {
    public static void main(String[] args) {
        
        try {
            ServerSocket sv = new ServerSocket(9999);
            int number = 0;
            while (true) {
                
                Socket incoming = sv.accept();
                System.out.println("Client: "+number++);
                

                BufferedReader in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
                PrintWriter out = new PrintWriter(incoming.getOutputStream(),true);

                out.println("Xin Chào");
                String output = in.readLine();
                System.out.println(output);
                incoming.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Sever.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
