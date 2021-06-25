package com.assignment_9_polymorphism;

public class Eg1 {
void sum(int a,int b){
	System.out.println("sum is "+(a+b));
}
void sum(float a, float b){
	System.out.println("sum is"+(a+b));
}
public static void main(String[] args) {
	Eg1 cal=new Eg1();
	cal.sum(5, 3);
	//cal.sum(1.2, 2.1);
}
}
