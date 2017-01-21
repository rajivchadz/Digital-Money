<!DOCTYPE html>
<html>
<head>
<title>Digital Money</title>

<link rel="stylesheet" href="resources/css/form.css">
</head>
<body>

	<div class="form">
	<h1>Login</h1>
    <form method="post" action="login">
    	<font color="red"><%
    	if(request.getAttribute("validate") != null)
    		out.println(request.getAttribute("validate"));
    	else if(request.getAttribute("info") != null)
    		out.println(request.getAttribute("info"));
    	%></font>
    	
    	
    	<input type="text" name="lusername" placeholder="Username" />
        <input type="password" name="lpassword" placeholder="Password"/>
        <button type="submit" class="btn btn-primary btn-large-log">Let me in.</button>
        <button type="button" class="btn btn-primary btn-large-log" onclick="window.location.href='/Digital_Money/showRegister'">Sign Up</button>
        <a href="/Digital_Money/showPasswordPage" style="color: rgb(0,255,0)">Forgot Password?</a>
    </form>
</div>

	<div class="footer">
		<p>
			&copy;2016 Untitled. All rights reserved. | Design by <a
				href="https://www.facebook.com/rajivchadz">Chad</a>.
		</p>
	</div>

</body>
</html>