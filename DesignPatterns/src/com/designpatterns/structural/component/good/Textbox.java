package com.designpatterns.structural.component.good;

public class Textbox implements Component {

	@Override
	public void draw() {
		System.out.println("Textbox is drawing");
	}

}
