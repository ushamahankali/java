<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ektha.freshdeskbootrestclient.entity.Ticket"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>View Tickets</title>
</head>
<body>
	<jsp:include page="index.jsp" />
	<br>
	<br>

	<table id="tickets">
		<tr>
			<th>Title</th>
			<th>Category</th>
			<th>Priority</th>
			<th>Description</th>
		</tr>
		<c:forEach var="ticket" items="${tickets}">
			<tr>
				<td>${ticket.getTitle()}</td>
				<td>${ticket.getCategory()}</td>
				<td>${ticket.getPriority()}</td>
				<td>${ticket.getDescription()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>