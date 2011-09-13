package com.designpatterns.behavioral.state.good;

public class HIGH implements State {

	public void increase(FanSpeedAdjuster fanSpeedAdjuster) {
		System.out.println("Turning Off");
		fanSpeedAdjuster.setCurrentState(new OFF());
	}

}
