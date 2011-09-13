package com.designpatterns.behavioral.strategy.bad;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigurationManager {
	
	private int cacheMethod;
	public void setCacheMethod(int cacheMethod) {
		this.cacheMethod = cacheMethod;
	}
	
	public File confFile = null;
	Properties properties = new Properties();
	
	Map<String, String> inMemoryCache = new HashMap<String, String>();
	Map<String, String> threadSafeInMemoryCache = new ConcurrentHashMap<String, String>();
	
	Random random = new Random();
	
	public ConfigurationManager(int cacheMethod) {
		this.cacheMethod = cacheMethod;
		try {
			confFile = new File("conf.properties");
			if (!confFile.exists()){
				confFile.createNewFile();
			}
			properties.load(new FileInputStream(confFile));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public String get(String key) throws InterruptedException{
		String value = null;
		if(cacheMethod == 1){
			value = (String)properties.get(key);
		}else if(cacheMethod == 2){
			value = inMemoryCache.get(key);
		}else if(cacheMethod == 3){
			value = threadSafeInMemoryCache.get(key);
		}else{
			throw new RuntimeException("cache method not supported");
		}
		if(value == null){
			Thread.sleep(1000);
			System.out.println("Configuration read from DB");
			value = "Value" + (random.nextInt(100));
			putCache(key, value);
		}
		return value;
	}
	
	public void putCache(String key,String value){
		if(cacheMethod == 1){
			properties.put(key, value);
			try {
				properties.store(new FileOutputStream(confFile), null);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}else if(cacheMethod == 2){
			inMemoryCache.put(key, value);
		}else if(cacheMethod == 3){
			threadSafeInMemoryCache.put(key, value);
		}else{
			throw new RuntimeException("cache method not supported");
		}
	}
	
	public String getFromCache(String key){
		if(cacheMethod == 1){
			return (String)properties.get(key);
		}else if(cacheMethod == 2){
			return inMemoryCache.get(key);
		}else if(cacheMethod == 3){
			return threadSafeInMemoryCache.get(key);
		}else{
			throw new RuntimeException("cache method not supported");
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException{
		ConfigurationManager configurationManager = new ConfigurationManager(1);
		System.out.println("key1 : " + configurationManager.get("key1"));
		System.out.println("key1 : " + configurationManager.get("key1"));
		System.out.println("key2 : " + configurationManager.get("key2"));
		System.out.println("key3 : " + configurationManager.get("key3"));
		System.out.println("key2 : " + configurationManager.get("key2"));
		
		configurationManager.setCacheMethod(2);
		System.out.println("key1 : " + configurationManager.get("key1"));
		System.out.println("key1 : " + configurationManager.get("key1"));
		System.out.println("key2 : " + configurationManager.get("key2"));
		System.out.println("key3 : " + configurationManager.get("key3"));
		System.out.println("key2 : " + configurationManager.get("key2"));
		
	}
	
}
