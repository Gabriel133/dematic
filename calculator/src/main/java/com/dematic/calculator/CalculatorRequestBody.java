package com.dematic.calculator;

public class CalculatorRequestBody {
	
	private String operationId;
	private float firstVal;
	private float secondVal;
	
	public CalculatorRequestBody() {};
	
	public CalculatorRequestBody(String operationId, float firstVal, float secondVal) {
		super();
		this.operationId = operationId;
		this.firstVal = firstVal;
		this.secondVal = secondVal;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public float getFirstVal() {
		return firstVal;
	}

	public void setFirstVal(float firstVal) {
		this.firstVal = firstVal;
	}

	public float getSecondVal() {
		return secondVal;
	}

	public void setSecondVal(float secondVal) {
		this.secondVal = secondVal;
	}
	
}
