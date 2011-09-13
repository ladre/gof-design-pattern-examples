package com.designpatterns.creational.singleton.good;

public class LazyNonThreadSafeSingleton {
	private static LazyNonThreadSafeSingleton instance = null;
    public static LazyNonThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyNonThreadSafeSingleton();
        }
        return instance;
    }
    private LazyNonThreadSafeSingleton() {}
}

