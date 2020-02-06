<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Ticket</title>
</head>
<body>
	<jsp:include page="index.jsp" />
	<br>
	<br>
	<div class="margin">
	<form action="createticket" method="post" id="userform">
		<label>Title:</label><br />
		<input type="text" name="title" id="title"><br />
		<br> <label>Category:</label><br />
		<input type="text" name="category" id="category"><br />
		<br> <label>Priority:</label><br />
		<input type="text" name="priority" id="priority"><br />
		<br> <label>Description</label> <br />
		<br>
		<textarea rows="4" cols="50" name="description" form="userform"
			placeholder="Enter description here..."></textarea>
		<br>
		<br> <input type="submit" value="Create" id="submit">
	</form>
	</div>
</body>
</html>