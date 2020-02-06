<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tenants</title>
</head>
<body>
	
	
			
			
		<div>
			<h3>TENANTS IN  <a href= "locationdetails/${locationName}"> ${locationName}</a>  </h3>
		</div>

		<%! int i = 0;  %>
		<c:forEach items="${tenantList}" var="tenantList">
		
			<div>
			TENANT <%= i+1 %> <br>
			---------------
			</div>
		
			<div>
				<h3>${tenantList.getName()}</h3>
			</div>
			
		<div>
		
			Address: <br>
			${tenantList.getAddress().getAddress_line1()}
			<br>
			${tenantList.getAddress().getAddress_line2()}
			<br>
			${tenantList.getAddress().getCity()}
			${tenantList.getAddress().getState()} 
			${tenantList.getAddress().getZipcode()}
			<br>
			<br>
			
		</div>
		
		<div>
		
			Contact : <br>
			${tenantList.getContact().getName()}
			<br>
			${tenantList.getContact().getEmail_id()}
			<br>
			${tenantList.getContact().getPhone()} 
			<br>
			<br>
			
		</div>
		
		<% i=i+1; %>
		
		</c:forEach>
		<% i=0; %>
	

</body>
</html>