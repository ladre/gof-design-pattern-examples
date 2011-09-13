package com.designpatterns.behavioral.observer.bad;

public class Client {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		
		CustomerService customerService = new CustomerService(configuration);
		Customer customer = customerService.createCustomer("Ozgur");
		System.out.println(customer.toString());
		
		AddressService addressService = new AddressService(configuration);
		Address address = addressService.createAddress("My address");
		System.out.println(address);
		
		configuration.readConfiguration("false", "Ankara");
		
		customer = customerService.createCustomer("Ozgur");
		System.out.println(customer.toString());
		
		address = addressService.createAddress("My address");
		System.out.println(address);

	}

}
