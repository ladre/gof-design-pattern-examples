package com.designpatterns.structural.facade.bad;

public class ComputerUser1 {
	private Memory memory = new Memory();
	private CPU cpu = new CPU();
	private HardDrive hardDrive = new HardDrive();
	public void start(){
		byte[] bootSektorData = hardDrive.readBootSektorData();
		memory.load(0, bootSektorData);
		cpu.execute();
	}
	
	public static void main(String[] args){
		new ComputerUser1().start();
	}
	
}
