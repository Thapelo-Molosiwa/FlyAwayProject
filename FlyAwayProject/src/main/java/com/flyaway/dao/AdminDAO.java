package com.flyaway.dao;

import java.io.InputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.flyaway.model.Admin;

public class AdminDAO {

    // Method to get database connection
    private Connection getConnection() throws SQLException {
        Properties properties = new Properties();
        
        // Load properties file
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find db.properties");
                return null;
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retrieve database connection details
        String url = properties.getProperty("db.url");
        String user = properties.getProperty("db.user");
        String password = properties.getProperty("db.password");

        // Establish connection
        return DriverManager.getConnection(url, user, password);
    }

	public Admin login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

    // Other DAO methods like addFlight, updateFlight, deleteFlight, etc.
}
