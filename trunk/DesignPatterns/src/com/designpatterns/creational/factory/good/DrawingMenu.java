package com.designpatterns.creational.factory.good;

public class DrawingMenu {
	
	VehicleFactory vehicleFactory = new VehicleFactory();
	
	
	public void drawVehicle(int selectedVehicleFromMenu){
		vehicleFactory.createVehicle(selectedVehicleFromMenu).draw();
	}
	
	public static void main(String[] args) {
		DrawingMenu drawingMenu = new DrawingMenu(); 
		drawingMenu.drawVehicle(1);
		drawingMenu.drawVehicle(2);
				
	}
	
}
