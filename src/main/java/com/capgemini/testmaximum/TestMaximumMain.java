package com.capgemini.testmaximum;

public class TestMaximumMain<T extends Comparable<T>> {
	private T firstElement;
	private T secondElement;
	private T thirdElement;

	public TestMaximumMain(T firstElement, T secondElement, T thirdElement) {
		this.firstElement = firstElement;
		this.secondElement = secondElement;
		this.thirdElement = thirdElement;
	}

	public T getMaximum() {
		return getTheMaxElement(firstElement, secondElement, thirdElement);
	}

	public <E extends Comparable<E>> E getTheMaxElement(E firstElement, E secondElement, E thirdElement){
		E maxElement = firstElement;
		if(secondElement.compareTo(maxElement) > 0)
			maxElement = secondElement;
		if(thirdElement.compareTo(maxElement) > 0)
			maxElement = thirdElement;
		return maxElement;
	}
}
