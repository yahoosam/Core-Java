package com.demo.interviewqa.evenodddemo;

public class CommonData {

	Boolean isPrintingOdd;
	int num;
	int max;

	public void PrintEven() throws InterruptedException {
		synchronized (this) {
			while (this.num <= this.max) {

				if (this.isPrintingOdd == true) {
					wait();
				}

				if (this.num <= this.max)
					System.out.println("Even: " + this.num++);

				this.isPrintingOdd = true;
				notify();
			}
		}
	}

	public void PrintOdd() throws InterruptedException {
		synchronized (this) {
			while (this.num <= this.max) {

				if (this.isPrintingOdd == false) {
					wait();
				}

				if (this.num <= this.max)
					System.out.println("Odd:  " + this.num++);

				this.isPrintingOdd = false;
				notify();
			}
		}
	}

}
