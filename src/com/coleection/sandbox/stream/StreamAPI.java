package com.coleection.sandbox.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamAPI {
	
	
	
	{
		
		
		
		
	
	
	
//	List<Integer> list = Stream.generate(() -> Integer).limit(70).collect(toList());
	
	List<Integer> someList = Collections.nCopies(5, 20);
	
	
	someList.stream().filter(s -> s>10).collect(Collectors.toList()).forEach(s -> System.out.println(s));
	
//	someList.forEach(s -> System.out.println(s));
	
	
	
	
	}
	
	
}
