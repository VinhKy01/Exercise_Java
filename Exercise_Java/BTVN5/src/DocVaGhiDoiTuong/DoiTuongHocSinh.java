/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocVaGhiDoiTuong;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Windows 10 Pro
 */
public class DoiTuongHocSinh implements Serializable{

    String maso, hoten, lop;
    float dtb;
    
    public DoiTuongHocSinh() {
    }
    
    
    public DoiTuongHocSinh(String maso, String hoten, String lop, float dtb) {
        this.maso = maso;
        this.hoten = hoten;
        this.lop = lop;
        this.dtb = dtb;
    }
    
    
    
    @Override
    public String toString() {
        return "Đối tượng nhân viên vừa đọc" + "\nHọ tên: "+ maso +"\nLuong: "+ hoten +" \nSố CMND: "+lop+" \nTuổi: "+dtb+"";
    }
}
