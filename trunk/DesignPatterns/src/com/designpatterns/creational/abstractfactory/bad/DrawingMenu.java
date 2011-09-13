package com.designpatterns.creational.abstractfactory.bad;

public class DrawingMenu {
	public void drawVehicle(int selectedVehicleFromMenu,int brandId){
		if((selectedVehicleFromMenu == 1) && (brandId == 1)){
			HondaCar car = new HondaCar();
			car.draw();
		}else if ((selectedVehicleFromMenu == 2) && (brandId == 1)){
			HondaMotorcycle motorcycle = new HondaMotorcycle();
			motorcycle.draw();
		}else if((selectedVehicleFromMenu == 1) && (brandId == 2)){
			ToyotaCar car = new ToyotaCar();
			car.draw();
		}else if ((selectedVehicleFromMenu == 2) && (brandId == 2)){
			ToyotaMotorcycle motorcycle = new ToyotaMotorcycle();
			motorcycle.draw();
		}else{
			// Newly added vehicles
			//new ....
		}
	}
	
	public static void main(String[] args) {
		DrawingMenu drawingMenu = new DrawingMenu(); 
		drawingMenu.drawVehicle(1,1);
		drawingMenu.drawVehicle(1,2);
		drawingMenu.drawVehicle(2,1);
		drawingMenu.drawVehicle(2,2);
	}
}
