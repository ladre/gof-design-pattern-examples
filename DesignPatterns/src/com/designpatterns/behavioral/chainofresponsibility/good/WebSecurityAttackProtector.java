package com.designpatterns.behavioral.chainofresponsibility.good;

import java.util.HashMap;
import java.util.Map;

public class WebSecurityAttackProtector {
	
	public void makeRequestClean(Request request) throws Exception{
		new SQLInjectionCleaner(new HeaderCleaner(new XSSCleaner(null))).process(request);
	}
	
	public static void main(String[] args) throws Exception {
		Map<String, String> params = new HashMap<String, String>() ;
		params.put("param1", "'; delete from customer: , <javascript> alert('hello world') </javascript>");
		Map<String, String> headers = new HashMap<String, String>() ;
		headers.put("header1","nnn");
		Request request = new Request(params,headers);
		new WebSecurityAttackProtector().makeRequestClean(request);
		System.out.println(request.requestParameters.get("param1"));
	}
}
