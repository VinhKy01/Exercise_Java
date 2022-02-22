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
public class DT_Tivi {
    private String mstivi,tentivi,mshang, tinhtrang;
    private int kichthuoc, gia, baohanh, soluong;

    public DT_Tivi(String mstivi, String tentivi, String mshang, int kichthuoc, int gia, int baohanh, String tinhtrang, int soluong) {
        this.mstivi = mstivi;
        this.tentivi = tentivi;
        this.mshang = mshang;
        this.tinhtrang = tinhtrang;
        this.kichthuoc = kichthuoc;
        this.gia = gia;
        this.baohanh = baohanh;
        this.soluong = soluong;
    }

    public String getMstivi() {
        return mstivi;
    }

    public String getTentivi() {
        return tentivi;
    }

    public String getMshang() {
        return mshang;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public int getKichthuoc() {
        return kichthuoc;
    }

    public int getGia() {
        return gia;
    }

    public int getBaohanh() {
        return baohanh;
    }

    public int getSoluong() {
        return soluong;
    }
}
