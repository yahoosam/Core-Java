package com.cj.exception.mycustomexception;

public class MyCustomException extends Exception {

	public MyCustomException(String message) {
		super("***Custom*** " + message);
	}
	
}
