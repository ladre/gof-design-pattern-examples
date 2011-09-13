package com.designpatterns.creational.builder.good;

public class FileURLBuilder extends AbstractURLBuilder{
	
	public FileURLBuilder(String path) {
		super(path);
	}

	@Override
	String getProtocol() {
		return "file";
	}

	@Override
	String getPort() {
		return "";
	}
	
	@Override
	public String getSeperator() {
		// TODO Auto-generated method stub
		return "";
	}
	
	@Override
	public String getHost() {
		// TODO Auto-generated method stub
		return "";
	}
	
}
