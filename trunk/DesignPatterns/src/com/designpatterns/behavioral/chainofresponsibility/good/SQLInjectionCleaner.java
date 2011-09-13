package com.designpatterns.behavioral.chainofresponsibility.good;

import java.util.Map.Entry;

public class SQLInjectionCleaner extends Cleaner{
	
	public SQLInjectionCleaner(Cleaner next) {
		super(next);
	}

	@Override
	void process(Request request) throws Exception {
		for (Entry<String, String> entry : request.requestParameters.entrySet()) {
			entry.setValue(entry.getValue().replaceAll("'", "&#39;"));
		}
		processNext(request);
	}
	
}
