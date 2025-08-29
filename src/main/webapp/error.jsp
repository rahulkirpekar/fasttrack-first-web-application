<%@ page isErrorPage="true" contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            color: #333;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }
        .error-container {
            background: #fff;
            padding: 30px 50px;
            border-radius: 12px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
            max-width: 600px;
            text-align: center;
        }
        h1 {
            color: #d9534f;
            margin-bottom: 15px;
        }
        .error-details {
            background-color: #f9d6d5;
            color: #b52b27;
            padding: 10px;
            border-radius: 8px;
            word-wrap: break-word;
            font-size: 14px;
            margin-top: 10px;
            text-align: left;
        }
        a {
            display: inline-block;
            margin-top: 15px;
            text-decoration: none;
            background-color: #0275d8;
            color: #fff;
            padding: 10px 20px;
            border-radius: 6px;
            transition: background 0.3s;
        }
        a:hover {
            background-color: #025aa5;
        }
    </style>
</head>
<body>
    <div class="error-container">
        <h1>Oops! Something went wrong</h1>
        <p>Sorry, the following exception occurred:</p>
        <div class="error-details">
            <%= exception %>
        </div>
        <a href="index.jsp">Go Back to Home</a>
    </div>
</body>
</html>
