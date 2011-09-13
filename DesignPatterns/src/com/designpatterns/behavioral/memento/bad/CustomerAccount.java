package com.designpatterns.behavioral.memento.bad;

import java.util.Random;

public class CustomerAccount {
	double myMoney = 0;
	Random random = new Random();
	public CustomerAccount() {
		myMoney = 100;
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
	
	public static void main(String[] args){
		CustomerAccount ca = new CustomerAccount();
		try {
			ca.withdraw(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ca.printAccount();
		
		try {
			ca.withdraw(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ca.printAccount();
		
		try {
			ca.withdraw(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ca.printAccount();
		
	}
	
}
