package com.designpatterns.behavioral.observer.good;

public class AddressService implements Observer{
	
	private Configuration configuration;
	
	private String defaultCity;
	
	public AddressService(Configuration configuration) {
		this.configuration = configuration;
		defaultCity = this.configuration.getConfigurationValue("city");
	}
	
	public Address createAddress(String address){
		return new Address(address,defaultCity);
	}

	@Override
	public void changeConfiguration() {
		defaultCity = this.configuration.getConfigurationValue("city");
	}
}
