package com.inheritace;

import java.util.HashSet;
import java.util.Set;

public class HashSetP {
	
	Set<Integer> mySet = new HashSet<>(); // remove duplicate values 2,4,4,5,8,9,9

	public Set<Integer> getArrayValue() {
		//use add. method
		mySet.add(2);
		mySet.add(4);
		mySet.add(4);
		mySet.add(5);
		mySet.add(8);
		mySet.add(9);
		mySet.add(9);
		
		System.out.println(mySet);
		
		return mySet;
	}
	
	
	public static void main(String[] args) {
		HashSetP obj=new HashSetP();
		obj.getArrayValue();
	}
	
	

	
}
