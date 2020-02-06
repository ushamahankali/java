<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="css/styles.css" rel="stylesheet" />
<!-- <link href="css/style.css" rel="stylesheet" /> -->
<link href="images/ektha.png" rel="images" />
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<title>Ektha Bank Index</title>

</head>
<body>

<h1>
			<a href="index"> <font color="black"> Ektha Bank </font></a>
		</h1>



		<nav class="navbar navbar-expand-sm navbar-dark"
			style="background: #9999ff;">
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#nav-content" aria-controls="nav-content"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>


			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="home">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="creditcard">
						CreditCard</a></li>

			</ul>
			<!-- <div class="navbar"> -->

		</nav>
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
	<br><br><br><br><br><br><br><br><br><br><br><br>
<section id="footer">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-5">
							<ul class="list-unstyled list-inline social text-center">
								<li class="list-inline-item"><a href="javascript:void();"><i
										class="fa fa-facebook"></i></a></li>
								<li class="list-inline-item"><a href="javascript:void();"><i
										class="fa fa-twitter"></i></a></li>
								<li class="list-inline-item"><a href="javascript:void();"><i
										class="fa fa-instagram"></i></a></li>
								<li class="list-inline-item"><a href="javascript:void();"><i
										class="fa fa-google-plus"></i></a></li>
								<li class="list-inline-item"><a href="javascript:void();"
									target="_blank"><i class="fa fa-envelope"></i></a></li>
							</ul>
						</div>

					</div>
					<div class="row">
						<div
							class="col-xs-12 col-sm-12 col-md-12 mt-2 mt-sm-2 text-center text-white">

							<p class="h6"> All right Reserved.Ektha Bank</p>
						</div>

					</div>

				</section>
				<!-- Footer -->
</body>
</html>
