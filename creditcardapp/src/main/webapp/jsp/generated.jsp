<%@ include file="/jsp/includes.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credit Card Generated</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta name="description" content="Displays Credit Card Details" />
</head>

<body>
	<div class="headerblue ">
		<div class="container">
			<h2 class="pt-2 logo text-white">Trust Bank</h2>
		</div>

	</div>

	<div class="container">

		<nav class="navbar navbar-expand-lg topnav">
			<a class="navbar-brand " href="home">Home</a> <a
				class="navbar-brand active" href="credit">Credit Card</a>

		</nav>

		<div class="row">

			<c:choose>
				<c:when test="${empty error}">
					<div class="col-md-12 pt-5 pd-10">
						<div class="col-md-6">
							<h2>Credit Card Generated</h2>
							<p>Your card has been generated. Please make sure you save
								all the details.</p>
							<p>Make sure you register for online account.</p>
							<p class="text-info">You need credit card details and
								security word to register.</p>

							<p class="text-success">
								Your <b>Credit Limit</b> is: $ ${creditLimit}.
							</p>


						</div>
						<div class="col-md-6 bg-dark p-5 text-white">
							<h2>Credit Card Details</h2>
							<p>Card Number: ${card}</p>
							<p>CVV: ${cvv}</p>
							<p>Expiry Date: ${date}</p>
						</div>
					</div>

				</c:when>
				<c:otherwise>
					<div class="col-md-12 pt-5 pd-10">
						<div class="col-md-6">
							<!-- Displays error message if annual income is less than 30,000 -->
							<h2>You are not approved</h2>

							<p class="text-danger">${error}</p>
						</div>

					</div>
				</c:otherwise>
			</c:choose>

		</div>
	</div>
	<!-- Footer -->
	<footer class="page-footer font-small blue pt-4">

		<!-- Footer Links -->
		<div class="container text-center text-md-left">

			<!-- Grid row -->
			<div class="row">

				<!-- Grid column -->
				<div class="col-md-6 mt-md-0 mt-3">

					<!-- Content -->
					<h5 class="text-uppercase">&copy; Trust Bank 2019</h5>
					<p>Your relaible banking partner.</p>

				</div>
				<!-- Grid column -->

				<hr class="clearfix w-100 d-md-none pb-3">

				<!-- Grid column -->
				<div class="col-md-3 mb-md-0 mb-3"></div>
				<!-- Grid column -->

				<!-- Grid column -->
				<div class="col-md-3 mb-md-0 mb-3"></div>
				<!-- Grid column -->

			</div>
			<!-- Grid row -->

		</div>
		<!-- Footer Links -->



	</footer>
	<!-- Footer -->
</body>