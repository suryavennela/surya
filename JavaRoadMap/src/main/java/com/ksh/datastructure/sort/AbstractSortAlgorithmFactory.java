package com.ksh.datastructure.sort;

import java.util.logging.Logger;

public abstract class AbstractSortAlgorithmFactory implements SortAlgorithmFatory{
	private Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	
	protected void displayArray(int array[]){
		logger.info("AbstractSortAlgorithmFactory#displayArray entry");
		if(array != null) {
			for(int i : array) {
				System.out.print(i+", ");
				
				//logger.info(String.valueOf(i));
			}
		}
		
		logger.info("AbstractSortAlgorithmFactory#displayArray exit");
	}
	
	protected void swap(int[] array,int pos1, int pos2){
		int temp 	= array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}
}
