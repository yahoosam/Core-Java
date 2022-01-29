package com.demo.lamda.predicate;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PredicateDemo {
	public static void main(String[] args) {

		// simple example
		Predicate<Integer> isgreater = (x) -> (x > 10);
		System.out.println(isgreater.test(12));

		// some more example
		Predicate<String> isvalidnumber = (x) -> {
			String regex = "[0-9]+[\\.]?[0-9]*";
			return Pattern.matches(regex, x);
		};

		System.out.println(isvalidnumber.test("10982323"));
	}
}
