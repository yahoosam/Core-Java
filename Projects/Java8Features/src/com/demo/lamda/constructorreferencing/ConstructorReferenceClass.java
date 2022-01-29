package com.demo.lamda.constructorreferencing;

import java.util.ArrayList;

public class ConstructorReferenceClass {

	private String name;

	public ConstructorReferenceClass(String name) {
		this.name = name;
		System.out.println("Inside Constructor called from: " + name);
	}

}
