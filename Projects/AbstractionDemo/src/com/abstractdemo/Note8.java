package com.abstractdemo;

public class Note8 extends Note5 {

	Note8() {
		System.out.println("Note 8 Series");
	}
	
	@Override
	void camerapixel() {
		System.out.println("8MP");
	}

	// displayresolution inherits from note5

	@Override
	void batterycapacity() {
		System.out.println("6000MAH");
	}

	public static void main(String[] args) {
		Note8 n8 = new Note8();

		n8.chargertype();
		n8.camerapixel();
		n8.displayresolution();
		n8.batterycapacity();
	}
}
