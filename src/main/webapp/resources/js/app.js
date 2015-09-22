/**
 * Created by szhao on 9/16/2015.
 */
var heibanApp = angular.module('heibanApp', []);
heibanApp.controller('courseCtrl', function ($scope, $http){

    function init(){
        $http.get('http://rubric-elb-5171323.us-east-1.elb.amazonaws.com/rubric/0b4f3936-efe7-43f2-a014-4b780aca4eca')
            .success(function(data) {
            $scope.courses = data;
            console.log(data);
        });
    }

    init();
});