<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>freshdesk | index </title>
<meta name = "description" content = "this is the first index page for this application">

<style>
* {box-sizing: border-box}
body {font-family: Arial, Helvetica, sans-serif;  background-color:#778899; font-color: }
.navbar {
  width: 100%;
  background-color: red;
  overflow: auto;
}

a:link, a:visited {
 
  color: red;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color:#778899;
}
.navbar a {
  float: left;
  padding: 12px;
  color: white;
  text-decoration: none;
  font-size: 17px;
  width: 25%; /* Four links of equal widths */
  text-align: center;
}

.navbar a:hover {
  background-color:;
}

.navbar a.active {
  background-color: purple;
}

@media screen and (max-width: 500px) {
  .navbar a {
    float: none;
    display: block;
    width: 100%;
    text-align: left;
  }
}
</style>
<body>

<div class="navbars">
<h2>
<a href = "index">
freshdesk
</a>
</h2>
</div>


<div class="navbar">
 <a href="home">Home</a> 
  
  <a href="ticket">Ticket</a>
  
  <a href="signup">SignUp</a> 
  
  <a href="login">Login</a>
</div>

</body>
</html> 

	
