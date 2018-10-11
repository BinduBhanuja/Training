package com.ford.bank;

public class Runner {

	public static void main(String[] args)
	{
		Address address = new Address(0, null, null, 0);
		AccountHolder accountHolder = new AccountHolder("Bindu", address);
		
		Bank icici = BankProvider.provideBank("ICICI");
		Bank sbi = BankProvider.provideBank("SBI");
		
		icici.deposit(10000.0);
		sbi.deposit(10000.0);
		accountHolder.createAccount(icici);
		accountHolder.createAccount(sbi);
		
		System.out.println("Balance in Bank 1:"+icici.getBalance());
		System.out.println("Balance in Bank 2:"+sbi.getBalance());
		
		icici.deposit(10000.0);
		sbi.deposit(2000.0);
		
		System.out.println("Bank 1:"+icici.getBalance());
		System.out.println("Bank 2:"+sbi.getBalance());
	}
}
