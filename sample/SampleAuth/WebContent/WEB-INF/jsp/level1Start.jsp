<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
      <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Assessment Portal</title>
	<style>
	input[type="submit"] {
         width: 10%;
         background-color: #00804d;
         color: white;
         padding: 14px 20px;
         margin: 8px 0;
         border: none;
         border-radius: 10px;
         cursor: pointer;
         }   
	
	</style>
</head>
<body>
${msg}
<header class="w3-container w3-teal">
         <h2>Take Test</h2>
      </header>
<div style="margin:1%">
<form action="validateQuestions" method = "post">
	<table>
	
	<tr>
	<label name="Question" >1.	Which one of the following is not a prime number?</label>
	<br>

	
	<input type="radio" name="choice1" value = "1"> 31 <br>
    <input type="radio" name="choice1" value = "2"> 61 <br>
    <input type="radio" name="choice1" value = "3"> 71 <br>
    <input type="radio" name="choice1" value = "4"> 91 <br>
	
	</td>
	</tr>
	<br>
	
	<tr>
	<label name="Question" >2.	What least number must be added to 1056, so that the sum is completely divisible by 23 ?</label>
	<br>

	
	<input type="radio" name="choice2" value = "1"> 2 <br>
    <input type="radio" name="choice2" value = "2"> 3 <br>
    <input type="radio" name="choice2" value = "3"> 18 <br>
    <input type="radio" name="choice2" value = "4"> 21 <br>
	
	</td>
	</tr>
	<br>
	<tr>
	
	<label name="Question" >3.	1397 x 1397 = ?</label>
	<br>

	
	<input type="radio" name="choice3" value = "1"> 1951609 <br>
    <input type="radio" name="choice3" value = "2"> 1981709 <br>
    <input type="radio" name="choice3" value = "3"> 18362619 <br>
    <input type="radio" name="choice3" value = "4"> 2031719 <br>
	
	</td>
	</tr>
	<br>
	<tr>
	<label name="Question" >4.	How many of the following numbers are divisible by 132 ?<br>
								264, 396, 462, 792, 968, 2178, 5184, 6336</label>
	<br>

	
	<input type="radio" name="choice4" value = "1"> 4 <br>
    <input type="radio" name="choice4" value = "2"> 5 <br>
    <input type="radio" name="choice4" value = "3"> 6 <br>
    <input type="radio" name="choice4" value = "4"> 7 <br>
	
	</td>
	</tr>
	<br>
	<tr>
	<label name="Question" >5.	If the number 97215 * 6 is completely divisible by 11, then the smallest whole number in place of * will be:</label>
	<br>

	
	<input type="radio" name="choice5" value = "1"> 3 <br>
    <input type="radio" name="choice5" value = "2"> 2 <br>
    <input type="radio" name="choice5" value = "3"> 1 <br>
    <input type="radio" name="choice5" value = "4"> 5 <br>
	
	</td>
	</tr>
	<br>
	<tr>
	<label name="Question" >6.	If the number 5 * 2 is divisible by 6, then * = ?	</label>
	<br>

	
	<input type="radio" name="choice6" value = "1"> 2 <br>
    <input type="radio" name="choice6" value = "2"> 3 <br>
    <input type="radio" name="choice6" value = "3"> 6 <br>
    <input type="radio" name="choice6" value = "4"> 7 <br>
	
	</td>
	</tr>
	<br>
	<tr>
	<label name="Question" >7.	A boy multiplied 987 by a certain number and obtained 559981 as his answer. If in the answer both 9 are wrong and the other digits are correct, then the correct answer would be:</label>
	<br>

	
	<input type="radio" name="choice7" value = "1"> 553681 <br>
    <input type="radio" name="choice7" value = "2"> 555181 <br>
    <input type="radio" name="choice7" value = "3"> 555681 <br>
    <input type="radio" name="choice7" value = "4"> 556581 <br>
	
	</td>
	</tr>
	<br>
	<tr>
	<label name="Question" >8.	How many prime numbers are less than 50 ?</label>
	<br>

	
	<input type="radio" name="choice8" value = "1"> 16 <br>
    <input type="radio" name="choice8" value = "2"> 15 <br>
    <input type="radio" name="choice8" value = "3"> 14 <br>
    <input type="radio" name="choice8" value = "4"> 18 <br>
	
	</td>
	</tr>
	<br>
	<tr>
	<label name="Question" >9.	When a number is divided by 13, the remainder is 11. When the same number is divided by 17, then remainder is 9. What is the number ?</label>
	<br>

	
	<input type="radio" name="choice9" value = "1"> 339 <br>
    <input type="radio" name="choice9" value = "2"> 349 <br>
    <input type="radio" name="choice9" value = "3"> 369 <br>
    <input type="radio" name="choice9" value = "4"> Data Inadequate <br>
	
	</td>
	</tr>
	<br>
	<tr>
	<label name="Question" >10.	If the number 42573 * is exactly divisible by 72, then the minimum value of * is:</label>
	<br>

	
	<input type="radio" name="choice10" value = "1"> 4 <br>
    <input type="radio" name="choice10" value = "2"> 5 <br>
    <input type="radio" name="choice10" value = "3"> 6 <br>
    <input type="radio" name="choice10" value = "4"> 7 <br>
	
	</td>
	</tr>
	</table>
	<input type="submit" value="submit" />
</form>
</div>
</body>
</html>