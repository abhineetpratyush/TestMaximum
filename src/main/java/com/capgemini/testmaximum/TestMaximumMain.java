package com.capgemini.testmaximum;

public class TestMaximumMain {
	private Integer firstInteger;
	private Integer secondInteger;
	private Integer thirdInteger;
	private Float firstFloat;
	private Float secondFloat;
	private Float thirdFloat;

	public TestMaximumMain(Integer firstInteger, Integer secondInteger, Integer thirdInteger) {
		this.firstInteger = firstInteger;
		this.secondInteger = secondInteger;
		this.thirdInteger = thirdInteger;
	}

	public TestMaximumMain(Float firstFloat, Float secondFloat, Float thirdFloat) {
		this.firstFloat = firstFloat;
		this.secondFloat = secondFloat;
		this.thirdFloat = thirdFloat;
	}

	public Integer getTheMaxInteger() {
		Integer maxInteger = firstInteger;
		if(secondInteger.compareTo(maxInteger) > 0)
			maxInteger = secondInteger;
		if(thirdInteger.compareTo(maxInteger) > 0)
			maxInteger = thirdInteger;
		return maxInteger;
	}

	public Float getTheMaxFloat() {
		Float maxFloat = firstFloat;
		if(secondFloat.compareTo(maxFloat) > 0)
			maxFloat = secondFloat;
		if(thirdFloat.compareTo(maxFloat) > 0)
			maxFloat = thirdFloat;
		return maxFloat;
	}
}
