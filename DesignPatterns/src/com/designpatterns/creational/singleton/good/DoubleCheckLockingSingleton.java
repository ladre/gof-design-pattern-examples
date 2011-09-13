package com.designpatterns.creational.singleton.good;

public class DoubleCheckLockingSingleton {
	private static DoubleCheckLockingSingleton instance = null;
    private static Object lockObj = new Object();
    public static DoubleCheckLockingSingleton getInstance() {
    	if(instance == null){
    		synchronized(lockObj) {
    			if (instance == null) {
    				instance = new DoubleCheckLockingSingleton();
    			}
    		}
    	}
    	return instance;
    }
    private DoubleCheckLockingSingleton() {}
}

