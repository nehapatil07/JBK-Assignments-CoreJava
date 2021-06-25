package com.assignment_14.ExceptionHandling;

public class eg2 {
public static void main(String[] args) {
	int []array={1,2};
	try{
		System.out.println("10th value of array is:"+array[10]);
	} catch (Exception e) {
		System.out.println("The error"+e);
	}
}
}
