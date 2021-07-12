package com.demo.threading.deadlock;

public class FirstResource {

	// "FirstResource object" "fr" spawned by "child thread"

	// The "fr" object invokes this "synchronized frmethod1" so "fr" object is
	// BLOCKED by "child thread"
	public synchronized void frmethod1(SecondResource sr) {
		System.out.println("frmethod1 - Entry");
		try {
			// This 2 seconds sleep will allow "main thread" to lock sr object
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("frmethod1 - calling srmethod2");
		sr.srmethod2();
	}

	public synchronized void frmethod2() {
		System.out.println("--- Inside frmethod2 ---");
	}

}
