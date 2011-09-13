package com.designpatterns.structural.facade.good;

public class HardDrive {
	public byte[] readBootSektorData(){
		System.out.println("reading boot sector data");
		return new String("data").getBytes();
	}
}
