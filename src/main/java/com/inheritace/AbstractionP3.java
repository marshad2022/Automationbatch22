package com.inheritace;

public class AbstractionP3 extends AbstractionP2{
	
	public static void addBudget() {
		
		int budgetCash = 2000;
	    int budgetCredit = 3000;
		int virtualWallet = 3000;
		int totalFunds= budgetCash+budgetCredit+virtualWallet;
		
		System.out.println("Total Funds for the Tour"+totalFunds);
		
	}
	

}
