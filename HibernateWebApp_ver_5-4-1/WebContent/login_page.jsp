<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login with your Credentials</title>
</head>
<style>
    .body{
        background-color:paleturquoise;
        text-align: center;
    }
    .heading{
        text-align: center;
        color: blue;
    }
    .form{
        text-align: center;
        display: inline-block;
    }
    .Uname{
        padding:17px;
        border-radius: 15px;
        border-color: darkviolet;
        border-image:fill;
    }
    .pass{
        padding:17px;
        border-radius: 15px;
        border-color: darkviolet;
        border-image:fill;
    }
    .submitbutton{
        padding:17px;
        border-radius: 15px;
        border-color:navy;
        border-image:fill;
    }
</style>
<body class="body">
	<div>
	<h1 class="heading">Sign In:</h1>
	<form class="form" action="Login_Servlet" method="post">
		
		<input type="text" name="username" placeholder="Enter your Username" autofocus required class="Uname" ><br>
		<br><input type="password" name="password" placeholder="Enter your password" required class="pass" ><br>
		<br><input type="submit" value="Login" class="submitbutton"><br>
		<a href="Register.jsp">Not Registered. Click Here to Register</a>
		
    </form>
    </div>
</body>
</html>