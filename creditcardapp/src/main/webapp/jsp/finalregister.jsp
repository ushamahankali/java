<%@ include file="/jsp/includes.jsp"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta name="description"
	content="Used for registration process final step" />

</head>

<body>
	<div class="headerblue ">
		<div class="container">
			<h2 class="pt-2 logo text-white">Trust Bank</h2>
		</div>

	</div>

	<div class="container">

		<nav class="navbar navbar-expand-lg topnav">
			<a class="navbar-brand active" href="home">Home</a> <a
				class="navbar-brand" href="credit">Credit Card</a>

		</nav>

		<div class="row">

			<div class="col-md-12 pt-5 pd-10"></div>

		</div>

		<!-- Registration proces final step, displays username and password registration form -->
		<c:choose>
			<c:when test="${message=='Your card has been activated'}">
				<div class="col-md-12">
					<h2>Registration - Final Step</h2>
				</div>
				<div class="col-md-12 text-success">Continue Registration
					Process</div>


				<form action="registeruser" method="post">


					<div class="col-md-4 mt-2">

						<label class="col-form-label lb-sm">User Name </label> <input
							class="form-control" type="text" name="username" required
							placeholder="User Name" />

					</div>
					<div class="col-md-4 mt-2">
						<label class="col-form-label lb-sm">Password </label> <input
							class="form-control" type="password" name="pass" required
							placeholder="Password" />
					</div>
					<div class="col-md-4 mt-2">
						<button class=" btn btn-primary" type="submit">Register</button>
					</div>


				</form>


			</c:when>
			<c:otherwise>
				<div class="col-md-12">
					<!-- Displays if validation does not matches -->
					<h2>Validation Error</h2>
				</div>
				<div class="col-md-12 text-danger">${message}</div>
				<div class="col-md-12 text-danger">
					Please <a href="register">Register</a> from beginning.
				</div>
			</c:otherwise>
		</c:choose>
	</div>


</body>