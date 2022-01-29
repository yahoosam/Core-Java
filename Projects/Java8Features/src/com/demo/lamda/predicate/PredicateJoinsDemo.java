package com.demo.lamda.predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateJoinsDemo {

	public static void main(String[] args) {
		// problem statement - filter and display age group >= 50

		int[] agegroup = { 3, 45, 2, 18, 56, 19, 23, 76, 27, 82, 92, 64, 51, 54, 26 };

		// Arrays.sort(agegroup);

		// age filter predicate
		Predicate<Integer> agefilter = age -> (age >= 50);
		// check even number predicate
		Predicate<Integer> evencheck = age -> (age % 2 == 0);

		printparticipantagegroup(agegroup, agefilter.and(evencheck));
	}

	static void printparticipantagegroup(int[] agegroup, Predicate<Integer> agefilter) {
		for (int age : agegroup) {
			if (agefilter.test(age))
				System.out.print(age + ", ");
		}
	}

}
