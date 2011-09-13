package com.designpatterns.structural.bridge.bad;

public class Refrigerator implements Equipment{

	@Override
	public void start() {
		System.out.println("Refrigerator started..."); 		
	}

	@Override
	public void stop() {
		System.out.println("Refrigerator stopped");
	}

}
