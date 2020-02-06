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
<br>
<a href = createticket>
Create Ticket
</a>
<br>


 <a href="viewticket">
View Ticket
</a>
</div>
	<h4>${infoMessage}</h4>
</body>
</html>