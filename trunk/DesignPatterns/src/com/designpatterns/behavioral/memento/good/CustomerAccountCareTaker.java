package com.designpatterns.behavioral.memento.good;

public class CustomerAccountCareTaker {
	private Memento memento;
	public Memento getMemento() {
		return memento;
	}
	public void savedMemento(Memento memento){
		this.memento = memento;
	}
	
}
