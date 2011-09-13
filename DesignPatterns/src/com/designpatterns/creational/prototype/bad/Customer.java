package com.designpatterns.creational.prototype.bad;

import java.util.Date;

public class Customer {
	
	public String defaultInfo;
	public Address address = new Address();
	
	public Customer() throws InterruptedException {
		Thread.sleep(1000);
		this.defaultInfo = "Long Configuration Information from DB";
	}
	
	public static void main(String[] args) throws InterruptedException {
		//creating 5 customers
		long start = new Date().getTime();
		for (int i = 0; i < 5; i++) { 
			 Customer customer = new Customer();
			 System.out.println(customer);
		}
		long end = new Date().getTime();
		System.out.println("Time passed : " + (end - start));
	}
	

	@Override
 	public String toString() {
 		return "Customer : " + defaultInfo + " Address : " + address;
 	}	
	
}
