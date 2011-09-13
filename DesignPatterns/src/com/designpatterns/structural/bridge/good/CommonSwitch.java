package com.designpatterns.structural.bridge.good;

public class CommonSwitch implements Switch {
	private Equipment equipment;
	
	@Override
	public void on() {
		equipment.start();
		
	}

	@Override
	public void off() {
		equipment.stop();
	}
	
}
