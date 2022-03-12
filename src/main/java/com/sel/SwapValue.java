package com.sel;



public class SwapValue {
	
	public void swapNmbrs() {
		
		int a = 2;
		int b =3;
		System.out.println("values of a and b before swap="+a+","+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("values of a and b after swap="+a+","+b);
	
		
		
	}
	
	
	public static void main(String[] args) {
		SwapValue objSwapValue= new SwapValue();
		new SwapValue().swapNmbrs();
		
	}

}
