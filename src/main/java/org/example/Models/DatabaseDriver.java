package org.example.Models;

import java.sql.*;

public class DatabaseDriver {
    private Connection conn;

    public DatabaseDriver() {
        try {
            this.conn = DriverManager.getConnection("jdbc:sqlite:mazebank.db");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
    * Client Section
    * */

    public ResultSet getClientData(String pAddress, String password) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery("select * from Clients where PayeeAddress='"+pAddress+"' and Password='"+password+"';");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    /*
     * Admin Section
     * */

    /*
     * Utility Section
     * */
}
