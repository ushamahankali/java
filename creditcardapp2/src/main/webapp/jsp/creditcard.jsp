<%@ include file="/jsp/includes.jsp"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credit Card</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta name="description"
	content="The first page that deals with link for activating, registering, applying credit card" />

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

		<div class="row pt-3">

			<div class="col-md-3">
				<div class="wrapper fadeInDown">
					<div class="formContent">
						<form action="validate" method="post">
							<div class="form-group">
								<label class="col-form-label lb-sm">User name</label> <input
									type="text" name="username" class="form-control"
									placeholder="user name"> <label
									class="col-form-label lb-sm">Password</label> <input
									type="password" name="password" class="form-control"
									placeholder="Password">
								<!-- Displays message after log out or when username mismatches  -->
								<c:if test="${not empty logout}">
									<p class="text-success">Successfully logged out</p>
								</c:if>
								<c:if test="${not empty errormessage}">
									<p class="text-danger">Invalid user name password
										combination</p>
								</c:if>

								<button type="submit" class="text-white mt-3 btn btn-primary ">Sign
									On</button>
								<a class="d-block mt-2" href="activate">Activate a Card</a> <a
									class="d-block mt-2" href="register">Register Now</a>
							</div>
						</form>

					</div>
				</div>
			</div>
			<div class=" col-md-9">
				<div class="row">
					<div class="col-md-6">
						<h2>Trust Cards just for you</h2>
						<p>With Trust bank credit cards, you can enjoy cash back upto
							40%.</p>
						<a class="mt-2 btn btn-primary applybtn" href="apply">Apply
							Card Now</a>
					</div>
					<div class="col-md-4">
						<a href="apply"><img src="img/card.png" /></a>
					</div>
				</div>


			</div>


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