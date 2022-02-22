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
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.RootPaneUI;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author infov
 */
public class TaiKhoan {
    private static TaiKhoan instance;

    public static TaiKhoan Instance() {
        if (instance == null) 
            instance = new TaiKhoan();
        return instance;
    }
    
    public int dangNhap(String userString, String passString){
        String query = "exec USP_LOGIN ? , ?";
        ResultSet res = DataProvider.Instance().ExcuteQuery(query, new Object[]{userString, passString});
        int loaitk = -1;
        try {
            while(res.next()){
                loaitk=res.getInt(1);
            }
        }
        catch(Exception ex) {

        }
        return loaitk;
    }
    
    public String getUser(){
        String user = "";
        String query = "select * from taikhoan where username = 'admin'";
        try {
            ResultSet rs = DataProvider.Instance().ExcuteQuery(query, null);
            
            if(rs.next()){
                user = rs.getString(3);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  user;
    }
        
    
    
    public boolean themTaiKhoan(String masoString){
        String query = "insert into taikhoan values (?, '123', '0', ?)";

        if(DataProvider.Instance().ExcuteUpdate(query, new Object[]{masoString, masoString})){
            {
                System.out.println("them thanh cong!");
                return true;
            }
        }
        else
          System.out.println("them thanh that bai!"); 
        return false;
    }
    
    public  boolean xoaTaiKhoan(String maso){
        String query = "delete taikhoan where username = ?";
        if(DataProvider.Instance().ExcuteUpdate(query, new Object[]{maso}))
        {
           return true;
        }
        return false;
    }
    
    public boolean suaTaiKhoan(String masomoi, String masocu){
        if(DataProvider.Instance().ExcuteUpdate("update TAIKHOAN set username = ?, masonv = ? where username = ?", new Object[]{masomoi, masomoi, masocu}))
            return true;
        return false;
    }
    
    public boolean doiMatKhau(String user, String password){
        if(DataProvider.Instance().ExcuteUpdate("update taikhoan set password = ? where username = ?", new Object[]{password, user}))
            return true;
        return false;
    }
    
    
}
