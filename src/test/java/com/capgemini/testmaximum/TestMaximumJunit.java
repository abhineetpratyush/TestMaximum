package com.capgemini.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumJunit {
	@Test
	public void givenMaxInteger_WhenAtFirstPos_ShouldReturnSameInteger() {
		Integer[] intArray = {10, -5, 6, 2};   
		TestMaximumMain<Integer> testMaximumObject = new TestMaximumMain<Integer>(intArray);
		Integer maxInteger = testMaximumObject.getMaximum();
		Assert.assertEquals(intArray[0], maxInteger);
	}

	@Test
	public void givenMaxInteger_WhenAtFourthPos_ShouldReturnSameInteger() {
		Integer[] intArray = {10, -5, 6, 201};   
		TestMaximumMain<Integer> testMaximumObject = new TestMaximumMain<Integer>(intArray);
		Integer maxInteger = testMaximumObject.getMaximum();
		Assert.assertEquals(intArray[3], maxInteger);
	}

	@Test
	public void givenMaxFloat_WhenAtFirstPos_ShouldReturnSameFloat() {
		Float[] floatArray = {10f, -5f, 6f, 2.2f};   
		TestMaximumMain<Float> testMaximumObject = new TestMaximumMain<Float>(floatArray);
		Float maxFloat = testMaximumObject.getMaximum();
		Assert.assertEquals(floatArray[0], maxFloat);
	}

	@Test
	public void givenMaxFloat_WhenAtSixthPos_ShouldReturnSameFloat() {
		Float[] floatArray = {10f, -5f, 6f, 2.2f, -10.3f, 502f};   
		TestMaximumMain<Float> testMaximumObject = new TestMaximumMain<Float>(floatArray);
		Float maxFloat = testMaximumObject.getMaximum();
		Assert.assertEquals(floatArray[5], maxFloat);
	}

	@Test
	public void givenMaxString_WhenAtFirstPos_ShouldReturnSameString() {
		String[] stringArray = {"Zebra", "Yak", "Apple", "Banana", "Hotel", "King"};   
		TestMaximumMain<String> testMaximumObject = new TestMaximumMain<String>(stringArray);
		String maxString = testMaximumObject.getMaximum();
		Assert.assertEquals(stringArray[0], maxString);
	}

	@Test
	public void givenMaxString_WhenAtFourthPos_ShouldReturnSameString() {
		String[] stringArray = {"Zebra", "Yak", "Apple", "Zzy", "Hotel", "King"};   
		TestMaximumMain<String> testMaximumObject = new TestMaximumMain<String>(stringArray);
		String maxString = testMaximumObject.getMaximum();
		Assert.assertEquals(stringArray[3], maxString);
	}
}
