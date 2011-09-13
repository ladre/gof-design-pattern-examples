package com.designpatterns.behavioral.mediator.bad;

public class Textbox {
	StringBuffer buffer = new StringBuffer();
	
	private AddButton addButton;
	
	private ClearButton clearButton;
	
	public Textbox write(char a){
		buffer.append(a);
		if(addButton.isEnabled()){
			addButton.enable(true);
		}
		if(clearButton.isEnabled()){
			clearButton.enable(true);
		}
		return this;
	}
	
	public void deleteLast(){
		buffer.deleteCharAt(buffer.length() - 1);
		if(buffer.length() == 0){
			addButton.enable(false);
			clearButton.enable(false);
		}
	}
	
	public void setAddButton(AddButton addButton) {
		this.addButton = addButton;
	}

	public void setClearButton(ClearButton clearButton) {
		this.clearButton = clearButton;
	}
	
	public String getValue(){
		String value = null;
		if(buffer.length() > 0){
			value = buffer.toString();
		}
		return value;
	}
	
	public void clear(){
		if(buffer.length() > 0){
			buffer = new StringBuffer();
		}
	}

}
