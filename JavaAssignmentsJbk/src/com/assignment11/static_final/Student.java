package com.assignment11.static_final;

public class Student {
int a;
static int b;
Student(){
	b++;
}
public void showData(){
	System.out.println("Value of a: "+a);
	System.out.println("Value of b: "+b);
}
/*public static void increment(){
	a++;
}*/

}
