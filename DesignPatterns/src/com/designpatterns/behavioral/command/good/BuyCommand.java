package com.designpatterns.behavioral.command.good;

public class BuyCommand extends Command {
	
	public BuyCommand(Customer customer,String currency,Double amount) {
		super(customer,currency,amount);
	}

	@Override
	void execute() {
		customer.buy(currency, amount);
		System.out.println(amount + " " + currency + " has been bought.");
	}

}
