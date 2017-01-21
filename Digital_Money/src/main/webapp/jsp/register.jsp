<!DOCTYPE html>
<html>
<head>
<title>Digital Money</title>

<link rel="stylesheet" href="./resources/css/form.css">
</head>
<body>

	<div class="form">
	<h1>Register Now</h1>
	
    <form method="post" action="/Digital_Money/register">
    
    	<font color="red"><%
    	if(request.getAttribute("validate") != null)
    		out.println(request.getAttribute("validate"));
    	else if(request.getAttribute("info") != null)
    		out.println(request.getAttribute("info"));
    	%></font>
    	<input type="text" name="rusername" placeholder="Username"   />
        <input type="password" name="rpassword" placeholder="Password"   />
        <input type="password" name="rerpassword" placeholder="Change Password"  >
        <input type="email" name="email_id" placeholder="Email-id"   />
        <input type="text" name="mobileno" placeholder="Mobile No."   maxlength="10" />
        <button type="submit" class="btn btn-primary btn-large-reg">Sign Up</button>
		<button type="button" class="btn btn-primary btn-large-reg" onclick="window.location.href='/Digital_Money/showLogin'">Sign In</button>
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