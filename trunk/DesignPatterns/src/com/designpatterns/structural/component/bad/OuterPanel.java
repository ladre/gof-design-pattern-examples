package com.designpatterns.structural.component.bad;

public class OuterPanel {
	private Panel panel1;
	private Panel panel2;
	private String name;
	public OuterPanel(String name) {
		this.name = name;
	}
	
	public void drawPanel(){
		System.out.println(name + " panel is drawing");
		panel1.drawPanel();
		panel2.drawPanel();
	}
	
	public void setPanel1(Panel panel1) {
		this.panel1 = panel1;
	}

	public void setPanel2(Panel panel2) {
		this.panel2 = panel2;
	}
}
