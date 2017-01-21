package com.project.walletsystem.simulation.validations;

import com.project.walletsystem.simulation.beans.LoginBean;

public class LoginValidate {

	public String validate(LoginBean bean) {

		if (bean.getLusername().equals("") || bean.getLusername() == null)
			return "emptyuser";
		else if (bean.getLpassword().equals("") || bean.getLpassword() == null)
			return "emptypassword";
		else
			return "notempty";

	}

}
