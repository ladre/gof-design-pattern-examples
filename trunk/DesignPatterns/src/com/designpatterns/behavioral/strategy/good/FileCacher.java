package com.designpatterns.behavioral.strategy.good;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class FileCacher implements Cacher{
	
	public File confFile = null;
	Properties properties = new Properties();
	
	public FileCacher() {
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
	
	public void put(String key,String value){
		properties.put(key, value);
		try {
			properties.store(new FileOutputStream(confFile), null);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public String get(String key){
		return (String)properties.get(key);
	}

}
