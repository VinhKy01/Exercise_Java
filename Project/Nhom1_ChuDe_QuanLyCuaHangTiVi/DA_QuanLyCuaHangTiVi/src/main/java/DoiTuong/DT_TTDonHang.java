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
public class DT_TTDonHang {
    String masp, iddonhang;
    int soluong;

    public String getMasp() {
        return masp;
    }

    public String getIddonhang() {
        return iddonhang;
    }

    public int getSoluong() {
        return soluong;
    }

    public DT_TTDonHang(String iddonhang, String masp, int soluong) {
        this.masp = masp;
        this.iddonhang = iddonhang;
        this.soluong = soluong;
    }
    
}
