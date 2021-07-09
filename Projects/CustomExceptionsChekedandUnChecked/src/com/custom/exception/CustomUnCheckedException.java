package com.custom.exception;

public class CustomUnCheckedException extends RuntimeException {
	public CustomUnCheckedException(String msg) {
		super("ATL: " + msg);
	}
}
