<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ektha.freshdeskmavenapp.entity.Ticket"%>
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
	<p>Welcome to the freshdesk view ticket page</p>

	<div class="navbar">
		<a href=${pageContext.request.contextPath}/home.html>Home</a> <a
			href=jsps/ticket.jsp>Ticket</a> <a href=jsps/signup.jsp>SignUp</a> <a
			href=jsps/login.jsp>Login</a>
	</div>
	<br>
	<br>
	<!-- provide an html table start tag -->
	<div align="center">
		<table border='1' width='75%'>
			<tr>
				<!-- create cells of row -->
				<td><b>Title</b></td>
				<td><b>Category</b></td>
				<td><b>Priority</b></td>
				<td><b>Description</b></td>
				<!-- close row -->
			</tr>
			<!--get the collection from the attribute from appropriate scope (here, request) -->
			<% List<Ticket> tickets = ((ArrayList<Ticket>)session.getAttribute("ticketList")); 
    for (Ticket ticket : tickets) {
    	if( ticket.getTitle() != "") {
    	 %>
			<!-- create an html table row -->
			<tr>
				<!-- create cells of row -->
				<td>
					<% out.print(ticket.getTitle()); %>
				</td>
				<td>
					<% out.print(ticket.getCategory()); %>
				</td>
				<td>
					<% out.print(ticket.getPriority()); %>
				</td>
				<td>
					<% out.print(ticket.getDescription()); %>
				</td>
				<!-- close row -->
			</tr>
			<!-- close the loop -->
			<% } } %>
			<!-- close table -->
		</table>
	</div>
</body>
</html>
