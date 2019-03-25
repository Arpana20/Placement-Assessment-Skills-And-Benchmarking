<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Assessment Portal</title>
  <link rel="stylesheet" href="bootstrap.min.css">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
	<style type="text/css">
		
		.tab {
  			overflow: hidden;
  			border: 1px solid #ccc;
  			background-color: #f1f1f1;
  			
  			
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

<div class="tab">
  <form action = "studentDashboard.html"><button>Take Test</button></form>
  <form action = "studentDashboard.html"><button>Practice Tests</button></form>
  <form action = "studentViewReport.html"><button>View Report</button></form>

</div>
<div >
  <div class="card border-primary mb-3" style="max-width: 60rem;">
  <div class="card-header">Level 1</div>
  <div class="card-body">
    <h4 class="card-title">Basic Test</h4>
    <p class="card-text">This part checks for your ability in basic Aptitude(Both Analytical and Quantitative Skills).</p>
    <form action="level1Test.html" method="get"><input class="w3-button w3-section w3-teal w3-ripple" type="submit" value="Go!"></form>
  </div>
</div>
</div>  
<div>
  <div class="card border-primary mb-3" style="max-width: 60rem;">
  <div class="card-header">Level 2</div>
  <div class="card-body">
    <h4 class="card-title">Intermediate Test</h4>
    <p class="card-text">This part checks for your ability in Domain Knowledge(Differs Department wise).</p>
    <form action="level2Test.html" method="get"><input class="w3-button w3-section w3-teal w3-ripple" type="submit" value="Go!"></form>
  </div>
</div>
</div>
<div>
  <div class="card border-primary mb-3" style="max-width: 60rem;">
  <div class="card-header">Level 3</div>  
  <div class="card-body">
    <h4 class="card-title">Advanced Test</h4>
    <p class="card-text">This part concentrates on Company related problem statements.</p>
    <form action="level3Test.html" method="get"><input class="w3-button w3-section w3-teal w3-ripple" type="submit" value="Go!">
    
    
    
    
    </form>
  </div>
</div>
</div>
</body>
</html>