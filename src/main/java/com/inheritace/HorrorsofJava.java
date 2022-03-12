package com.inheritace;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class HorrorsofJava {
	

		
		public static void removeDuplicateValues() {
			int [] var = {20, 55,12,60,20,10};
			int a = var.length;
			Set<Integer> myset = new HashSet<>();
			for(int i=0;i<a;i++){

				myset.add(var[i]);
				}

				System.out.println(myset);
				}
		
		public static void removeDupVal() {
			int [] var = {21,55,55,21,44,44,66,66,11,11,29,29};
		Arrays.parallelSort(var);
			int a = var.length;
			Set<Integer> myset1= new HashSet<>();
			for (int i=0;i<a;i++) {
				myset1.add(var[i]);}
	
		System.out.println(myset1);

	
			}
			
			
		
		public static void main(String[] args) {
			removeDuplicateValues();
		removeDupVal();
		}
	
	}
	


