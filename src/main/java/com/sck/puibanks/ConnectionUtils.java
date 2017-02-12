package com.sck.puibanks;

import java.sql.Connection;
import java.sql.SQLException;
 
public class ConnectionUtils {
 
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        return MySQLConnUtils.getMySQLConnection();
        //return SQLiteConnUtils_SQLJDBC.getSQLiteConnection_SQLJDBC();
    }
    
   public static void closeQuietly(Connection conn) {
       try {
           conn.close();
       } catch (Exception e) {
           
       }
   }
 
   public static void rollbackQuietly(Connection conn) {
       try {
           conn.rollback();
       } catch (Exception e) {
           
       }
   }
}
