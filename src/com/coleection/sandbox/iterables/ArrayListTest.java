package com.coleection.sandbox.iterables;

import java.util.ArrayList;


public class ArrayListTest {
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<?super Number> someList = new ArrayList<>(10);
		
		
		someList.add((Double)5.0);
		
		
		System.out.println(someList.isEmpty());
		
		System.out.println(someList.get(0));
	}
	

}
