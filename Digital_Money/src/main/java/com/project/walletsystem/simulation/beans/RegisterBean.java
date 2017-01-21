package com.project.walletsystem.simulation.beans;

import java.util.Date;

public class RegisterBean {

	private String rusername;
	private String rpassword;
	private String rpasswordconfirm;
	private String email_id;
	private long mobile_no;
	private Date date_of_birth;
	private String address;
	private String city;
	private String state;
	private String country;
	private float wallet_money;

	public String getRusername() {
		return rusername;
	}

	public void setRusername(String rusername) {
		this.rusername = rusername;
	}

	public String getRpassword() {
		return rpassword;
	}

	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}

	public String getRpasswordconfirm() {
		return rpasswordconfirm;
	}

	public void setRpasswordconfirm(String rpasswordconfirm) {
		this.rpasswordconfirm = rpasswordconfirm;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public float getWallet_money() {
		return wallet_money;
	}

	public void setWallet_money(float wallet_money) {
		this.wallet_money = wallet_money;
	}

}