package com.coleection.sandbox.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class StreamAPI {
	
	
	
	{
		
		
		
		
	List<Integer> someList = new ArrayList<>(); 
	
	
	Iterator<Integer> iterator1 = someList.iterator();
	
	while(iterator1.hasNext()) {
		someList.add(1);
	}
	
	
	
	
	someList.stream().forEach(s -> System.out.println(s));
	
	
	
	
	}
	
	
}
