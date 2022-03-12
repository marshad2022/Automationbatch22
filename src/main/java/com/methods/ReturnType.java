package com.methods;

public class ReturnType {
	
public int add() {
		int a=2;
		int b=3;
		int c=a-b; 
	    return c;}
public static void main(String[] args) {
		
	ReturnType objRttype=new ReturnType();
	objRttype.add();
	System.out.println("Value of ReturnType C=" +objRttype.add());}   
		
public String name(String x,String y) {
		String R=x+y;
		return R;}
		
//public static void main(String[] args) {
	//ReturnType objRttype=new ReturnType();
	//objRttype.name(null, null);
	//System.out.println("Value of R=" +objRttype.name("Mark","Cuban"));    }   
			
//public int addValue(int m, int n) {
		//int z=m+n;
		//return z;}
		
//	public static void main(String[] args) {
				
	//ReturnType objrttypeint=new ReturnType();
	//objrttypeint.addValue(0, 0);
   //System.out.println("Value of int z=" +objrttypeint.addValue(2, 3));
				
}

