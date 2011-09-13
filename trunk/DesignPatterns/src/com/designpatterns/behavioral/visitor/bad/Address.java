package com.designpatterns.behavioral.visitor.bad;

public class Address implements Dumpable{
	public String address;
	public String city;
	public Address(String address,String city) {
		this.address = address;
		this.city = city;
	}
	
	@Override
	public void dump() {
		System.out.println("Address : " + address + " City : " + city);
	}
	
}
