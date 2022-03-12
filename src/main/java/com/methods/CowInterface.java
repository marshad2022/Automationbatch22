package com.methods;

public class CowInterface implements TigerInterface{

	@Override
	public void getLogin() {
		// TODO Auto-generated method stub
		int a =5;
		int b =3;
		System.out.println(a+b);
	}
	
public static void main(String[] args) {
	CowInterface objCowInterface=new CowInterface();
	objCowInterface.getLogin();
}	
	

}
