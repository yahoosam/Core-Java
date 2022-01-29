package com.demo.lamda.constructorreferencing;

import java.util.ArrayList;

public class ConstructorReferencingDemo {

	public static void main(String[] args) {
		// legacy way to create an instance
		ConstructorReferenceClass crc = new ConstructorReferenceClass("Legacy");

		// lamda way using interface
		ConstructorReferenceInterface cri = msg -> new ConstructorReferenceClass(msg);
		ConstructorReferenceClass crclam = cri.getClassInstance("Using Lamda");

		// constructor referencing way
		ConstructorReferenceInterface cri2 = ConstructorReferenceClass::new;
		ConstructorReferenceClass crcconref = cri2.getClassInstance("Using Constructor referencing");
	}

}
