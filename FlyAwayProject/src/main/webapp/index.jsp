<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FlyAway - Search Flights</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/styles.css">
</head>
<body>
    <header>
        <h1>FlyAway</h1>
    </header>
    <div class="container">
        <h2>Search Flights</h2>
        <form action="searchFlight" method="post">
            <div class="form-group">
                <label for="source">Source:</label>
                <input type="text" id="source" name="source" required>
            </div>
            <div class="form-group">
                <label for="destination">Destination:</label>
                <input type="text" id="destination" name="destination" required>
            </div>
            <div class="form-group">
                <label for="date">Date:</label>
                <input type="date" id="date" name="date" required>
            </div>
            <div class="form-group">
                <label for="passengers">Number of Passengers:</label>
                <input type="number" id="passengers" name="passengers" min="1" required>
            </div>
            <button type="submit" class="btn-primary">Search</button>
        </form>
    </div>
</body>
</html>
