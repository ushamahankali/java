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
		<br>
		<br>
		<br>
		
		<div align="center">${infoMessage}</div>
		<div class="row pt-2">

			<div class="col-md-12">
			<div class="row ">
				<h2>Activate
					Your Card</h2>
			</div>
			<div class="row ">
			<div class="h4-style cross-link-heading">Activating
							your card is easy. Fill in the information below to get started</div>
					</div>
				</div>
				
				<div class="row">
			<div class="col-md-12">
				<div class="">
					<form action="getactivate" Method="post">
						<div class="row">
							<div class="col-md-12">
						
                <p>
					<div class="col-sm-3">
								<div class="inputBox ">
									<label class="col-form-label lb-sm">Card Number </label> <input
										type="number" name="cardNumber" class="form-control"
										placeholder="CardNumber" required>
								</div>
							</div>
             
							<!---->
                <div>
						<h6>	The field can't be left blank.
									Please enter your information.</h6>
							</div>
							<!---->
						</div>
            
						
						<div class="col-sm-4 mt-4 ">
								<div class="inputBox mt-4 ">
									<button type="submit" name="submit"
										class="btn btn-secondary applybtn form-control">continue</button>
								</div>               </div>
</div>
						
                    <div class="col-sm-4 mt-4 ">
								<div class="inputBox mt-4 ">
                     <a href="creditcard" id="cancel" name ="cancel" class="btn btn-default pull-right">Cancel</a>
 </div>
							</div>
							</form>
						</div>

					

				</div>

			</div>
		</div>

	</div>

						

<div>	</div>	
<div>	</div>

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
