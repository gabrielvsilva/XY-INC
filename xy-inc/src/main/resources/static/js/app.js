/**
 * Created by gabriel on 13/04/18.
 */
var appLandmark = angular.module("appLandmark", ['ngRoute']);

appLandmark.config(function ($routeProvider, $locationProvider){

    $locationProvider.hashPrefix('');

    $routeProvider
        .when("/landmark",{
            templateUrl:"views/landmark/landmark.html",
            controller:"landmarkController"
        })
        .when("/proximity",{
            templateUrl:"views/proximity/proximity.html",
            controller:"proximityController"
        })
        .otherwise({redirect:"/"});
})

