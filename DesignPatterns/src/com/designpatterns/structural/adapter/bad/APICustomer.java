package com.designpatterns.structural.adapter.bad;

public class APICustomer {
	
	private  String name;
	private String middle;
	private String surname;
	
	public APICustomer(String name, String middle, String surname) {
		super();
		this.name = name;
		this.middle = middle;
		this.surname = surname;
	}
	
	public static APICustomer newInstance(){
		return new APICustomer("ozgur", "rahmi", "donmez from API");
	}
	
	public String getName() {
		return name;
	}

	public String getMiddle() {
		return middle;
	}

	public String getSurname() {
		return surname;
	}
	
}
