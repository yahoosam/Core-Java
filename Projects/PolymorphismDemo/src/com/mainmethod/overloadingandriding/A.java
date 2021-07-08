package com.mainmethod.overloadingandriding;

public class A {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		main(10);
	}

	// try to overload the main method
	public static void main(int args) {
		System.out.println("Inside overloaded main method");
	}

}
