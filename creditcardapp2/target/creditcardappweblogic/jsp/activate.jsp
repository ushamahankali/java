<%@ include file="/jsp/includes.jsp"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Activate Credit Card</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta name="description" content="Used to activate credit card" />

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
				class="active navbar-brand" href="credit">Credit Card</a>

		</nav>

		<div class="row">

			<div class="col-md-12 pt-5 pd-10">
				<h2>Activate your Card</h2>
				<!-- The JSTL if tag below is used to check where the request is coming from. If request comes back after checking if card exists, it will not display html below -->
				<c:if test="${empty cardExists}">
					<div class="row">
						<div class="col-md-6">

							<p class="mt-4">
								<span class="text-success">Congratulations</span> on your
								approval with Trust bank credit card ? Next step is to activate
								it before you can use it.
							</p>
							<p>Use your credit card number to activate it</p>
							<p class="text-info">To activate, you will need last Name,
								SSN and Security Word in next step</p>
						</div>
						<div class="col-md-6"></div>
					</div>
				</c:if>

				<!-- When the request comes first time on this page, display input box to validate credit card number  -->
				<c:choose>
					<c:when test="${empty cardExists}">
						<form action="validatecredit" method="post">
							<div class="row">

								<div class="col-md-6">

									<input class="form-control" type="text" name="creditcard"
										required placeholder="Enter credit card number" /> <input
										type="hidden" name="requestpage" value="activate" />

								</div>
								<div class="col-md-6">
									<button class=" btn btn-primary" type="submit">Search</button>
								</div>

							</div>
						</form>
					</c:when>
					<c:otherwise>
						<!-- After card is found, second setp is to display input tags to validate -->
						<c:choose>
							<c:when test="${cardExists}">
								<form action="activatecard" method="post">
									<div class="row">
										<div class="col-md-12">
											<p class="text-success">Card found, Enter following
												details to activate</p>
										</div>
										<div class="col-md-6">

											<input class="form-control" type="text" name="lastname"
												required placeholder="Last Name" />


										</div>
									</div>
									<div class="row mt-2">

										<div class="col-md-6">
											<input class="form-control" type="text" name="ssn" required
												placeholder="last 4 digits of SSN" />
										</div>

									</div>

									<div class="row mt-2">

										<div class="col-md-3">
											<div class="inputBox">
												<select class="form-control" name="securityhint" required>
													<option value="2" selected>Favorite Pet's Name</option>
													<option value="1">Favorite Snack</option>
													<option value="3">Favorite Hobby</option>
													<option value="4">Favorite Teacher</option>
													<option value="5">Best friend's last name</option>
													<option value="6">First Concert Attended</option>
													<option value="7">Ideal Place to Vacation</option>
													<option value="8">Your childhood nickname</option>

												</select>
											</div>
										</div>

										<div class="col-md-3">

											<input type="text" name="secword" class="form-control"
												placeholder="Security Word" required> <input
												type="hidden" name="cardnumber" class="form-control"
												placeholder="Security Word" value="${cardNumber}">

										</div>
									</div>




									<div class="row">


										<div class="col-md-3 mt-4">

											<button type="submit" name="email"
												class="btn btn-primary applybtn ">Submit</button>

										</div>
									</div>

								</form>
							</c:when>
							<c:otherwise>
								<form action="validatecredit" method="post">
									<div class="row">
										<div class="col-md-12">
											<p class="text-danger">No Card found, Try again</p>
										</div>
										<div class="col-md-6">

											<input class="form-control" type="text" name="creditcard"
												required placeholder="Enter credit card number" /> <input
												type="hidden" name="requestpage" value="activate" />

										</div>
										<div class="col-md-6">
											<button class=" btn btn-primary" type="submit">Search</button>
										</div>

									</div>
								</form>
							</c:otherwise>
						</c:choose>
					</c:otherwise>
				</c:choose>
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