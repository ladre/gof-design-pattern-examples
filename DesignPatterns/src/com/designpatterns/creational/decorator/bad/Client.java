package com.designpatterns.creational.decorator.bad;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleLogger simpleLogger = new SimpleLogger();
		simpleLogger.log("my first data");
		
		EncryptingLogger encryptingLogger = new EncryptingLogger();
		encryptingLogger.log("my first data");
		
		HtmlLogger htmlLogger = new HtmlLogger();
		htmlLogger.log("my first data");
		
		
	}

}
