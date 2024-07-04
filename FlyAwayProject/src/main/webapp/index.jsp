<!-- src/main/webapp/index.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>FlyAway - Search Flights</title>
</head>
<body>
    <h1>FlyAway - Book Your Flight</h1>
    <form action="search" method="post">
        <label for="source">Source:</label>
        <input type="text" id="source" name="source" required><br><br>
        
        <label for="destination">Destination:</label>
        <input type="text" id="destination" name="destination" required><br><br>
        
        <label for="travelDate">Date of Travel:</label>
        <input type="date" id="travelDate" name="travelDate" required><br><br>
        
        <label for="numPersons">Number of Persons:</label>
        <input type="number" id="numPersons" name="numPersons" min="1" required><br><br>
        
        <input type="submit" value="Search Flights">
    </form>
</body>
</html>
