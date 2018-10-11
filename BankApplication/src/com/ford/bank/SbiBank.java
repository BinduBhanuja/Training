package com.ford.bank;

public class SbiBank extends BaseBank {

	private static final double WITHDRAWAL_LIMIT = 30000.0;
	
	public SbiBank(Address address)
	{
		super(address);
		this.name = "SBI";
	}
	public final boolean loanRequest(double amount) {
		// TODO Auto-generated method stub
		if(this.balance * 10 >= amount)
			return true;
		return false;
	}

	public double withDrawLimit() {
		// TODO Auto-generated method stub
		return WITHDRAWAL_LIMIT;
	}

	protected boolean isPrivate()
	{
		return false;
	}
	@Override
	public void transferFunds(Bank bank, double amount) {
		// TODO Auto-generated method stub
		
	}

}
