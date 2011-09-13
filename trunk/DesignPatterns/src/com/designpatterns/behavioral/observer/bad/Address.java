package com.designpatterns.behavioral.observer.bad;

public class Address {
	private String address;
	private String city;
	
	public Address(String address,String city) {
		this.address = address;
		this.city = city;
		
	}
	
	@Override
	public String toString() {
		return "Address : " + address + " City : " + city; 
	}
	
}
