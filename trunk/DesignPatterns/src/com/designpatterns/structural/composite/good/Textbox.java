package com.designpatterns.structural.composite.good;

public class Textbox implements Component {

	@Override
	public void draw() {
		System.out.println("Textbox is drawing");
	}

}
