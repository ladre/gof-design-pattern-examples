package com.designpatterns.structural.adapter.good;

public class APICustomerAdapter implements Customer {
	private APICustomer apiCustomer;
	
	public APICustomerAdapter(APICustomer apiCustomer) {
		this.apiCustomer = apiCustomer;
	}
	
	@Override
	public String getName() {
		return apiCustomer.getName() + " " + apiCustomer.getMiddle() + " " + apiCustomer.getSurname(); 
	}

}
