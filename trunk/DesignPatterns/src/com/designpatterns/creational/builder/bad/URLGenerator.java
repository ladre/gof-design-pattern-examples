package com.designpatterns.creational.builder.bad;

public class URLGenerator {
	public static void main(String[] args){
		
		String httpProtocol = "http://";
		String fileProtocol = "file://";
		String ftpProtocol = "ftp://";
		
		String host = "localhost";
		String seperator = ":";
		
		String httpPort = "80";
		String ftpPort = "20";
		
		// Let us generate 3 URL (one is http, other is file, other is ftp)
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(httpProtocol);
		buffer.append(host);
		buffer.append(seperator);
		buffer.append(httpPort);
		buffer.append("/pathForHttp");
		System.out.println("Http URL : " + buffer.toString());
		
		buffer = new StringBuffer();
		buffer.append(ftpProtocol);
		buffer.append(host);
		buffer.append(seperator);
		buffer.append(ftpPort);
		buffer.append("/pathForFtp");
		System.out.println("Http URL : " + buffer.toString());
		
		buffer = new StringBuffer();
		buffer.append(fileProtocol);
		// for host
		buffer.append("");
		// for seperator 
		buffer.append("");
		// for port
		buffer.append("");
		buffer.append("/pathForFile");
		System.out.println("Http URL : " + buffer.toString());
		
	}
}
