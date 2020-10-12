package com.capgemini.testmaximum;

public class TestMaximumMain {
	private Integer firstInteger;
	private Integer secondInteger;
	private Integer thirdInteger;
	private Float firstFloat;
	private Float secondFloat;
	private Float thirdFloat;
	private String firstString;
	private String secondString;
	private String thirdString;

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

	public TestMaximumMain(String firstString, String secondString, String thirdString) {
		this.firstString = firstString;
		this.secondString = secondString;
		this.thirdString = thirdString;
	}
	
	public <E extends Comparable<E>> E getTheMaxElement(E firstElement, E secondElement, E thirdElement){
		E maxElement = firstElement;
		if(secondElement.compareTo(maxElement) > 0)
			maxElement = secondElement;
		if(thirdElement.compareTo(maxElement) > 0)
			maxElement = thirdElement;
		return maxElement;
	}

	public Integer getTheMaxInteger() {
		return getTheMaxElement(firstInteger, secondInteger, thirdInteger);
	}

	public Float getTheMaxFloat() {
		return getTheMaxElement(firstFloat, secondFloat, thirdFloat);
	}
	
	public String getTheMaxString() {
		return getTheMaxElement(firstString, secondString, thirdString);
	}
}
