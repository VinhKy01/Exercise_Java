/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author infov
 */
public class ThuongHieu {
    private static ThuongHieu instance;

    public static ThuongHieu Instance() {
        if (instance == null) {
            instance = new ThuongHieu();
        }
        return instance;
    }
    
    public int getIDHang(String tenhang){
        int id = 0;
        String query = "select mshang from hangtivi where tenhang = ?";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, new Object[]{tenhang});
            
            if(rs.next()){
                id = rs.getInt("mshang");
            }           
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  id;
    }
    
    public DefaultTableModel LoadListTH(){
        String query = "select * from hangtivi where mshang != 1";
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
    
    public DefaultTableModel TimKiemTH(String ten){
        String query = "select * from hangtivi where mshang != 1 and tenhang like '%"+ten+"%'";
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
    
    public boolean ThemTH(String tenthString){
        if(DataProvider.Instance().ExcuteUpdate("insert into hangtivi values (?)", new Object[]{tenthString}))
            return true;
        return false;
    }
    
    public boolean XoaTH(int id){
        //update tivi luon
        Tivi.Instance().setUndetedtedTV(id);
        
        //xoa th
        if(DataProvider.Instance().ExcuteUpdate("delete hangtivi where mshang = '"+id+"'", null))
            return true;
        return false;
    }
    
    public boolean SuaTH(String oldname, String name){
        if(DataProvider.Instance().ExcuteUpdate("update hangtivi set tenhang = ? where tenhang = ?", new Object[]{name, oldname}))
            return true;
        return false;
    }


}
