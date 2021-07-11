package com.demo.threading.waitnotify;

public class DataConsumer implements Runnable {
	CommonData cd;

	public DataConsumer(CommonData cd) {
		this.cd = cd;
	}

	@Override
	public void run() {
		System.out.println("consumer Thread " + Thread.currentThread().getName() + "- Entry");
		cd.consume();
		System.out.println("consumer Thread " + Thread.currentThread().getName() + "- Exit");
	};
}
