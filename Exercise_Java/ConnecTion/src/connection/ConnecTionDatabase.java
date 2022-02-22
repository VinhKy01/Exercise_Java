/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author infov
 */
public class ConnecTionDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conn;
        var server = "DESKTOP-D05RLNC\\SQLEXPRESS";
        var user = "sa";
        var password = "12345";
        var dtb = "JVS_QLTV";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName(server);
        ds.setPortNumber(port);
        try {
            conn = (Connection) ds.getConnection();
            System.out.println("Kết nối với SQLServer thành công");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
