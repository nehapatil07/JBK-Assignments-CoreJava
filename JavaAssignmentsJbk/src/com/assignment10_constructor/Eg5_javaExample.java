package com.assignment10_constructor;

public class Eg5_javaExample {
String web;
Eg5_javaExample(String w){
	web=w;
}
Eg5_javaExample(Eg5_javaExample je){
	web=je.web;
}
void disp(){
System.out.println("Website: "+web);
}
public static void main(String[] args) {
	Eg5_javaExample obj1=new Eg5_javaExample("www.javabykiran.com");
	Eg5_javaExample obj2=new Eg5_javaExample("www.javabykiran.com");
	obj1.disp();
	obj2.disp();

}
}
