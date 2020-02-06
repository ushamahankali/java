<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Activation</title>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
<script src="resources/script.js"></script>
<script src="https://kit.fontawesome.com/a1c203ab73.js"></script></head>
<body>

<div id="nav-bar-placeholder"></div>

<div class="container my-5">
<h1 class="pb-4">Activate Your Card</h1>
<p class="text-danger pb-3">${cardNotFoundMessage} ${infoNotMatchMessage}</p>

<form action="./activation.do" method="post">

<section class="my-3">

 <div class="form-row">
    <div class="col-md-6 mb-3">
      <label for="card-number">Card Number</label>
      <input type="text" class="form-control rounded-0" id="card-number" pattern="[0-9]{16}" title="Card Number should be 16 digits." maxlength="16" value="${listOfInfo.get(0)}" name="cardNo" required>
    </div>
  </div>


  <div class="form-row">
    <div class="col-md-5 mb-3">
      <label for="first-name">First Name</label>
      <input type="text" class="form-control rounded-0" id="first-name" pattern="[a-zA-Z]{1,}" title="No special characters." maxlength="45" value="${listOfInfo.get(1)}" name="firstName" required>
    </div>
  
    <div class="col-md-5 mb-3">
      <label for="last-name">Last Name</label>
      <input type="text" class="form-control rounded-0" id="last-name" pattern="[a-zA-Z]{1,}" title="No special characters." maxlength="45" value="${listOfInfo.get(2)}" name="lastName" required>
    </div>
  </div>

  <div class="form-row">
    <div class="col-md-3 mb-3">
      <label for="last4-ssn">Last 4 digits of SSN</label>
      <input type="text" class="form-control rounded-0" id="last4-ssn" pattern=[0-9]{4} title="4 digits only." maxlength="4" value="${listOfInfo.get(3)}" name="last4Ssn" required>
    </div>
    
    <div class="col-md-1 mb-3">
    </div>
    
    <div class="col-md-5 mb-3">
      <label for="birth-date">Date of Birth</label>
      <input type="date" class="form-control rounded-0" id="birth-date" value="${listOfInfo.get(4)}" name="birthDate" required>
    </div>
  </div>


   <div class="form-row">
    <div class="col-md-8 mb-3">
      <label for="security-question">Security Question</label>
      <select type="number" class="security-question form-control rounded-0" id="security-question" name="questionId" required>
        <option hidden disabled selected></option>
          <c:forEach var="question" items="${listOfQuestion}">
          <option value="${question.questionId}">${question.question}</option>
      </c:forEach>
      </select>
    </div>
  </div>
  
   <div class="form-row">
    <div class="col-md-5 mb-3">
      <label for="security-word">Security Word</label>
      <input type="text" class="form-control rounded-0" id="security-word" pattern="[a-zA-Z0-9]{1,}" maxlength="45" value="${listOfInfo.get(6)}" name="word" required>
    </div>   
   </div>
    
   
</section>
  <button class="btn btn-info my-3" type="submit">Verify Your Information</button> 
</form>

</div>
<script>
var date = new Date();
var dateInFormat = date.getFullYear() + "-" + ("0"+(date.getMonth()+1)).slice(-2) + "-" + ("0"+date.getDate()).slice(-2);

$(document).ready(function(){
 $("select.security-question > option[value='${listOfInfo.get(5)}']").attr("selected","selected");
 $("#birth-date").attr("max", dateInFormat); 
});
</script>

</body>
</html>