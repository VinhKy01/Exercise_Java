/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author infov
 */
public class AutoID {

    private static AutoID instance;

    public static AutoID Instance() {
        if (instance == null) {
            instance = new AutoID();
        }
        return instance;
    }
    
    public String phatSinhIDNhanVien() {
        String id = "NARUTO";
        do {
            id = "NARUTO" + randInt(1000, 9999);   
        } while (NhanVien.Instance().kiemTraNV(id));
        return id;
    }
    
    public String phatSinhIDKhachHang() {
        String id = "SASUKE";
        do {
            id = "SASUKE"+ randInt(1000, 9999);   
        } while (NhanVien.Instance().kiemTraNV(id));
        return id;
    }

    public String phatSinhIDTivi() {
        String id = "TANJIRO";
        do {
            id = "TANJIRO"+ randInt(1000, 9999);   
        } while (NhanVien.Instance().kiemTraNV(id));
        return id;
    }

    public String phatSinhIDDonHang() {
        String id = "NEZUKO_";

        do {
            id = "NEZUKO_";
            String date = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
            id = id + date + "_"+ randInt(1000, 9999);   
        } while (NhanVien.Instance().kiemTraNV(id));
        return id;
    }

    int randInt(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }
}
