package com.jbk.GarbageCollection;

public class eg1 {
int a;
int b;
public void setData(int c, int d){
	a=c;
	b=d;
}
public void showData(){
	System.out.println("value of a is>> "+a);
	System.out.println("value of b is>>> "+b);
}
public static void main(String[] args) {
	eg1 s1=new eg1();
	eg1 s2=new eg1();
	s1.setData(1, 2);
	s2.setData(3, 4);
	s1.showData();
	s2.showData();
	eg1 s3;
	s3=s2;
	s3.showData();
	s2=null;
	s3.showData();
	s3=null;
	s3.showData();
	
	
}
}
