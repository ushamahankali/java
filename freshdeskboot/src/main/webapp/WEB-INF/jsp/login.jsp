<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<jsp:include page="index.jsp" />
	<br>
	<br>
	<div class="margin">
		<form action="login" method="post">
			<label>Email:</label><br />
			<input type="email" name="email" id="email"><br />
			<br> <label>Password:</label><br />
			<input type="password" name="password" id="password"><br />
			<br> <input type="submit" value="Submit" id="submit">
		</form>
	</div>
	<h4>${infoMessage}</h4>
</body>
</html>