package com.assignment_5.loops.src;

import java.util.Scanner;

public class generaltable {
public static void main(String[] args) {

	System.out.println("Enter a number:");
	Scanner aa=new Scanner(System.in);
	int c=aa.nextInt();
	aa.close();
	
	for (int i=1;i<=10;i++){
		System.out.println(i*c);
	}
	
}
}
