package com.demo.threading;

public class ThreadingExtendThreadDemo extends Thread {

	public static void main(String[] args) {

		ThreadingExtendThreadDemo td = new ThreadingExtendThreadDemo();
		td.start();

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
