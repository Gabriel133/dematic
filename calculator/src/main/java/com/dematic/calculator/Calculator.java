package com.dematic.calculator;
 
public abstract class Calculator {
	
	abstract float result();
	
	void printResult() {
		System.out.println("Calculator result: " + result());
	}
}
