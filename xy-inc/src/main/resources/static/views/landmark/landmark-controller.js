/**
 * Created by gabriel on 13/04/18.
 */
appLandmark.controller("landmarkController", function ($scope, $http){

    $scope.landmarks = [];
    $scope.landmark = {};


    $scope.listLandmark = function(){
        $http({
            method : "GET",
            url : "http://localhost:8080/api/landmark/list"
        }).then(function mySuccess(response) {
            $scope.landmarks = response.data;
        }, function myError(response) {
            $scope.myWelcome = response.statusText;
        });
    };

    $scope.save = function(){
        $http({method:'POST', url:'http://localhost:8080/api/landmark/save', data:$scope.landmark})
            .then(function (response){
                $scope.landmark = {};
                $scope.listLandmark();
            }, function(response){
                console.log(response.status);
                console.log(response.data);
                $scope.landmark = {};
                alert("error");
            });
    };

    $scope.clear = function(){
        $scope.landmark = {};
    }


    $scope.listLandmark();
});