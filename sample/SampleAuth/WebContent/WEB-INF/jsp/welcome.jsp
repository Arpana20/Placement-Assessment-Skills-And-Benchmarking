
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sample Angular JS</title>
<link rel="shortcut icon" href="about:blank"/>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
</head>
<body data-ng-app="sampleAngular">
${message }
<div data-ng-controller="myController">
 Enter Numbers to Multiply:<br><input type="text" data-ng-model="num1"/> X <input type="text" data-ng-model="num2" data-ng-blur="setValue()"/>
  = <!-- <span>{{num1*num2}}</span> -->
  <input type="text" data-ng-model="result"  />
 </div>
 
 <script>
 	var ngApp = angular.module('sampleAngular', []);
 	ngApp.controller('myController', function($scope){
 		
 	
 	$scope.setValue = function(){
 		var a = $scope.num1;
 		var b = $scope.num2;
 		$scope.result = a * b;
 		
 	}
 	}
 	
 	);
 	
 	
 </script>
</body>

</html>



