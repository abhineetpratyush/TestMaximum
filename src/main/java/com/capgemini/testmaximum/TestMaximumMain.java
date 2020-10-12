package com.capgemini.testmaximum;

public class TestMaximumMain<T extends Comparable<T>> {
	private T[] elementArray;

	public TestMaximumMain(T[] elementArray) {
		this.elementArray = elementArray;
	}

	public T getMaximum() {
		return getTheMaxElement(elementArray);
	}

	public <E extends Comparable<E>> E getTheMaxElement(E[] elementList) {
		int maxIndex = 0;
		for(int index = 1; index < elementList.length; index++) 
			if (elementList[index].compareTo(elementList[maxIndex]) > 0) 
				maxIndex = index;
		return elementList[maxIndex];
	}
}
