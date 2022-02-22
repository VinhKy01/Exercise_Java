/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

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
public class KhachHang {

    private static KhachHang instance;

    public static KhachHang Instance() {
        if (instance == null) {
            instance = new KhachHang();
        }
        return instance;
    }

    public DefaultTableModel LoadKhachHang() {
        String query = "select * from khachhang where mskh != 'deleted'";
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

    public boolean ThemKhachHang(String masoString, String tenString, String gioitinhString, String ngaysinhString, String diachiString, String sdtString) {
        String query = "exec USP_THEMKHACHHANG ?, ?, ?, ?, ?, ?";

        if (DataProvider.Instance().ExcuteUpdate(query, new Object[]{masoString, tenString, gioitinhString, ngaysinhString, diachiString, sdtString})) {
            return true;
        }

        return false;
    }

    public boolean XoaKHVaHD(String makh) {
        String madon = DonHang.Instance().maDonTheoKH(makh);
        while (!"".equals(madon)){
            

            //xoa ttdonhang truoc tien
            TTDonHang.Instance().XoaTTDonHang(madon);

            try{
            //xoa DH
            DonHang.Instance().XoaDonHang(madon);
            }catch(Exception e){}

            //lay ma don hang tuong ung
            madon = DonHang.Instance().maDonTheoKH(makh);
        } 
        //xoa kh
        if (DataProvider.Instance().ExcuteUpdate("delete Khachhang where mskh = ?", new Object[]{makh})) {
            return true;
        }
        return false;
    }

    public boolean XoaKH(String maso) {
        if (DataProvider.Instance().ExcuteUpdate("delete khachhang where mskh = ?", new Object[]{maso})) {
            return true;
        }
        return false;
    }

    public boolean SuaKH(String maso, String masoString, String tenString, String gioitinhString, String ngaysinhString, String diachiString, String sdtString) {
        if (maso.equals(masoString)) {
            DataProvider.Instance().ExcuteUpdate("exec SuaKH ?,?,?,?,?,?", new Object[]{masoString, tenString, gioitinhString, ngaysinhString, diachiString, sdtString});
            return true;
        } else {
            //them kh moi
            if (!KhachHang.Instance().ThemKhachHang(masoString, tenString, gioitinhString, ngaysinhString, diachiString, sdtString)) {
                return false;
            }

            //update don hang
            if (!DonHang.Instance().CapNhatMaKH(masoString, maso)) {
                return false;
            }

            //xoa kh cu
            if (!KhachHang.Instance().XoaKH(maso)) {
                return false;
            }

            return true;
        }
    }

    //
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

    public DefaultTableModel TimKiemKH(String chuoi, String giatri) {
        String query = "select * from khachhang where mskh != 'deleted' and " + chuoi + " like '%" + giatri + "%'";
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
