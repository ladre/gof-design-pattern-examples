package com.designpatterns.structural.composite.bad;

public class Panel {
	private Button button;
	private Textbox textbox;

	private String name;
	
	public Panel(String name) {
		this.name = name;
	}

	public void drawPanel(){
		System.out.println(name + " panel is drawing");
		if(button != null)
			button.draw();
		if(textbox != null)
			textbox.draw();
	}	
	
	public void setButton(Button button) {
		this.button = button;
	}
	
	public void setTextbox(Textbox textbox) {
		this.textbox = textbox;
	}
}
