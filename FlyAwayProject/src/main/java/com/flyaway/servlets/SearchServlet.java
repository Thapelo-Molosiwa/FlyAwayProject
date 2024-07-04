// src/main/java/com/flyaway/servlets/SearchServlet.java
package com.flyaway.servlets;

import com.flyaway.util.DatabaseUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String travelDate = request.getParameter("travelDate");
        int numPersons = Integer.parseInt(request.getParameter("numPersons"));

        try (Connection connection = DatabaseUtil.getConnection()) {
            String sql = "SELECT * FROM flights WHERE source = ? AND destination = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, source);
            statement.setString(2, destination);
            ResultSet resultSet = statement.executeQuery();

            // For simplicity, setting attribute for JSP to read and display results
            request.setAttribute("resultSet", resultSet);
            request.getRequestDispatcher("results.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
        }
    }
}
