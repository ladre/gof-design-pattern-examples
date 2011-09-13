package com.designpatterns.creational.factory.bad;

public class DrawingMenu {
	public void drawVehicle(int selectedVehicleFromMenu){
		if(selectedVehicleFromMenu == 1){
			Car car = new Car();
			car.draw();
		}else if (selectedVehicleFromMenu == 2){
			Motorcycle motorcycle = new Motorcycle();
			motorcycle.draw();
		}else{
			// Newly added vehicles
			//new ....
		}
	}
	
	public static void main(String[] args) {
		DrawingMenu drawingMenu = new DrawingMenu(); 
		drawingMenu.drawVehicle(1);
		drawingMenu.drawVehicle(2);
	}
}
