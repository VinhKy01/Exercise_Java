/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

/**
 *
 * @author infov
 */
public class DT_KhachHang {
    private String mskh, ten,gioitinhString, diachi, ngaysinh, sdt;

    public String getGioitinhString() {
        return gioitinhString;
    }

    public String getMskh() {
        return mskh;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public DT_KhachHang(String mskh, String ten, String gioitinhString,String ngaysinh, String diachi,  String sdt) {
        this.mskh = mskh;
        this.ten = ten;
        this.gioitinhString = gioitinhString;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
    }

 
    
}
