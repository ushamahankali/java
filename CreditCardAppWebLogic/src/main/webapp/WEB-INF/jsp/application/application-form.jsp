<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<div class="container my-5">
<h1 class="pb-5">Application Form</h1>
<p class="text-danger pb-3">${ssnDuplicateMessage}</p>

<form action="./applicationResult.do" method="post">

<section class="my-3">
  <h2>Personal Information</h2>
  <div class="form-row">
    <div class="col-md mb-3">
      <label for="first-name">First Name</label>
      <input type="text" class="form-control rounded-0" id="first-name" pattern="[a-zA-Z]{1,}" maxlength="45" title="No special characters." value="${customer.firstName}" name="firstName" required>
    </div>
    <div class="col-md-3 mb-3">
      <label for="middle-name">Middle Name</label>
      <input type="text" class="form-control rounded-0" id="middle-name" pattern="[a-zA-Z]{0,}" maxlength="45" title="No special characters." placeholder="optional" value="${customer.middleName}" name="middleName">
    </div>
    <div class="col-md mb-3">
      <label for="last-name">Last Name</label>
      <input type="text" class="form-control rounded-0" id="last-name" pattern="[a-zA-Z]{1,}" maxlength="45" title="No special characters." value="${customer.lastName}" name="lastName" required>
    </div>
  </div>

  <div class="form-row">
    <div class="col-md-7 mb-3">
      <label for="ssn-number">SSN</label>
      <input type="text" class="form-control rounded-0" id="ssn-number" pattern="[0-9]{9}" maxlength="9" title="SSN number should be 9 digits." value="${customer.ssn}" name="ssn" required>    
    </div>
  </div>

  <div class="form-row">
    <div class="col-md-5 mb-3">
      <label for="birth-date">Date of Birth</label>
      <input type="date" class="form-control rounded-0" id="birth-date" value="${customer.birthDate}" name="birthDate" required>
    </div>
  </div>
</section>



<section class="my-3">
  <h2>Contact</h2>
  <div class="form-row">
    <div class="col-md-10 mb-3">
      <label for="home-address">Home Address</label>
      <input type="text" class="form-control rounded-0" id="home-address" pattern=".{1,}" maxlength="100" value="${contact.address}" name="address" required>
    </div>
    <div class="col-md-2 mb-3">
      <label for="apt-number">Apt(opt.)</label>
      <input type="text" class="form-control rounded-0" id="apt-number" maxlength="20" placeholder="optional" value="${contact.apt}" name="apt">
    </div>
  </div>

   <div class="form-row">
    <div class="col-md-3 mb-3">
      <label for="city">City</label>
      <input type="text" class="form-control rounded-0" id="city" pattern="[a-zA-Z0-9]{1,}" maxlength="45" value="${contact.city}" name="city" required>
    </div>   
    <div class="col-md-3 mb-3">
      <label for="state">State</label>
      <select class="state form-control rounded-0" id="state" name="state" required>
        <option hidden disabled selected>
	    <option value="AL">Alabama</option>
	    <option value="AK">Alaska</option>
	    <option value="AZ">Arizona</option>
	    <option value="AR">Arkansas</option>
	    <option value="CA">California</option>
	    <option value="CO">Colorado</option>
	    <option value="CT">Connecticut</option>
	    <option value="DE">Delaware</option>
	    <option value="DC">District Of Columbia</option>
	    <option value="FL">Florida</option>
	    <option value="GA">Georgia</option>
	    <option value="HI">Hawaii</option>
	    <option value="ID">Idaho</option>
	    <option value="IL">Illinois</option>
	    <option value="IN">Indiana</option>
	    <option value="IA">Iowa</option>
	    <option value="KS">Kansas</option>
	    <option value="KY">Kentucky</option>
	    <option value="LA">Louisiana</option>
	    <option value="ME">Maine</option>
	    <option value="MD">Maryland</option>
	    <option value="MA">Massachusetts</option>
	    <option value="MI">Michigan</option>
	    <option value="MN">Minnesota</option>
	    <option value="MS">Mississippi</option>
	    <option value="MO">Missouri</option>
	    <option value="MT">Montana</option>
	    <option value="NE">Nebraska</option>
	    <option value="NV">Nevada</option>
	    <option value="NH">New Hampshire</option>
	    <option value="NJ">New Jersey</option>
	    <option value="NM">New Mexico</option>
	    <option value="NY">New York</option>
	    <option value="NC">North Carolina</option>
	    <option value="ND">North Dakota</option>
	    <option value="OH">Ohio</option>
	    <option value="OK">Oklahoma</option>
	    <option value="OR">Oregon</option>
	    <option value="PA">Pennsylvania</option>
	    <option value="RI">Rhode Island</option>
	    <option value="SC">South Carolina</option>
	    <option value="SD">South Dakota</option>
	    <option value="TN">Tennessee</option>
	    <option value="TX">Texas</option>
	    <option value="UT">Utah</option>
	    <option value="VT">Vermont</option>
	    <option value="VA">Virginia</option>
	    <option value="WA">Washington</option>
	    <option value="WV">West Virginia</option>
	    <option value="WI">Wisconsin</option>
	    <option value="WY">Wyoming</option>
    </select>
    </div>
    <div class="col-md-3 mb-3">
      <label for="zipcode">Zipcode</label>
      <input type="text" class="form-control rounded-0" id="zipcode" pattern="[0-9]{5}" title="Zipcode should be 5 digits." maxlength="5" value="${contact.zipcode}" name="zipcode" required>
    </div>
  </div>

  <div class="form-row">
    <div class="col-md-5 mb-3">
      <label for="phone-number">Phone Number</label>
      <input type="text" class="form-control rounded-0" id="phone-number" pattern="[0-9-()]{5,20}" title="Phone Number should only contains digits, - or ()." maxlength="20" value="${contact.phone}" name="phone" required>
    </div>
    <div class="col-md-5 mb-3">
      <label for="email-address">Email</label>
      <input type="email" class="form-control rounded-0" id="email-address" maxlength="45" value="${contact.email}" name="email" required>
    </div>
  </div>
