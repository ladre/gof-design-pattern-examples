package com.designpatterns.behavioral.state.good;

public class OFF implements State {

	public void increase(FanSpeedAdjuster fanSpeedAdjuster) {
		System.out.println("Running at low speed");
		fanSpeedAdjuster.setCurrentState(new LOW());
	}

}
