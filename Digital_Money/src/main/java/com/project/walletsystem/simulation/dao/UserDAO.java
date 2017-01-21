package com.project.walletsystem.simulation.dao;

import com.project.walletsystem.simulation.beans.LoginBean;
import com.project.walletsystem.simulation.beans.RegisterBean;

public interface UserDAO {
	
	public boolean userRegister(RegisterBean rbean);
	public boolean userLogin(LoginBean lbean);

}
