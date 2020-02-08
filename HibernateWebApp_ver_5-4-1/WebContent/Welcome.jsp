<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Information</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}

h1{
	text-align: center;
}
</style>
</head>
<body>
<h1> Your Informations : </h1>
<hr>
<table>
	<tr>
		<th>Login Id</th>
		<th>Name</th>
		<th>Password</th>
		<th>Email Id</th>
		<th>Gender</th>
	</tr>
	<tr>
		<td>
			<%
			out.print(request.getAttribute("id"));
			%>
		</td>
		<td><%	
			out.print(request.getAttribute("uname"));
			%>
		</td>
		<td><%	
			out.print(request.getAttribute("pwd"));
		%></td>
		<td><%
			out.print(request.getAttribute("emailId"));
			%>
		</td>
		<td><%	
			out.print(request.getAttribute("gen"));
			%>
		</td>
	</tr>
	</table>
</body>
</html>