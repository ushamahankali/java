<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ektha.freshdesknextgen.entity.Ticket"%> --%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>View Tickets</title>
</head>
<body>
	<jsp:include page="index.jsp" />
	<br>
	<br>

<br><br>
 <!-- provide an html table start tag -->
 <div align ="center">
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
   
   <c:forEach var="ticket" items="${tickets}">
			<tr>
				<td>${ticket.getTitle()}</td>
				<td>${ticket.getCategory()}</td>
				<td>${ticket.getPriority()}</td>
				<td>${ticket.getDescription()}</td>
			</tr>
		</c:forEach>
    <%-- <%-- <% for (Ticket ticket : %>${ tickets}<%) {
    	if( ticket.getTitle() != "") {
    	 %>
    <!-- create an html table row -->
       <tr>
       <!-- create cells of row -->
       <td><% out.print(ticket.getTitle()); %></td>
       <td><% out.print(ticket.getCategory()); %></td>
       <td><% out.print(ticket.getPriority()); %></td>
       <td><% out.print(ticket.getDescription()); %></td>
       <!-- close row --> --%>
       
       <!-- close the loop -->
 <%--  <% } } %>  --%> 
   <!-- close table --> 
   </table>
</div>
</body>
</html> 