     <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Display</title>
    <style>
    table#nat{
    	width: 50%;
    	background-color: #c48ec5;
    }
    </style>
    </head>
    <body>  
    <% String fname =  request.getParameter("fname");
    	String lname = request.getParameter("lname");
    	String mail = request.getParameter("mail");%>
    <h2> WELCOME </h2>
    <table id ="nat">
    <tr>
    	<td>First Name</td>
    	<td><%= fname %></td>
    </tr>
    <tr>
    	<td>Last Name</td>
    	<td><%= lname %></td>
    </tr>
    <tr>
    	<td>Email</td>
    	<td><%= mail %></td>
    </tr>
    
    </table>
    </body>
    </html>