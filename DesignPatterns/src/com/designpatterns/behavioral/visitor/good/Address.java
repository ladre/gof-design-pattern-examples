package com.designpatterns.behavioral.visitor.good;

public class Address implements Visitable{
	public String address;
	public String city;
	public Address(String address,String city) {
		this.address = address;
		this.city = city;
	}
	
	public void dump() {
		System.out.println("Address : " + address + " City : " + city);
	}
	
	public void accept(Visitor visitor){
		visitor.visit(this);
	}
	
}
