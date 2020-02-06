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
                <div class="row pt-3">

				<div class=" col-md-4">
					<div class="formContent">
						<form action="validate" method="post">
							<div class="form-group">
								<label class="col-form-label lb-sm">User name</label>
								 <input	type="text" name="username" class="form-control"
									placeholder="user name"  value ="user name" > 
									<label class="col-form-label lb-sm">Password</label> <input
									type="password" name="password"  value ="password"class="form-control">


								<button type="submit" class="text-white mt-3 btn btn-primary ">Sign
									On</button>
								<a class="d-block mt-2" href="cardactivate">Activate a Card</a> <a
									class="d-block mt-2" href="cardregister">Register Now</a>
							</div>
						</form>
					</div>
		

			</div>
	<div class="row pt-4">
				<div class="col-md-8">
					<h2>Ektha Bank Cards just for you</h2>

					<a href="apply"><img src="/images/credit_card.jpg" /></a> <a
						class="mt-2 btn btn-primary applybtn" href="applicationform">Apply Card
						Now</a>
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

							<p class="h6"> All right Reserved.Ektha Bank</p>
						</div>

					</div>

				</section>
				<!-- Footer -->
</body>
</html>
