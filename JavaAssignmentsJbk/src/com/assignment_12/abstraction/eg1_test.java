package com.assignment_12.abstraction;

public class eg1_test extends eg1 {
public void display2(){
	System.out.println("i am overriding abstract method");
}
public static void main(String[] args) {
	eg1_test aa=new eg1_test ();
	aa.disp1();
	aa.display2();
}
}
