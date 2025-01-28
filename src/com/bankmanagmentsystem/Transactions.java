package com.bankmanagmentsystem;

public class Transactions {

	private String transactionId;
	private String transactionType;
	private Account account;
	private double amount;
	
	// constructor
	public Transactions(String transactionId, String transactionType, Account account, double amount)
	{
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.account = account;
		this.amount = amount;		
		
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Transction Id : " + this.transactionId + "\nTransactionType : " + this.transactionType + " Account" + this.amount + "\nTransaction Amount : " + this.amount;
	}
	
	
	
}
