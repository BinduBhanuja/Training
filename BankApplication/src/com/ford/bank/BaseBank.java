package com.ford.bank;

public abstract class BaseBank implements Bank {

	protected double balance = 0;
	protected String name;
	protected Address address;
	protected boolean unlock=false;
	
	public void setLock()
	{
		unlock=true;
	}
	public boolean getLock()
	{
		return unlock;
	}
	public BaseBank(Address address)
	{
		this.address = address;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Address getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void withDraw(double amount) {
		// TODO Auto-generated method stub
		if(this.isPrivate()==true)
		{
			this.balance = amount * 0.99;
		}
		else
		{
			this.balance -= amount;
		}
	}
	
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if(unlock)
			this.balance += amount;
		else
			System.out.println("The account doesn't exist");
	}
	
	public void transferFunds(Bank bank, double amount) {
		// TODO Auto-generated method stub
		bank.withDraw(amount);
		this.deposit(amount);
	}
	
	abstract boolean isPrivate();

	public boolean loanRequest(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	public double withDrawLimit() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
