package com.abstractdemo;

public class Note5 extends SamsungMobileNoteSeries {

	Note5() {
		System.out.println("Note 5 Series");
	}
	
	@Override
	void camerapixel() {
		System.out.println("5MP");
	}

	@Override
	void displayresolution() {
		System.out.println("FHD");
	}

	@Override
	void batterycapacity() {
		System.out.println("5000MAH");
	}

	public static void main(String[] args) {
		Note5 n5 = new Note5();

		n5.chargertype();
		n5.camerapixel();
		n5.displayresolution();
		n5.batterycapacity();
	}
}
