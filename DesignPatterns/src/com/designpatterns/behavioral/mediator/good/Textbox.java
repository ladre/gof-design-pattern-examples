package com.designpatterns.behavioral.mediator.good;

public class Textbox {
	private Mediator mediator;
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	StringBuffer buffer = new StringBuffer();
	
	public Textbox write(char a){
		buffer.append(a);
		mediator.textboxWrite();
		return this;
	}
	
	public void deleteLast(){
		buffer.deleteCharAt(buffer.length() - 1);
		mediator.textboxDelete(buffer.toString());
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
