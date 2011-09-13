package com.designpatterns.behavioral.mediator.bad;

public class AddButton {
	private Textbox textbox;
	private Listbox listbox;
	private ClearButton clearButton;
	
	public void setClearButton(ClearButton clearButton) {
		this.clearButton = clearButton;
	}
	
	public void setTextbox(Textbox textbox) {
		this.textbox = textbox;
	}

	public void setListbox(Listbox listbox) {
		this.listbox = listbox;
	}

	private boolean enabled;
	
	public boolean isEnabled() {
		return enabled;
	}

	public void enable(boolean enabled){
		this.enabled = enabled;
	}
	
	public void click(){
		String value = textbox.getValue();
		if(value != null){
			listbox.add(value);
			textbox.clear();
		}
		if(clearButton.isEnabled()){
			clearButton.enable(false);
		}
	}
	
}
