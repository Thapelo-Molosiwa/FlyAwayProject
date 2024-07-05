package com.flyaway.servlets;

import com.flyaway.dao.FlightDAO;
import com.flyaway.model.Flight;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class FlightSearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String source = request.getParameter("source");
        String destination = request.getParameter("destination");

        FlightDAO flightDAO = new FlightDAO(null);
        List<Flight> flights = flightDAO.searchFlights(source, destination);

        request.setAttribute("flights", flights);
        request.getRequestDispatcher("results.jsp").forward(request, response);
    }
}
