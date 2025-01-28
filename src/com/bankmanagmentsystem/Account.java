package com.bankmanagmentsystem;

import BankExceptions.InsufficientFundsException;
import BankExceptions.NegitiveAmountException;

public class Account {
	private String accountNumber;
	private String accountType;
	private double balance;
	private Customer customer;
	
	// constructor 
	public Account(String accountNumber, String accountType, double balance, Customer customer)
	{
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.customer = customer;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	// Methods for money withdraw and deposit
	
	public String withdraw(double amount) throws NegitiveAmountException , InsufficientFundsException
	{
		if(this.balance > 0 && amount > 0)
		{
			balance -= amount;
			return "money withdraw successful";
		}
		else if(amount <= 0)
		{
			throw new NegitiveAmountException("Withdrawal Amount Must be Possitive ");
		}
		else 
		{
			throw new InsufficientFundsException("Insufficient Balance");
		}
	}
	
	// Method for money deposit
	public String deposit(double amount) throws NegitiveAmountException
	{
		boolean deposit = false;
		if(amount > 0)	
		{
			this.balance += amount;
			deposit =  true;
		}
		else if(amount <= 0)
		{
			throw new NegitiveAmountException("Deposit Amount Mustbe Positive");
		}
		return deposit ? "deposit successfull": " failed to deposit";
	}
	
	
	// to String method
	@Override
	public String toString()
	{
		return "Ac Number : " + this.accountNumber + "\naccountType : " + this.accountType + "\nbalance : " + this.balance + "\nbelongsTo : " + this.customer.getName() ;
	}
	
	
	
}
