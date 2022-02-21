package com.demo.lamda.innerclass;

public class InnerClassDemo {

	public static void main(String[] args) {
		// legacy way to create inner class and invoke the thread
		Thread innerclassthread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("value of i: " + i);
				}
			}
		});
		innerclassthread.start();

		// using lamda
		Thread lamthread = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("using lamda value of i: " + i);
			}
		});
		lamthread.start();
		
		//another simple single line example
		new Thread(()->{System.out.println("Inside another single line lamda thread");}).start();
		new Thread(()-> System.out.println("Inside another single line lamda thread")).start();
	}

}
