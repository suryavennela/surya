package com.ksh.datastructure.sort;

public class SortAlgorthmMain {
	public static void main(String[] args) {
		int[] array = {5, 1, 6, 9};
		KshSortingAlortihm sortAl = new KshSortingAlortihm();
		int[] bubleSort = sortAl.bubleSort(array);
		sortAl.displayArray(bubleSort);
	}
}
