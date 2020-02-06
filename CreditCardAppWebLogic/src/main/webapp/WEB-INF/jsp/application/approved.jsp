<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Application</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<script src="resources/script.js"></script>
<script src="https://kit.fontawesome.com/a1c203ab73.js"></script></head>
<body>

<div id="nav-bar-placeholder"></div>

<div class="container">

	<div class="card m-5 bg-light">
		<div class="card-body text-center">
			<h2 class="card-title mb-5 pt-5">Congratulations, ${customer.firstName}! Your application is approved.</h2>
			<div class="card-text mb-5">								
				<table class="table table-striped">
					<tr><th colspan=2 class="h5">Here is your new card information:</th></tr>
					<tr><td>Name on Card:</td> <td>${customer.firstName } ${customer.lastName }</td></tr>
					<tr><td>Card No:</td> <td>${creditCard.cardNo }</td></tr>
					<tr><td>cvv No:</td> <td>${creditCard.cvv }</td></tr>
					<tr><td>Credit Limit:</td> <td>${creditCard.creditLimit }</td></tr>
					<tr><td>Expiration Date:</td> <td>${creditCard.expirationDate }</td></tr>				
				</table>			
												
				<p class="font-weight-bold">Please activate your card. You can activate online by Click the link below.</p>
				
			<p>
			<a href="./preActivation.do" class="btn btn-outline-info" role="button">Activate Your Card</a>
			<a href="./home.do" class="btn btn-outline-info" role="button">Go Back Home</a>
			</p>
						
			</div>
		</div>
	</div>
</div>


</body>
</html>