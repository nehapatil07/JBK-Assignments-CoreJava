package com.assignment_14.ExceptionHandling;

public class ArrayoutofBound {
	public static void main(String[] args) {
		try {
			int a[] = new int[10];
			a[11] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bound");
		}
	}
}
