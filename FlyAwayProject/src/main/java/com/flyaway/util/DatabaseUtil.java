// src/main/java/com/flyaway/util/DatabaseUtil.java
package com.flyaway.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/flyaway";
    private static final String USER = "root";
    private static final String PASSWORD = "Zer014fx@96"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
