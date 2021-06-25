package com.assignment_12.abstraction;

public class test implements interface2{
public void method1(){
	System.out.println("Implemneted method 1");
}
public void method2(){
	System.out.println("Implemented method 2");
}
public static void main(String[] args) {
	test aa=new test();
	aa.method1();
	aa.method2();
}
}
