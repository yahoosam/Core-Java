package com.demo.anonymousclass;

public class AnonymousClass {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside the anonymous class thread");
			}
		});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("some code in main method exit");
	}

}
