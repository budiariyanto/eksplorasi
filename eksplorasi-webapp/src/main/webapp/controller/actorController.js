/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function getActor($scope, $http) {
    $http.get('http://localhost:8080/eksplorasi-restful-0.0.1-SNAPSHOT/actor/abc').
        success(function(data) {
            $scope.actor = data;
        });
}

function getAllActor($scope, $http) {
    $http.get('http://localhost:8080/eksplorasi-restful-0.0.1-SNAPSHOT/actor/all').
        success(function(data) {
            $scope.actor = data;
        });
}