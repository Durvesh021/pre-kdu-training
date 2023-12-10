var plus = document.getElementById("plus");
var minus = document.getElementById("minus");
var cnt = document.getElementById("cnt");

let counter = 0;

plus.addEventListener("click", increament);
minus.addEventListener("click", decreament);

function increament() {
  counter++;
  cnt.innerHTML = counter;
}

function decreament() {
  counter--;
  cnt.innerHTML = counter;
}
