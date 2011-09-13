package com.designpatterns.creational.factory.better;

import java.util.HashMap;


public class VehicleFactory {
	
	private HashMap<Integer, Class<? extends Vehicle>> registeredVehicles = new HashMap<Integer, Class<? extends Vehicle>>();
	
	public void registerVehicle(int vehicleId,Class<? extends Vehicle> clazz){
		registeredVehicles.put(vehicleId, clazz);
	}
	
	public Vehicle createVehicle(int vehicleId) throws InstantiationException, IllegalAccessException {
		return registeredVehicles.get(vehicleId).newInstance();
	}
}
