<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">


<link href="css/styles.css" rel="stylesheet" />

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
		<div class="row pt-3">
			<div class="col-md-8 justify-content">

				<p>$200 cash rewards bonus after making at least $1,000 in
					purchases in the first 90 days of your account opening plus now
					choose how you earn rewards. No annual fee Earn 3% cash back in the
					category of your choice: gas, online shopping, dining, travel, drug
					stores, or home improvement/furnishings and 2% cash back at grocery
					stores and wholesale clubs on the first $2,500 in combined choice
					category/grocery store/wholesale club purchases each quarter, then
					earn 1%. Earn unlimited 1% cash back on all other purchases.
					Preferred Rewards clients get a 25%-75% rewards bonus on every
					purchase. Go to the Mobile Banking app or to Online Banking to
					change your choice category for future purchases once each calendar
					month, or make no change and it stays the same. Introductory 0% APR
					for your first 12 billing cycles for purchases, and for any balance
					transfers made within 60 days of opening your account. After the
					intro APR offer ends, a Variable APR that's currently 16.24% to
					26.24% will apply. A 3% fee (min $10) applies to all balance
					transfers.</p>
			</div>
			<div class="row pt-3">
				<div class="col-md-4">
					<img src="/images/card.jpg" />
				</div>
			</div>
		</div>
	</div>
	<div class="container">
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
					<form action="processform" Method="post">
						<div class="row">
							<div class="col-md-12">
								<h3 class="d-block pt-2">Personal information</h3>
							</div>
							<div class="col-sm-3">
								<div class="inputBox ">
									<label class="col-form-label lb-sm">First name </label> <input
										type="text" name="firstName" class="form-control"
										placeholder="First name" required>
								</div>
							</div>

							<div class="col-sm-3">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Middle name (opt)</label> <input
										type="text" name="middleName" class="form-control"
										placeholder="Middle name">
								</div>
							</div>

							<div class="col-sm-3">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Last name</label> <input
										type="text" name="lastName" class="form-control"
										placeholder="Last name" required>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-5">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Date of birth</label> <input
										type="date"  class="form-control" id="birth-date"
										value="${customer.birthDate}" name="dateOfBirth" required>

								</div>
							</div>

						</div>


						<div class="row">

							<div class="col-sm-4">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Social Security
										Number</label> <input type="number" name="ssn" class="form-control"
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
										type="text" name="homeAddress" class="form-control"
										placeholder="Home address" required>
								</div>
							</div>

							<div class="col-sm-2">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Apt/ ste (opt)</label> <input
										type="text" name="appartment" class="form-control"
										placeholder="Apt/Ste">
								</div>
							</div>

							<div class="col-sm-2">
								<div class="inputBox">
									<label class="col-form-label lb-sm">Zip Code</label> <input
										type="number" name="zipcode" class="form-control"
										placeholder="zip" required>
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
										type="number" name="phoneNumber" class="form-control"
										placeholder="Phone" required>
								</div>
							</div>

							<div class="col-sm-5">
								<div class="inputBox">
									<label class="col-form-label lb-sm">email</label> <input
										type="email" name="emailId" class="form-control"
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
										<option value="" disabled></option>
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
										type="text" name="securityAnswer" class="form-control"
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
										type="text" name="income" class="form-control"
										placeholder="Income" required>
								</div>
							</div>

						</div>
						<div class="row">


							<div class="col-sm-4 mt-4 ">
								<div class="inputBox mt-4 ">
									<button type="submit" name="submit"
										class="btn btn-secondary applybtn form-control">apply</button>
								</div>
							</div>

							<div class="col-sm-4 mt-4 ">
								<div class="inputBox mt-4 ">
									<a href="creditcard" id="cancel" name="cancel"
										class="btn btn-default pull-right">Cancel</a>
								</div>

							</div>


						</div>

					</form>
				</div>


			</div>

		</div>


	</div>


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

				<p class="h6">All right Reserved.Ektha Bank</p>
			</div>

		</div>

	</section>
	<!-- Footer -->
</body>
</html>
