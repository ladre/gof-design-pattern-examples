package com.designpatterns.structural.component.good;

public class Graphics {

	public static void main(String[] args) {
		Panel outer = new Panel("Outer");
		Panel inner1 = new Panel("Inner1");
		inner1.addComponent(new Button());
		Panel inner2 = new Panel("Inner2");
		inner2.addComponent(new Textbox());
		outer.addComponent(inner1);
		outer.addComponent(inner2);
		outer.draw();
	}

}
