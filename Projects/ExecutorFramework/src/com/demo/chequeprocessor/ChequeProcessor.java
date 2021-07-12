package com.demo.chequeprocessor;

public class ChequeProcessor implements Runnable {

	String chequeSource;
	int processingtime;

	public ChequeProcessor(String chequeSource, int processingtime) {
		this.chequeSource = chequeSource;
		this.processingtime = processingtime;
	}

	@Override
	public void run() {
		System.out.println(
				chequeSource + " cheque received and started processing in thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(processingtime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(chequeSource + " ***processed*** in thread: " + Thread.currentThread().getName());
	}

}
