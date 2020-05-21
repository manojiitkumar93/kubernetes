function sayHello(){
console.log("IN SayHello Function");

var request = new XMLHttpRequest();
request.open('GET', 'http://localhost:8080/hello', true);
request.setRequestHeader("Access-Control-Allow-Origin", "*");
request.onload = function () {

  var data = this.response;
console.log("Response ",data );
document.getElementById("root").innerHTML = data;
document.getElementById("button").style.display = "none";
}
request.send();
}



