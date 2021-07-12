package com.demo.threading.deadlock;

public class SecondResource {

	// "SecondResource object" "sr" spawned by "main thread"

	// The "sr" object invokes this "synchronized srmethod1" so "sr" object is
	// BLOCKED by "main thread"
	public synchronized void srmethod1(FirstResource fr) {
		System.out.println("srmethod1 - Entry");
		try {
			// This 2 seconds sleep will allow "child thread" to lock fr object
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("srmethod1 - calling frmethod2");
		fr.frmethod2();
	}

	public synchronized void srmethod2() {
		System.out.println("--- Inside srmethod2 ---");
	}

}
