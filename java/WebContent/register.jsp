<%@page import="oftalClinic.Database"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
try{
	Connection connection = Database.getConnection(); 
}
catch(Exception e){
	e.printStackTrace();
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form>
		<div><label>Account Type: <input></label></div>
		<div><label>First Name: <input></label></div>
		<div><label>Last Name: <input></label></div>
		<div><label>E-mail: <input></label></div>
		<div><label>Password: <input></label></div>
		
		<div><button>Register</button></div>
	
	</form>
</body>
</html>