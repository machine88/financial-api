package com.financialservices.models;

import java.util.Date;

import lombok.Data;

@Data
public class Transaction {
	private int Transaction_ID;
	private int Account_ID;
	private int OperationType_ID;
	private double Amount;
	private Date EventDate;
}
