<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>
	<jsp:include page="index.jsp" />
	<br />
	<br>


	
	<div align="center">
		<p>Welcome to the freshdesk Sign Up page</p>
	</div>
	

	
		<form action="signup" method="post">
		





			<div align="center">
				<table  width="35%" cellpadding="3"  align="center" border="0">
					<thead>
						<tr>
							<th colspan="2">Sign Up Page</th>
						</tr>

					</thead>
					<tbody>
						<tr>
							<td>FirstName</td>
							<td><input type="text" name="firstName" /></td>
						</tr>

						<tr>
							<td>LastName
							
							<td><input type="text" name="lastName" /></td>
						</tr>

						<tr>

							<td>EmailId</td>
							
						<td><input type="text" name="emailid" /></td>
							</tr>

						<tr>
							<td>Password</td>
							<td><input type="password" name="password"></td>
						</tr>
						<tr>

							<td>PhoneNumber</td>
							<td><input type="number" name="phoneNumber"></td>
						</tr>

					<tr>
					<td></td>
							<td align ="center"><input type="submit" value="Sign Up" /></td>

						</tr>
					</tbody>
				</table>
			</div>

		</form>
	  <div align = "center">
  ${infoMessage}
  </div>

</body>
</html>
