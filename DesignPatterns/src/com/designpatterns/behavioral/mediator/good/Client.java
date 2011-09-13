package com.designpatterns.behavioral.mediator.good;

public class Client {
	public static void main(String[] args){
		
		// components
		Textbox textbox = new Textbox();
		AddButton addButton = new AddButton();
		ClearButton clearButton = new ClearButton();
		Listbox listbox = new Listbox();
		
		Mediator  mediator = new Mediator(addButton,clearButton,textbox,listbox);
		textbox.setMediator(mediator);
		addButton.setMediator(mediator);
		clearButton.setMediator(mediator);
		
		textbox.write('h').write('e').write('l').write('l').write('o');
		addButton.click();
		textbox.write('w');
		clearButton.click();
		textbox.write('w').write('o').write('r').write('l').write('d');
		textbox.deleteLast();
		addButton.click();
		
		
		// what is the state ?
		listbox.printList();
		System.out.println("addbuttonEnabled : " + addButton.isEnabled());
		System.out.println("addbuttonEnabled : " + clearButton.isEnabled());
		System.out.println("textbox : " + textbox.getValue());
		
	}
}
