package com.capgemini.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumJunit {
	@Test
	public void givenMaxInteger_WhenAtFirstPos_ShouldReturnSameInteger() {
		Integer firstNumber = 5;
		Integer secondNumber = 1;
		Integer thirdNumber = -1;        
		TestMaximumMain testMaximumObject = new TestMaximumMain(firstNumber, secondNumber, thirdNumber);
		Integer maxInteger = testMaximumObject.getTheMaxInteger();
		Assert.assertEquals(firstNumber, maxInteger);
	}

	@Test
	public void givenMaxInteger_WhenAtSecondPos_ShouldReturnSameInteger() {
		Integer firstNumber = 1;
		Integer secondNumber = 7;
		Integer thirdNumber = -1;        
		TestMaximumMain testMaximumObject = new TestMaximumMain(firstNumber, secondNumber, thirdNumber);
		Integer maxInteger = testMaximumObject.getTheMaxInteger();
		Assert.assertEquals(secondNumber, maxInteger);
	}

	@Test
	public void givenMaxInteger_WhenAtThirdPos_ShouldReturnSameInteger() {
		Integer firstInteger = 1;
		Integer secondInteger = -7;
		Integer thirdInteger = 10;        
		TestMaximumMain testMaximumObject = new TestMaximumMain(firstInteger, secondInteger, thirdInteger);
		Integer maxInteger = testMaximumObject.getTheMaxInteger();
		Assert.assertEquals(thirdInteger, maxInteger);
	}

	@Test
	public void givenMaxFloat_WhenAtFirstPos_ShouldReturnSameFloat() {
		Float firstFloat = 101.0f;
		Float secondFloat = -7.2f;
		Float thirdFloat = 10.3f;        
		TestMaximumMain testMaximumObject = new TestMaximumMain(firstFloat, secondFloat, thirdFloat);
		Float maxFloat = testMaximumObject.getTheMaxFloat();
		Assert.assertEquals(firstFloat, maxFloat);
	}

	@Test
	public void givenMaxFloat_WhenAtSecondPos_ShouldReturnSameFloat() {
		Float firstFloat = 10.2f;
		Float secondFloat = 99f;
		Float thirdFloat = 10.3f;        
		TestMaximumMain testMaximumObject = new TestMaximumMain(firstFloat, secondFloat, thirdFloat);
		Float maxFloat = testMaximumObject.getTheMaxFloat();
		Assert.assertEquals(secondFloat, maxFloat);
	}

	@Test
	public void givenMaxFloat_WhenAtThirdPos_ShouldReturnSameFloat() {
		Float firstFloat = 101.0f;
		Float secondFloat = -7.2f;
		Float thirdFloat = 105.3f;        
		TestMaximumMain testMaximumObject = new TestMaximumMain(firstFloat, secondFloat, thirdFloat);
		Float maxFloat = testMaximumObject.getTheMaxFloat();
		Assert.assertEquals(thirdFloat, maxFloat);
	}
}
