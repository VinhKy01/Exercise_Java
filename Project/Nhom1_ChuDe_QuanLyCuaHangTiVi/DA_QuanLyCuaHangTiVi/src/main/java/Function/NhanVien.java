/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import DoiTuong.DT_KhachHang;
import DoiTuong.DT_NhanVien;
import java.sql.Date;
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
public class NhanVien {

    private static NhanVien instance;

    public static NhanVien Instance() {
        if (instance == null) {
            instance = new NhanVien();
        }
        return instance;
    }

    public DefaultTableModel LoadNhanVien() {
        String query = "select * from nhanvien where msnv != 'master' and msnv != 'deleted'";
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

    public boolean ThemNV(String masonvString, String tenString, String gioitinhString, String diachiString, String ngaysinhDate, String sdtString, int Luong, float HSLuong) {
        String query = "Insert into nhanvien values (?, ?, ?, ?, ?, ?, ?, ?)";

        return DataProvider.Instance().ExcuteUpdate(query, new Object[]{masonvString, tenString, gioitinhString, diachiString, ngaysinhDate, sdtString, Luong, HSLuong});
    }

    public boolean xoaNhanVien(String masoString) {
        //sửa khóa bên đon hàng
        DonHang.Instance().CapNhatMaNV("deleted",masoString);
        //xóa nhân viên
        String query = "delete nhanvien where msnv = ?";

        if (DataProvider.Instance().ExcuteUpdate(query, new Object[]{masoString})) {
            return true;
        }
        return false;
    }

    public boolean suaNhanVien(String maso, String masonvString, String tenString, String gioitinhString, String diachiString, String ngaysinhDate, String sdtString, int Luong, float HSLuong){
        if(maso.equals(masonvString)){
            DataProvider.Instance().ExcuteUpdate("exec USP_SUANV ?,?,?,?,?,?,?,?", new Object[]{masonvString, tenString, gioitinhString, diachiString, ngaysinhDate, sdtString, Luong, HSLuong});
            return true;
        }
        else{
            //them nv moi
            if(!NhanVien.Instance().ThemNV(masonvString, tenString, gioitinhString, diachiString, ngaysinhDate, sdtString, Luong, HSLuong))
                return false;
            
            //update tai khoan + donhang
            if(!TaiKhoan.Instance().suaTaiKhoan(masonvString, maso))
                return false;
            if(!DonHang.Instance().CapNhatMaNV(masonvString, maso))
                return false;
            //xoa nhanvien cu
            if(!NhanVien.Instance().xoaNhanVien(maso))
                return false;
            
            return true;
        }
        
    }
    
    public boolean kiemTraNV(String maso){
        ResultSet rs = DataProvider.Instance().ExcuteQuery("select * from nhanvien where msnv = ?", new Object[]{maso});
        
        try {
            if(rs.next())
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    public DT_NhanVien getNVByID(String id) {
        DT_NhanVien nv = null;

        String query = "select * from nhanvien where msnv  = ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{id});
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int column = rsmetadata.getColumnCount();

            while (rs.next()) {
                nv = new DT_NhanVien(rs.getString("msnv"), rs.getString("hoten"), rs.getString("gioitinh"), rs.getString("diachi"), rs.getString("namsinh"), rs.getString("sdt"), rs.getInt("luongcoban"), rs.getFloat("hesoluong"));
            }

            return nv;

        } catch (SQLException ex) {
        }
        return null;
    }
    
        public DT_KhachHang getKHByID(String id) {
        DT_KhachHang kh = null;

        String query = "select * from khachhang where mskh  = ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{id});
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int column = rsmetadata.getColumnCount();

            while (rs.next()) {
                kh = new DT_KhachHang(rs.getString("mskh"), rs.getString("tenkh"), rs.getString("gioitinh"), rs.getString("namsinh"), rs.getString("diachi"), rs.getString("sdt"));
            }

            return kh;

        } catch (SQLException ex) {
        }
        return kh;
    }
    
    public DefaultTableModel TimKiemNV(String chuoi, String giatri) {
        String query = "select * from nhanvien where msnv != 'master' and "+chuoi+" like '%"+giatri+"%'";
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
