package com.designpatterns.creational.decorator.bad;


public class HtmlLogger extends SimpleLogger {
	@Override
	public void log(String data) {
		System.out.println("<log>");
		super.log(data);
		System.out.println("</log>");
	}
}
