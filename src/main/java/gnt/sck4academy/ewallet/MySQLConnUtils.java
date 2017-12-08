package gnt.sck4academy.ewallet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
    public static Connection getMySQLConnection()
            throws ClassNotFoundException, SQLException {

        String hostName = "localhost";
        String dbName = "gnt_season2_wallet";
        String dbPort = "3306";
        String userName = "root";
        String password = "yourpassword";
        
        return getMySQLConnection(hostName, dbName, dbPort, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
            String dbPort, String userName, String password) throws SQLException,
            ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        String connectionURL = "jdbc:mysql://" + hostName + ":"+ dbPort +"/" + dbName;

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        return conn;
    }    
}
