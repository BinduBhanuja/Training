package com.ford.bank;

public class IciciBank extends BaseBank {

	private static final double WITHDRAWAL_LIMIT = 20000.0;
	

	IciciBank(Address address)
	{
		super(address);
		this.name = "ICICI";
	}
	
	
	@Override
	public final boolean loanRequest(double amount) {
		// TODO Auto-generated method stub
		if(this.balance * 5 >= amount)
			return true;
		return false;
	}

	@Override
	public double withDrawLimit() {
		// TODO Auto-generated method stub
		return WITHDRAWAL_LIMIT;
	}

	protected boolean isPrivate()
	{
		return true;
	}
	@Override
	public void transferFunds(Bank bank, double amount) {
		// TODO Auto-generated method stub
		
	}

}