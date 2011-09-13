package com.designpatterns.behavioral.visitor.good;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public List<Customer> getAlCustomers(){
		List<Customer> customerList = new ArrayList<Customer>();
		for (int i = 0; i < 10; i++) {
			List<Address> addressList = new ArrayList<Address>();
			for (int j = 0; j < 2; j++) {
				addressList.add(new Address((("address" + i) + j) ,"Istanbul"));
			}
			List<Phone> phones = new ArrayList<Phone>();
			for (int j = 0; j <2 ; j++) {
				phones.add(new Phone(("5322101800" + i) + j));
			}
			customerList.add(new Customer("name" + i,20 + i,addressList,phones));
		}
		return customerList;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DumpVisitor dumpVisitor = new DumpVisitor();
		PrintVisitor printVisitor = new PrintVisitor();
		Client client = new Client();
		for (Customer customer : client.getAlCustomers()) {
			customer.accept(dumpVisitor);
			customer.accept(printVisitor);
		}
		
	}

}
