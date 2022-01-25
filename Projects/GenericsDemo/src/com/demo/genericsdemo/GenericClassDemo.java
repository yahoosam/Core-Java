package com.demo.genericsdemo;

public class GenericClassDemo {

	public static void main(String[] args) {
		CustomGenericClass<Integer> i = new CustomGenericClass<Integer>(10);
		i.displayobjectdetails();

		CustomGenericClass<String> s = new CustomGenericClass<String>("Hello...");
		s.displayobjectdetails();
		
		CustomGenericClass<Double> d = new CustomGenericClass<Double>(39834.1342);
		d.displayobjectdetails();
		
		CustomGenericClass<Boolean> b = new CustomGenericClass<Boolean>(false);
		b.displayobjectdetails();
	}

}
