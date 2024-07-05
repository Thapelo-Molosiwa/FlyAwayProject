package com.flyaway.dao;

import com.flyaway.model.Flight;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class FlightDAO {
    
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

    public List<Flight> searchFlights(String source, String destination) {
        List<Flight> flights = new ArrayList<>();
        String sql = "SELECT * FROM flights WHERE source = ? AND destination = ?";
        
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, source);
            statement.setString(2, destination);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Flight flight = new Flight();
                flight.setId(resultSet.getInt("id"));
                flight.setSource(resultSet.getString("source"));
                flight.setDestination(resultSet.getString("destination"));
                flight.setAirline(resultSet.getString("airline"));
                flight.setSource(resultSet.getDouble("price"));
                flights.add(flight);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flights;
    }
}
