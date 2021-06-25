package com.assignment_15.collection;

import java.util.HashSet;

public class Hashset_demo1 {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<>();
	hs.add("java");
	hs.add("by");
	hs.add("kiran");
	hs.add("karvenagar");
	System.out.println(hs);
	System.out.println("is hasset empty or not?>>"+hs.isEmpty());
	hs.remove("karvenagar");
	System.out.println(hs);
	System.out.println("size of hs>>"+hs.size());
	System.out.println("does hashset contains first element as java?>>"+hs.contains("java"));




}
}
