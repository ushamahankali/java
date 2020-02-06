<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Ticket</title>
</head>
<body>
<jsp:include page="index.jsp" />
	<br>
	<br>
<div class="navbars">
<h2>


</h2>
<div align ="center">
<p>Welcome to the freshdesk create ticket page</p>

 </div>
  </div>
<br><br>
	
		<form action="createticket" method="post" id="userform">


			<div align="center">
				<table style= width:35%  cellpadding =3  align= center >
					<thead>
						<tr>
							<th colspan="2">Create Ticket</th>
						</tr>

					</thead>
					<tbody>
						<tr>
							<td>Title</td>
							<td><input type="text" name="title" /></td>
						</tr>

						<tr>
							<td>Category</td>
							
							<td><input type="text" name="category" /></td>
						</tr>

						<tr>

							<td>Priority</td>
							
						<td><input type="text" name="priority" /></td>
							</tr>

						<tr>
							<td>Description</td>
							<td> <textarea rows = "5" cols = "20" name = "description" form="userform"></textarea></td>
						</tr>
						

					<tr>
					<td></td>
							<td align ="center"><input type="submit" value="Create" /></td>

						</tr>
					</tbody>
				</table>
			</div>

		</form>
	

</body>
</html>
