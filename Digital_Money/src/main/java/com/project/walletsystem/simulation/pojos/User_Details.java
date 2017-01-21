package com.project.walletsystem.simulation.pojos;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "user_details")
public class User_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userdetail_id;

	private String email_id;
	private long mobile_no;

	@Temporal(TemporalType.DATE)
	private Date date_of_birth;
	private String address;
	private String city;
	private String state;
	private String country;
	private float wallet_money;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
	private User_Login_Master userlogin;

	public int getUserdetail_id() {
		return userdetail_id;
	}

	public void setUserdetail_id(int userdetail_id) {
		this.userdetail_id = userdetail_id;
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

	public User_Login_Master getUserlogin() {
		return userlogin;
	}

	public void setUserlogin(User_Login_Master userlogin) {
		this.userlogin = userlogin;
	}

}
