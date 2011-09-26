package com.designpatterns.structural.bridge.good;

public class Switch {
	private Equipment equipment;
	
	public void on() {
		equipment.start();
	}

	public void off() {
		equipment.stop();
	}
	
}
