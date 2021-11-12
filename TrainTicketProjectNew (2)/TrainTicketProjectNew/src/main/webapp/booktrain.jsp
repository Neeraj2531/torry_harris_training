<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Train Details</title>
</head>
<body background="https://media.istockphoto.com/photos/train-picture-id903338678";"
background-repeat:repeat -x>
<h1 align="center"> TICKET BOOKING </h1>
<marquee><h2 font colour="green">Welcome To Indian Railways</h2></marquee>
<div align="center">
<form>
    <table border="0px">

        <tr>
            <td align="center">Train Number:</td>
            <td><input id="numb" type="number"></td>
             <button style="background-color: grey"; type="button" onclick="myFunction()">Validate</button>
             <p style="background-color: red";   id="demo"></p>
             <p style="background-color: green";   id="demo1"></p>

        </tr>
        <tr>
            <td>Date & Time</td>
            <td><input type="date"></td>
        </tr>

    </table>
    <form action="noofpassangers.jsp">
    <submit><input type="button" value="Select Train" colour="red"/></submit>
    <input type="reset" value="Reset">
    </form>
</form>
</div>
<script>
function myFunction() {
  // Get the value of the input field with id="numb"
  let x = document.getElementById("numb").value;
  let text;
  let text1;
  if (isNaN(x) || x < 1001 || x > 1006) {
    text = "Please enter train number between 1001 and 1006";
     document.getElementById("demo").innerHTML = text;
  } else {
    text1 = "Valid train number";
    document.getElementById("demo1").innerHTML = text1;
  }
}
</script>
</body>
</html>