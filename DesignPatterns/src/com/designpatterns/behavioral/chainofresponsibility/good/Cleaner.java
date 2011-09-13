package com.designpatterns.behavioral.chainofresponsibility.good;

public abstract class Cleaner {
	private Cleaner next;
	
	public Cleaner(Cleaner next) {
		this.next = next;
	}
	abstract void process(Request request) throws Exception ;
	
	public void processNext(Request request) throws Exception{
		if(next != null){
			next.process(request);
		}
	}
}
