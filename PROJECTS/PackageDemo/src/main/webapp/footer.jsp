<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        body {
            margin: 0;
            font-family: 'Arial', sans-serif;
            background-color: #f0f0f0;
            color: #333;
        }

        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 20px;
            position: relative;
        }

        .social-icons {
            margin-top: 10px;
        }

        .social-icons a {
            color: white;
            font-size: 20px;
            margin: 0 10px;
        }

        .social-icons a:hover {
            color: #F4C2C2;
        }
        
       .contact-form {
            max-width: 600px;
            margin: 40px auto;
            padding: 30px;
            border-radius: 10px;
            background-color: #fff; /* White background for the form */
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1); /* Subtle shadow */
        }

        .contact-form h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
            font-size: 28px;
        }

        .contact-form label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
            color: #555; /* Dark gray for labels */
        }

        .contact-form input, 
        .contact-form textarea {
            width: 100%;
            padding: 12px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            transition: border-color 0.3s; /* Transition effect */
        }

        .contact-form input:focus, 
        .contact-form textarea:focus {
            border-color: #007BFF; /* Blue border on focus */
            outline: none; /* Remove default outline */
        }

        .contact-form button {
            width: 100%;
            background-color: #F4C2C2;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 18px;
            transition: background-color 0.3s; /* Transition effect */
        }

        .contact-form button:hover {
            background-color: #0056b3; /* Darker blue on hover */
        }

        @media (max-width: 768px) {
            .contact-form {
                padding: 20px;
            }

            .contact-form h2 {
                font-size: 24px;
            }
       </style>
</head>
<body>

        <footer>
        <p>&copy; 2024 Event Planner. All rights reserved.</p>
        <div class="social-icons">
            <a href="#"><i class="fab fa-facebook-f"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
            <a href="#"><i class="fab fa-linkedin-in"></i></a>
        </div>
    </footer>


</body>
</html>
