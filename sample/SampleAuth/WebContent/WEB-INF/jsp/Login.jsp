<%@taglib
uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Assessment Portal</title>
      <style type="text/css">
         input[type=text], input[type=password] {
         width: 100%;
         padding: 12px 20px;
         margin: 8px 0;
         display: inline-block;
         border: 1px solid #ccc;
         border-radius: 4px;
         box-sizing: border-box;
         }
         input[type=submit] {
         width: 100%;
         background-color: #00804d;
         color: white;
         padding: 14px 20px;
         margin: 8px 0;
         border: none;
         border-radius: 10px;
         cursor: pointer;
         }
         .formDiv {
         border-radius: 50px;
         background-color: #a0a0a0;
         padding: 50px;
         }
         .td1{
         padding: 0px 150px 0px 0px;
         }
         .td2{
         padding: 0px 0px 0px 150px;
         }
         .tdPadding{
         padding: 0px 50px 0px 50px;
         border-bottom-style: solid;
         border-top-style: solid;
         background-color: pink;
         }
      </style>
   </head>
   <body>
      <header class="w3-container w3-teal">
         <h2>Login</h2>
      </header>
      <div class="w3-container w3-half w3-margin-top">
        <p style="color:red"> ${msg} </p>
        
 	<form method="post" action="login" class="w3-container w3-card-4">
            <p>
               <label>Username</label>
               <input class="w3-input" type="text" name="userName" style="width:90%" required>
            </p>
            <p>
               <label>Password</label>
               <input class="w3-input" type="password" name="password" style="width:90%" required>
            </p>
            
            <p>
               <input type="submit" value="Submit" />
            </p>
         </form>      
      </div>
   </body>
</html>