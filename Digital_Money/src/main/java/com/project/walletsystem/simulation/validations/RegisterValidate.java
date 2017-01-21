package com.project.walletsystem.simulation.validations;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.walletsystem.simulation.beans.RegisterBean;

public class RegisterValidate {

	public String validate(HttpServletRequest req,HttpServletResponse resp)
	{
		if (req.getParameter("rusername").equals("") || req.getParameter("rusername") == null)
			return "emptyuser";
		else if(!Pattern.matches("[a-zA-Z]{1}[a-zA-Z]+", req.getParameter("rusername")))
			return "usernamealpha";
		else if (req.getParameter("rpassword").equals("") || req.getParameter("rpassword") == null)
			return "emptypassword";
		else if(req.getParameter("rerpassword").equals("") || req.getParameter("rerpassword") == null)
			return "emptyrepassword";
		else if(!req.getParameter("rpassword").equals(req.getParameter("rerpassword")))
			return "matchpassword";
		else if(req.getParameter("email_id").equals("") || req.getParameter("email_id") == null)
			return "emptyemail";
		else if(req.getParameter("mobileno").equals("") || req.getParameter("mobileno") == null)
			return "emptymobile";
		else if(!Pattern.matches("[0-9]{10}", req.getParameter("mobileno")))
			return "mobile10";
		else
			return "nextpage";
	}
	
	public String validateOtherDetails(HttpServletRequest req, HttpServletResponse resp) throws ParseException 
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = formatter.parse(req.getParameter("dob"));
		
		if (req.getParameter("dob").equals("") || date == null)
			return "emptydob";
		else if (req.getParameter("address").equals("") || req.getParameter("address") == null)
			return "emptyaddress";
		else if(req.getParameter("city").equals("") || req.getParameter("city") == null)
			return "emptycity";
		else if(req.getParameter("state").equals("") || req.getParameter("state") == null)
			return "emptystate";
		else if(req.getParameter("country").equals("") || req.getParameter("country") == null)
			return "emptycountry";
		else
			return "nextpage";
	}
}
