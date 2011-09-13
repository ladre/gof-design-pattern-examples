package com.designpatterns.creational.abstractfactory.good;

public class HondaFactory extends VehicleFactory {

	@Override
	Car createCar() {
		// TODO Auto-generated method stub
		return new HondaCar();
	}

	@Override
	Motorcycle createMotorcycle() {
		// TODO Auto-generated method stub
		return new HondaMotorcycle();
	}

}
