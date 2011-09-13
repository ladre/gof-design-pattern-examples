package com.designpatterns.creational.factory.better.more;

public class Car implements Vehicle{
	
	public void draw(){
		System.out.println("Car has been drawn");
	}

	@Override
	public Vehicle newInstance() {
		// TODO Auto-generated method stub
		return new Car();
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 1;
	}
}
