package com.assignment_5.loops.src;

import java.util.Scanner;

public class switch_case {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int day=sc.nextInt();
	sc.close();
	//int day=2;
	switch(day){
	case 1: System.out.println("Mon");
	break;
	case 2:System.out.println("Tue");
	break; 
	case 3:System.out.println("wed");
	break;
	case 4:System.out.println("Thu");
	break;
	case 5:System.out.println("Fri");
	break;
	case 6:System.out.println("Sat");
	break;
	case 7:System.out.println("Sun");
	break;
	default : System.out.println("Wrong input");
	} 
	
}
}
