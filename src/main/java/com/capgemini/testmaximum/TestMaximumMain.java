package com.capgemini.testmaximum;

public class TestMaximumMain {
	private Integer firstNumber;
	private Integer secondNumber;
	private Integer thirdNumber;

	 public TestMaximumMain(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

	public Integer getTheMaxInteger() {
		Integer maxNumber = firstNumber;
		if(secondNumber.compareTo(maxNumber) > 0)
			maxNumber = secondNumber;
		if(thirdNumber.compareTo(maxNumber) > 0)
			maxNumber = thirdNumber;
		return maxNumber;
	}
}
