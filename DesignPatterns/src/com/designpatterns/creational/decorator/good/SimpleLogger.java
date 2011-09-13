package com.designpatterns.creational.decorator.good;

public class SimpleLogger implements Logger {

	@Override
	public String log(String data) {
		//System.out.println("Data logged : " + data);
		return data;
	}

}
