package com.assignment_14.ExceptionHandling;

public class eg1 {
public static void main(String[] args) {
	int num1,num2;
	try{
		num1=0;
		num2=62/num1;
		System.out.println("try block message");
	} catch(ArithmeticException e){
		System.out.println("Dont divide a number by zero");
	} System.out.println("i am out of try catch block");
}
}
