package com.custom.exception;

public class CustomCheckedException extends Exception {
	public CustomCheckedException(String msg) {
		super("ATL: " + msg);
	}
}
