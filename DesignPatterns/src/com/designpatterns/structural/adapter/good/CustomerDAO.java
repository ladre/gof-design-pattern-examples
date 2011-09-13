package com.designpatterns.structural.adapter.good;

public class CustomerDAO {
	public void save(Customer customer){
		System.out.println(customer.getName() + " is saving" );
	}
	
	public static void main(String[] args){
		new CustomerDAO().save(new CustomerImpl());
		new CustomerDAO().save(new APICustomerAdapter(APICustomer.newInstance()));
	}
	
	
}	
