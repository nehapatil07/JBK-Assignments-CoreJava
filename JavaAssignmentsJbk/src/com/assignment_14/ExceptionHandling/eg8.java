package com.assignment_14.ExceptionHandling;

public class eg8 {
static int sum(int num1, int num2){
	if (num1==0)
		throw new ArithmeticException("first parameter is not valid");
	else{
		System.out.println("both parameters are correct");
	} return num1+num2;
}
public static void main(String[] args) {
	int result=sum(0,2);
	System.out.println(result);
	System.out.println("Continue next statement");
}
}
