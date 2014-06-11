/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function getBukuUjian($scope, $http) {
    $http.get('http://localhost:8080/chimpanzee-restful-0.0.1-SNAPSHOT/bukuUjian/abc').
        success(function(data) {
            $scope.bukuUjian = data;
        });
}

function getAllBukuUjian($scope, $http) {
    $http.get('http://localhost:8080/chimpanzee-restful-0.0.1-SNAPSHOT/bukuUjian/all').
        success(function(data) {
            $scope.bukuUjian = data;
        });
}