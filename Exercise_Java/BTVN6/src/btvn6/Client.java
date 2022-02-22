/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows 10 Pro
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket sk = new Socket("192.168.0.107", 9999);
            BufferedReader in = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            PrintWriter out = new PrintWriter(sk.getOutputStream(),true);
            
            String output = in.readLine();
            System.out.println(output);
            Random r = new Random();
            out.println("Tôi là Client "+r.nextInt());
            
            sk.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
