package com.assignment_8.inheritance;

public class Main1 {
public static void main(String[] args) {
	employee ee=new employee();
	ee.name="Candid"; 
	ee.age=22;
	ee.ph=123456789l;
	ee.specialization="Java";
	
	System.out.println(ee.name);
	System.out.println(ee.age);
	System.out.println(ee.ph);
	System.out.println(ee.specialization);

	manager m1=new manager();
	m1.name="java"; 
	m1.age=25;
	m1.ph=345789l;
	m1.department="HR";

	System.out.println(m1.name);
	System.out.println(m1.age);
	System.out.println(m1.ph);
	System.out.println(m1.department);

}

}
