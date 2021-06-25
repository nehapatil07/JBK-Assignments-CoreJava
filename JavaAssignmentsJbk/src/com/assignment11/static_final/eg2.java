package com.assignment11.static_final;

public class eg2 {
private String name;
private static String Staticvar="Static-String";
public eg2(String n){
	this.name=n;
}
public static void testStaticMethod(){
	System.out.println("hey! i am in sttaic method");
	System.out.println(eg2.Staticvar);
}
public void testObjectMethod(){
	System.out.println("Hey! i am in non-static method");
	System.out.println(eg2.Staticvar);
	System.out.println("name is:>> "+this.name);
}
public static void main(String[] args) {
	eg2.testStaticMethod();
	eg2 obj=new eg2("jbk");
	obj.testObjectMethod();
}
}
