package com.designpatterns.behavioral.mediator.good;

public class Mediator {
	private AddButton addButton;
	private ClearButton clearButton;
	private Textbox textbox;
	private Listbox listbox;
	
	public Mediator(AddButton addButton,ClearButton clearButton,Textbox textbox,Listbox listbox) {
		this.addButton = addButton;
		this.clearButton = clearButton;
		this.textbox = textbox;
		this.listbox = listbox;
	}
	
	public void clickAddButton() {
		String value = textbox.getValue();
		if(value != null){
			listbox.add(value);
			textbox.clear();
		}
		if(clearButton.isEnabled()){
			clearButton.enable(false);
		}
	}
	
	public void clickClearButton(){
		if(addButton.isEnabled()){
			addButton.enable(false);
		}
		textbox.clear();
	}
	
	public void textboxWrite(){
		if(addButton.isEnabled()){
			addButton.enable(true);
		}
		if(clearButton.isEnabled()){
			clearButton.enable(true);
		}
	}
	
	
	public void textboxDelete(String value){
		if(textbox.getValue() == null){
			addButton.enable(false);
			clearButton.enable(false);
		}
	}
	
	
}
