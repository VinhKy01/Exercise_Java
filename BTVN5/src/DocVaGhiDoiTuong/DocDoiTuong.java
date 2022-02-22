/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocVaGhiDoiTuong;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows 10 Pro
 */
public class DocDoiTuong {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("E://HocSinh.dat"));
            
            DoiTuongHocSinh nv = (DoiTuongHocSinh) in.readObject();
            System.out.println(nv.toString());
            
            in.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GhiDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GhiDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
}
