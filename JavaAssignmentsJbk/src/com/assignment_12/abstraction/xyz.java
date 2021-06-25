package com.assignment_12.abstraction;

public class xyz implements myinterface {

	@Override
	public void method1() {
		System.out.println("implemented method 1");
		
	}

	@Override
	public void method2() {
		System.out.println("implemented method 2");	
	}
public static void main(String[] args) {
	xyz aa=new xyz();
	aa.method1();
	aa.method2();
}
}
