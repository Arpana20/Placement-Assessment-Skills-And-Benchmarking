<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Assessment Portal</title>
	<link rel="stylesheet" href="bootstrap.min.css">
  	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

  	<style type="text/css">
		.sidenav{
			height: 100%; /* Full-height: remove this if you want "auto" height */
  			width: 23%; /* Set the width of the sidebar */
  			position: fixed; /* Fixed Sidebar (stay in place on scroll) */
  			z-index: 1;  /*Stay on top*/ 
  			top: 0; /* Stay at the top */
  			left: 0;
  			background-color: #008080; /* Black */
  			overflow-x: hidden; /* Disable horizontal scroll */
  			padding-top: 20px;
		}
		.tab {
  			overflow: hidden;
  			border: 1px solid #ccc;
  			background-color: #f1f1f1;
  			margin-left: 24%;
  			margin-right: 1%;
  			
		}
		.tab button {
  			background-color: inherit;
  			float: left;
  			border: none;
  			outline: none;
  			cursor: pointer;
  			padding: 25px 25px 25px 25px;
  			transition: 0.3s;
		}
    .imgUser{
     height: 200px;
     width: 200px;
     margin: 15%;
      
    }

    .imgDetails{
      height: 150px;
      width: 100%;
      margin-top: 163px;
    }
		
/* Style the tab content */
.tabcontent {
  display: none;
  padding: 6px 12px;
  border: 1px solid #ccc;
  border-top: none;
  margin-left: 23%;

}

		


	</style>
</head>
<body>
	<div class="sidenav">
	<img class="imgUser" src="https://pngimage.net/wp-content/uploads/2018/06/no-user-image-png-2.png">


  <img class="imgDetails" src="https://www.beautycolorcode.com/9fa3a7-336x280.png">
</div>
<div class="tab">
  <form action = "facultyDashboard.html"><button>Home</button></form>
  <form action = "facultyUploadQuestions.html"><button>Upload Questions</button></form>
  <form action = "facultyViewReport.html"><button>View Report</button></form>
</div>

<div style="margin-left: 24%; margin-top: 20px;">
  <div class="card border-primary mb-3" style="max-width: 60rem;">
  <div class="card-header">Show Progress</div>
  <div class="card-body">
    Displaying overall progress of previous test.
  </div>
</div>
</div> 

</body>
</html>