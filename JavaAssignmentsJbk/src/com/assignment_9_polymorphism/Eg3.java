package com.assignment_9_polymorphism;

public class Eg3 {
void find(int l, int b){
	System.out.println("Area is>> "+(l*b));
}
void find(int l, int b, int h){
	System.out.println("area is>> "+(l*b*h));
}
public static void main(String[] args) {
	Eg3 aa=new Eg3();
	aa.find(3, 5);
	aa.find(3, 5, 6);
}
}
