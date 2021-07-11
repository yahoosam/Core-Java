package com.demo.threading.synchronization;

public class DisplayMessage {
	public synchronized void greetings(String msg) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Welcome to Milkyway Mr." + msg);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				System.out.println("something went wrong");
			}
		}
	}
}
