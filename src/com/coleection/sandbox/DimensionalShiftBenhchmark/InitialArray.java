package com.coleection.sandbox.DimensionalShiftBenhchmark;

import static com.coleection.sandbox.DimensionalShiftBenhchmark.ShiftLaunhcer.SIZE;


import java.util.Arrays;





public class InitialArray {
	
	public double [][] sparseField = new double [SIZE][SIZE];
	
	
	
	
	public void buildMatrix() {
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				
				
				if ((i>0)&(j>0)&(i<SIZE)&(j<SIZE)){
					sparseField[i][j] = Math.cos(0.20279*i-1.6223)*Math.cos(0.17346*j-1.3877);
				} else {
					sparseField[i][j] = 0;
				}
				
				
			}
		}
		
		printMatrix(sparseField);
	}
	
	
	private void printMatrix(double [][] printingArray) {
		
		System.out.println(Arrays.deepToString(printingArray).replace("], ", "]\n"));
			}

}
