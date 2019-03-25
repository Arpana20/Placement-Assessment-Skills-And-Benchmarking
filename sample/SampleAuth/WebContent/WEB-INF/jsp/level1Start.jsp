<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Assessment Portal</title>
</head>
<body>
${msg}


<form:form action="validateQuestions" modelAttribute="questionaire" method = "post">
	<table>
	<% for(int i=0; i<10; i++){ %>
	<tr><td>
	<label name="Question" >1.</label>
	<br>
	<form:radiobutton  path="questionTextAns" />
	<form:radiobutton  path="questionTextAns" />
	<form:radiobutton  path="questionTextAns" />
	<form:radiobutton  path="questionTextAns" />
	
	</td>
	</tr>
	<% } %>
	</table>
	<input type="submit" value="submit" />
</form:form>
Basic Test Instructions
</body>
</html>