package com.assignment_15.collection;

import java.util.HashSet;

public class Hashset_demo3 {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<>();
	hs.add("java");
	hs.add("by");
	hs.add("kiran");
	hs.add("karvenagar");
	hs.add("pune");
	System.out.println("first hasset>>"+hs);
	HashSet<String> subset=new HashSet<>();
	subset.add("java");
	subset.add("J2EE");
	subset.add("Selenium");
	System.out.println("Second hasset>>"+subset);
	hs.retainAll(subset);
	System.out.println("Common Hashset content from both:");
	System.out.println(hs);
}
}
