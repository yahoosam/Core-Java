package com.demo.accessmodifier;

public class SamePackage {

	public static void main(String[] args) {
		AccessModifierDemo amd = new AccessModifierDemo();
		
		System.out.println("Same Package public " + amd.i);
		System.out.println("Same Package default " + amd.j);
		System.out.println("Same Package protected " + amd.k);
		System.out.println("Same Package NO ACCESS PRIVATE");
	}

}
