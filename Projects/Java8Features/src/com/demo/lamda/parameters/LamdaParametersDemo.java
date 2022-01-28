package com.demo.lamda.parameters;

public class LamdaParametersDemo {

	public static void main(String[] args) {
		Sum sum = (x, y) -> System.out.println("Sum is: " + (x + y));

		Sum sum2 = (x, y) -> System.out.println("Another implementation of Sum: " + (x + y));
		
		sum.add(10, 20);
		sum2.add(10, 20);
	}

}
