package com.dynamicbinding;

public class MacBookAir extends MacBook {
	String s = "MacBookAir";

	@Override
	void start() {
		System.out.println("Inside MacBookAir Start");
	}
	
	@Override
	void shutdown() {
		System.out.println("Inside MacBookAir Shutdown");
	}
}
