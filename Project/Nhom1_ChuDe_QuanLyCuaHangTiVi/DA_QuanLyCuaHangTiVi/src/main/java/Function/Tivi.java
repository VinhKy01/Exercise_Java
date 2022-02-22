/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import DoiTuong.DT_NhanVien;
import DoiTuong.DT_Tivi;
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
public class Tivi {
    private static Tivi instance;

    public static Tivi Instance() {
        if (instance == null) {
            instance = new Tivi();
        }
        return instance;
    }

    public DefaultTableModel LoadTivi() {
        String query = "USP_KHO";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, null);
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

    public boolean ThemTivi(String masoString, String tenString, int hang, int kichthuoc, int gia, int baohanh, String tinhtrangString, int soluong) {
        String query = "USP_INSERTTIVI ?, ?, ?, ?, ?, ?, ?, ?";

        return DataProvider.Instance().ExcuteUpdate(query, new Object[]{masoString, tenString, hang,  kichthuoc, gia,baohanh, tinhtrangString, soluong});
    }

    public boolean xoaTivi(String masoString) {
        

        String query = "delete tivi where mstivi = ?";

        if (DataProvider.Instance().ExcuteUpdate(query, new Object[]{masoString})) {
            return true;
        }
        return false;
    }

    public boolean suaTivi(String maso, String masoString, String tenString, int hang, int gia, int kichthuoc, int baohanh, String tinhtrangString, int soluong){
        if(maso.equals(masoString)){
            DataProvider.Instance().ExcuteUpdate("USP_UPDATETIVI ?, ?, ?, ?, ?, ?, ?, ?", new Object[]{masoString, tenString, hang, gia, kichthuoc, baohanh, tinhtrangString, soluong});
            return true;
        }
        else{
            //them nv moi
            if(!Tivi.Instance().ThemTivi(masoString, tenString, hang, gia, kichthuoc, baohanh, tinhtrangString, soluong))
                return false;
            
            //update tai khoan
            if(!TTDonHang.Instance().UpdateTTDonHang(masoString))
                return false;
            
            //xoa nhanvien cu
            if(!Tivi.Instance().xoaTivi(maso))
                return false;
            
            return true;
        }
        
    }
    
    public boolean kiemTraTivi(String maso){
        ResultSet rs = DataProvider.Instance().ExcuteQuery("select * from Tivi where mstivi = ?", new Object[]{maso});
        
        try {
            if(rs.next())
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean setUndetedtedTV(int  id){
        if(DataProvider.Instance().ExcuteUpdate("update tivi set mshang = 1 where mshang = '"+id+"'", null))
            return true;
        return false;
    }
  
    public DT_Tivi getTVByID(String id) {
        DT_Tivi tv = null;

        String query = "select * from tivi where mstivi= ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{id});
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int column = rsmetadata.getColumnCount();

            while (rs.next()) {
                tv = new DT_Tivi(rs.getString("mstivi"), rs.getString("tentivi"), rs.getString("mshang"), rs.getInt("kichthuoc"), rs.getInt("gia"), rs.getInt("baohanh"), rs.getString("tinhtrang"), rs.getInt("soluong"));
            }

            return tv;

        } catch (SQLException ex) {
        }
        return tv;
    }
    
    
    
    public DT_Tivi getTVByName(String id) {
        DT_Tivi tv = null;

        String query = "select top 1 * from tivi where tentivi= ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{id});
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int column = rsmetadata.getColumnCount();

            while (rs.next()) {
                tv = new DT_Tivi(rs.getString("mstivi"), rs.getString("tentivi"), rs.getString("mshang"), rs.getInt("kichthuoc"), rs.getInt("gia"), rs.getInt("baohanh"), rs.getString("tinhtrang"), rs.getInt("soluong"));
            }

            return tv;

        } catch (SQLException ex) {
        }
        return tv;
    }
    
    public DT_Tivi getTVByGia(int gia) {
        DT_Tivi tv = null;

        String query = "select top 1 * from tivi where gia= ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{gia});
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int column = rsmetadata.getColumnCount();

            while (rs.next()) {
                tv = new DT_Tivi(rs.getString("mstivi"), rs.getString("tentivi"), rs.getString("mshang"), rs.getInt("kichthuoc"), rs.getInt("gia"), rs.getInt("baohanh"), rs.getString("tinhtrang"), rs.getInt("soluong"));
            }

            return tv;

        } catch (SQLException ex) {
        }
        return tv;
    }
    
    public boolean capNhatSLSP(String mstivi, int soluong){
        String query = "update tivi set soluong = soluong + ? where mstivi = ?";
        if(DataProvider.Instance().ExcuteUpdate(query, new Object[]{soluong, mstivi}))
            return true;
        return false;
    }
    
    public DefaultTableModel TimKiemTivi(String chuoi, String giatri) {
        String query = "select t.mstivi, t.tentivi, h.tenhang, t.kichthuoc, t.gia, t.tinhtrang, t.baohanh, t.soluong from tivi as t, HANGTIVI as h where t.mshang = h.mshang and t.mstivi != 'EROR (DELETED)' and "+chuoi+" like '%"+giatri+"%'";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, null);
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
