package com.assignment_14.ExceptionHandling;

public class eg11 {
public static void main(String[] args) {
	try{
		System.out.println("The value is:");
		for (int i=1;i<=3;i++){
			System.out.println(i);
		}
	} catch (Exception e) {
		e.printStackTrace();
	} 
	finally{
		System.out.println("The finally block always gets executed");
	}
}
}
