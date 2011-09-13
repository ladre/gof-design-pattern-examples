package com.designpatterns.structural.bridge.bad;

public class TelevisionSwitch implements Switch {
	private Television television;
	
	@Override
	public void on() {
		television.start();
		
	}

	@Override
	public void off() {
		television.stop();
	}
	
}
