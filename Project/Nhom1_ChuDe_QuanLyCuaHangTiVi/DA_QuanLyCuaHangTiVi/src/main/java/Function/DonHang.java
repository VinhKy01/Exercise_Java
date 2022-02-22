/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import DoiTuong.DT_DonHang;
import DoiTuong.DT_KhachHang;
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
public class DonHang {
    private static DonHang instance;

    public static DonHang Instance() {
        if (instance == null) {
            instance = new DonHang();
        }
        return instance;
    }
    
    public String maDonTheoKH(String makh){
        String madon = "";
        String query = "select top 1 madonhang from donhang where makh = ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{makh});
            
            if(rs.next()){
                return madon = rs.getString("madonhang");
            }           
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  madon;  
    }
    
    public boolean ThemDonHang(String madonString, String ngaybanString, String makhString, String khuyenmaiString, String tongtienString, String manv){
        String quey = "insert into donhang values(?,?,?,?,?, ?)";
        if(DataProvider.Instance().ExcuteUpdate(quey, new Object[]{madonString, ngaybanString, makhString, khuyenmaiString, tongtienString, manv}))
            return true;
        return false;
    }
    
    public boolean XoaDonHang(String madon){
        //xoa don hang
        if(DataProvider.Instance().ExcuteUpdate("delete donhang where madonhang = ?", new Object[]{madon}))
            return true;
        return false;
    }
    
    public boolean CapNhatMaKH(String makhmoi, String makhcu){
        if(DataProvider.Instance().ExcuteUpdate("update donhang set makh = ? where makh = ?", new Object[]{makhmoi, makhcu}))
            return true;
        return true;
    }
    
    public boolean CapNhatMaNV(String makhmoi, String makhcu){
        if(DataProvider.Instance().ExcuteUpdate("update donhang set manv = ? where manv = ?", new Object[]{makhmoi, makhcu}))
            return true;
        return true;
    }
    
    public boolean checkIDDonHang(String id){
        String query = "select * from donhang where mahd = ?";
        ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{id});
        
        try {
            if(rs.next())
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public DefaultTableModel LoadDonHang(String day1, String day2) {
        String query = "select madonhang, ngayban, tenkh, khuyenmai, tongtien, hoten from donhang, KHACHHANG, NHANVIEN where makh = mskh and manv = msnv and ngayban > ? and ngayban < ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{day1, day2});
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
    
    
    public DT_DonHang getDonHang(String id) {
        DT_DonHang kh = null;

        String query = "select * from donhang where madonhang  = ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{id});
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int column = rsmetadata.getColumnCount();

            while (rs.next()) {
                kh = new DT_DonHang(rs.getString("madonhang"), rs.getString("ngayban"), rs.getString("makh"), rs.getInt("khuyenmai"), rs.getLong("tongtien"), rs.getString("manv"));
            }

            return kh;

        } catch (SQLException ex) {
        }
        return kh;
    }
}
