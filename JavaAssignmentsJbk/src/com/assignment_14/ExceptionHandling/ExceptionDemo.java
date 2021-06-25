package com.assignment_14.ExceptionHandling;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int num1 = 30, num2 = 0;
			int c = num1 / num2;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide an int by 0");
		}
	}
}
