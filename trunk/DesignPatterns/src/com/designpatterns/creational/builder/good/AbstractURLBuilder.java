package com.designpatterns.creational.builder.good;

public abstract class AbstractURLBuilder {
	
	private String path;
	
	public AbstractURLBuilder(String path) {
		this.path = path;
	}
	
	abstract String getProtocol();
	public String getHost(){
		return "localhost";
	}
	abstract String getPort();
	public String getSeperator(){
		return ":";
	}
	
	public String build(){
		StringBuilder s = new StringBuilder();
		s.append(getProtocol());
		s.append("://");
		s.append(getHost());
		s.append(getSeperator());
		s.append(getPort());
		s.append(path);
		System.out.println(s.toString());
		return s.toString();
	}
}
