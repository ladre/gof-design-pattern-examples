package com.designpatterns.structural.bridge.bad;

public class RefrigeratorSwitch implements Switch {
	private Refrigerator refrigerator;
	
	@Override
	public void on() {
		refrigerator.start();
		
	}

	@Override
	public void off() {
		refrigerator.stop();
	}
	
}
