package com.project.walletsystem.simulation.beans;

import java.util.Date;

public class ElectricityBillBean {

	private String name_on_bill;
	private long ca_no;
	private long bill_no;
	private Date bill_date;
	private String service_provider;
	private float amount;
	private int phoneno_on_bill;

	public String getName_on_bill() {
		return name_on_bill;
	}

	public void setName_on_bill(String name_on_bill) {
		this.name_on_bill = name_on_bill;
	}

	public long getCa_no() {
		return ca_no;
	}

	public void setCa_no(long ca_no) {
		this.ca_no = ca_no;
	}

	public long getBill_no() {
		return bill_no;
	}

	public void setBill_no(long bill_no) {
		this.bill_no = bill_no;
	}

	public Date getBill_date() {
		return bill_date;
	}

	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}

	public String getService_provider() {
		return service_provider;
	}

	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getPhoneno_on_bill() {
		return phoneno_on_bill;
	}

	public void setPhoneno_on_bill(int phoneno_on_bill) {
		this.phoneno_on_bill = phoneno_on_bill;
	}

}
