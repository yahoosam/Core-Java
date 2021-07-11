package com.demo.threading;

public class ThreadingRunnableInterfaceDemo implements Runnable {

	public static void main(String[] args) {

		ThreadingRunnableInterfaceDemo td = new ThreadingRunnableInterfaceDemo();
		Thread thread = new Thread(td);
		thread.start();

		for (int j = 0; j <= 100; j++) {
			System.out.println("j---: " + j);
		}
	}

	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("i###: " + i);
		}
	}

}
