package com.designpatterns.structural.facade.good;

public class Computer {
	private Memory memory = new Memory();
	private CPU cpu = new CPU();
	private HardDrive hardDrive = new HardDrive();
	public void start(){
		byte[] bootSektorData = hardDrive.readBootSektorData();
		memory.load(0, bootSektorData);
		cpu.execute();
	}
}
