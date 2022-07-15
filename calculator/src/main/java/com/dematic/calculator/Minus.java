package com.dematic.calculator;

public class Minus extends Calculator {
	private float firstVal;
	private float secondVal;
	
	Minus(){
		this.firstVal = 0;
		this.secondVal = 0;
	}
	
	Minus(float firstVal, float secondVal){
		this.firstVal = firstVal;
		this.secondVal = secondVal;
	}
	
	
	@Override
	float result() {
		// TODO Auto-generated method stub
		return firstVal - secondVal;
	}
	
	public float getFirstVal() {
		return firstVal;
	}
	public float getSecondVal() {
		return secondVal;
	}
	
	public void setFirstVal(float val) {
		this.firstVal = val;
	}
	
	public void setSecondVal(float val) {
		this.secondVal = val;
	}
}
