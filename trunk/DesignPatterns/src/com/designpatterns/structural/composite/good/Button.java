package com.designpatterns.structural.composite.good;

public class Button implements Component {

	@Override
	public void draw() {
		System.out.println("Button is drawing");
	}

}
