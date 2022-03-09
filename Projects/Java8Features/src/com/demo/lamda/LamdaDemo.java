package com.demo.lamda;

import java.util.function.Consumer;

public class LamdaDemo {

	public static void main(String[] args) {
		// without lamda, we need to create an instance of LegacyImplementation class
		// which implements the abstract method
		LegacyImplementation wl = new LegacyImplementation();
		wl.method1();

		// with Lamda, there is no need for implementation class (LegacyImplementation)
		// we can directly invoke and implement the functional interface and call its
		// abstract method.
		FirstFunctionalInterface ffa = () -> System.out.println("Implementation of method1 using Lamda...");
		ffa.method1();
	}

}
