package com.designpatterns.creational.factory.better.more;


public class DrawingMenu {
	
	public void drawVehicle(int selectedVehicleFromMenu) throws InstantiationException, IllegalAccessException{
		VehicleFactory.createVehicle(selectedVehicleFromMenu).draw();
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		DrawingMenu drawingMenu = new DrawingMenu();
		drawingMenu.drawVehicle(1);
		drawingMenu.drawVehicle(2);
	}
	
}
