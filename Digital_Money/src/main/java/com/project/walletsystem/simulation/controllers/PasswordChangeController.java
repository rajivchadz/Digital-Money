package com.project.walletsystem.simulation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PasswordChangeController {
	
	@RequestMapping(value = "showPasswordPage", method = RequestMethod.GET)
	public ModelAndView showRegister()
	{
		return new ModelAndView("/jsp/forgotpassword.jsp");
	}

}
