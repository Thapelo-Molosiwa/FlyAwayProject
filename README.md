# FlyAwayProject

FlyAwayProject is an airline booking portal enabling users to search and book flights, with an admin interface for managing flight information.

## Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Project Structure](#project-structure)
- [Database Setup](#database-setup)
- [Running the Application](#running-the-application)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

FlyAwayProject provides a user-friendly interface for booking airline tickets, including:
- Flight search form on the homepage.
- Display of available flights with ticket prices.
- Booking process with user registration and dummy payment gateway.
- Admin backend for managing flight details and master lists of places and airlines.

## Technologies Used

- **Java 17**: Backend development.
- **Jakarta Servlet 5.0**: Web request handling.
- **Jakarta JSP 3.1**: Dynamic web pages.
- **MySQL**: Database for storing flight data.
- **Maven**: Build and dependency management.
- **Tomcat 10.1**: Web server.
- **Eclipse**: Integrated Development Environment (IDE).

## Setup Instructions

### Prerequisites

- Java 17 installed.
- Eclipse IDE with Maven integration.
- Apache Tomcat 10.1 server.
- MySQL server installed and running.

### Configuration

#### 1. **Database Configuration**

Create a `db.properties` file in `src/main/resources` with the following content:

```properties
db.url=jdbc:mysql://localhost:3306/flyawaydb
db.username=root
db.password=rootpassword
