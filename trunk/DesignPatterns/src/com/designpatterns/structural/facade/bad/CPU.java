package com.designpatterns.structural.facade.bad;

public class CPU {
    public void jump(long position) {
    	System.out.println("Jumped to address : " + position);
    }
    public void execute() { System.out.println("Executing");}
}
