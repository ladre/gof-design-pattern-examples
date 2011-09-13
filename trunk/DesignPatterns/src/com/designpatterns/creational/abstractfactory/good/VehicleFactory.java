package com.designpatterns.creational.abstractfactory.good;

public abstract class VehicleFactory {
	abstract Car createCar();
	abstract Motorcycle createMotorcycle();
	public Vehicle createVehicle(int vehicleId){
		if(vehicleId == 1){
			return createCar();
		}else{
			return createMotorcycle();
		}
	}
}
