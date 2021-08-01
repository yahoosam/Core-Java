package com.demo.interviewqa.evenodddemo;

public class EvenPrint implements Runnable {

	CommonData cd;

	public EvenPrint(CommonData cd) {
		this.cd = cd;
	}

	@Override
	public void run() {
		try {
			cd.PrintEven();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
