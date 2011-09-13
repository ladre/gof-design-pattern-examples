package com.designpatterns.creational.abstractfactory.good;

public class VehicleFactoryPicker {
	public static VehicleFactory pick(int brand){
		if(brand == 1){
			return new HondaFactory();
		}else if(brand == 2){
			return new ToyotaFactory();
		}else{
			// return new factories
		}
		return null;
	}
}	
