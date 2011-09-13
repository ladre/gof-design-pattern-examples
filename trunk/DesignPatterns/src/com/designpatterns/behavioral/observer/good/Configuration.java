package com.designpatterns.behavioral.observer.good;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Configuration {
	
	List<Observer> observers = new LinkedList<Observer>();
	
	public HashMap<String, String> conf = new HashMap<String, String>();
	
	public Configuration() {
		readConfiguration("true","Istanbul");
	}
	
	public void readConfiguration(String sendEmailNotify,String city){
		conf.put("sendEmailNotifocation", sendEmailNotify);
		conf.put("city", city);
		for (Observer observer : observers) {
			observer.changeConfiguration();
		}
	}
	
	public String getConfigurationValue(String key){
		return conf.get(key);
	} 
	
	public void register(Observer observer){
		observers.add(observer);
	}
	
}
