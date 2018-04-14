appLandmark.controller("proximityController", function ($scope, $http){

    $scope.landmarks = [];
    $scope.landmark = {};

    $scope.search = function(x, y, distanceMax){
        $http({method : "GET", url : "http://localhost:8080/api/landmark/listProximity?"+"x="+ x +"&y="+ y +"&distanceMax="+ distanceMax
        }).then(function mySuccess(response) {
            $scope.landmarks = response.data;
        }, function myError(response) {
            $scope.myWelcome = response.statusText;
        });
    };

    $scope.clear = function(){
        $scope.x = null;
        $scope.y = null;
        $scope.distanceMax = null;
    }


});