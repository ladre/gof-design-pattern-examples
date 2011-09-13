package com.designpatterns.behavioral.observer.good;

public class CustomerService implements Observer {
	
	private Configuration configuration;
	
	private String defaultEmailNotify = null;
	
	public CustomerService(Configuration configuration) {
		this.configuration = configuration;
		defaultEmailNotify = this.configuration.getConfigurationValue("sendEmailNotifocation");
	}
	
	public Customer createCustomer(String name){
		return new Customer(name,defaultEmailNotify);
	}
	
	@Override
	public void changeConfiguration() {
		defaultEmailNotify = this.configuration.getConfigurationValue("sendEmailNotifocation");
	}
}
