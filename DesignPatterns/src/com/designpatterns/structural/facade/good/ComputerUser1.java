package com.designpatterns.structural.facade.good;


public class ComputerUser1 {
	Computer computer = new Computer();
	public void start(){
		computer.start();
	}
	
	public static void main(String[] args){
		new ComputerUser1().start();
	}
}
