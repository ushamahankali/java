<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	%>
<!DOCTYPE html>

<%@ page import="com.ektha.freshdeskjndi.entity.User" %>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>freshdesk |Login Application</title>
</head>
<style>
* {
	box-sizing: border-box
}

body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: #778899;
	font-color:
}

.navbar {
	width: 100%;
	background-color: red;
	overflow: auto;
}

a:link, a:visited {
	color: red;
	padding: 14px 25px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
}

a:hover, a:active {
	background-color: #778899;
}

.navbar a {
	float: left;
	padding: 12px;
	color: white;
	text-decoration: none;
	font-size: 17px;
	width: 25%; /* Four links of equal widths */
	text-align: center;
}

.navbar a:hover {
	background-color:;
}

.navbar a.active {
	background-color: purple;
}

@media screen and (max-width: 500px) {
	.navbar a {
		float: none;
		display: block;
		width: 100%;
		text-align: left;
	}
}
</style>
<body>



	<div class="navbars">
		<h2>
			<a href=${pageContext.request.contextPath}/index.html> freshdesk
			</a>
			<p align="right">
				<a href=${pageContext.request.contextPath}/index.html> <input
					type="button" value="SignOut" align="right">
				</a>
			</p>
		</h2>
	</div>
	<div align="left">


		
	</div>

	<div align="center">
		<% if(session.getAttribute("currentUser") != null) {
User user = ((User)session.getAttribute("currentUser")); 

           
 if(user != null) {%>
		Welcome User
		<%= user.getEmailId() %>
		<%} } %>

	</div>
	<div align="center">
		<p>Welcome to the freshdesk login page</p>
	</div>
	<br>
	<br>
	<div class="navbar">
		<a href=${pageContext.request.contextPath}/home.html>Home</a>
		<a href=ticket.jsp>Ticket</a> 
		<a href=signup.jsp>SignUp</a>
		 <a class="active" href=login.jsp>Login</a>
	</div>


	<br>
	<br>
	<form action="${pageContext.request.contextPath}/login" method="post">



		<table  width="30%" cellpadding="3" align="center">

			<thead>

				<tr>
					<th colspan="2">Login Page</th>
				</tr>

			</thead>
			<tbody>
				<tr>
					<td>email Id</td>
					<td><input type="text" name="emailid" value="" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" value="" /></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset" /></td>
					<td><input type="submit" value="Login" /></td>

				</tr>
				<tr>
					<td colspan="2">New User <a href=signup.jsp>Sign Up Here</a></td>
				</tr>
			</tbody>
		</table  >

	</form>

</body>
</html>

