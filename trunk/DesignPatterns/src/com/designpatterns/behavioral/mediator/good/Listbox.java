package com.designpatterns.behavioral.mediator.good;

import java.util.LinkedList;
import java.util.List;

public class Listbox {
	
	List<String> list = new LinkedList<String>();
	
	public void add(String text){
		list.add(text);
	}
	
	public void printList(){
		for (String item : list) {
			System.out.println(item);
		}
	}
	
}
