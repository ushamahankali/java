<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PSB Locations</title>
</head>
<body>

	

	<div>

		<div>Select Location</div>
		

		<div>
			<form:form method="post" action="tenant" commandName="tenant">
				<select id="location" name='location'>
					<c:forEach items="${tenantMap}" var="entry">
						<option value="${entry.key}">${entry.key}</option>
					</c:forEach>
				</select> <input type="submit" value="Get Tenants">
			</form:form>
		</div>

	</div>

</body>
</html>