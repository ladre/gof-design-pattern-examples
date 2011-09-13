package com.designpatterns.behavioral.observer.bad;

public class CustomerService {
	
	private Configuration configuration;
	
	private String defaultEmailNotify = null;
	
	public CustomerService(Configuration configuration) {
		this.configuration = configuration;
		defaultEmailNotify = this.configuration.getConfigurationValue("sendEmailNotifocation");
	}
	
	public Customer createCustomer(String name){
		return new Customer(name,defaultEmailNotify);
	}
}
