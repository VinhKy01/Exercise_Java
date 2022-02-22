/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class ClientProcess implements Runnable{
 Socket incoming;
    BufferedReader in ;
    PrintWriter out;
    public ClientProcess(Socket incoming) {
     
        try {
            this.incoming = incoming;

            in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
            out=new PrintWriter(incoming.getOutputStream(),true);
        } catch (IOException ex) {
            
        }
      
    }
    @Override
    public void run() {
       try
        {
            while(true){
                String command=in.readLine();
                if(command.equalsIgnoreCase("GetTime")){
                    SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss");
                    Date date = new Date(System.currentTimeMillis());
                    out.println(formatter.format(date));
                }
                else if(command.equalsIgnoreCase("GetDate")){
                    SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date(System.currentTimeMillis());
                    out.println(formatter.format(date));          
                }
                else if(command.equalsIgnoreCase("quit")){                    
                    out.println("Bye"); break;
                }
                else{
                    out.println("Unkown command");
                }
            } 
            System.out.println("Client disconnected");
            incoming.close();
        }
        catch(IOException ex)
        {
            
        }
    }
    }
    
    

