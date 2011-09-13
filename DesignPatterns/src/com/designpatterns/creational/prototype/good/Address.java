package com.designpatterns.creational.prototype.good;

public class Address implements Cloneable{
	public String defaultInfo;
	public Address() throws InterruptedException {
		Thread.sleep(1000);
		this.defaultInfo = "Long default Address Information from DB";
	}
	
	@Override
	protected Address clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Address)super.clone();
	}
	
	@Override
	public String toString() {
		return "Address : " + defaultInfo;
	}
	
}
