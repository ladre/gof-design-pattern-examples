package com.designpatterns.behavioral.visitor.good;

public class Phone {
	public String number;
	
	public Phone(String number) {
		this.number = number;
	}

	public void dump() {
		System.out.println(" Phonenumber : " + number);
	}
}
