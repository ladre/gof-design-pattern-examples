package com.designpatterns.behavioral.visitor.good;

public class DumpVisitor implements Visitor{
	public void visit(Address address){
		System.out.println("Address : " + address.address + " City : " + address.city);
	}
	
	public void visit(Customer customer){
		System.out.println("Name : " + customer.name + " Age : " + customer.age );
		System.out.println(" Addresses : ");
		for (Address address : customer.addressList) {
			visit(address);
		}
		System.out.println(" Phone numbers : ");
		for (Phone phone : customer.phoneList) {
			visit(phone);
		}
	}
	
	public void visit(Phone phone){
		System.out.println(" Phonenumber : " + phone);
	}
}
