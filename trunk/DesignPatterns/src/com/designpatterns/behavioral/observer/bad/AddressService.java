package com.designpatterns.behavioral.observer.bad;

public class AddressService {
	
	private Configuration configuration;
	
	private String defaultCity;
	
	public AddressService(Configuration configuration) {
		this.configuration = configuration;
		defaultCity = this.configuration.getConfigurationValue("city");
	}
	
	public Address createAddress(String address){
		return new Address(address,defaultCity);
	}
}
