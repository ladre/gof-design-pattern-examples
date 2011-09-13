package com.designpatterns.structural.component.good;

import java.util.ArrayList;
import java.util.List;

public class Panel implements Component {
	List<Component> componentList = new ArrayList<Component>();
	public String name;
	
	public Panel(String name) {
		super();
		this.name = name;
	}

	@Override
	public void draw() {
		System.out.println(name + " panel is drawing");
		for (Component com : componentList) {
			com.draw();
		}
	}
	
	public void addComponent(Component component){
		componentList.add(component);
	}
	
	public void removeComponent(Component component){
		componentList.remove(component);
	}

}
