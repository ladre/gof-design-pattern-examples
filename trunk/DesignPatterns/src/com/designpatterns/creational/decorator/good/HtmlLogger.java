package com.designpatterns.creational.decorator.good;


public class HtmlLogger implements Logger {
	private Logger logger;
	
	public HtmlLogger(Logger logger) {
		this.logger = logger;
	}
	
	@Override
	public String log(String data) {
		String data2 = logger.log(data);
		return "<log>" + data2 + "</log>";
		//System.out.println("<log>" + data + "</log>");  
	}
}
