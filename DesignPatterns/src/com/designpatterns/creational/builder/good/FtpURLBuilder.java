package com.designpatterns.creational.builder.good;

public class FtpURLBuilder extends AbstractURLBuilder{

	public FtpURLBuilder(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getProtocol() {
		return "ftp";
	}

	@Override
	String getPort() {
		return "20";
	}

	
	
}
