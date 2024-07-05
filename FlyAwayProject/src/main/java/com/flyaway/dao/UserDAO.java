package com.flyaway.dao;

import com.flyaway.model.User;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class UserDAO {
    
    private Connection getConnection() throws SQLException {
        Properties properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("db.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        return DriverManager.getConnection(url, username, password);
    }

    public boolean registerUser(User user) {
        String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
        
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
