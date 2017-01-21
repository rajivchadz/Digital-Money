package com.project.walletsystem.simulation.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.walletsystem.simulation.beans.LoginBean;
import com.project.walletsystem.simulation.connections.DBConnection;
import com.project.walletsystem.simulation.dao.UserDAOImpl;
import com.project.walletsystem.simulation.validations.LoginValidate;

@Controller
public class LoginController {

	LoginBean bean = new LoginBean();

	@RequestMapping(value = "showLogin", method = RequestMethod.GET)
	public ModelAndView showLogin() {
		return new ModelAndView("index.jsp");
	}

	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req, HttpServletResponse resp) {
		bean.setLusername(req.getParameter("lusername"));
		bean.setLpassword(req.getParameter("lpassword"));
		String validate = new LoginValidate().validate(bean);
		if(validate.equals("emptyuser"))
			return new ModelAndView("index.jsp", "validate", "Username can't be empty");
		else if(validate.equals("emptypassword"))
			return new ModelAndView("index.jsp", "validate", "Password can't be empty");
		
		System.out.println("Name: " + bean.getLusername() + " Password: " + bean.getLpassword());
		boolean result = new UserDAOImpl(DBConnection.getConnect().getConnection()).userLogin(bean);
		System.out.println(result);
		if (result == true)
			return new ModelAndView("/jsp/welcome.jsp", "info", bean.getLusername());
		else
			return new ModelAndView("index.jsp", "validate", "Username or Password is incorrect");
	}

}
