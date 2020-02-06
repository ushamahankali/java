<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<jsp:include page="index.jsp" />
	<br>
	<br>
	
<div align ="left">



</div>

<div align = "center">

</div>
 <div align="center">
<p>Welcome to the freshdesk login page</p>
</div>
   
 <form action="login" method="post">
           
 
            <table width="30%" cellpadding="3" align ="center">
             
                <thead>
              
                    <tr>
                        <th colspan="2">Login Page</th>
                    </tr>
              
                </thead>
                <tbody>
                    <tr>
                        <td>email Id</td>
                        <td><input type="text" name="emailid" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="" /></td>
                    </tr>
                    <tr>
                     <td><input type="reset" value="Reset" /></td>
                        <td><input type="submit" value="Login" /></td>
                       
                    </tr>
                    <tr>
                        <td colspan="2">New User <a href= signup.jsp>Sign Up Here</a></td>
                    </tr>
                </tbody>
            </table>
            
    </form>
    <div align = "center">
  ${infoMessage}
  </div>
</body>
</html> 

