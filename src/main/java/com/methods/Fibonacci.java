package com.methods;

public class Fibonacci {
	public void disLoop () {
		int a=0;
		int b=1;
		int c;
		int endpoint=20;
		
		for (int i=0; i<=endpoint; i++) {
			c=a+b;
			
			System.out.println("Fibonacci Series=" +c);
		a=b;
		b=c;
			
		}

		
	}
	
	

}
