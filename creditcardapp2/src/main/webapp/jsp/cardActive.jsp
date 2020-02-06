<%@ include file="/jsp/includes.jsp"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Activation Status</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta name="description"
	content="Used to display message after card is activated" />

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
			<!-- Displays whether card is activated or activation failed -->
			<c:choose>

				<c:when test="${message=='Your card has been activated'}">
					<div class="col-md-12">
						<h2>Activated</h2>
					</div>
					<div class="col-md-12 text-success">${message}</div>
				</c:when>
				<c:otherwise>
					<div class="col-md-12">
						<h2>Activation fail</h2>
					</div>
					<div class="col-md-12 text-danger">${message}</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>


</body>