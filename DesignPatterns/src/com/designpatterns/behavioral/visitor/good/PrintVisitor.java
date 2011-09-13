package com.designpatterns.behavioral.visitor.good;

public class PrintVisitor implements Visitor{
	public void visit(Address address){
		System.out.println("Address printed");
	}
	
	public void visit(Customer customer){
		System.out.println("Customer printed");
		for (Address address : customer.addressList) {
			visit(address);
		}
		for (Phone phone : customer.phoneList) {
			visit(phone);
		}
	}
	
	public void visit(Phone phone){
		 System.out.println("Phone printed");
	}
}
