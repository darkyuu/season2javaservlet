package com.sck.puibanks;

import  java.sql.Connection;
import  java.sql.SQLException;
import  java.sql.DriverManager;

import  org.sqlite.JDBC;

public class SQLiteConnUtils_SQLJDBC {
    public static Connection getSQLiteConnection_SQLJDBC()
        throws ClassNotFoundException, SQLException {
      
        String pathName = "src/main/resources/";
        String databaseName = "PuiBank.db";
         
        return getSQLiteConnection_SQLJDBC(pathName, databaseName);
    }
 
    private static Connection getSQLiteConnection_SQLJDBC(String pathName,
        String databaseName) throws ClassNotFoundException, SQLException {
        
        Class.forName("org.sqlite.JDBC");
        String connectionURL = "jdbc:sqlite:" + pathName + databaseName;
        Connection conn = DriverManager.getConnection(connectionURL);
     
        return conn;
    }
}
