<!DOCTYPE html>
<html>
<head>
<title>Digital Money</title>

<link rel="stylesheet" href="./resources/css/form.css">
</head>
<body>

	<div class="form">
	<h1>More Details</h1>
    <form method="post" action="/Digital_Money/moredetails">
    
    <font color="red"><%
    	if(request.getAttribute("validate") != null)
    		out.println(request.getAttribute("validate"));
    	%></font>
    
 	   	<input type="date" name="dob" placeholder="DOB(YYYY-MM-DD)" />
   		<input type="text" name="address" placeholder="Address" />
    	<input type="text" name="city" placeholder="City" />
    	<input type="text" name="state" placeholder="State" />
    	<input type="text" name="country" placeholder="Country" />
        
        <button type="submit" class="btn btn-primary btn-large-log">Finish!</button>
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