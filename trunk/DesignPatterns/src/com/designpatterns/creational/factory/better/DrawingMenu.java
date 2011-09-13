package com.designpatterns.creational.factory.better;


public class DrawingMenu {
	
	VehicleFactory vehicleFactory = new VehicleFactory();

	public DrawingMenu() {
		vehicleFactory.registerVehicle(1, Car.class);
		vehicleFactory.registerVehicle(2, Motorcycle.class);
	}
	
	public void drawVehicle(int selectedVehicleFromMenu) throws InstantiationException, IllegalAccessException{
		vehicleFactory.createVehicle(selectedVehicleFromMenu).draw();
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		DrawingMenu drawingMenu = new DrawingMenu(); 
		drawingMenu.drawVehicle(1);
		drawingMenu.drawVehicle(2);
	}
	
}
