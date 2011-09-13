package com.designpatterns.creational.prototype.bad;

public class Address {
	
	public String defaultInfo;
	
	public Address() throws InterruptedException {
		Thread.sleep(1000);
		this.defaultInfo = "Long default Address Information from DB";
	}
	
	@Override
	public String toString() {
		return "Address : " + defaultInfo;
	}
}
