package com.coleection.sandbox.synchronizedCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionsLaunch {

	public static void main(String[] args) {
		
		
		SynchronizedCollection synchronizedCollection  = new SynchronizedCollection();
		
		System.out.println("Synchronized collection: ");
		synchronizedCollection.returningList().stream().forEach(e -> System.out.print(e));
		

	}

}
