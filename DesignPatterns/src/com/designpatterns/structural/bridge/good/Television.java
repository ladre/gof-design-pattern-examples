package com.designpatterns.structural.bridge.good;

public class Television implements Equipment{

	@Override
	public void start() {
		System.out.println("Television started..."); 		
	}

	@Override
	public void stop() {
		System.out.println("Television stopped");
	}

}
