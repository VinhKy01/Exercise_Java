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
public class DT_DonHang {
    String iddonhang, msnv, mskh, ngayban;
    int khuyenmai;
    long tongtien;

    public DT_DonHang(String iddonhang,String ngayban,   String mskh, int khuyenmai, long tongtien,String msnv) {
        this.iddonhang = iddonhang;
        this.msnv = msnv;
        this.mskh = mskh;
        this.ngayban = ngayban;
        this.khuyenmai = khuyenmai;
        this.tongtien = tongtien;
    }

    public String getNgayban() {
        return ngayban;
    }

    public String getIddonhang() {
        return iddonhang;
    }

    public String getMsnv() {
        return msnv;
    }

    public String getMskh() {
        return mskh;
    }

    public int getKhuyenmai() {
        return khuyenmai;
    }

    public long getTongtien() {
        return tongtien;
    }


    
}
