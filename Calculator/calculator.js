"Result: " + //four operations
  document.getElementById("+").addEventListener("click", add);
document.getElementById("-").addEventListener("click", sub);
document.getElementById("*").addEventListener("click", mul);
document.getElementById("/").addEventListener("click", div);

var result;

function add() {
  let ip1 = parseFloat(document.getElementById("ip1").value);
  let ip2 = parseFloat(document.getElementById("ip2").value);
  result = ip1 + ip2;
  alert("Result: " + result);
}

function sub() {
  let ip1 = parseFloat(document.getElementById("ip1").value);
  let ip2 = parseFloat(document.getElementById("ip2").value);
  result = ip1 - ip2;
  alert("Result: " + result);
}

function mul() {
  let ip1 = parseFloat(document.getElementById("ip1").value);
  let ip2 = parseFloat(document.getElementById("ip2").value);
  result = ip1 * ip2;
  alert("Result: " + result);
}

function div() {
  let ip1 = parseFloat(document.getElementById("ip1").value);
  let ip2 = parseFloat(document.getElementById("ip2").value);
  if (ip2 == 0) {
    alert("Cannot divide by zero");
    return;
  }
  result = ip1 / ip2;
  alert("Result: " + result);
}
