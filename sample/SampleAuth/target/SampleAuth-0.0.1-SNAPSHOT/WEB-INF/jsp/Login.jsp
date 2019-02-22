
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sample Hello World</title>
<link rel="shortcut icon" href="about:blank"/>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
</head>
<body data-ng-app="sampleAngular">

<div data-ng-controller="logindo as myController">
<h1>Login</h1><br><form method="get">
				  Username:<input type="text" data-ng-model="logindo.uname"/> <br> 
 				  Password:<input type="password" data-ng-model="logindo.pwd" /><br>
  				  <input type="submit"/>
  				  </form>  				  
  				  <input type="text" data-ng-model="result"/>
 </div>
 <script>
 	var ngApp = angular.module('sampleAngular', []);
 	ngApp.controller('myController', function($scope){
 		$scope.setValue = function(){
 			var a = $scope.logindo;
 			$scope.result = a;
 		}
 	});
 </script>
</body>
</html>