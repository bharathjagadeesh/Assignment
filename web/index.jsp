<%-- 
    Document   : index
    Created on : Apr 16, 2018, 11:06:01 PM
    Author     : Bharath Jagadeesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>
<style>
div.ex {
	text-align: right;
        width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	<h1>Registration Form</h1>
	<div class="ex">
		<form action="RegistrationController" method="post">
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fname" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="mail" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pwd" /></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="pwd2" /></td>
				</tr>
			</table>
			<input type="submit" value="register" />
		</form>
	</div>
</body>
</html>