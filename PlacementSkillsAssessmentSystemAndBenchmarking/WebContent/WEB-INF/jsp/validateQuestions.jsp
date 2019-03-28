<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assessment Portal</title>
<style>
table#t01 {
  width: 50%;    
  background-color: #f1f1c1;
}
th, td {
  padding: 15px;
  text-align: left;
}
</style>
</head>
<body>

<center>
<h2>RESULT</h2>
<table id="t01">
  
  <tr>
    <td>NO. OF QUESTIONS</td>
    <td>10</td>
  </tr>
  <tr>
    <td>NO. OF CORRECT ANSWERS</td>
    <td>${marks }</td>
  </tr>
  <tr>
    <td>RESULT</td>
    <td>${result }</td>
  </tr>
</table>
<form action="newstudentDashboard" method="post">
  	<input type="submit" value="Back">
  	</form>
  	<form action="newLogin" method="get">
  	<input type="submit" value="Logout">
  	</form>
</center>

</body>
</html>