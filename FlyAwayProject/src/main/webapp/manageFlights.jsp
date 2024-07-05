<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.flyaway.model.Flight" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FlyAway - Manage Flights</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/styles.css">
</head>
<body>
    <header>
        <h1>FlyAway Admin</h1>
    </header>
    <div class="container">
        <h2>Manage Flights</h2>
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Source</th>
                    <th>Destination</th>
                    <th>Airline</th>
                    <th>Ticket Price</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    Object flightsObj = request.getAttribute("flights");
                    if (flightsObj != null && flightsObj instanceof List) {
                        List<Flight> flights = (List<Flight>) flightsObj;
                        for (Flight flight : flights) {
                %>
                <tr>
                    <td><%= flight.getId() %></td>
                    <td><%= flight.getSource() %></td>
                    <td><%= flight.getDestination() %></td>
                    <td><%= flight.getAirline() %></td>
                    <td><%= flight.getTicketPrice() %></td>
                </tr>
                <% 
                        }
                    } else {
                        // Handle case where flights are not found or not of expected type
                        // You can put an error message or handle it as per your application logic
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
