package com.designpatterns.behavioral.state.good;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FanSpeedAdjuster {
	private State currentState; // off

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public FanSpeedAdjuster(State currentState) {
		this.currentState = currentState;
	}
	
	public void increase(){
		currentState.increase(this);
	}
	
	public static void main(String[] args) throws IOException{
		FanSpeedAdjuster fanSpeedAdjuster = new FanSpeedAdjuster(new OFF());
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while(!line.equalsIgnoreCase("end")){
			fanSpeedAdjuster.increase();
			line = in.readLine();
		}
	}
	
}
