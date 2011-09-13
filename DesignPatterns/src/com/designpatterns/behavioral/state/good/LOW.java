package com.designpatterns.behavioral.state.good;

public class LOW implements State {

	public void increase(FanSpeedAdjuster fanSpeedAdjuster) {
		System.out.println("Running at medium speed");
		fanSpeedAdjuster.setCurrentState(new MEDIUM());
	}

}
