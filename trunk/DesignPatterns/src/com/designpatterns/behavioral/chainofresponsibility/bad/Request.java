package com.designpatterns.behavioral.chainofresponsibility.bad;

import java.util.HashMap;
import java.util.Map;

public class Request {
	public Map<String, String> requestParameters = new HashMap<String, String>();
	public Map<String, String> requestHeaders = new HashMap<String, String>();
	
	public Request(Map<String, String> parameters,Map<String,String> headers) {
		this.requestParameters = parameters;
		this.requestHeaders = headers;
	}
	
}
