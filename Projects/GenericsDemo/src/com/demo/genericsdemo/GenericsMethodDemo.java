package com.demo.genericsdemo;

public class GenericsMethodDemo {

	public static <T> void printarrayelements(T[] inputarr) {
		for (T element : inputarr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer i[] = { 10, 20, 30 };
		Float f[] = { 2.24f, 3.54f, 65.23f };
		String s[] = { "Hello", "world" };
		Character c[] = { 'a', 'b', 'c' };

		printarrayelements(i);
		printarrayelements(f);
		printarrayelements(s);
		printarrayelements(c);
	}

}
