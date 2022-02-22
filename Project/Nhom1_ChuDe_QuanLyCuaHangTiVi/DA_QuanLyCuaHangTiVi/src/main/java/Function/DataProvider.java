/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author infov
 */
public class DataProvider {

    private static String DB_URL = "jdbc:sqlserver://DESKTOP-D05RLNC\\SQLEXPRESS:1433;databaseName=DTB_DOAN_JAVA_TEST";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "12345";

    public DataProvider() {
    }

    private static DataProvider instance;

    public static DataProvider Instance() {
        if (instance == null) {
            instance = new DataProvider();
        }
        return instance;
    }

    public ResultSet ExcuteQuery(String query, Object[] para) {
        ResultSet resultSet;
        Connection conn = null;
        try {
            // connnect to database 'testdb'
            conn = getConnection(DB_URL, USER_NAME, PASSWORD);

            PreparedStatement pst = conn.prepareStatement(query);

            if (para != null) {
                String temp;
                for (int i = 1; i <= para.length; i++) {
                    temp = para[i - 1].toString();
                    pst.setString(i, temp);
                }
            }

            // execute query
            resultSet = pst.executeQuery();
            // close connection
            //conn.close();
            
            return resultSet;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    public boolean ExcuteUpdate(String query, Object[] para) {
        try {
            // connnect to database 'testdb'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);

            // crate statement
            PreparedStatement pst = conn.prepareStatement(query);

            if (para != null) {
                String temp;
                for (int i = 1; i <= para.length; i++) {
                    temp = para[i - 1].toString();
                    pst.setString(i, temp);
                }
            }

            // execute update
            pst.executeUpdate();
            // close connection
            conn.close();

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static Connection getConnection(String dbURL, String userName, String password) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            //System.out.println("connect successfully!");
        } catch (Exception ex) {
            //System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    public void LoadCbb(JComboBox c, ResultSet rs) {
        c.removeAllItems();
        try {
            ResultSetMetaData rsmetadata = rs.getMetaData();
            int column = rsmetadata.getColumnCount();

            while (rs.next()) {
                c.addItem(rs.getString(1));
            }
        } catch (SQLException e) {
        }
        c.setSelectedIndex(0);
    }

}
