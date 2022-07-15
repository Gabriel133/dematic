package com.dematic.calculator;

public class Divide extends Calculator {
	private float firstVal;
	private float secondVal;
	
	Divide(){
		this.firstVal = 0;
		this.secondVal = 0;
	}
	
	Divide(float firstVal, float secondVal){
		this.firstVal = firstVal;
		this.secondVal = secondVal;
	}
	
	
	@Override
	float result() {
		float result = 0;
		
		try {
			ValCheck();
			result = firstVal / secondVal;
		}
		catch (IllegalArgumentException e){
			System.out.println(e);
		}
		
		return result;
	}
	
	void ValCheck() throws IllegalArgumentException {
		if (this.secondVal > this.firstVal) {
			throw new IllegalArgumentException("Fisrt value (" + firstVal + ") cannot smaller than second value (" + secondVal + ")");
		}
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
