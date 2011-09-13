package com.designpatterns.creational.factory.better.more;

import java.util.HashMap;
import java.util.Set;


public class VehicleFactory {
	
	private static HashMap<Integer, Vehicle> registeredVehicles = new HashMap<Integer, Vehicle>();
	
	static{
		try{
			Set<Class<?>> implementingClasses = ClassUtil.getClassesImplementing("com.designpatterns.creational.factory.better.more",Vehicle.class);
			for (Class<?> clazz : implementingClasses) {
				Vehicle vehicle = (Vehicle) clazz.newInstance();
				registeredVehicles.put(vehicle.getId(), vehicle);
			}
		}catch(Exception ex){
			
		}
	}
	
	public static Vehicle createVehicle(int vehicleId) throws InstantiationException, IllegalAccessException {
		return registeredVehicles.get(vehicleId).newInstance();
	}
}
