package com.coleection.sandbox.iterables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IterableClass {
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> someList = new ArrayList<>();
		
		for (int i = 0; i < 20 ; i++) {
			someList.add(i);
		}
		
		
//	for (int i = 0; i < someList.size(); i++) {
//		System.out.println(someList.get(i));
//	}
		
		Iterator iterator = someList.iterator(); 
		
		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
				

//		someList.forEach(number -> System.out.println(number));
		
//		someList.forEach(System.out::println);
		
		someList.forEach(s-> System.out.println(s));
		
		
		
	}
	
	

	

}
