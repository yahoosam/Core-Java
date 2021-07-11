package com.demo.threading.yield;

public class YieldDemo {

	public static void main(String[] args) {
		MyYieldThread myyield = new MyYieldThread();
		myyield.start();
		
		for (int j = 0; j <= 100; j++) {
			System.out.println("j---: " + j);
		}
	}

}
