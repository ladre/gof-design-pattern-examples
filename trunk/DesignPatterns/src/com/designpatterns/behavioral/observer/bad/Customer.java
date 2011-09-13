package com.designpatterns.behavioral.observer.bad;

public class Customer {
	private String name;
	private String sendEmailNotification;
	
	public Customer(String name,String sendEmailNotification) {
		this.name = name;
		this.sendEmailNotification = sendEmailNotification;
	}
	
	@Override
	public String toString() {
		return "Customer name : " + name + " NotifyByEmail : " + sendEmailNotification; 
	}
	
}
