/**
 * Created by szhao on 9/16/2015.
 */
var heibanApp = angular.module('heibanApp', []);
heibanApp.controller('courseCtrl', function ($scope, $http){

    function init(){
        $http.get('http://104.230.217.10:8090/rest/courses')
            .success(function(data) {
                $scope.courses = data;
                console.log(data);
            });
    }

    init();
});