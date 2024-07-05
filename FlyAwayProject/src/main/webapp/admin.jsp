<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FlyAway Admin - Login</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/styles.css">
</head>
<body>
    <header>
        <h1>FlyAway Admin</h1>
    </header>
    <div class="container">
        <h2>Login</h2>
        <form action="adminLogin" method="post">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit" class="btn-primary">Login</button>
        </form>
    </div>
</body>
</html>
