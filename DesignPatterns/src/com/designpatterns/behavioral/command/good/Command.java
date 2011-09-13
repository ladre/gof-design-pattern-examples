package com.designpatterns.behavioral.command.good;

public abstract class Command {
	public Customer customer;
	public String currency;
	public Double amount;
	public Command(Customer customer,String currency,Double amount) {
		this.customer = customer;
		this.currency = currency;
		this.amount = amount;
	}
	abstract void execute() throws Exception;
	
	// abstract undo() throws Exception;
}
