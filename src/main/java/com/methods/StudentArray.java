package com.methods;

import java.util.Arrays;

public class StudentArray {
	public static void arrayMethod () {
	String [] studentofBatch22= {"Muhammad","Manpeet","Champa","Kunal"};
	System.out.println("Name of Student at index 1 before change="+studentofBatch22[1]);
studentofBatch22[1]="Davis";
	System.out.println("Name at index 1="+studentofBatch22[1]);
	
	
	System.out.println("Length of Students="+studentofBatch22.length);}
	
	public static void test() {
		
		int [] a= {4,5,7,8,9,10};
		//int b=a.length;
		//int min = a[0];
		
		//for (int i=0; i<b; i++);{
		//	if (a[0]>min) {
			//	min=a[0];
			//}
		//}
		int minNum=a[0];
		System.out.println("Value of the min num="+minNum);}
		
		public static void distortedOrderArray() {
			int[] a= {8,4,9,3,2};
			Arrays.parallelSort(a);
			int b=a.length;
			int max= a[0];
			
			for (int i=0; i<b; i++) {
			if (a[i]>max) {
				max=a[i];
				
			//int minNum = a[a.length-1];
			
			
			System.out.println("value of the min value="+max);}}}
		
		public static void minDistortedOrderArray() {
			int[] a= {8,4,9,3,2};
			Arrays.parallelSort(a);
			int b=a.length;
			int min =a[0];
			for (int i=0;i<b;i++) {
			if (a[i]<min) {
				min=a[i];
				}
		}
		//	int  maxNum = a[a.length-1];
		//System.out.println("max value array="+min);
		
		
		// int [] h = {2,4,5,6};	
		// System.out.println(Arrays.toString(h));   
		
		
		} }
	
	
	
	
	
	


