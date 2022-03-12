package com.methods;

public class Hellojava {
static int a=10;
int b=30;
int c=20;
static String first_name= "Muhammad";
static String last_name= "Arshad";
String animal="Cat";  

public static void main(String[] args) {
	
  Hellojava obj=new Hellojava();
     
  
 //System.out.println("Full String Name=" +first_name+ last_name);
 
  
 //System.out.println("animal name=" +obj.animal);}
  
  
  
//System.out.println("Static int="+a);
  
System.out.println("string animal name=" +obj.animal); 

 

}

public void swapNmbrs() {
	
    int j=10;
    int k=20;
    System.out.println("Values of j & k before the swap=" +j+","+k);
	
	j=j+k;
	k=j-k;
	j=j-k;
	
	System.out.println("Values of j & k after the swap= "+j+","+k);

	
}
public void swapN() {
	int a =11;
	int b =13;
	System.out.println("values of a & b before swap="+a+","+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("values of a & b after the swap="+a+","+b);}
	public void disFibo() {
		int a=0;
		int b=1;
		int c;
		int endpoint=21;
		for (int i=0; i<=endpoint;i++) {
			c=a+b;
			System.out.println("Fibo Series="+c);
			a=b;
			b=c;
		}
		}
		
	
	


}
