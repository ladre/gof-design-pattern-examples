package com.designpatterns.behavioral.mediator.bad;

public class ClearButton {
	private AddButton addButton;
	private Textbox textBox;
	
	private boolean enabled;
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void enable(boolean enabled){
		this.enabled = enabled;
	}
	
	public void setAddButton(AddButton addButton) {
		this.addButton = addButton;
	}
	
	public void setTextBox(Textbox textBox) {
		this.textBox = textBox;
	}
	
	public void click(){
		if(addButton.isEnabled()){
			addButton.enable(false);
		}
		textBox.clear();
	}

}
