package com.demo.threading.waitnotify;

public class CommonData {
	int sum;

	public synchronized void produce() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Producing: " + i);
			sum += i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("producer Thread " + Thread.currentThread().getName() + "- notify in 2 seconds...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.notify();
	}

	public synchronized void consume() {
		try {
			System.out.println("consumer Thread " + Thread.currentThread().getName() + "- wait...");
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("consumer Thread " + Thread.currentThread().getName() + "- resume...");
		System.out.println("SUM: " + sum);
	}
}