</section>

<section class="my-3">
  <h2>Security Word</h2>
   <div class="form-row">
    <div class="col-md-7 mb-3">
      <label for="security-question">Security Question</label>
      <select class="security-question form-control rounded-0" id="security-question" name="questionId" required>
        <option hidden disabled selected></option>
          <c:forEach var="question" items="${listOfQuestion}">
          	<option value="${question.questionId}">${question.question}</option>
      	  </c:forEach>
      
<!--        <option value="1">What was the house number and street name you lived in as a child?</option>
    <option value="2">What were the last four digits of your childhood telephone number?</option>
    <option value="3">What primary school did you attend?</option>
    <option value="4">In what town or city was your first full time job?</option>
    <option value="5">In what town or city did you meet your spouse/partner?</option>
    <option value="6">What is the middle name of your oldest child?</option> -->
    
      </select>
    </div>
    <div class="col-md-5 mb-3">
      <label for="security-word">Security Word</label>
      <input type="text" class="form-control rounded-0" id="security-word" pattern="[a-zA-Z0-9]{1,}" maxlength="45" value="${application.word}" name="word" required>
    </div>
  </div>
</section>

<section class="my-3">
  <h2>Income</h2>
  <div class="form-row">
    <div class="col-md-3 mb-3">
      <label for="annual-income">Annual Income</label>
      <input type="text" class="form-control rounded-0" id="annual-income" pattern="[0-9]{0,}" title="Please input a whole number for it." value="${customer.annualIncome}" name="annualIncome" required>
    </div>
  </div>
</section>

  <button class="btn btn-info my-3" type="submit">Submit Form</button>
</form>
   

</div>

<script>
var date = new Date();
var dateInFormat = date.getFullYear() + "-" + ("0"+(date.getMonth()+1)).slice(-2) + "-" + ("0"+date.getDate()).slice(-2);
/* console.log(dateInFormat); */
$(document).ready(function(){
 $("select.security-question > option[value='${application.getQuestionId()}']").attr("selected","selected");
 $("select.state > option[value='${contact.getState()}']").attr("selected","selected");
$("#birth-date").attr("max", dateInFormat); 
});
</script>
</body>
</html>