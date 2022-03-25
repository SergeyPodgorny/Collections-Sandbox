package com.coleection.sandbox.stream.two.dimensions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamFor2dArrays {
	
	
	public static void main(String[] args) {
		
		TwoDArray array = new TwoDArray();
		
		Arrays.asList(array.getArray()).stream().forEach(s -> System.out.println(s));
		
		
		
		
		
	}
	

	
	
	
	
	
}
