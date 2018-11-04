package com.ksh.oopp;

import org.junit.Assert;
import org.junit.Test;

import com.ksh.oop.opertaors.KshOperator;
import com.ksh.oop.opertaors.OperatorFactory;



public class OperatorsTest {
	
	@Test
	public void addtionTest(){
		OperatorFactory ko = new KshOperator();
		int i= ko.add(10, 12);
		Assert.assertEquals(22, i);
	}
}
