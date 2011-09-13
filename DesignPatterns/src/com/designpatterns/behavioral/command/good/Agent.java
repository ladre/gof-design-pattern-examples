package com.designpatterns.behavioral.command.good;


public class Agent {
	
	public void execute(Command command) throws Exception{
		command.execute();
	}
	
	public static void main(String[] args) throws Exception {
		Customer customer = new Customer();
		Agent agent = new Agent();
		agent. execute(new BuyCommand(customer, "Dollar",15.0));
		agent. execute(new BuyCommand(customer, "Euro",20.0));
		agent. execute(new SellCommand(customer, "Dollar",10.0));
	}
	
}
