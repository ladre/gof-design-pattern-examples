package com.designpatterns.structural.bridge.bad;

public class Switch {
	private Refrigerator refrigerator;
	private Television television;
	
	public void on(int equipmentId) {
		if(equipmentId == 1)
			refrigerator.start();
		else
			television.start();
		
	}

	public void off(int equipmentId) {
		if(equipmentId == 1)
			refrigerator.stop();
		else
			television.stop();
	}
}
