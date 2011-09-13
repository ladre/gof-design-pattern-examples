package com.designpatterns.behavioral.mediator.good;

public class AddButton {
	private Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	private boolean enabled;
	
	public boolean isEnabled() {
		return enabled;
	}

	public void enable(boolean enabled){
		this.enabled = enabled;
	}
	
	public void click(){
		mediator.clickAddButton();
	}
	
}
