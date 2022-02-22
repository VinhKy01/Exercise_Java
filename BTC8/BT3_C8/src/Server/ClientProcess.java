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
   
    public static int countWordsUsingSplit(String input) { if (input == null || input.isEmpty()) { return 0; } String[] words = input.split("\\s+"); return words.length; }
    public void run() {
       try
        {
            String command  ;
            while(true){
                command=in.readLine();
                if(command.equalsIgnoreCase("Getstring")){
                    // yêu cầu nhập
                    out.println(" Làm ơn nhập chuỗi please:");
                    //doc chuoi từ client goi len
                    command=in.readLine();
                    
                    
                    char[] splitStr = command.toCharArray();
                    for(int i = 0; i < splitStr.length; i++) {
                       if(splitStr[i] >= 97 && splitStr[i] <= 122){
                         splitStr[i] -= 32;
                        }
                    }
                    command = String.valueOf(splitStr);
                    
                    //goi ket qua về client
                    out.println(command);
                    
                    
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
    
    

