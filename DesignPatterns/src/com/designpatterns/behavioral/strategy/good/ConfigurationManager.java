package com.designpatterns.behavioral.strategy.good;

import java.util.Random;

public class ConfigurationManager {
	Cacher cacheStrategy = null;
	
	public void setCacheStrategy(Cacher cacheStrategy) {
		this.cacheStrategy = cacheStrategy;
	}

	Random random = new Random();
	
	public ConfigurationManager(Cacher cacheStrategy) {
		this.cacheStrategy = cacheStrategy;
	}

	public String get(String key) throws InterruptedException{
		String value = cacheStrategy.get(key);
		if(value == null){
			Thread.sleep(1000);
			System.out.println("Configuration read from DB");
			value = "Value" + (random.nextInt(100));
			putCache(key, value);
		}
		return value;
	}
	
	public void putCache(String key,String value){
		cacheStrategy.put(key, value);
	}
	
	public static void main(String[] args) throws InterruptedException{
		ConfigurationManager configurationManager = new ConfigurationManager(new FileCacher());
		System.out.println("key1 : " + configurationManager.get("key1"));
		System.out.println("key1 : " + configurationManager.get("key1"));
		System.out.println("key2 : " + configurationManager.get("key2"));
		System.out.println("key3 : " + configurationManager.get("key3"));
		System.out.println("key2 : " + configurationManager.get("key2"));
		
		configurationManager.setCacheStrategy(new InMemoryCacher());
		System.out.println("key1 : " + configurationManager.get("key1"));
		System.out.println("key1 : " + configurationManager.get("key1"));
		System.out.println("key2 : " + configurationManager.get("key2"));
		System.out.println("key3 : " + configurationManager.get("key3"));
		System.out.println("key2 : " + configurationManager.get("key2"));
		
	}
	
}
