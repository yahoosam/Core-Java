package com.dynamicbindinginterface;

public class MacBookAir extends MacBook {

	@Override
	public void start() {
		System.out.println("Inside MacBookAir Start");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside MacBookAir Shutdown");
	}
	
	public void macbookairaddedfeatures() {
		System.out.println("Inside MacBookAir Added Features");
	}
}
