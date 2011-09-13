package com.designpatterns.behavioral.visitor.good;

public interface Visitor {
	 void visit(Address address);
	 void visit(Customer customer);
	 void visit(Phone phone);
}
