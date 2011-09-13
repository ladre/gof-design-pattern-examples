package com.designpatterns.behavioral.chainofresponsibility.good;

import java.util.Map.Entry;
import java.util.regex.Pattern;

public class HeaderCleaner extends Cleaner{

	private static final Pattern HEADER_NAME_PATTERN = Pattern.compile("[^\\\\()<>@,;:/?={}\\s\\]\\[\"]+",Pattern.DOTALL);
	
	public HeaderCleaner(Cleaner next) {
		super(next);
	}

	@Override
	void process(Request request) throws Exception {
		for (Entry<String, String> entry : request.requestHeaders.entrySet()) {
			if(!HEADER_NAME_PATTERN.matcher(entry.getValue()).matches()){
				throw new Exception("Header attack!");
			}
		}
		processNext(request);
	}
	
}
