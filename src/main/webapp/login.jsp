<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login - AMart</title>
    <link rel="stylesheet" href="assets/bootstrap.min.css">
</head>
<body>
    <h2>Login</h2>
    <form action="login" method="post">
        <input type="text" name="username" placeholder="Username" required><br>
        <input type="password" name="password" placeholder="Password" required><br>
        <button type="submit">Login</button>
    </form>
</body>
</html>
