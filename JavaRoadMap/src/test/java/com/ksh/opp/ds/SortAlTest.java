package com.ksh.opp.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ksh.datastructure.sort.KshSortingAlortihm;
import com.ksh.datastructure.sort.SortAlgorithmFatory;

public class SortAlTest {
	SortAlgorithmFatory sortAl = null;
	
	@Before
	public void sortAlinit() {
		sortAl  = new KshSortingAlortihm();
	}
	
	@Test
	public void bubbleSortTest(){
		int[] inArray = {5, 1, 6, 9};
		int[] actuallArray = sortAl.bubleSort(inArray);
		int[] expectedArray = {1, 5, 6, 9};
		
		Assert.assertArrayEquals(actuallArray, expectedArray);
	}
}
