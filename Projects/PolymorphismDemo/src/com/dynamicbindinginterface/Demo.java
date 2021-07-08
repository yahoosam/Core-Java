package com.dynamicbindinginterface;

public class Demo {

	public static void main(String[] args) {
		// upcasting doesn't need a typecasting
		AppleLaptop applelaptop = new MacBook();
		AppleLaptop applelaptop1 = new MacBookPro();
		AppleLaptop applelaptop2 = new MacBookAir();

		applelaptop.start();
		applelaptop.shutdown();

		applelaptop1.start();
		applelaptop1.shutdown();

		applelaptop2.start();
		applelaptop2.shutdown();

		// downcasting needs a typecasting
		// we need to downcast to access macbookairaddedfeatures()
		MacBookAir macbookair = (MacBookAir) applelaptop2;
		macbookair.start();
		macbookair.shutdown();
		macbookair.macbookairaddedfeatures();
	}

}
