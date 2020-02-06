<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credit Card</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta name="description"
	content="Used to display form for applying credit card" />
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

		<div class="row pt-4">

			<div class="col-sm-5">
				<img src="img/visa.png" />
			</div>
			<div class="col-sm-7 justify-content">
				<h2>Trust Rewards Card</h2>
				<p>Earn 15,000 bonus points after you spend $1,000 in purchases
					with your card within 3 months of account opening. Bonus ThankYou®
					Points are not available if you received a new cardmember bonus for
					Citi Rewards+SM, Citi ThankYou® Preferred,Citi ThankYou®
					Premier/Citi PremierSM or Citi Prestige®, or if you have closed any
					of these accounts, in the past 24 months.</p>
				<hr />
				0% Intro APR on balance transfers and purchases for 15 months. After
				that, the variable APR will be 15.74% - 25.74%, based on your
				creditworthiness.
				<hr />
				Round Up every purchase to the nearest 10 points - with no cap.


			</div>

		</div>

		<div class="row pt-2">

			<div class="col-md-12">
				<h2>Tell us about yourself</h2>
				<p class="text-muted">(All fields are required unless specified
					optional)</p>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<div class="">
					<form action="getcard" Method="post">
						<div class="row">
							<div class="col-md-12">
								<h3 class="d-block pt-2">Personal information</h3>
							</div>
							<div class="col-sm-3">
								<div class="inputBox ">
									<label class="col-form-label lb-sm">First name </label> <input
										type="text" name="fname" class="form-control"
										placeholder="First name" required>
								</div>
							</div>

							<div class="col-sm-3">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Middle name (opt)</label> <input
										type="text" name="mname" class="form-control"
										placeholder="Middle name">
								</div>
							</div>

							<div class="col-sm-3">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Last name</label> <input
										type="text" name="lname" class="form-control"
										placeholder="Last name" required>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-12">
								<label class="col-form-label lb-sm">Date of birth </label>
							</div>
							<div class="col-sm-2">

								<div class="inputBox ">
									<select name="dob1"
										class="form-control error validation-input-danger" required>
										<option value="" disabled>Month</option>
										<option value="01">January</option>
										<option value="02">February</option>
										<option value="03">March</option>
										<option value="04">April</option>
										<option value="05">May</option>
										<option value="06">June</option>
										<option value="07">July</option>
										<option value="08">August</option>
										<option value="09">September</option>
										<option value="10">October</option>
										<option value="11">November</option>
										<option value="12">December</option>

									</select>
								</div>
							</div>

							<div class="col-sm-2">
								<div class="inputBox">
									<input type="number" name="dob2" class="form-control"
										placeholder="day" required>
								</div>
							</div>

							<div class="col-sm-2">
								<div class="inputBox">
									<input type="number" name="dob3" class="form-control"
										placeholder="year" required>
								</div>
							</div>
						</div>
						<div class="row">

							<div class="col-sm-4">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Social Security
										Number</label> <input type="text" name="ssn" class="form-control"
										placeholder="ssn" required>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-12">
								<h3 class="d-block pt-2">Address and Contact Information</h3>
							</div>
							<div class="col-sm-5">
								<div class="inputBox ">
									<label class="col-form-label lb-sm">Home Address </label> <input
										type="text" name="home" class="form-control"
										placeholder="Home address" required>
								</div>
							</div>

							<div class="col-sm-2">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Apt/ ste (opt)</label> <input
										type="text" name="apt" class="form-control"
										placeholder="Apt/Ste">
								</div>
							</div>

							<div class="col-sm-2">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Zip Code</label> <input
										type="text" name="zip" class="form-control" placeholder="zip"
										required>
								</div>
							</div>
						</div>

						<div class="row">

							<div class="col-sm-2">
								<div class="inputBox ">
									<label class="col-form-label lb-sm">city </label> <input
										type="text" name="city" class="form-control"
										placeholder="City" required>
								</div>
							</div>

							<div class="col-sm-2">
								<div class="inputBox">
									<label class="col-form-label lb-sm">state</label> <input
										type="text" name="state" class="form-control"
										placeholder="State" required>
								</div>
							</div>

						</div>

						<div class="row">

							<div class="col-sm-4">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Phone</label> <input
										type="number" name="phone" class="form-control"
										placeholder="Phone" required>
								</div>
							</div>

							<div class="col-sm-5">
								<div class="inputBox">
									<label class="col-form-label lb-sm">email</label> <input
										type="email" name="email" class="form-control"
										placeholder="email" required>
								</div>
							</div>

						</div>

						<div class="row">

							<div class="col-md-12">
								<h3 class="d-block pt-2">Security Word</h3>
							</div>

							<div class="col-sm-4">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Security Word Hint</label>
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

							<div class="col-sm-5">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Security Word</label> <input
										type="text" name="secword" class="form-control"
										placeholder="Security Word" required>
								</div>
							</div>

						</div>

						<div class="row">

							<div class="col-md-12">
								<h3 class="d-block pt-2">Financial Information</h3>
							</div>

							<div class="col-sm-4">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Annual Income</label> <input
										type="number" name="income" class="form-control"
										placeholder="Income" required>
								</div>
							</div>

						</div>
						<div class="row">


							<div class="col-sm-4 mt-4 ">
								<div class="inputBox mt-4 ">
									<button type="submit" name="email"
										class="btn btn-primary applybtn form-control">Submit</button>
								</div>
							</div>
						</div>

					</form>

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
</html>