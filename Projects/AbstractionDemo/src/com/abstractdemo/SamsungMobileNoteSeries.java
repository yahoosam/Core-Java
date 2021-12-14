package com.abstractdemo;

public abstract class SamsungMobileNoteSeries {

	SamsungMobileNoteSeries() {
		System.out.println("Common Note properties");
	}

	void chargertype() {
		System.out.println("USB-C");
	}

	abstract void camerapixel();

	abstract void displayresolution();

	abstract void batterycapacity();
}
