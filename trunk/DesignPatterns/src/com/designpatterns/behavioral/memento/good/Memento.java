package com.designpatterns.behavioral.memento.good;

public class Memento {
	private double money;
	public double getMoney() {
		return money;
	}
	public Memento(double money) {
		this.money = money;
	}
}
