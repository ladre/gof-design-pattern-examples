package com.designpatterns.behavioral.command.bad;

public class Agent {
	
	public void buy(Customer customer,String currency,Double amount){
		customer.buy(currency, amount);
		System.out.println(amount + " " + currency + " has been bought.");
	}
	
	public void sell(Customer customer,String currency,Double amount) throws Exception{
		customer.sell(currency, amount);
		System.out.println(amount + " " + currency + " has been sold");
	}
	
	public static void main(String[] args) throws Exception {
		Customer customer = new Customer();
		Agent agent = new Agent();
		agent.buy(customer,"Dollar", 15.0);
		agent.buy(customer,"Euro", 20.0);
		agent.sell(customer,"Dollar", 10.0);
	}
	
}
