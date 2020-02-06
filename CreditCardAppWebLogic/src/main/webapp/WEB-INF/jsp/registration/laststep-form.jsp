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
<h1 class="pb-4">Set up Username and Password</h1>
<p class="text-danger pb-3">${usernameDuplicateMessage} ${registrationFailedMessage}</p>

<form action="./registrationResult.do" method="post">

<p>${registrationMessage}</p>
<p>It's almost done. Please set up your user name and password below.</p>

<section class="my-3">

 <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="user-name">User Name</label>
      <input type="text" class="form-control rounded-0" id="user-name" pattern="[a-zA-Z0-9]{3,}" title="Please use at least 3 letters or digits, no space and special characters." maxlength="45" name="username" required>
    </div>
 
  </div>


  <div class="form-row">
    <div class="col-md-4 mb-3">
      <label for="password">Password</label>
      <input type="password" class="form-control rounded-0" id="password" pattern="[^\s]+" title="No spaces." maxlength="45" name="password" required>
    </div>
  </div>  
</section>
 
  	<input type="hidden" name="cardNo" value="${cardNo}">
  	<input type="hidden" name="firstName" value="${firstName}">
    <input class="btn btn-info" type="submit" value="Set Up my Account">
  
</form>

</div>

</body>
</html>