
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<title>FreshDesk Index</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="index">FreshDesk Next Gen</a>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link" href="home.jsp">Home</a>
      </li>
	 <li class="nav-item dropdown active">
  		<a class="nav-link dropdown-toggle active" href="ticket.jsp" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Ticket<span class="sr-only">(current)</span></a>
  			<div class="dropdown-menu" aria-labelledby="navbarDropdown">
    			<a class="dropdown-item active" href="createticket">Create</a>                    
    			<a class="dropdown-item active" href="view">View</a>
  			</div>
	 </li>
      <li class="nav-item active">
        <a class="nav-link" href="signin">Sign in</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="signup">Sign up</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

<br><br>
<h1 align="center">Sign in is Failed, please enter valid email and password! </h1>

<footer>
<div id="footer-bottom" align="center"> Copyright &copy;
<script>document.write(new Date().getFullYear())</script> freshdesk
</div>
</footer>

</body>
</html>