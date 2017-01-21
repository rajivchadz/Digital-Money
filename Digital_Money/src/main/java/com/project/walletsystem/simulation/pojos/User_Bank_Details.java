package com.project.walletsystem.simulation.pojos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_bank_details")
public class User_Bank_Details {

	private long account_no;
	private String account_name;
	private String bank_name;
	private String ifsc_code;
	private long card_no;
	private int date_on_card;
	private int year_on_card;
	private String name_on_card;
	
}
