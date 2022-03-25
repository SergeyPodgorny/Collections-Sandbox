package com.coleection.sandbox.stream.two.dimensions;



public class StreamFor2dArrays {
	
	
	private static int SIZE = 17;
	
	
protected double [][] sparseField = new double [SIZE][SIZE];
	
	
	protected void buildSparseMatrix() {
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				sparseField[i][j] = 0;
			}
		}
		
		
	}
	

	
	
	
	
	
}
