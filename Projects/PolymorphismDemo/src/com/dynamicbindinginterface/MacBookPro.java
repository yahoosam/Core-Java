package com.dynamicbindinginterface;

public class MacBookPro extends MacBook {

	@Override
	public void start() {
		System.out.println("Inside MacBookPro Start");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside MacBookPro Shutdown");
	}
}
