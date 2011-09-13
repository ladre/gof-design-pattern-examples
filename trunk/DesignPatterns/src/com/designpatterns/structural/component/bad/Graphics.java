package com.designpatterns.structural.component.bad;

public class Graphics {

	public static void main(String[] args) {
		OuterPanel op = new OuterPanel("Outer");
		Panel ip1 = new Panel("Inner1");
		Panel ip2 = new Panel("Inner2");
		ip1.setButton(new Button());
		ip2.setTextbox(new Textbox());
		op.setPanel1(ip1);
		op.setPanel2(ip2);
		op.drawPanel();
	}

}
