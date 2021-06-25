package com.assignment_14.ExceptionHandling;

public class eg3 {
public static void main(String[] args) {
	try{
		int a[]=new int[7];
		a[4]=30/0;
		System.out.println("Print statement in try block");
	} catch(ArithmeticException e){
		System.out.println("Warning:Arithmetic expression");
	} catch(IndexOutOfBoundsException e){
		System.out.println("warning: Index out of bound exception");
	} catch (Exception e){
		System.out.println("Other exception");
	}
	System.out.println("out of try catch block");
} 
}
