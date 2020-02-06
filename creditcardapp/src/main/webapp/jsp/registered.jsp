<%@ include file="/jsp/includes.jsp"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta name="description"
	content="Page that displays after user is registered" />

</head>

<body>
	<div class="headerblue ">
		<div class="container">
			<h2 class="pt-2 logo text-white">Trust Bank</h2>
		</div>

	</div>

	<div class="container">

		<nav class="navbar navbar-expand-lg topnav">
			<a class="navbar-brand" href="home">Home</a> <a class="navbar-brand"
				href="credit">Credit Card</a>

		</nav>

		<div class="row">

			<div class="col-md-12 pt-5 pd-10">
				<div class="col-md-6">
					<!-- This message is displayed if registered -->

					<c:choose>
						<c:when test="${isRegistered}">
							<h2>User Registered</h2>
							<p class="text-success">Congratulations, you have been
								registered for online access. Please login.</p>
							<p>Username: ${userName }</p>
							<p>Password: ********</p>
							<p>card Number: ${card.cardNumber }</p>
						</c:when>
						<c:otherwise>
							<h2>Registration Failed</h2>
							<p class="text-danger">Registration failed. Please try from
								beginning with different userName</p>
							<p class="text-info">Only one user per credit card</p>
						</c:otherwise>
					</c:choose>
					<!-- Above C otherwise shows message if registration fails -->
							
				</div>
				<div class="col-md-6"></div>
			</div>
		</div>
	</div>


</body>