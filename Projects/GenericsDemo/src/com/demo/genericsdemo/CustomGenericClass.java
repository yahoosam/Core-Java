package com.demo.genericsdemo;

public class CustomGenericClass<T> {
	T obj;
	
	CustomGenericClass(T obj){
		this.obj = obj;
	}
	
	public void displayobjectdetails() {
		System.out.println(obj.getClass().getName() + ": " + obj);
	}
}
