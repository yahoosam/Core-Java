package com.demo.interviewqa.evenodddemo;

public class EvenOddDemo {

	public static void main(String[] args) {

		CommonData cd = new CommonData();
		cd.isPrintingOdd = true;
		cd.num = 1;
		cd.max = 100;

		Thread ep = new Thread(new EvenPrint(cd));
		Thread op = new Thread(new OddPrint(cd));

		ep.start();
		op.start();

	}

}
