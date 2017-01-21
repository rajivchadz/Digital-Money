package com.project.walletsystem.simulation.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.walletsystem.simulation.beans.RegisterBean;
import com.project.walletsystem.simulation.connections.DBConnection;
import com.project.walletsystem.simulation.dao.UserDAOImpl;
import com.project.walletsystem.simulation.validations.RegisterValidate;

@Controller
public class RegisterController {

	RegisterBean bean = new RegisterBean();

	@RequestMapping(value = "showRegister", method = RequestMethod.GET)
	public ModelAndView showRegister() {
		return new ModelAndView("/jsp/register.jsp");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest req, HttpServletResponse resp) {
		
		String validate = new RegisterValidate().validate(req,resp);
		if(validate.equals("emptyuser"))
			return new ModelAndView("/jsp/register.jsp", "validate", "Username can't be empty");
		else if(validate.equals("emptypassword"))
			return new ModelAndView("/jsp/register.jsp", "validate", "Password can't be empty");
		else if(validate.equals("emptyrepassword"))
			return new ModelAndView("/jsp/register.jsp", "validate", "Confirm Password can't be empty");
		else if(validate.equals("emptyemail"))
			return new ModelAndView("/jsp/register.jsp", "validate", "Email Id can't be empty");
		else if(validate.equals("emptymobile"))
			return new ModelAndView("/jsp/register.jsp", "validate", "Mobile No. can't be empty");
		else if(validate.equals("mobile10"))
			return new ModelAndView("/jsp/register.jsp", "validate", "Mobile No. must be 10 Digits");
		else if(validate.equals("useralpha"))
			return new ModelAndView("/jsp/register.jsp", "validate", "Username start with Alphabet");
		else if(validate.equals("matchpassword"))
			return new ModelAndView("/jsp/register.jsp", "validate", "Password didnt Match.");
		
		bean.setRusername(req.getParameter("rusername"));
		bean.setRpassword(req.getParameter("rpassword"));
		bean.setRpasswordconfirm(req.getParameter("rerpassword"));
		bean.setEmail_id(req.getParameter("email_id"));
		bean.setMobile_no(Long.parseLong(req.getParameter("mobileno")));
		System.out.println(bean.getRusername() + " " + bean.getRpassword() + " " + bean.getRpasswordconfirm() + " "
				+ bean.getEmail_id() + " " + bean.getMobile_no());
		
		return new ModelAndView("/jsp/moredetails.jsp");
	}

	@RequestMapping(value = "/moredetails", method = RequestMethod.POST)
	public ModelAndView moreDetails(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		String validate = new RegisterValidate().validateOtherDetails(req,resp);
		if(validate.equals("emptydob"))
			return new ModelAndView("/jsp/moredetails.jsp", "validate", "Date of Birth can't be empty");
		else if(validate.equals("emptyaddress"))
			return new ModelAndView("/jsp/moredetails.jsp", "validate", "Address can't be empty");
		else if(validate.equals("emptycity"))
			return new ModelAndView("/jsp/moredetails.jsp", "validate", "City can't be empty");
		else if(validate.equals("emptystate"))
			return new ModelAndView("/jsp/moredetails.jsp", "validate", "State can't be empty");
		else if(validate.equals("emptycountry"))
			return new ModelAndView("/jsp/moredetails.jsp", "validate", "Country can't be empty");
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		bean.setDate_of_birth(formatter.parse(req.getParameter("dob")));
		bean.setAddress(req.getParameter("address"));
		bean.setCity(req.getParameter("city"));
		bean.setState(req.getParameter("state"));
		bean.setCountry(req.getParameter("country"));
		System.out.println(bean.getDate_of_birth() + " " + bean.getAddress() + " " + bean.getCity() + " "
				+ bean.getState() + " " + bean.getCountry());
		
		
		
		
		boolean result = new UserDAOImpl(DBConnection.getConnect().getConnection()).userRegister(bean);
		System.out.println(result);

		if (result)
			return new ModelAndView("index.jsp", "info", bean.getRusername() + " Successfully Register");
		else
			return new ModelAndView("/jsp/register.jsp", "info", bean.getRusername() + " is already registered");
	}

}
