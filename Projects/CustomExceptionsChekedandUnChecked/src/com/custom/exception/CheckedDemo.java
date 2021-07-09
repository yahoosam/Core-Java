package com.custom.exception;

public class CheckedDemo {

	public static void main(String[] args) {
		try {
			throw new CustomCheckedException("Custom Business CheckedException");
		} catch (CustomCheckedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("some code block is here");
	}

}
