package com.assignment_15.collection;

import java.util.HashMap;

public class Hashmap_demo3 {
public static void main(String[] args) {
	HashMap<String, String> hm = new HashMap<String, String>();
	hm.put("one", "java");
	hm.put("two", "By");
	hm.put("three", "Kiran");
	System.out.println(hm);
	System.out.println("Value of second:=" + hm.get("two"));
	System.out.println("Is HashMap empty:=" + hm.isEmpty());
	hm.remove("two");
	System.out.println(hm);
	System.out.println("Size of the HashMap:=" + hm.size());
	
}
}
