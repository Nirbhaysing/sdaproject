package com.model1;

public class DemoFactory {
 private static final DemoFactory obj=new DemoFactory();
 private DemoFactory() {
	 System.out.println("Private Constructor");
 }
 
	public static DemoFactory get() {
		return obj;
		
	}
	public void display() {
		System.out.println("Using Concept of factory method");
	}
}
