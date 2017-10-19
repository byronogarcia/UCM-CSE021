package oop;


public class DecrementableCounter extends Counter {

	public void decrement() {
		if (value > 0)
			value--;
	}
}