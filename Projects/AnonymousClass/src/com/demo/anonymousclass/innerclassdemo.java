package com.demo.anonymousclass;

public class innerclassdemo {

	public static void main(String[] args) {
		System.out.println("Inside the main()");
		
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("inside innder class...");				
			}
		});
		
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Exiting the main()");
	}

}
