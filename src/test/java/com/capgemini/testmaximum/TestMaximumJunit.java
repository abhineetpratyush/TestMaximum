package com.capgemini.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumJunit {
    @Test
    public void givenMaxNumber_WhenAtFirstPos_ShouldReturnSameNumber() {
        Integer firstNumber = 5;
        Integer secondNumber = 1;
        Integer thirdNumber = -1;        
    	TestMaximumMain testMaximumObject = new TestMaximumMain(firstNumber, secondNumber, thirdNumber);
        Integer maxInteger = testMaximumObject.getTheMaxInteger();
        Assert.assertEquals(firstNumber, maxInteger);
    }
    
    @Test
    public void givenMaxNumber_WhenAtSecondPos_ShouldReturnSameNumber() {
    	Integer firstNumber = 1;
    	Integer secondNumber = 7;
    	Integer thirdNumber = -1;        
    	TestMaximumMain testMaximumObject = new TestMaximumMain(firstNumber, secondNumber, thirdNumber);
    	Integer maxInteger = testMaximumObject.getTheMaxInteger();
    	Assert.assertEquals(secondNumber, maxInteger);
    }

    @Test
    public void givenMaxNumber_WhenAtThirdPos_ShouldReturnSameNumber() {
    	Integer firstNumber = 1;
    	Integer secondNumber = -7;
    	Integer thirdNumber = 10;        
    	TestMaximumMain testMaximumObject = new TestMaximumMain(firstNumber, secondNumber, thirdNumber);
    	Integer maxInteger = testMaximumObject.getTheMaxInteger();
    	Assert.assertEquals(thirdNumber, maxInteger);
    }
    
    
}
