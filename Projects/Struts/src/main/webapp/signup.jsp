<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
    }
    form {
        max-width: 300px;
        margin: 50px auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
    }
    input[type="text"],
    input[type="password"],
    input[type="submit"] {
        width: calc(100% - 10px);
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
        box-sizing: border-box;
    }
    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        border: none;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
    input[type="submit"]:focus {
        outline: none;
    }
    form h1{
	text-align: center;
	color:green;
}
</style>
</head>
<body>
    <form action="signup">
    	<h1>SignUp</h1>
        <label>Name</label>
        <input type="text" name="name" required>
        <label>Email ID</label>
        <input type="text" name="email" required>
        <label>UserName</label>
        <input type="text" name="userName" required>
        <label>Password</label>
        <input type="password"  id="pass"name="password" required>
        <label>Re-Enter Password</label>
        <input type="password" required name="reenterpassword" id="cnfpass" onkeyup="checkPassword()" >
        <span id="error-message"></span>
        <input type="submit" id="btn" value="Sign Up">
    </form>

<script>
function checkPassword() {
	let btn = document.getElementById("btn");
	let errorMessage = document.getElementById("error-message");
	if (document.getElementById("cnfpass").value == document
			.getElementById("pass").value) {
		btn.removeAttribute("disabled");
		errorMessage.textContent = "";
	} else {
		btn.setAttribute("disabled", "disabled");
		errorMessage.textContent = "Confirm Password should be same as Password!";
	}
}
</script>
</body>
</html>