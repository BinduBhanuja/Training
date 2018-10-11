package com.ford.bank;

public class BankProvider {

	public static Bank provideBank(String name)
	{
		switch(name)
		{
		case "ICICI":
			Address address = new Address(210, "perungudi", "Chennai", 128362);
			return new IciciBank(address);
		case "SBI":
			Address address1 = new Address(245, "guindy", "Chennai", 272885);
			return new SbiBank(address1);
			
			default:
				return null;
				
		}
	}
}
