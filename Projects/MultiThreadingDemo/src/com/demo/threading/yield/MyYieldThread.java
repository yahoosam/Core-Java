package com.demo.threading.yield;

public class MyYieldThread extends Thread {

	@Override
	public void run() {
		Thread.yield();
		for (int i = 0; i <= 100; i++) {
			System.out.println("i###: " + i);
		}
	}

}
