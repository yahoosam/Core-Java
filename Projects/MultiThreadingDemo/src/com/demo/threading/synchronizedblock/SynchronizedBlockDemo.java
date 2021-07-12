package com.demo.threading.synchronizedblock;

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		CalculateSumThread cs = new CalculateSumThread();

		cs.start();

		synchronized (cs) {
			try {
				System.out.println(Thread.currentThread().getName() + " Thread going to wait state...");
				cs.wait();
				System.out.println(Thread.currentThread().getName() + " Thread got notification...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Calculated Sum: " + cs.sum);
		}
	}
}
