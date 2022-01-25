package com.demo.genericsdemo;

public class GenericMethodExtendsDemo {

	public static <T extends Comparable<T>> T getmaxvalue(T x, T y, T z) {
		T max = x;

		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;

		return max; // returns the largest object
	}

	public static void main(String[] args) {

		System.out.println(getmaxvalue(10, 3, 76));

		System.out.println(getmaxvalue(65.23, 33.12, 54.78));

		System.out.println(getmaxvalue('Z', 'B', 'C'));

		System.out.println(getmaxvalue("ZpplePie", "Cat", "Elon"));

	}

}
