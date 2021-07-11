package com.demo.threading;

import java.util.Scanner;

public class ThreadingJoinDemo extends Thread {

	static long num, sum;

	public static void main(String[] args) {
		System.out.println("Enter an integer to calculate the Sum of 'N' numbers: ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

		long start = System.currentTimeMillis();

		ThreadingJoinDemo tj = new ThreadingJoinDemo();
		tj.start();
		System.out.println("Do something before waiting for the execution to complete");
		try {
			tj.join();
		} catch (InterruptedException e) {
			System.out.println("something whent wrong");
		}
		
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());

		System.out.println("The Sum of " + num + " is: " + sum);

		long end = System.currentTimeMillis();
		System.out.println("Total time taken: " + (end - start) + " milliseconds");
	}

	public void run() {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("customthread");
		System.out.println(currentThread.getName());
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
	}

}
