package com.designpatterns.creational.abstractfactory.good;


public class DrawingMenu {
	public void drawVehicle(int selectedVehicleFromMenu,int brandId){
		VehicleFactoryPicker.pick(brandId).createVehicle(selectedVehicleFromMenu).draw();
	}
	
	public static void main(String[] args) {
		DrawingMenu drawingMenu = new DrawingMenu(); 
		drawingMenu.drawVehicle(1,1);
		drawingMenu.drawVehicle(1,2);
		drawingMenu.drawVehicle(2,1);
		drawingMenu.drawVehicle(2,2);
	}
}
