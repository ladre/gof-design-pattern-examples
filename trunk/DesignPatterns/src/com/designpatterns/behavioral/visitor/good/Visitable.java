package com.designpatterns.behavioral.visitor.good;

public interface Visitable {
	void accept(Visitor visitor);
}
