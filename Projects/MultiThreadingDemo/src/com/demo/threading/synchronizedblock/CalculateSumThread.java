package com.demo.threading.synchronizedblock;

public class CalculateSumThread extends Thread {
	int sum;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 10; i++) {
				sum += i;
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("Notifying in 2 seconds...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.notify();
			System.out.println(Thread.currentThread().getName() + " Thread exiting...");
		}
	}
}
