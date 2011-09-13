package com.designpatterns.creational.factory.better.more;

public class Motorcycle implements Vehicle {
	
	public void draw(){
		System.out.println("Motorcycle has been drawn");
	}

	@Override
	public Vehicle newInstance() {
		// TODO Auto-generated method stub
		return new Motorcycle();
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 2;
	}
}
