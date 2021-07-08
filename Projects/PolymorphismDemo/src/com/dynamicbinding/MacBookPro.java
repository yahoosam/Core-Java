package com.dynamicbinding;

public class MacBookPro extends MacBook {
	String s = "MacBookPro";

	@Override
	void start() {
		System.out.println("Inside MacBookPro Start");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MacBookPro Shutdown");
	}
}
