package com.designpatterns.behavioral.chainofresponsibility.bad;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;


public class WebSecurityAttackProtector {
	
	private static final Pattern HEADER_NAME_PATTERN = Pattern.compile("[^\\\\()<>@,;:/?={}\\s\\]\\[\"]+",Pattern.DOTALL);
	
	public Request makeRequestClean(Request request) throws Exception{
		
		//clean SQL Injection attacks
		for (Entry<String, String> entry : request.requestParameters.entrySet()) {
			entry.setValue(entry.getValue().replaceAll("'", "&#39;"));
		}
		
		//clean XSS Injection attacks
		for (Entry<String, String> entry : request.requestParameters.entrySet()) {
			entry.setValue(entry.getValue().replaceAll("\"","&quot;"));
			entry.setValue(entry.getValue().replaceAll("<","&lt;"));
			entry.setValue(entry.getValue().replaceAll(">","&gt;"));
		}
		
		//clean request headers
		for (Entry<String, String> entry : request.requestHeaders.entrySet()) {
			if(!HEADER_NAME_PATTERN.matcher(entry.getValue()).matches()){
				throw new Exception("Header attack!");
			}
		}
		
		//... Many other protections here
		
		return request;
		
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
