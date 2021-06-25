package com.assignment_12.abstraction;

public class eg2_test extends eg2 {
	int x,y,z;
	void get(int a, int b){
		x=a;
		y=b;
	}
	void add(){
		z=x+y;
	}
	void display(){
		System.out.println("the addition is:"+z);
	}	
public static void main(String[] args) {
	eg2_test aa=new eg2_test();
	aa.get(2, 3);
	aa.add();
	aa.display();
}
}
