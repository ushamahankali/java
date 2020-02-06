<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	%>
<!DOCTYPE html>

<%@page import="com.ektha.freshdeskjndi.entity.User" %>
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
	background-color: #ccccff;
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
		</h2>
	</div>


	<div align="center">
		<p>Welcome to the freshdesk Sign Up page</p>
	</div>
	<br>
	<br>
	<div class="navbar">
		<a href=${pageContext.request.contextPath}/home.html>Home</a> <a href=ticket.jsp>Ticket</a> <a
			href=signup.jsp>SignUp</a> <a class="active" href=login.jsp>Login</a>
	</div>


	<br>
	<br>

	<form action="${pageContext.request.contextPath}/signup" method="post">






		<div align="center">
			<table width="35%" cellpadding="3" align="center" >
				<thead>
					<tr>
						<th colspan="2">Sign Up Page</th>
					</tr>

				</thead>
				<tbody>
					<tr>
						<td>FirstName</td>
						<td><input type="text" name="firstName" /></td>
					</tr>

					<tr>
						<td>LastName
						<td><input type="text" name="lastName" /></td>
					</tr>

					<tr>

						<td>EmailId</td>

						<td><input type="text" name="emailid" /></td>
					</tr>

					<tr>
						<td>Password</td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>

						<td>PhoneNumber</td>
						<td><input type="number" name="phoneNumber"></td>
					</tr>

					<tr>
						<td></td>
						<td align="center"><input type="submit" value="Sign Up" /></td>

					</tr>
				</tbody>
			</table>
		</div>

	</form>


</body>
</html>
