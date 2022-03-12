package com.inheritace;  // for finding removing duplicate values

import java.util.HashMap;
import java.util.Map;

public class AddMap{
	
	public static void addName () {
		
		Map<String, String> myMap = new HashMap<>(); // add name & city
		myMap.put("Name", "Mark");
		myMap.put("City", "New York");
	
		
		System.out.println("myMap"+myMap);
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		addName();
		
		
		
	}


	

	

}
