package com.designpatterns.creational.factory.good;


public class VehicleFactory {
	public Vehicle createVehicle(int vehicleId){
		Vehicle vehicle = null;
		if(vehicleId == 1){
			vehicle= new Car();
		}else if (vehicleId == 2){
			vehicle = new Motorcycle();
		}else{
			// Newly added vehicles
			//vehicle = new ....
		}
		return vehicle;
	}
}
