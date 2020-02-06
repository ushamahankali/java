<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket</title>
</head>
<body>
	<jsp:include page="index.jsp" />
	<br>
	<div class="center">
		<a href="createticket">Create Ticket</a> <br>
		<br> <a href="viewtickets">View Tickets</a>
	</div>
	<h4>${infoMessage}</h4>
</body>
</html>