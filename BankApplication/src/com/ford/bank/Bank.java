package com.ford.bank;

public interface Bank {

	String getName();
	Address getAddress();
	double getBalance();
	void withDraw(double amount);
	void deposit(double amount);
	boolean loanRequest(double amount);
	void transferFunds(Bank bank, double amount);
	double withDrawLimit();
	 void setLock();
}
