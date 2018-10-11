package com.ford.bank;

public class AccountHolder {

	private String name;
	private Address address;
	private Bank[] banks = new Bank[5];
	private int count=0;

	public AccountHolder(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	
	public void createAccount(Bank bank)
	{
		banks[count] = bank;
		bank.setLock();
	}
	
	public void transferWithin(Bank fromBank, Bank toBank, AccountHolder ah, double amount)
	{
		fromBank.transferFunds(toBank,amount);
	}
}
