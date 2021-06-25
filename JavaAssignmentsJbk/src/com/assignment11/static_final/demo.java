package com.assignment11.static_final;

public class demo {
final int MAX_val;
demo(){
	MAX_val=100;
}
void mymethod(){
	System.out.println(MAX_val);
}
public static void main(String[] args) {
	demo dd=new demo();
	dd.mymethod();
}
}
