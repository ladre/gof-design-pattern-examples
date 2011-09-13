package com.designpatterns.behavioral.visitor.bad;

import java.util.List;

public class Customer implements Dumpable{
	public String name;
	public int age;
	
	public List<Address> addressList;
	
	public List<Phone> phoneList;
	
	public Customer(String name,int age,List<Address> addressList,List<Phone> phoneList) {
		this.name = name;
		this.age = age;
		this.addressList = addressList;
		this.phoneList = phoneList;
	}

	@Override
	public void dump() {
		System.out.println("New Customer : ");
		System.out.println("Name : " + name + " Age : " + age );
		System.out.println(" Addresses : ");
		for (Address address : addressList) {
			address.dump();
		}
		System.out.println(" Phone numbers : ");
		for (Phone phone : phoneList) {
			phone.dump();
		}
	}
	
}
