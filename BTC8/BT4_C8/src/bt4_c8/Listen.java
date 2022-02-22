/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4_c8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JTextArea;

/**
 *
 * @author PC
 */
public class Listen implements Runnable {
 ServerSocket serversocket;
    Socket s;
    JTextArea txtNoiDung;
   
    public Listen(ServerSocket serversocket, JTextArea txtNoiDung) {
        this.serversocket = serversocket;
        this.txtNoiDung = txtNoiDung;
    }

    
    public Socket getImcomingSocket() {
        return s;
    }
    @Override
    public void run() {
       try {
            s=serversocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); 
            Receive r=new Receive(in, txtNoiDung);
            Thread t=new Thread(r);
            t.start();
            
        } catch (IOException ex) {
            
    }
    
    }
}
