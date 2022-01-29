package com.demo.lamda.function;

import java.util.function.Function;

public class lamdaFunction {

	public static void main(String[] args) {
		Function<String, Integer> strlength = (str) -> (str.length());
		
		System.out.println(strlength.apply("Hello"));
		System.out.println(strlength.apply("World..."));
		System.out.println(strlength.apply("Milkyway..."));
	}

}
