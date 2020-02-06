<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>
	<jsp:include page="index.jsp" />
	<br />
	<br>
	<div class="margin">
	<form action="signup" method="post">
		<label>First Name:</label><br />
		<input type="text" name="fname" id="fname"><br />
		<br> <label>Last Name:</label><br />
		<input type="text" name="lname" id="lname"><br />
		<br> <label>Email:</label><br />
		<input type="email" name="email" id="email"><br />
		<br> <label>Password:</label><br /> <input type="password"
			name="password" id="password"><br />
		<br> <label>Phone:</label><br /> <input type="text" name="phone"
			id="phone"><br />
		<br> <input type="submit" value="Submit" id="submit">
	</form>
	<h4>${infoMessage}</h4>
	</div>
</body>
</html>