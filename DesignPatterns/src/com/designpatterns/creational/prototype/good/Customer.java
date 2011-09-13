package com.designpatterns.creational.prototype.good;

import java.util.Date;

public class Customer implements Cloneable{
	
	public String defaultInfo;
	public Address address = new Address();
	
	public Customer() throws InterruptedException {
		Thread.sleep(1000);
		this.defaultInfo = "Long Configuration Information from DB";
	}
	
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
		//creating 5 customers
		long start = new Date().getTime();
		Customer customer = new Customer();
		for (int i = 0; i < 5; i++) { 
			 Customer copy = customer.clone();
			 System.out.println(copy);
		}
		long end = new Date().getTime();
		System.out.println("Time passed : " + (end - start));
	}
	
	@Override
	protected Customer clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer customer = (Customer)super.clone();
		// deep copy
		customer.address = address.clone();
		// shallow copy
		//customer.address = address;
		return customer;
	}
	
	@Override
 	public String toString() {
 		return "Customer : " + defaultInfo + " Address : " + address;
 	}	

}
