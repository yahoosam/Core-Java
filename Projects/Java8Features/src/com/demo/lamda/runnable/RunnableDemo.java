package com.demo.lamda.runnable;

public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {

		// Legacy way to implement the runnable interface
		RunnableImpl runimpl = new RunnableImpl();
		Thread runimplthread = new Thread(runimpl);
		runimplthread.start();
		runimplthread.join();

		// Easy way using lamda
		Runnable runlamda = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("value of i from Lamda: " + i);
			}
			System.out.println(Thread.currentThread().getName());
		};

		Thread lamthread = new Thread(runlamda);
		lamthread.setName("LamdaThread");
		lamthread.start();
		lamthread.join();
		System.out.println(Thread.currentThread().getName());
	}
}
