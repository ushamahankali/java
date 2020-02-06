<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	%>
	<%@ page import="com.ektha.freshdeskmavenapp.entity.Ticket" %>
<!DOCTYPE html>

<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box
}

body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: #ccccff;
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
	background-color: #000;
}

.navbar a.active {
	background-color: #4CAF50;
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
	<p>Welcome to the freshdesk create ticket page</p>

	<div class="navbar">
		<a href=${pageContext.request.contextPath}/home.html>Home</a> <a
			href=ticket.jsp>Ticket</a> <a href=signup.jsp>SignUp</a> <a
			href=login.jsp>Login</a>
	</div>
	<br>
	<div align="center">
		<% if(session.getAttribute("currentTicket") != null) {
Ticket ticket = ((Ticket)session.getAttribute("currentTicket")); 
         
 if(ticket != null) {%>
		Ticket Created
		<%} } %>

	</div>
	<br>
	<br>

	<form action="${pageContext.request.contextPath}/ticket" method="post">


		<div align="center">
			<table style="width: 35%" cellpadding=3 align=center >
				<thead>
					<tr>
						<th colspan="2">Create Ticket</th>
					</tr>

				</thead>
				<tbody>
					<tr>
						<td>Title</td>
						<td><input type="text" name="title" /></td>
					</tr>

					<tr>
						<td>Category</td>

						<td><input type="text" name="category" /></td>
					</tr>

					<tr>

						<td>Priority</td>

						<td><input type="text" name="priority" /></td>
					</tr>

					<tr>
						<td>Description</td>
						<td><textarea rows="5" cols="20" name="description"></textarea></td>
					</tr>


					<tr>
						<td></td>
						<td align="center"><input type="submit" value="Create" /></td>

					</tr>
				</tbody>
			</table>
		</div>

	</form>


</body>
</html>
