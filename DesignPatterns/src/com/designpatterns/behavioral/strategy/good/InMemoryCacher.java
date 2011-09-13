package com.designpatterns.behavioral.strategy.good;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCacher implements Cacher {
	Map<String, String> cache = new HashMap<String, String>();
	
	public void put(String key,String value){
		cache.put(key, value);
	}
	
	public String get(String key){
		return cache.get(key);
	}
}	
