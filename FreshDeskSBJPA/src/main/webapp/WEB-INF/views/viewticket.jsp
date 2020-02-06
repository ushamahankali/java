<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>


      <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<title>FreshDesk Index</title>
<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>
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
        <a class="nav-link" href="home">Home</a>
      </li>

	 <li class="nav-item active">
        <a class="nav-link" href="ticket">Ticket</a>
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
<%-- 
<table id="customers">
					<tr>
						<th>Ticket Number</th>
						<th>Title</th>
						<th>Category</th>
						<th>Priority</th>
						<th>Description</th>
					</tr>

					<%
							try{
								ArrayList<Ticket> list = (ArrayList<Ticket>) request.getAttribute("ticket");

							for (Ticket tkList : list) {
					%>
					<tr>
						<td>
							<%
								out.println(tkList.getTicketNumber());
							%>
						</td>
						<td>
							<%
								out.println(tkList.getTitle());
							%>
						</td>
						<td>
							<%
								out.println(tkList.getCategory());
							%>
						</td>
						<td>
							<%
								out.println(tkList.getPriority());
							%>
						</td>
						<td>
							<%
								out.println(tkList.getDescription());
							%>
						</td>
							<% }}catch (NullPointerException e){
								
							}%>
					</tr>
				</table> --%>

<footer>
<div id="footer-bottom" align="center"> Copyright &copy;
<script>document.write(new Date().getFullYear())</script> freshdesk
</div>
</footer>

</body>
</html>