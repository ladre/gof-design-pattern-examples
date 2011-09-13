package com.designpatterns.structural.facade.good;


public class ComputerUser2 {
	Computer computer = new Computer();
	public void start(){
		computer.start();
	}
	
	public static void main(String[] args){
		new ComputerUser2().start();
	}
}
