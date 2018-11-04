package com.ksh.datastructure.sort;

public class KshSortingAlortihm extends AbstractSortAlgorithmFactory{

	public int[] bubleSort(int[] array) {
		int outer, inner, index = array.length;

		for (outer = index - 1; outer > 0; outer--) { // outer loop (in back word direction)
			for (inner = 0; inner < outer; inner++) { // inner loop (in forward direction)
				if (array[inner] > array[inner + 1]) { // out of order
					swap(array, inner, inner + 1); // swaping
				}
			}
		}
		return array;
	}

}
