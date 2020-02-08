<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<style>
	    .body{
        background-color:paleturquoise;
        text-align: center;
    }
    /* .heading{
        text-align: center;
        color: blue;
    } */
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
	<h1 style="color: indigo; text-align: center;">Register: </h1>
<div>
		<form class="form" action="Register_Servlet" method="post">
    
		
		<input type="text" name="uname" placeholder="Enter your Name" required autofocus class="Uname"><br><br>
		
		<input type="password" name="pwd" placeholder="Enter the Password" required class="pass"><br><br>
		
		<input type="password" name="rpwd" placeholder="ReType your Password" required class="pass"><br><br>
		
		<input type="text" name="email" placeholder="Enter valid EmailId" required class="pass"><br><br>
		
		<input type="radio" name="gender" value="M">Male
		<input type="radio" name="gender" value="F">Female
		<input type="radio" name="gender" value="O">Others<br><br>
		
		<input type="submit" value="Save" class="submitbutton">
  </form>
</div>
</body>
</html>