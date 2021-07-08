package com.staticbinding;
//compile time

public class MethodOverloading {

	void add(int a, int b) {
		System.out.println("Result: " + (a + b));
	}

	void add(float a, float b) {
		System.out.println("Result: " + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("Result: " + (a + b + c));
	}

	public static void main(String[] args) {

		MethodOverloading obj1 = new MethodOverloading();
		obj1.add(10, 20);
		obj1.add(10, 20, 30);
		obj1.add(10.10f, 20.33f);

	}

}
