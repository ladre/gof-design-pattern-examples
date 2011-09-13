package com.designpatterns.behavioral.observer.bad;

import java.util.HashMap;

public class Configuration {
	
	public HashMap<String, String> conf = new HashMap<String, String>();
	
	public Configuration() {
		readConfiguration("true","Istanbul");
	}
	
	public void readConfiguration(String sendEmailNotify,String city){
		conf.put("sendEmailNotifocation", sendEmailNotify);
		conf.put("city", city);
	}
	
	public String getConfigurationValue(String key){
		return conf.get(key);
	}
	
	
}
