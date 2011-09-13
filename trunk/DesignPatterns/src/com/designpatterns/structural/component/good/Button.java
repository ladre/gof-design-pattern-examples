package com.designpatterns.structural.component.good;

public class Button implements Component {

	@Override
	public void draw() {
		System.out.println("Button is drawing");
	}

}
