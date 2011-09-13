package com.designpatterns.creational.abstractfactory.good;

public class ToyotaFactory extends VehicleFactory {
	
	@Override
	Car createCar() {
		// TODO Auto-generated method stub
		return new ToyotaCar();
	}

	@Override
	Motorcycle createMotorcycle() {
		// TODO Auto-generated method stub
		return new ToyotaMotorcycle();
	}

}
