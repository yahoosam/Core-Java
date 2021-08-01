package com.demo.interviewqa.evenodddemo;

public class OddPrint implements Runnable {

	CommonData cd;

	public OddPrint(CommonData cd) {
		this.cd = cd;
	}

	@Override
	public void run() {
		try {
			cd.PrintOdd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
