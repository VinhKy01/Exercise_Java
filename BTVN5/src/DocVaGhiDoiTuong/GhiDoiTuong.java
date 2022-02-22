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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.processing.FilerException;

/**
 *
 * @author Windows 10 Pro
 */
public class GhiDoiTuong {
    public static void main(String[] args) {
        int soluong;
        try {
            ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("E://HocSinh.dat"));
            Scanner input = new Scanner(System.in);
            DoiTuongHocSinh[] nv = new DoiTuongHocSinh[200];
            soluong = input.nextInt();
            for (int i = 0; i < soluong; i++) {
                System.out.print("Nhập vào số lượng học sinh: ");
                System.out.print("Nhập vào mã học sinh: ");
                nv[i].maso = input.nextLine();
                System.out.print("Nhập vào họ tên: ");
                nv[i].hoten = input.nextLine();
                System.out.print("Nhập vào lớp: ");
                nv[i].lop = input.nextLine();
                System.out.print("Nhập vào điểm trung bình: ");
                nv[i].dtb = input.nextFloat();
                in.writeObject(nv[i]);
            }
            in.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GhiDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GhiDoiTuong.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
}