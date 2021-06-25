package com.assignment11.static_final;

public class finalEg {
final int a=10;
final void jbk(){
	final int i=5;
	System.out.println(i);
	/*for(i=0;i<5;i++){
		System.out.println(i++);
	}*/
}
public static void main(String[] args) {
	finalEg ee=new finalEg();
	ee.jbk();
}
}
