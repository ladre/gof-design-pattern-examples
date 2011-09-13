package com.designpatterns.behavioral.strategy.good;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeInMemoryCacher implements Cacher{
	Map<String, String> cache = new ConcurrentHashMap<String, String>();
	
	public void put(String key,String value){
		cache.put(key, value);
	}
	
	public String get(String key){
		return cache.get(key);
	}
}	
