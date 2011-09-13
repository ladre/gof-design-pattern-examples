package com.designpatterns.behavioral.state.bad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FanSpeedAdjuster {
	private int currentState; // off

	public FanSpeedAdjuster(int currentState) {
		this.currentState = currentState;
	}
	
	public void increase(){
		if(currentState == 0){
			currentState = 1;
			System.out.println("Runnin at low speed");
		}else if(currentState == 1){
			currentState = 2;
			System.out.println("Runnin at medium speed");
		}else if(currentState == 2){
			currentState = 3;
			System.out.println("Running at high Speed");
		}else if(currentState == 3){
			currentState = 0;
			System.out.println("Turning off");
		}
	}
	
	public static void main(String[] args) throws IOException{
		FanSpeedAdjuster fanSpeedAdjuster = new FanSpeedAdjuster(0);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while(!line.equalsIgnoreCase("end")){
			fanSpeedAdjuster.increase();
			line = in.readLine();
		}
	}
	
}
