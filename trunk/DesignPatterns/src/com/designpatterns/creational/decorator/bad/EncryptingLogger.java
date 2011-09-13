package com.designpatterns.creational.decorator.bad;

import org.apache.commons.lang.StringUtils;

public class EncryptingLogger extends SimpleLogger {
	@Override
	public void log(String data) {
		String reversed = StringUtils.reverse(data);
		super.log(reversed);
	}
}
