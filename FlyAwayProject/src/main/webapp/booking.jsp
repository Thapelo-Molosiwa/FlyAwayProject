<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FlyAway - Booking Details</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/styles.css">
</head>
<body>
    <header>
        <h1>FlyAway</h1>
    </header>
    <div class="container">
        <h2>Booking Details</h2>
        <table class="table">
            <tr>
                <th>Source</th>
                <td><%= request.getParameter("source") %></td>
            </tr>
            <tr>
                <th>Destination</th>
                <td><%= request.getParameter("destination") %></td>
            </tr>
            <tr>
                <th>Flight Date</th>
                <td><%= request.getParameter("date") %></td>
            </tr>
            <tr>
                <th>Passengers</th>
                <td><%= request.getParameter("passengers") %></td>
            </tr>
        </table>
        <form action="register" method="post">
            <input type="hidden" name="source" value="<%= request.getParameter("source") %>">
            <input type="hidden" name="destination" value="<%= request.getParameter("destination") %>">
            <input type="hidden" name="date" value="<%= request.getParameter("date") %>">
            <input type="hidden" name="passengers" value="<%= request.getParameter("passengers") %>">
            <button type="submit" class="btn-primary">Proceed to Register</button>
        </form>
    </div>
</body>
</html>
