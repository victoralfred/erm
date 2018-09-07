<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Form</title>
</head>
<body>
<a href="contact">Contact</a>
<a href="form">Form</a>

<form method="post" action="processForm">
  First name:<br>
  <input type="text" name="firstname"><br>
  Last name:<br>
  <input type="text" name="lastname"><br>
<button type="submit">Save</button>
</form>
</body>
</html>