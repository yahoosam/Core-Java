package com.demo.threading.deadlock;

public class DeadLockDemo implements Runnable {

	static FirstResource fr = new FirstResource();
	static SecondResource sr = new SecondResource();

	public DeadLockDemo() {
		new Thread(this).start();
	}

	public static void main(String[] args) {
		// span a child thread using constructor and invoke frmethod1
		new DeadLockDemo();
		// invoke srmethod1 from main thread
		sr.srmethod1(fr);
	}

	@Override
	public void run() {
		fr.frmethod1(sr);
	}

}
