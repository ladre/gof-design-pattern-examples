package com.designpatterns.creational.builder.good;

public class HttpURLBuilder extends AbstractURLBuilder{

	public HttpURLBuilder(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getProtocol() {
		return "http";
	}

	@Override
	String getPort() {
		return "80";
	}

	
	
}
