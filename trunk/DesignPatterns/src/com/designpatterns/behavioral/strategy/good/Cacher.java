package com.designpatterns.behavioral.strategy.good;

public interface Cacher {
	void put(String key,String value);
	String get(String key);
}
