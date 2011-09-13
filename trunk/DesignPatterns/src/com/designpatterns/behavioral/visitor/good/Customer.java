package com.designpatterns.behavioral.visitor.good;

import java.util.List;

public class Customer implements Visitable{
	public String name;
	public int age;
	
	public List<Address> addressList;
	
	public List<Phone> phoneList;
	
	public Customer(String name,int age,List<Address> addressList,List<Phone> phones) {
		this.name = name;
		this.age = age;
		this.addressList = addressList;
		this.phoneList = phones;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	
	
}
