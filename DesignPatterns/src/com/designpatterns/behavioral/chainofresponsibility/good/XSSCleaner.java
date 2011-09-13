package com.designpatterns.behavioral.chainofresponsibility.good;

import java.util.Map.Entry;

public class XSSCleaner extends Cleaner{

	
	public XSSCleaner(Cleaner next) {
		super(next);
	}

	@Override
	void process(Request request) throws Exception {
		for (Entry<String, String> entry : request.requestParameters.entrySet()) {
			entry.setValue(entry.getValue().replaceAll("\"","&quot;"));
			entry.setValue(entry.getValue().replaceAll("<","&lt;"));
			entry.setValue(entry.getValue().replaceAll(">","&gt;"));
		}
		processNext(request);
	}
	
}
