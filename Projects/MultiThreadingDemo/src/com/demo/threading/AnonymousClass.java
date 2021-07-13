package com.demo.threading;

public class AnonymousClass {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside the anonymous class thread");
			}
		});
		t.start();
	}

}
