package com.project.walletsystem.simulation.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction_master")
public class Transaction_Master {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transaction_id;
	private int user_id;
	private float debit_amount;
	private float credit_amount;
	private float balance_amount;
	private Date  paid_date;

}
