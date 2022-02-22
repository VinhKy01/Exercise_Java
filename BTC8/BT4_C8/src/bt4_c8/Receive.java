/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4_c8;

import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author PC
 */
public class Receive implements Runnable {
 BufferedReader in;
    JTextArea txtNoiDung;

    public Receive(BufferedReader in, JTextArea txtNoiDung) {
        this.in = in;
        this.txtNoiDung = txtNoiDung;
    }
    @Override
    public void run() {
         String noidung;
        try {
            while(true)
            {
                noidung=in.readLine();
                txtNoiDung.append("You: "+noidung+"\n");
            }
        } catch (IOException ex) {
        
        }
    }
    }
    

