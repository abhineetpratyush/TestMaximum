package com.capgemini.testmaximum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximumMain<T extends Comparable<T>> {
	private static final Logger log = LogManager.getLogger(TestMaximumMain.class);
	private T[] elementArray;

	public TestMaximumMain(T[] elementArray) {
		this.elementArray = elementArray;
	}

	public T getMaximum() {
		printMaximum(getTheMaxElement(elementArray));
		return getTheMaxElement(elementArray);
	}
	
	private void printMaximum(T theMaxElement) {
		log.info("The max element is : " + theMaxElement);
	}

	public <E extends Comparable<E>> E getTheMaxElement(E[] elementList) {
		int maxIndex = 0;
		for(int index = 1; index < elementList.length; index++) 
			if (elementList[index].compareTo(elementList[maxIndex]) > 0) 
				maxIndex = index;
		return elementList[maxIndex];
	}
}
