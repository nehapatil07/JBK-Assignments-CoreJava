package com.assignment_9_polymorphism;

public class Eg5_test {
public static void main(String[] args) {
	Eg5_1 aa=new Eg5_1(); //object of derived class
	aa.method();
	Eg5 bb=new Eg5();   //object of base class
	bb.method();
	Eg5 cc=new Eg5_1();  //dynamic dispatch
	cc.method();
}
}
