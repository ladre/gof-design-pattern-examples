package com.designpatterns.creational.builder.good;

public class URLGenerator {
	public static void main(String[] args){
		
		HttpURLBuilder builder = new HttpURLBuilder("/pathFotHttp");
		builder.build();
		
		FtpURLBuilder ftpURLBuilder = new FtpURLBuilder("/pathFotFtp");
		ftpURLBuilder.build();	
		
		FileURLBuilder fileURLBuilder = new FileURLBuilder("/pathForFile");
		fileURLBuilder.build();
		
		
	}
}
