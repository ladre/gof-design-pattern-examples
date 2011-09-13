package com.designpatterns.behavioral.state.good;

public class MEDIUM implements State {

	public void increase(FanSpeedAdjuster fanSpeedAdjuster) {
		System.out.println("Running at high speed");
		fanSpeedAdjuster.setCurrentState(new HIGH());
	}

}
