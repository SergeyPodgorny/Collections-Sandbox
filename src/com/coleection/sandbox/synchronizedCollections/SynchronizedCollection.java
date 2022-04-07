package com.coleection.sandbox.synchronizedCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollection {
	
	
	List<Integer> list = Collections.synchronizedList(new ArrayList<>());
	
	
	
	

	public List<Integer> returningList(){
		return list;
	}
	
	
}
