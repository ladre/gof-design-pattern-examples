package com.designpatterns.creational.decorator.bad;

public class SimpleLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Data logged : " + data);
	}

}
