package com.demo.lamda.methodreferencing;

public class MethodReferencingDemo {

	public static void main(String[] args) {
		// older lamda way
		MyCustomInterface inter = str -> {
			str = "old lamda Mr." + str;
			return str;
		};
		System.out.println(inter.greeter("Sam.."));

		// method referencing using ::
		MyCustomInterface myinter = MethodReferencingDemo::localgreeter;
		System.out.println(myinter.greeter("Sam.."));
	}

	static String localgreeter(String str) {
		str = "using method reference Mr." + str;
		return str;
	}

}
