package com.assignment11.static_final;

public class Eg1 {
static int count=0;
public void increment(){
	count++;
}
public static void main(String[] args) {
	Eg1 obj=new Eg1();
	Eg1 obj2=new Eg1();
	obj.increment();
	obj2.increment();
	System.out.println("obj count is>> "+obj.count);
	System.out.println("obj count is>> "+obj2.count);;
}
}
