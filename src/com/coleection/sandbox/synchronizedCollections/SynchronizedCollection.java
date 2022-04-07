package com.coleection.sandbox.synchronizedCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollection {
	
	
	List<Integer> list = Collections.synchronizedList(new ArrayList<>());
	
	
	{
		Runnable r = () -> {
			list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
		};
	
		new Thread(r).start();
		
		new Thread(r).start();
	
	}
	
	
	
	
	

	public List<Integer> returningList(){
		return list;
	}
	
	
}
