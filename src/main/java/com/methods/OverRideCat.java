package com.methods;

public class OverRideCat extends OverRideAnimal{

	@Override
	public void getMoney() {
		// TODO Auto-generated method stub
		System.out.println("This is Dog!");
	}
	
	public static void main(String[] args) {
		OverRideCat objofOverRideCat= new OverRideCat();
		objofOverRideCat.getMoney();
		
	}


		
	}
	


