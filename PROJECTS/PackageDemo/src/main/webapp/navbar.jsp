<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Event Planning System</title>
    <style>
        body {
            margin: 0;
            font-family: 'Poppins', sans-serif;
        }

        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #C4A484;
            padding: 10px 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            position: sticky;
            top: 0;
            z-index: 1000;
        }

        .navbar a {
            color: white;
            text-decoration: none;
            padding: 10px 15px;
            font-weight: 500;
            font-size: 16px;
            transition: color 0.3s ease;
        }

        .navbar a:hover {
            color: #F4C2C2;
        }

        .navbar-right a {
            border: 1px solid #F4C2C2;
            border-radius: 20px;
            padding: 8px 15px;
            margin-left: 10px;
            transition: background-color 0.3s ease, color 0.3s ease;
        }

        .navbar-right a:hover {
            background-color: #F4C2C2;
            color: #333;
        }

        .navbar a.logo {
            font-size: 20px;
            font-weight: bold;
            letter-spacing: 2px;
        }
    </style>
</head>
<body>

    <div class="navbar">
        <a href="home.jsp" class="logo">EventPlanner</a>
        <div class="navbar-left">
            <a href="#about">About Us</a>
            <a href="#services">Services</a>
            <a href="Reservation.jsp">Booking</a>
            <a href="#reviews">Reviews</a>
            <a href="#contact">Contact</a>
        </div>
        <div class="navbar-right">
            <a href="#login">Login</a>
            <a href="#signup">Sign Up</a>
        </div>
    </div>

</body>
</html>
