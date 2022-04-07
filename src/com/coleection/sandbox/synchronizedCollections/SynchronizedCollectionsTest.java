package com.coleection.sandbox.synchronizedCollections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SynchronizedCollectionsTest {
	
	
	
	
	
	
	
	
	@Test
	void testing() {
		
		SynchronizedCollection synchronizedCollection  = new SynchronizedCollection();
		
		assertEquals(synchronizedCollection.returningList().size(), 6);
		
		
		
	}
	

}
