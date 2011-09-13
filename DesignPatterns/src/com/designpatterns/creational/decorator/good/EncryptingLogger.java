package com.designpatterns.creational.decorator.good;

import org.apache.commons.lang.StringUtils;

public class EncryptingLogger implements Logger {
	private Logger logger;
	public EncryptingLogger(Logger logger) {
		this.logger = logger;
	}
	
	@Override
	public String log(String data) {
		String reversed = StringUtils.reverse(logger.log(data));
		System.out.println(reversed);
		return reversed;
	}
}
