package com.assignment_15.collection;

import java.util.HashMap;

public class Hashmap_demo1 {
public static void main(String[] args) {
	HashMap<String, String> hm=new HashMap<>();
	hm.put("first", "java");
	hm.put("second", "by");
	hm.put("third", "kiran");
	System.out.println(hm);
	
	HashMap<String, String> hml=new HashMap<>();
	hml.put("c1", "JAVA");
	hml.put("c2", "SELENIUM");
	hm.putAll(hml);
	System.out.println(hm);
}
}
