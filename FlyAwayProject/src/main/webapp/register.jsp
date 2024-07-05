<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FlyAway - Register</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/styles.css">
</head>
<body>
    <header>
        <h1>FlyAway</h1>
    </header>
    <div class="container">
        <h2>Register for Flight</h2>
        <form action="confirmBooking" method="post">
            <input type="hidden" name="flightId" value="<%= request.getParameter("flightId") %>">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" id="firstName" name="firstName" required>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" id="lastName" name="lastName" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="phone">Phone:</label>
                <input type="text" id="phone" name="phone" required>
            </div>
            <button type="submit" class="btn-primary">Continue</button>
        </form>
    </div>
</body>
</html>
