package com.assignment_13.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Eg1_test {
public static void main(String[] args) throws Exception {
	Eg1 aa=new Eg1();
	Class cls=aa.getClass();
	System.out.println("class name is>> "+cls.getName());
	
	Constructor con=cls.getConstructor();
	System.out.println("name of the constructor is>>"+con.getName());
	System.out.println("public methods of class are :");
	
	Method[] methods=cls.getMethods();
	for(Method methodname:methods){
		System.out.println(methodname.getName());
	}
	
	Method methodcall1 =cls.getDeclaredMethod("method2", int.class);
	System.out.println(methodcall1);
	
	Field fid=cls.getDeclaredField("s");
	fid.setAccessible(true);
	fid.set(aa, "JAVA");
	
	Method methodcall2=cls.getMethod("method1");
	methodcall2.invoke(aa);
	
}

}
