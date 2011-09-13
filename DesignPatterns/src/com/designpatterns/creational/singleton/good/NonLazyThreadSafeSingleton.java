package com.designpatterns.creational.singleton.good;

public class NonLazyThreadSafeSingleton {
	private static NonLazyThreadSafeSingleton instance = new NonLazyThreadSafeSingleton();
    public static NonLazyThreadSafeSingleton Instance() {
        return instance;
    }
    private NonLazyThreadSafeSingleton() {}
}

