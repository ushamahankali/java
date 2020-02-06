<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>location details</title>
</head>

<body>

	<div>
		<h3>${locationName}</h3>
		
	</div>
	
	<div>
		<h3> Number of tenants :  ${location.getNoOfTenants()}  </h3>
	</div>
	
	<div>
		Address : <br>
		 ${location.getAddress().getAddress_line1()} 
		<br>
		 ${location.getAddress().getCity()} 
		 ${location.getAddress().getState()} 
		 ${location.getAddress().getZipcode()} 
		<br>
		<br>
	</div>
	
	<div>
		Contact : <br>
		 ${location.getContact().getName()} 
		<br>
		 ${location.getContact().getEmail_id()} 
		<br>
		 ${location.getContact().getPhone()} 
	</div>
	
</body>
</html>