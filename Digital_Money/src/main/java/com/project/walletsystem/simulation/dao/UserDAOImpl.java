package com.project.walletsystem.simulation.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import com.project.walletsystem.simulation.beans.LoginBean;
import com.project.walletsystem.simulation.beans.RegisterBean;
import com.project.walletsystem.simulation.pojos.User_Details;
import com.project.walletsystem.simulation.pojos.User_Login_Master;

public class UserDAOImpl implements UserDAO {

	Session session = null;

	public UserDAOImpl(Session session) {
		this.session = session;
	}

	public boolean userRegister(RegisterBean rbean) {

		User_Login_Master userlogin = new User_Login_Master();
		userlogin.setUsername(rbean.getRusername());
		userlogin.setPassword(rbean.getRpassword());

		User_Details userdetails = new User_Details();
		userdetails.setEmail_id(rbean.getEmail_id());
		userdetails.setMobile_no(rbean.getMobile_no());
		userdetails.setDate_of_birth(rbean.getDate_of_birth());
		userdetails.setAddress(rbean.getAddress());
		userdetails.setCity(rbean.getCity());
		userdetails.setState(rbean.getState());
		userdetails.setCountry(rbean.getCountry());
		userdetails.setWallet_money(0.0f);
		userdetails.setUserlogin(userlogin);
		session.persist(userdetails);

		try{
		session.beginTransaction().commit();
		}
		catch(ConstraintViolationException c)
		{
		session.close();
		System.out.println("Duplicate Name: " + rbean.getRusername());
		return false;
		}

		System.out.println("register check");

		return true;
	}

	public boolean userLogin(LoginBean lbean) {

		String sql = "FROM User_Login_Master user where user.username = '" + lbean.getLusername()
				+ "' and user.password = '" + lbean.getLpassword() + "'";
		System.out.println(sql);
		Query query = session.createQuery(sql);

		List<String> list = query.list();
		Iterator<String> iterator = list.iterator();
		if (iterator.hasNext())
			return true;
		else
			return false;

	}

}
