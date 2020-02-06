<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Registration</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<script src="resources/script.js"></script>
<script src="https://kit.fontawesome.com/a1c203ab73.js"></script>
</head>
<body>

<div id="nav-bar-placeholder"></div>

<div class="container my-5">
<h1 class="pb-4">Registrer for an Accounct</h1>
<p class="text-danger pb-3">${cardNotFoundMessage}</p>

	<form action="./registration.do" method="post">
	
		<section class="my-3">
		
		 <div class="form-row">
		    <div class="col-md-7 mb-3">
		      <label for="card-number">Card Number</label>
		      <input type="text" class="form-control rounded-0" id="card-number" pattern="[0-9]{16}" title="Card Number should be 16 digits." maxlength="16" name="cardNo" value="${listOfInfo.get(0)}" required>
		    </div>
		 
		     <div class="col-md-2 mb-3">
		      <label for="birth-date">CVV</label>
		      <input type="text" class="form-control rounded-0" id="cvv-number" pattern="[0-9]{3}" title="CVV Number should be 3 digits." maxlength="3" name="cvv" value="${listOfInfo.get(1)}" required>
		    </div>
		  </div>
		
		
		  <div class="form-row">
		    <div class="col-md-4 mb-3">
		      <label for="first-name">First Name</label>
		      <input type="text" class="form-control rounded-0" id="first-name" pattern="[a-zA-Z]{1,}" title="No special characters." maxlength="45" name="firstName" value="${listOfInfo.get(2)}" required>
		    </div>
		  
		    <div class="col-md-4 mb-3">
		      <label for="last-name">Last Name</label>
		      <input type="text" class="form-control rounded-0" id="last-name" pattern="[a-zA-Z]{1,}" title="No special characters." maxlength="45" name="lastName" value="${listOfInfo.get(3)}" required>
		    </div>
		  </div>
		
		  <div class="form-row">
		    <div class="col-md-6 mb-3">
		      <label for="ssn-number">SSN</label>
		      <input type="text" class="form-control rounded-0" id="ssn-number" pattern="[0-9]{9}" maxlength="9" title="SSN number should be 9 digits." name="ssn" value="${listOfInfo.get(4)}" required>
		    </div>
		    
		 </div>
		   
		</section>
	<button class="btn btn-info my-3" type="submit">Verify Your Information</button> 
	</form> 

</div>

</body>
</html>