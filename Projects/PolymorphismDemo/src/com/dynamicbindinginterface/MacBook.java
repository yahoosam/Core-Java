package com.dynamicbindinginterface;

public class MacBook implements AppleLaptop{

	public void start() {
		System.out.println("Inside MacBook Start");
	}

	public void shutdown() {
		System.out.println("Inside MacBook Shutdown");
	}
}
