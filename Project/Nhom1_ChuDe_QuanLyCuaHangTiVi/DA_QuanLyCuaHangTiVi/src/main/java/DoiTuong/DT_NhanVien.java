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
public class DT_NhanVien {
    private String maso, hoten,gioitinh,diachi, ngaysinh, sdt;
    private int luong;
    private float hsluong;

    public DT_NhanVien(String maso, String hoten, String gioitinh, String diachi, String ngaysinh, String sdt, int luong, float hsluong) {
        this.maso = maso;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.luong = luong;
        this.hsluong = hsluong;
    }

    public String getMaso() {
        return maso;
    }

    public String getHoten() {
        return hoten;
    }

    public String getGioitinh() {
        return gioitinh;
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

    public int getLuong() {
        return luong;
    }

    public float getHsluong() {
        return hsluong;
    }
    
}
