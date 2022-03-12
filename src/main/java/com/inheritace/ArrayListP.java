package com.inheritace;

import java.util.ArrayList;
import java.util.List;

public class ArrayListP {

		List<Integer> myList = new ArrayList<>(); //upcasting; declare a "wrapper class" object in <>
		
		public List<Integer> addArrayValue() {
		
			// to insert value in list use add method
			// 2, 4, 4, 5, 8, 9
			myList.add(2);
			myList.add(4);
			myList.add(4);
			myList.add(5);
			myList.add(8);
			myList.add(9);
			
			System.out.println(myList);
			
			System.out.println(myList.size());
			
			return myList;
		}
	
public static void main(String[] args) {
	
	ArrayListP obj= new ArrayListP();
	obj.addArrayValue();
	
}

}