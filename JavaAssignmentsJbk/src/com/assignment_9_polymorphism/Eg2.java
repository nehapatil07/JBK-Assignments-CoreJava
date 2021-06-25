package com.assignment_9_polymorphism;

public class Eg2 {
void demo(int a){
	System.out.println("a is: "+a);
}
void demo(int a,int b){
	System.out.println("a and b are: "+a+","+b);
}
double demo(double a){
	System.out.println("double a: "+a);
	return a*a;
}
int demo(int a, int b, int c)
{
	return a+b+c;
	}
public static void main(String[] args) {
	Eg2 aa=new Eg2();
	double result;
	int add;
	aa.demo(10);
	aa.demo(10, 20);
	result=aa.demo(10.2);
	System.out.println("output>> "+result);
	add=aa.demo(5, 5, 5);
	System.out.println("addition of integeres is>> "+add);
}}
