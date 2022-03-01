package com.coleection.sandbox.iterables;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorClass {
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<? super Integer> someList = new ArrayList<>();
		
		for (int i = 0; i < 20 ; i++) {
			someList.add(i);
		}
		
		
//	for (int i = 0; i < someList.size(); i++) {
//		System.out.println(someList.get(i));
//	}
		
		Iterator iterator = someList.iterator(); 
		
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
				

		
		
		
	}
	

}
