<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<!DOCTYPE html>
<html>
<head>
    <title>Flight Results</title>
</head>
<body>
    <h1>Flight Results</h1>
    <table border="1">
        <tr>
            <th>Airline</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Departure Time</th>
            <th>Arrival Time</th>
            <th>Price</th>
        </tr>
        <%
            ResultSet resultSet = (ResultSet) request.getAttribute("resultSet");
            if (resultSet != null) {
                try {
                    while (resultSet.next()) {
        %>
        <tr>
            <td><%= resultSet.getString("airline") %></td>
            <td><%= resultSet.getString("source") %></td>
            <td><%= resultSet.getString("destination") %></td>
            <td><%= resultSet.getTime("departure_time") %></td>
            <td><%= resultSet.getTime("arrival_time") %></td>
            <td><%= resultSet.getDouble("price") %></td>
        </tr>
        <%
                    }
                } catch (SQLException e) {
                    e.printStackTrace(out);
                }
            } else {
        %>
        <tr>
            <td colspan="6">No flights found or error occurred</td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
