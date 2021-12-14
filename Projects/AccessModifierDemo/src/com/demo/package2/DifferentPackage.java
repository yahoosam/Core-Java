package com.demo.package2;

import com.demo.accessmodifier.AccessModifierDemo;

public class DifferentPackage {

	public static void main(String[] args) {
		AccessModifierDemo amd = new AccessModifierDemo();

		System.out.println("Different Package public " + amd.i);
		System.out.println("Different Package NO ACCESS default");
		System.out.println("Different Package NO ACCESS protected");
		System.out.println("Different Package NO ACCESS private");
	}
	
}
