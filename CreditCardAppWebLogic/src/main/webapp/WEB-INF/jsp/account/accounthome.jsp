<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Your Personal Account</title>
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
			<h3 class="card-title mb-5 pt-5">Hello, ${customer.firstName}! Welcome to your online account. </h3>
			
			<div class="card-text mb-5">	
			
										
				<table class="table table-striped my-5">
					<tr><th colspan=2 class="h3"><i class="fas fa-credit-card"></i> Credit Card Details</th></tr>
					<tr><td colspan=2 class="font-weight-bold">Your card is ${cardStatus}.</td></tr>
					<tr><td>Name on Card </td> <td>${customer.firstName} ${customer.lastName}</td></tr>
					<tr><td>Card Number </td> <td>${creditCard.cardNo}</td></tr>
					<tr><td>CVV Number </td> <td>${creditCard.cvv }</td></tr>
					<tr><td>Credit Limit </td> <td>${creditCard.creditLimit} USD</td></tr>
					<tr><td>Expiration Date </td> <td>${creditCard.expirationDate}</td></tr>				
				</table>			
					
					<hr>
					
				<table class="table table-striped my-5">
					<tr><th colspan=2 class="h3"><i class="fas fa-envelope-open-text"></i> Contact Information</th></tr>
					<tr><td>Phone Number</td> <td>${contact.phone}</td></tr>	
					<tr><td>Email </td> <td>${contact.email}</td></tr>	
					<tr><td>Address </td> <td>${contact.address} ${contact.apt}</td></tr>
					<tr><td>City </td> <td>${contact.city}</td></tr>
					<tr><td>State</td> <td>${contact.state}</td></tr>
					<tr><td>Zipcode</td> <td>${contact.zipcode}</td></tr>			
				</table>		
					
					<hr>
				
				<table class="table table-striped my-5">
					<tr><th class="h3"><i class="fas fa-user-check"></i> Personal Details</th></tr>
					<tr><td>
					<a href="./accountDetails.do" class="btn btn-outline-info btn-lg" role="button">Go to Personal Details</a>
					</td></tr>				
				</table>
																
			</div>
		</div>
	</div>
</div>


</body>
</html>