package com.ksh.oop.opertaors;

public class OperatorMain {
	public static void main(String[] args) {
		
		//KshOperator ko = new KshOperator();
		OperatorFactory ko = new KshOperator();
		System.out.println(ko.add(10, 12));
		
	}
}
