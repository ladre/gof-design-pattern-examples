package com.designpatterns.behavioral.command.good;

public class SellCommand extends Command {
	
	public SellCommand(Customer customer,String currency,Double amount) {
		super(customer,currency,amount);
	}

	@Override
	void execute() throws Exception {
		customer.sell(currency, amount);
		System.out.println(amount + " " + currency + " has been sold");
	}

}
