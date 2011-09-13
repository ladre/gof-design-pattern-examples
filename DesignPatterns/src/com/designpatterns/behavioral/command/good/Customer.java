package com.designpatterns.behavioral.command.good;

import java.util.HashMap;
import java.util.Map;

public class Customer {
	private Map<String, Double> accounts = new HashMap<String, Double>();
	
	public void buy(String currency,Double amountToBuy){
		Double amount = accounts.get(currency);
		if (amount == null){
			amount = amountToBuy;
		}else{
			amount += amountToBuy;
		}
		accounts.put(currency, amount);
		System.out.println("Recent Amount for " + currency + " : " + accounts.get(currency));
	}
	
	public void sell(String currency,Double amountToSell) throws Exception{
		Double amount = accounts.get(currency);
		if (amount == null){
			throw new Exception("Can not be sold!");
		}else{
			if(amount < amountToSell)
				throw new Exception("Can not be sold!");
			amount -= amountToSell;
		}
		accounts.put(currency, amount);
		System.out.println("Recent Amount for " + currency + " : " + accounts.get(currency));
	}
	
}
