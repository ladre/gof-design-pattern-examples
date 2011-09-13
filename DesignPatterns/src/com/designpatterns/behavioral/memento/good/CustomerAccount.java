package com.designpatterns.behavioral.memento.good;

import java.util.Random;

public class CustomerAccount {
	double myMoney = 0;
	Random random = new Random();
	public CustomerAccount() {
		myMoney = 100;
	}
	
	public void wrapWithdraw(long amount) throws Exception{
		CustomerAccountCareTaker cact = new CustomerAccountCareTaker();
		cact.savedMemento(takeSnapshot());
		try{
			withdraw(amount);
		}catch(Exception ex){
			restoreFromSnapshot(cact.getMemento());
			System.out.println("Should rollbacked");
		}
	}
	
	public void withdraw(long amount) throws Exception{
		myMoney -= amount;
		// some other work in  the same transaction
		if (random.nextBoolean()){
			throw new Exception("Exception when withdrawing!");
		}
	}
	
	public void printAccount(){
		System.out.println(myMoney);
	}
	
	public Memento takeSnapshot(){
		return new Memento(myMoney);
	}
	
	public void restoreFromSnapshot(Memento memento){
		this.myMoney = memento.getMoney();
	}
	
	
	public static void main(String[] args){
		CustomerAccount ca = new CustomerAccount();
		try {
			ca.wrapWithdraw(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ca.printAccount();
		
		try {
			ca.wrapWithdraw(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ca.printAccount();
		
		try {
			ca.wrapWithdraw(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ca.printAccount();
		
	}
	
}
