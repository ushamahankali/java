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
	content="After login displays personal information" />

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
		<!-- Checks if session content is empty, if yes, doesnot display content below -->

		<c:choose>
			<c:when test="${not empty sessionScope.cardSession.ccId}">
				<div class="row pt-3">

					<div class="col-md-3">
						<ul class="nav nav-pills">
							<li class="nav-item  usernav "><a class="nav-link  "
								href="user">Card Details</a></li>
							<li class="nav-item active usernav"><a class="nav-link "
								href="personal">Personal Details</a></li>
							<li class="nav-item usernav"><a class="nav-link "
								href="logout">Logout</a></li>

						</ul>
					</div>
					<div class=" col-md-9">
						<div class="row">
							<div class="col-md-8">
								<h2>Hello ${sessionScope.userName }, Your Personal Details:</h2>


								<table class="table">

									<tbody>
										<tr>
											<td>First Name</td>
											<td>${sessionScope.cardSession.customer.firstName }</td>
										</tr>
										<tr>
											<td>Middle Name</td>
											<td>${sessionScope.cardSession.customer.middleName }</td>
										</tr>
										<tr>
											<td>Last Name</td>
											<td>${sessionScope.cardSession.customer.lastName }</td>
										</tr>
										<tr>
											<td>SSN</td>
											<td>${sessionScope.cardSession.customer.ssn }</td>
										</tr>
										<tr>
											<td>Annual Income</td>
											<td>$${sessionScope.cardSession.customer.annualIncome }</td>
										</tr>
										</tr>
									</tbody>
								</table>

							</div>

						</div>


					</div>


				</div>
			</c:when>
			<c:otherwise>
					<h2>You are not logged in</h2>
			</c:otherwise>
		</c:choose>
		<!--Above c otherwise Displays this when session content is empty  -->
			


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