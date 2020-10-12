package com.capgemini.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumJunit {
	@Test
	public void givenMaxInteger_WhenAtFirstPos_ShouldReturnSameInteger() {
		Integer firstInteger = 5;
		Integer secondInteger = 1;
		Integer thirdInteger = -1;        
		TestMaximumMain<Integer> testMaximumObject = new TestMaximumMain<Integer>(firstInteger, secondInteger, thirdInteger);
		Integer maxInteger = testMaximumObject.getMaximum();
		Assert.assertEquals(firstInteger, maxInteger);
	}

	@Test
	public void givenMaxInteger_WhenAtSecondPos_ShouldReturnSameInteger() {
		Integer firstInteger = 1;
		Integer secondInteger = 7;
		Integer thirdInteger = -1;        
		TestMaximumMain<Integer> testMaximumObject = new TestMaximumMain<Integer>(firstInteger, secondInteger, thirdInteger);
		Integer maxInteger = testMaximumObject.getMaximum();
		Assert.assertEquals(secondInteger, maxInteger);
	}

	@Test
	public void givenMaxInteger_WhenAtThirdPos_ShouldReturnSameInteger() {
		Integer firstInteger = 1;
		Integer secondInteger = -7;
		Integer thirdInteger = 10;        
		TestMaximumMain<Integer> testMaximumObject = new TestMaximumMain<Integer>(firstInteger, secondInteger, thirdInteger);
		Integer maxInteger = testMaximumObject.getMaximum();
		Assert.assertEquals(thirdInteger, maxInteger);
	}

	@Test
	public void givenMaxFloat_WhenAtFirstPos_ShouldReturnSameFloat() {
		Float firstFloat = 101.0f;
		Float secondFloat = -7.2f;
		Float thirdFloat = 10.3f;        
		TestMaximumMain<Float> testMaximumObject = new TestMaximumMain<Float>(firstFloat, secondFloat, thirdFloat);
		Float maxFloat = testMaximumObject.getMaximum();
		Assert.assertEquals(firstFloat, maxFloat);
	}

	@Test
	public void givenMaxFloat_WhenAtSecondPos_ShouldReturnSameFloat() {
		Float firstFloat = 10.2f;
		Float secondFloat = 99f;
		Float thirdFloat = 10.3f;        
		TestMaximumMain<Float> testMaximumObject = new TestMaximumMain<Float>(firstFloat, secondFloat, thirdFloat);
		Float maxFloat = testMaximumObject.getMaximum();
		Assert.assertEquals(secondFloat, maxFloat);
	}

	@Test
	public void givenMaxFloat_WhenAtThirdPos_ShouldReturnSameFloat() {
		Float firstFloat = 101.0f;
		Float secondFloat = -7.2f;
		Float thirdFloat = 105.3f;        
		TestMaximumMain<Float> testMaximumObject = new TestMaximumMain<Float>(firstFloat, secondFloat, thirdFloat);
		Float maxFloat = testMaximumObject.getMaximum();
		Assert.assertEquals(thirdFloat, maxFloat);
	}

	@Test
	public void givenMaxString_WhenAtFirstPos_ShouldReturnSameString() {
		String firstString = "Zebra";
		String secondString = "Guava";
		String thirdString = "Apple";        
		TestMaximumMain<String> testMaximumObject = new TestMaximumMain<String>(firstString, secondString, thirdString);
		String maxString = testMaximumObject.getMaximum();
		Assert.assertEquals(firstString, maxString);
	}

	@Test
	public void givenMaxString_WhenAtSecondPos_ShouldReturnSameString() {
		String firstString = "Banana";
		String secondString = "Zebra";
		String thirdString = "Apple";        
		TestMaximumMain<String> testMaximumObject = new TestMaximumMain<String>(firstString, secondString, thirdString);
		String maxString = testMaximumObject.getMaximum();
		Assert.assertEquals(secondString, maxString);
	}

	@Test
	public void givenMaxString_WhenAtThirdPos_ShouldReturnSameString() {
		String firstString = "Cat";
		String secondString = "Guava";
		String thirdString = "Xylophone";        
		TestMaximumMain<String> testMaximumObject = new TestMaximumMain<String>(firstString, secondString, thirdString);
		String maxString = testMaximumObject.getMaximum();
		Assert.assertEquals(thirdString, maxString);
	}
}
