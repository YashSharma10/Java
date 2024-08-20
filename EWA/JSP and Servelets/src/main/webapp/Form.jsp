<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style>
*{
        font-family: Arial, sans-serif;
        background-color: #f5f5f5;
}
.details{
        border: 1px solid #ccc;
        border-radius: 2px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
       
        }
</style>
</head>
<body>
Today's date :
<%=(new java.util.Date()).toLocaleString() %>
<h1>Registration Form</h1>
<br>
<div class=details>
<form name = "details" action="login" method="post">
<table style ="width:90%">
<tr>
<td>USERNAME :</td>
<td><input type="text" name = username>
</tr>
<tr>
<td>PASSWORD :</td>
<td><input type="text" name = password>
</tr>
<tr>
<td>FIRST NAME :</td>
<td><input type="text" name = first_name>
</tr>
<tr>
<td>LAST NAME :</td>
<td><input type="text" name = last_name>
</tr>
<tr>
<td>ADDRESS :</td>
<td><input type="text" name = address>
</tr>
<tr>
<td>CONTACT NO. :</td>
<td><input type="text" name = conatact>
</tr>
</table><br>
<input type="submit" value="submit">

</form>
</div>
</body>
</html>