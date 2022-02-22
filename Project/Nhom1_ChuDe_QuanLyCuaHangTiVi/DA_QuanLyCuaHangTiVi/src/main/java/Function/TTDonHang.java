/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import DoiTuong.DT_TTDonHang;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author infov
 */
public class TTDonHang {
    private static TTDonHang instance;

    public static TTDonHang Instance() {
        if (instance == null) {
            instance = new TTDonHang();
        }
        return instance;
    }
    
    public boolean UpdateTTDonHang(String maspString){
        if(DataProvider.Instance().ExcuteUpdate("update ttdonhang set masp = ? where masp = ?", new Object[]{maspString, maspString}))
            return true;
        return false;
    }
    
    public boolean capNhatSanPhamBiXoa(String masp){
        try{
            if(DataProvider.Instance().ExcuteUpdate("exec USP_UPDATETIVIEROR ?", new Object[]{masp}))
                return true;
        }catch(Exception ex){}
        return true;
    }
    
    public boolean XoaTTDonHang(String madonhang){
        if(DataProvider.Instance().ExcuteUpdate("delete ttdonhang where iddonhang = ?", new Object[]{madonhang}))
            return true;
        return false;
    }
    
    public boolean ThemTTDonHang(String masp, String iddonhangString, int sluong){
        String query = "insert into ttdonhang values(?, ? ,?)";
        if(DataProvider.Instance().ExcuteUpdate(query, new Object[]{masp, iddonhangString, sluong}))
            return true;
        return false;
    }
    
    public boolean ktraSPTrongDonHang(String mstivi, String iddonhang){
        String query = "select * from ttdonhang  where masp = ? and iddonhang  = ?";
        ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{mstivi, iddonhang});
        
        try {
            if(rs.next())
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean BoSungSoLuong(String mstivi, int soluong){
        String query = "update ttdonhang set soluong = soluong + ? WHERE masp = ?";
        if(DataProvider.Instance().ExcuteUpdate(query, new Object[]{soluong, mstivi}))
            return true;
        return false;
    }
    
    public int getSoLuongSP(String iddonhang, String masp){
        String query = "select soluong from ttdonhang where iddonhang = ? and masp = ?";
        int kq = 0;
        ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{iddonhang, masp});
        
        try {
            if(rs.next())
                return kq = rs.getInt("soluong");
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    public boolean capNhatSL(String iddonhang, String masp, int soluong ){
        String query = "update ttdonhang set soluong = ? where iddonhang = ? and masp = ?";
        if(DataProvider.Instance().ExcuteUpdate(query, new Object[]{soluong, iddonhang, masp}))
            return true;
        return false;
    }
    
    public boolean xoaSanPham(String masp, String iddonhang){
        String query = "delete ttdonhang where iddonhang = ? and masp = ?";
        if(DataProvider.Instance().ExcuteUpdate(query, new Object[]{iddonhang, masp}))
            return true;
        return false;
    }
    
    public DefaultTableModel LoadDSSP(String iddonhang){
        String query = "select mstivi, tentivi, gia, tt.soluong, gia*tt.soluong as thanhtien  from tivi, TTDONHANG as tt where mstivi = masp and  iddonhang = ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{iddonhang});
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int column = rsmetadata.getColumnCount();

            DefaultTableModel data = new DefaultTableModel();

            Vector column_name = new Vector();
            Vector data_row = new Vector();

            for (int i = 1; i <= column; i++) {
                column_name.addElement(rsmetadata.getColumnName(i));
            }
            data.setColumnIdentifiers(column_name);

            while (rs.next()) {
                data_row = new Vector();
                for (int j = 1; j <= column; j++) {
                    data_row.addElement(rs.getString(j));
                }
                data.addRow(data_row);
            }
            return data;
        } catch (SQLException ex) {
        }
        return null;
        
    }
    
    public DefaultTableModel LoadChiTiet(String iddonhang) {
        String query = "select t.masp, v.tentivi, h.tenhang, v.kichthuoc, v.tinhtrang,  t.soluong, v.gia  from TTDONHANG as T, TIVI as V, HANGTIVI as H  where masp = mstivi and v.mshang = h.mshang and iddonhang =  ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{iddonhang});
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int column = rsmetadata.getColumnCount();

            DefaultTableModel data = new DefaultTableModel();

            Vector column_name = new Vector();
            Vector data_row = new Vector();

            for (int i = 1; i <= column; i++) {
                column_name.addElement(rsmetadata.getColumnName(i));
            }
            data.setColumnIdentifiers(column_name);

            while (rs.next()) {
                data_row = new Vector();
                for (int j = 1; j <= column; j++) {
                    data_row.addElement(rs.getString(j));
                }
                data.addRow(data_row);
            }
            return data;
        } catch (SQLException ex) {
        }
        return null;
    } 

    
}
