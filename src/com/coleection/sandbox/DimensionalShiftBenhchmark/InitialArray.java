package com.coleection.sandbox.DimensionalShiftBenhchmark;

import static com.coleection.sandbox.DimensionalShiftBenhchmark.ShiftLaunhcer.SIZE;





public class InitialArray {
	
	public double [][] sparseField = new double [SIZE][SIZE];
	
	
	
	
	public void buildSparseMatrix() {
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				sparseField[i][j] = 0;
			}
		}
		
		
	}
	

}
