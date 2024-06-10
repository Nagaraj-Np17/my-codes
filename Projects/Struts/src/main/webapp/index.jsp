<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome To Our App</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
    }
    h1 {
        color: #333;
        text-align: center;
        margin-top: 50px;
    }
    form {
        max-width: 300px;
        margin: 20px auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    label {
        display: block;
        margin-bottom: 10px;
        font-weight: bold;
    }
    input[type="text"],
    input[type="password"],
    input[type="submit"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 3px;
        box-sizing: border-box;
        height: 40px;
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
    .signup-button {
        text-align: center;
        margin-top: 10px;
    }
    .signup-button a {
        background-color: #008CBA;
        color: white;
        border: none;
        padding: 10px 20px;
        text-align: center;
        text-decoration: none;
        font-size: 16px;
        cursor: pointer;
        border-radius: 3px;
        display: inline-block;
    }
    .signup-button a:hover {
        background-color: #005f6b;
    }
</style>
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
</head>
<body>
    <h1>Welcome To Our App</h1>
    <form action="login" method="post">
        <label for="username">User Name</label>
        <input type="text" id="username" name="username" autocomplete="off" required>
        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>
        <% if (request.getAttribute("errorMessage")!=null){%>
       <p style="color: red; text-align: center;"><%=request.getAttribute("errorMessage")%></p>
        <%} %>
        <input type="submit" value="LOGIN">
    </form>
    <div class="signup-button">
        <a href="signup.jsp">SignUp</a>
    </div>
</body>
</html>
