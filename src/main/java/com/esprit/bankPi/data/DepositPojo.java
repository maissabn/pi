package com.esprit.bankPi.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepositPojo extends TransactionPojo{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
}
