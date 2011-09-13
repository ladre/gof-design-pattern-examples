package com.designpatterns.structural.facade.good;

public class Memory {
	public void load(long position,byte[] data){
		System.out.println("Loading data to address : " + position);
	}
}
