package com.designpatterns.creational.decorator.good;

public class Client {

	public static void main(String[] args) {
		SimpleLogger simpleLogger = new SimpleLogger();
		simpleLogger.log("my first data");
		
		EncryptingLogger encryptionLogger = new EncryptingLogger(simpleLogger);
		encryptionLogger.log("my first data");
		
		HtmlLogger htmlLogger = new HtmlLogger(simpleLogger);
		htmlLogger.log("my first data");
		
		// ********* NEW CAPIBILITY ************* //
		htmlLogger = new HtmlLogger(encryptionLogger);
		htmlLogger.log("my first data");
		
		new EncryptingLogger(new HtmlLogger(new SimpleLogger())).log("hello");
		
	}

}
